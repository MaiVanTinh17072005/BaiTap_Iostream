import java.io.File;
import java.util.Scanner;

public class PrintLengthOfFile {
    public PrintLengthOfFile() {

    }

    public static int printLength(String path){
        File file = new File(path);
        int size = (int) file.length();
        return size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Path of file: ");
        String pathFile = sc.nextLine();
        System.out.println("Size of file: "+ printLength(pathFile) + " byte");

    }
}
