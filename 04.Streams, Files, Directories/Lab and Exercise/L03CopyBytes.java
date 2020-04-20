import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class L03CopyBytes {
    public static void main(String[] args) {
        String userDir = System.getProperty("user.dir");
        String pathIn = userDir + "/res/input.txt";
        String pathOut = userDir + "/res/outputBytes.txt";

        try (FileInputStream fileIn = new FileInputStream(pathIn);
             FileOutputStream fileOut = new FileOutputStream(pathOut)) {


            int oneByte = fileIn.read();
            while (oneByte >= 0) {
                if(oneByte == 32 || oneByte == 10){
                    fileOut.write(oneByte);
                } else {
                    String byteAsText = String.valueOf(oneByte);
                    for (int i = 0; i < byteAsText.length(); i++) {
                        int symbol = byteAsText.charAt(i);
                        fileOut.write(symbol);
                    }
                }
                oneByte = fileIn.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
