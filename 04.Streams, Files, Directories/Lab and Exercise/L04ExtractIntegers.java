import java.io.*;
import java.util.Scanner;

public class L04ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {
        String userDir = System.getProperty("user.dir");
        String pathIn = userDir + "/res/input.txt";
        String pathOut = userDir + "/res/outputAsInteger.txt";

        try (Scanner scanner = new Scanner(new FileReader(pathIn));
              PrintWriter writer = new PrintWriter(pathOut)){
            while (scanner.hasNext()) {
                scanner.next();
                if (scanner.hasNextInt()) {
                    writer.println(scanner.nextInt());
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
