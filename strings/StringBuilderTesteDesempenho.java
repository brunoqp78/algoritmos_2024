package strings;

public class StringBuilderTesteDesempenho {

    public static final int LIMITETEMPO = 1000;

    public static void main(String[] args) {
        String strFinal = "";
        long tInicio = System.currentTimeMillis();
        for (int i = 0; i < LIMITETEMPO; i++) {
            strFinal += "a";
        }
        long tFim = System.currentTimeMillis();
        long tResultado = tFim - tInicio;
        System.out.println("Tempo de Execução com operador '+' = " + tResultado + " ms");

        StringBuilder strBuilder = new StringBuilder();
        tInicio = System.currentTimeMillis();
        for (int i = 0; i < LIMITETEMPO; i++) {
            strBuilder.append("a");
        }
        tFim = System.currentTimeMillis();
        tResultado = tFim - tInicio;
        System.out.println("Tempo de Execução com StringBuilder = " + tResultado + " ms");
        
    }
}
