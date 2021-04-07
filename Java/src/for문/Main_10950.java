package for문;

import java.util.*;

public class Main_10950{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int a = 0;
        int b = 0;
        
        for(int i = 0; i < count; i++){
            a = scan.nextInt();
            b = scan.nextInt();
            System.out.println(a + b);
        }
    }
}
