/** Program to rename files in this directory to take all single digit numbers
 * and turn them into double digits with a zero in front. If the argument '*' is
 * passed, then it does so for all files in the directory.
 * 
 * @author Scott M.
 * RenameFiles2.java
 */

import java.io.File;

public class RenameFiles2 {
    /** Main method to run program. */
    public static void main(String[] args) {
        File file;
        if (args[0].charAt(0) == '*') {
            file = new File("D:\\Book_Projects_Ch12");
        }
        else {
            file = new File(args[0]);
        }
        
        if (file.isFile()) {
            if (rename(file))
                System.out.print("File renamed successfully");
            else
                System.out.print("Didn't rename File");
        }
        else if (file.isDirectory()) {
            File[] directory = file.listFiles();
            for (int i = 0; i < directory.length; i++) {
                if (rename(directory[i]))
                    System.out.println("Renamed file " + i);
                else
                    System.out.println("Didn't rename file " + i);
            }
        }
    }
    
    /** Rename a single file to format single digit integers as two digit integers.
     * 
     * @params file
     * @return true if file was renamed, false otherwise
     */
    public static boolean rename(File file) {
        if (file.getName().contains("Exercise")) {
            String fileName = file.getName();
            int numberCount = 0;
            boolean renamed = false;
            for (int i = 0; i < fileName.indexOf('_') + 1; i++) {
                if (Character.isDigit(fileName.charAt(i))) {
                    numberCount++;
                }
                else {
                    if (numberCount == 1) {
                        fileName = fileName.substring(0, i - 1) + '0' + fileName.substring(i - 1);
                        i++;
                    }
                    numberCount = 0;
                }
            }
            if (!fileName.equals(file.getName()))
                renamed = true;
            file.renameTo(new File(fileName));
            return renamed;
        }
        else {
            return false;
        }
    }
}
