package strings;

import java.util.Scanner;

public class ManipularCaracter03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int car = s.next().charAt(0);
        if (car >= 'a' && car <= 'z'){
            System.out.println(car + " é minusculo");
        }else if (car >= 65 && car <= 90){
            System.out.println(car + " é maiusculo");
        }else{
            System.out.println(car + " não é letra");
        }
        
        s.close();
    }
}
