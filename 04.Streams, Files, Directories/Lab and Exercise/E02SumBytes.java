import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class E02SumBytes {
    public static void main(String[] args) throws FileNotFoundException {

        String path =
                "C:\\Users\\alexk\\Desktop\\04. Streams,Files and Directories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        FileReader fileReader = new FileReader(path);
        BufferedReader reader = new BufferedReader(fileReader);
        int asciiSum = 0;
        try {
            String line = reader.readLine();
            while (line != null) {
                for (char symbol : line.toCharArray()) {
                    asciiSum += symbol;
                }
                line = reader.readLine();
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(asciiSum);
    }
}
