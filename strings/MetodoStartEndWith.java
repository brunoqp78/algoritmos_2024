package strings;

import java.util.Scanner;

public class MetodoStartEndWith {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String t1 = s.nextLine();
        String t2 = s.nextLine();
        System.out.println(t1.startsWith(t2));
        System.out.println(t1.endsWith(t2));        
        s.close();
    }
}
