package strings;

import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        if (s1.equals(s2)){
            System.out.println("iguais");
        }else{
            System.out.println("diferentes");
        }
        s.close();
    }
}
