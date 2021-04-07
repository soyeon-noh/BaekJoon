package if문;

import java.util.*;

public class Main_2884{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int H = scan.nextInt();
        int M = scan.nextInt();
        
        if(M - 45 < 0){
            H -= 1;
            if(H < 0){
                H += 24;
            }
            M = M - 45 + 60;
        }else{
            M -= 45;
        }
        System.out.println(H);
        System.out.println(M);
    }
}
