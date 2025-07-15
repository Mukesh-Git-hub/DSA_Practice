package ArrayFolder;

public class suma {
    public static void main(String[] args) {
        String s="a racer";
        String word=s.replace(" ","");
      char c[]=  word.toCharArray();
      for(int i=c.length-1;i>=0;i--){
          System.out.println(c[i]);
      }
        String str = new String(c);
        System.out.println(str);
    }


}
