package Collectpackage;

import java.util.*;

public class Comparatorpractices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Comparator<Integer> com=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list,com);
        list.forEach(System.out::println);
    }
}
