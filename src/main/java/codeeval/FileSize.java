package codeeval;

import java.io.File;

/**
 * Created by Vladimir Bichev
 * Date: 25.09.11
 * Time: 16:03
 */
public class FileSize {


    public static void main (String arg[]) {
        File file = new File("C:/Patch.rev");
        long fileSize = file.length();
        System.out.println(fileSize);
    }
}
