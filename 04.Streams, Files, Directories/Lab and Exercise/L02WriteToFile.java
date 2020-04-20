import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class L02WriteToFile {
    public static void main(String[] args) {
        String userDir = System.getProperty("user.dir");
        String pathIn = userDir + "/res/input.txt";
        String pathOut = userDir + "/res/output.txt";

        try (FileInputStream fileIn = new FileInputStream(pathIn);
             FileOutputStream fileOut = new FileOutputStream(pathOut)) {


            int oneByte = fileIn.read();
            while (oneByte >= 0) {
                if (oneByte != '.'
                        && oneByte != ','
                        && oneByte != '?'
                        && oneByte != '!') {
                    fileOut.write(oneByte);
                }
            oneByte = fileIn.read();
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

