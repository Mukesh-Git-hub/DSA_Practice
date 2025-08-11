package SlidingWindow;

import java.util.HashSet;

public class Lengthofsubstringnorepeat {
    void method(){
        String s="abcabcbb";
        int left=0;
        int right=0;
        int n=s.length();
        HashSet<Character> set = new HashSet<>();
        int maxlength=0;
        while(right<n){
            char current = s.charAt(right);
            while (set.contains(current)) {
                set.remove(s.charAt(left));
                           left++;
            }
            set.add(current);
            maxlength = Math.max(maxlength, right - left + 1);
            right++;
                    }
        System.out.println("maxlength"+maxlength);
    }



}
