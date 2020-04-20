import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class L01ReadFile {
    public static void main(String[] args) {

        String userDir = System.getProperty("user.dir");
        String path = userDir + "/res/input.txt";

        try(FileInputStream fileStream = new FileInputStream(path)){
            int oneByte = fileStream.read();
            while(oneByte>=0){
                String res = Integer.toBinaryString(oneByte);
                System.out.print(res + " ");
                oneByte= fileStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
