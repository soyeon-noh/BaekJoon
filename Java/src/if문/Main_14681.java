package if문;

import java.util.*;

public class Main_14681{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        
        if(y > 0){
            if( x > 0 ){
                System.out.println("1");
            }else{
                System.out.println("2");
            }
        }else{
            if( x > 0 ){
                System.out.println("4");
            }else{
                System.out.println("3");
            }
        }
    }
}