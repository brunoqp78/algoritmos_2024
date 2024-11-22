package strings;

public class StringBuilderExemplo01 {
    public static void main(String[] args) {
        StringBuilder t1 = new StringBuilder(20);
        System.out.println(t1.capacity());
        t1.append("IFTM");
        System.out.println(t1);
        t1.append(" Udi ");
        t1.append("Centro");
        System.out.println(t1);
        t1.insert(0, "Campus ");
        System.out.println(t1);
        t1.delete(0, 2);
        System.out.println(t1);
        t1.replace(0, 4, "Campus");
        System.out.println(t1);
        t1.reverse();
        System.out.println(t1);
        System.out.println(t1.capacity());
        t1.append("09504579457092457945709570945709357039857458438573654590739");
        System.out.println(t1.capacity());
        t1.append(new StringBuffer());
    }
}
