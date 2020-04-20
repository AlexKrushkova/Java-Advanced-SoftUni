import java.io.*;

public class E01SumLines {
    public static void main(String[] args) throws FileNotFoundException {

        String path =
                "C:\\Users\\alexk\\Desktop\\04. Streams,Files and Directories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        BufferedReader reader = new BufferedReader(new FileReader(path));
        try {
            String line = reader.readLine();
            while (line != null) {
                int asciiSum = 0;
                for (char symbol : line.toCharArray()) {
                    asciiSum += symbol;
                }
                System.out.println(asciiSum);
                line = reader.readLine();
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}