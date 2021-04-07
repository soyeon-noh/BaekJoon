
import java.util.*;

public class Main_2753{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sYear = 0;
        sYear = scan.nextInt();
        
        if(sYear % 4 == 0){
            if(sYear % 100 != 0 || sYear % 400 == 0 ){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }else {
           System.out.println("0");
        }
    }
}