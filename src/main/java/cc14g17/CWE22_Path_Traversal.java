/*
 * @Description
 * CWE_ID: 22
 * CWE_Entry_Name: Improper Limitation of a Pathname to a Restricted Directory ('Path Traversal')
 *
 * The software uses external input to construct a pathname that is intended to identify a file
 * or directory that is located underneath a restricted parent directory, but the software does
 * not properly neutralize special elements within the pathname that can cause the pathname to resolve
 * to a location that is outside of the restricted directory.
 */

package cc14g17;

import java.io.*;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CWE22_Path_Traversal extends AbstractDefectiveProgram {

    private boolean fileRead;

    CWE22_Path_Traversal() {
        fileRead = false;
    }

    @Override
    public void bad() {
        badRead("alice.txt");
    }

    @Override
    public void good() {
        goodRead("alice.txt");
    }


    public void badRead(String userPath) {

        String relativeFilePath = "./src/main/resources/profiles/" + userPath;

        File file = new File(relativeFilePath);

        /* FLAW code doesn't limit the potential input for the file path */

        BufferedReader in = null;

        try {
            in = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));

            String line;
            while((line = in.readLine()) != null)
            {
                System.out.println(line);
            }

            fileRead = true;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        fileRead = true;
    }

    public void goodRead(String userPath) {

        String relativeFilePath = "src/main/resources/profiles/" + userPath;

        File file = new File(relativeFilePath);

        /* FIX check */

        String canonicalPath = null;
        String absolutePath = null;

        try {
            canonicalPath = file.getCanonicalPath();
            absolutePath = file.getAbsolutePath();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (canonicalPath == null || absolutePath == null)
            return;

        if (!canonicalPath.equals(absolutePath)) {
            System.out.println("Potential Directory Traversal");
            return;
        }

        BufferedReader in = null;

        try {
            in = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));

            String line;
            while((line = in.readLine()) != null)
            {
                System.out.println(line);
            }

            fileRead = true;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        fileRead = true;
    }

    public boolean isFileRead() {
        return fileRead;
    }

    public void setFileRead(boolean fileRead) {
        this.fileRead = fileRead;
    }
}
