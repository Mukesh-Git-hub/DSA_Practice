package FileHandling;

import java.io.File;
import java.io.IOException;

public class Abspath {
    public static void main(String[] args) throws IOException {
       String path=".";
        File file=new File(".");
        System.out.println(file.isDirectory());  System.out.println(file.exists());
        System.out.println(file.getName());

        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());
        System.out.println(file.getPath());

    }
}
