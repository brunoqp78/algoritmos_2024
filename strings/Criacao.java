package strings;

import java.util.Scanner;

public class Criacao {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = "IFTM";
        String s2 = new String("IFTM");
        String s3 = "IFTM";
        String s4 = s.next();

        System.out.println(s1);
        System.out.println(s2);

        if(s1==s3){
            System.out.println("igual");
        }else{
            System.out.println("diferente");
        }

        if (s1 == s2){
            System.out.println("igual");
        }else{
            System.out.println("diferente");
        }

        if (s1 == s4){
            System.out.println("igual");
        }else{
            System.out.println("diferente");
        }  
        
        s1 = s1 + " Udi centro";
        System.out.println(s1);
        
    }

}
