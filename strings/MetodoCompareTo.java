package strings;

import java.util.Scanner;

public class MetodoCompareTo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String t1 = s.nextLine();
        String t2 = s.nextLine();
        System.out.println(t1.equals(t2));
        System.out.println(t1.compareTo(t2));

        if (t1.compareTo(t2)< 0){
            System.out.println(t1);
            System.out.println(t2);
        }else{
            System.out.println(t2);
            System.out.println(t1);
        }

        s.close();
    }
}
