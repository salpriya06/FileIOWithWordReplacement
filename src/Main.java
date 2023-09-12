import java.io.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        Scanner scan = new Scanner(System.in);

        String srcFilePath = "C:\\Users\\acer\\Desktop\\fileIO.txt";
        String destFilePath = "C:\\Users\\acer\\Desktop\\fileIOW.txt";

        System.out.println("Enter word you want to replace!!");
        String wordToReplace = scan.nextLine();

        System.out.println("Enter the replacement word");
        String replacementWord = scan.nextLine();

        Util.ReplaceWord(srcFilePath,destFilePath,wordToReplace,replacementWord);

    }
}