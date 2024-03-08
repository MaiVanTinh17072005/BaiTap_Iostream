import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Main {
    public Main() {

    }

    public void dolon() {
        System.out.println("do lon file: ");
        Scanner s = new Scanner(System.in);
        String filePath = s.nextLine();
        File file = new File(filePath);
        if (file.exists()) {
            long fileSizeInBytes = file.length();
            System.out.println("Độ lớn của file là: " + fileSizeInBytes + " bytes");
        } else {
            System.out.println("File không tồn tại.");
        }
    }
    public void xoafile() {
        System.out.println("xoa file: ");
        Scanner s = new Scanner(System.in);
        String filePath = s.nextLine();
        File fileToDelete = new File(filePath);
        if (fileToDelete.exists()) {
            if (fileToDelete.delete()) {
                System.out.println("File đã được xóa thành công.");
            } else {
                System.out.println("Không thể xóa file.");
            }
        } else {
            System.out.println("File không tồn tại.");
        }
    }


    public static void main(String[] args) throws Exception{
        Main m= new Main();
        m.dolon();
        m.xoafile();
       
    }
}