import java.io.*;
public class L05EveryThirdLiine {
    public static void main(String[] args) throws FileNotFoundException {
        String userDir = System.getProperty("user.dir");
        String pathIn = userDir + "/res/input.txt";
        String pathOut = userDir + "/res/outputEveryThirdLine.txt";

        try (BufferedReader in =
                     new BufferedReader(new FileReader(pathIn));
             PrintWriter out =
                     new PrintWriter(new FileWriter(pathOut))) {
            int counter = 1;
            String line = in.readLine();
            while (line != null) {
                if (counter % 3 == 0)
                    out.println(line);
                counter++;
                line = in.readLine();
    }
            } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
