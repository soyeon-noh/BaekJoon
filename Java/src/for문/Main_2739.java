package for문; //구구

import java.util.*;

public class Main_2739{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int dan = scan.nextInt();
        
        for(int i = 0; i < 9; i++){
            System.out.printf("%d * %d = %d\n"
                              , dan, i+1, dan * (i+1));
        }
    }
}
