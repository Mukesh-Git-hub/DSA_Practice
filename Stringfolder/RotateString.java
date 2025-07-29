package Stringfolder;

public class RotateString {
    public static void main(String[] args) {
        String s="ABCDE";
        String goal="BCDEA";
        String s3=s+s;
        if(s.length()!=goal.length()) {
            System.out.println("Not match");
        }
        int n=s3.indexOf(goal);
        System.out.println(n);

    }
}
