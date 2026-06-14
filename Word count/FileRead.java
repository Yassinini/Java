import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class FileRead{
    public File file;
    public FileRead(String Filepath) {
        this.file = new File(Filepath);
    }
    public String Read() throws IOException{
        String heh="";
        try {  
            Scanner fr = new Scanner(file);  
            int i = 0;
            while (fr.hasNextLine()) {
                i++;
                heh += fr.nextLine();
            }
        } 
        catch(IOException e) {
            System.out.println("Error: " + e);
        } 
        return heh;
    }
}