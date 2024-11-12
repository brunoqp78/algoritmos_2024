package strings;

import java.util.Scanner;

public class MetodoToUpperToLower {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String t1 = s.nextLine();
        System.out.println(t1.toLowerCase());
        System.out.println(t1.toUpperCase());        
        s.close();
    }
}
