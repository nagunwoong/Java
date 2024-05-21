package chap18.sec11;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {

    public static void main(String[] args) throws Exception {
        // File 객체 생성
        File dir = new File("/Library/Temp");
        File file1 = new File("/Library/Temp/file1.txt");
        File file2 = new File("/Library/Temp/file2.txt");
        File file3 = new File("/Library/Temp/file3.txt");
        
        if (!dir.exists()) { dir.mkdir(); }
        if (!file1.exists()) { file1.createNewFile(); }
        if (!file2.exists()) { file2.createNewFile(); }
        if (!file3.exists()) { file3.createNewFile(); }

        File temp = new File("/Library/Temp");
        File[] contents = temp.listFiles();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (File file : contents) {
            System.out.printf("%-25s", sdf.format(new Date(file.lastModified())));
            if (file.isDirectory()) {
                System.out.printf("%-10s%-20s\n", "<DIR>", file.getName());
            } else {
                System.out.printf("%-10d%-20s\n", file.length(), file.getName());
            }
        }	
    }
}