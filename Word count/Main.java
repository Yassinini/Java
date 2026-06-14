
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String filepath = sc.nextLine();
        FileRead fr = new FileRead(filepath);
        String content = fr.Read();
        System.out.println(content);

    }
}
