import java.io.File;
import java.util.Scanner;

public class DeleteFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Path of file: ");
        String pathFile = sc.nextLine();
        delete(pathFile);

    }
    public static void delete(String path){
        File file = new File(path);
        if(file.delete()) {
            System.out.println("Xoá thành công!");
        }else System.out.println("Lệnh xoá thất bại!");
    }
}
