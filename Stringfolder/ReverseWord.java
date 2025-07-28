package Stringfolder;

public class ReverseWord {
    public static String reverseWords(String s) {
        s = s.trim();
        char array[]=s.toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append(array[0]);
        boolean firstSpace = true;
        for(int i=1;i<array.length;i++) {
            if(sb.charAt(sb.length()-1)==' ' && array[i]==' ') {
                continue;
            }
            else {
                sb.append(array[i]);
            }

        }
        String res = sb.toString();
        String[] rev = res.split(" ");
        String[] str = new String[rev.length];
        for(int i=0;i<(rev.length-1)/2;i++) {
           String temp = rev[i];
           rev[i] = rev[rev.length-1-i];
           rev[rev.length-1-i] = temp;
        }
        for(String i:rev) {
            System.out.println(i);
        }

        return String.join(" ",rev);
    }
    public static void main(String[] args) {
        String s="example  a good";
        String res = reverseWords(s);
        System.out.println(res);
    }

    }

