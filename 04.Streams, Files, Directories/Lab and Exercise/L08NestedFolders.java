import java.io.File;

public class L08NestedFolders {
    public static void main(String[] args) {


        File f = new File("C:\\Users\\alexk\\Desktop\\04. Streams,Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        DFS(f);
    }
         static void DFS (File root) {
            if (root == null) return;
             File[] files =  root.listFiles();
             if (files == null) return;

             for (File file :files) {
                 if (file.isDirectory()){
                     System.out.println(file.getName());
                     DFS(file);
                 }
                 else{
                     System.out.println(file.getName());
                 }
        }
    }
}
