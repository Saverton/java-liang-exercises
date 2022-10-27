/** 
 * (Rename files) Suppose you have a lot of files in a directory named Exercisei_j,
 * where i and j are digits. Write a program that pads a 0 before j if j is a single 
 * digit. For example, a file named Exercise2_1 in a directory will be renamed to 
 * Exercise2_01. In Java, when you pass the symbol * from the command line, 
 * it refers to all files in the directory (see Supplement III.V). Use the following 
 * command to run your program.
 *      java Exercise12_29 *
 * @author Scott M.
 */

import java.io.File;

public class Exercise_12_29 {
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
            if (padLastDigitInFileName(file))
                System.out.print("File renamed successfully");
            else
                System.out.print("Didn't rename File");
        }
        else if (file.isDirectory()) {
            File[] directory = file.listFiles();
            for (int i = 0; i < directory.length; i++) {
                if (padLastDigitInFileName(directory[i]))
                    System.out.println("Renamed file " + i);
                else
                    System.out.println("Didn't rename file " + i);
            }
        }
    }
    
    /** 
     * Rename a file formatted as "Exercisei_j" such that if "j" is a  single digit, it is padded with a 0 to be 2 digits long (e.g. Exercise2_2 => Exercise2_02).
     * Return a boolean corresponding to the success of the operation.
     * @param file File: file to rename
     * @return boolean: true = file was renamed, false otherwise
     */
    public static boolean padLastDigitInFileName(File file) {
        if (file.getName().contains("Exercise")) {
            String fileName = file.getName();
            int numberCount = 0;
            boolean renamed = false;
            for (int i = fileName.indexOf('_'); i < fileName.length(); i++) {
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
