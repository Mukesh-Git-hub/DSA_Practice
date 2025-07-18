package Stringfolder;

public class lastwordlength {
        public int lengthOfLastWord(String s) {
            String word[]=s.split(" ");
            int n=word.length;
            String singleword=  word[n-1];
            return  singleword.length();

        }
    }

