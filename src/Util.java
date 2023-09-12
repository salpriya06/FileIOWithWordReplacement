import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Util {

    public static void ReplaceWord(String srcFilePath,String destFilePath, String wordToReplace, String replacementWord ){

        try(
                FileReader fileR = new FileReader(srcFilePath);
                BufferedReader bufferR = new BufferedReader(fileR);

                FileWriter fileW = new FileWriter(destFilePath);
                ){
            String line;
            while ((line = bufferR.readLine())!= null){
                line = line.replaceAll(wordToReplace, replacementWord);
                fileW.write(line + "\n");
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }

}
