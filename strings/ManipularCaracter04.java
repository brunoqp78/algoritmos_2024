package strings;

import java.util.Scanner;

public class ManipularCaracter04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char car = s.next().charAt(0);
        char car2 = s.next().charAt(0);
        car = (char) (car + 3);
        System.out.println(car);
        car += 3;
        System.out.println(car);
        
        System.out.println(car2-car);
        s.close();
    }
}
