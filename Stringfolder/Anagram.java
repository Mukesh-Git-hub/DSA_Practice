package Stringfolder;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        char array[]=  s.toCharArray();
        char array2[]=  t.toCharArray();
        int sum=method(array);
        int sum2=method(array2);
        if(sum==sum2){
            return true;
        }
        return false;
    }
    int method(char[] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=(int)array[i];
        }
        return sum;
    }
}
