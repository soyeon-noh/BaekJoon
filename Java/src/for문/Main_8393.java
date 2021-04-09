package for문;

import java.util.*;

public class Main_8393{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
    
        int num = scan.nextInt();
        int sum = 0;
    
        for(int i = 0; i < num; i++){
            sum += (i + 1);
        }
        System.out.println(sum);
    }
}