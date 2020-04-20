import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class L07ListFiles {
    public static void main(String[] args) throws IOException {

        String userDir = System.getProperty("user.dir");
        Path pathOut = Paths.get(userDir + "/res/outputListFiles.txt");

        File f = new File("C:\\Users\\alexk\\Desktop\\04. Streams,Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");
        File [] allFiles = f.listFiles();
        assert allFiles != null;
        for (File f1:allFiles) {
            if (!f1.isDirectory()){
                System.out.println(
                        String.format("%s: [%d]",
                                f1.getName(), f1.length()));
            }
        }

    }
}

