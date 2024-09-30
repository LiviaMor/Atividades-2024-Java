public class Fibonacci {
    public static void main(String[] args) {
        int n = 50; // Número de termos desejados
        long[] fibonacci = new long[n];
        
        // Inicializando os dois primeiros termos
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        
        // Calculando os termos seguintes
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        
        // Imprimindo a sequência
        for (int i = 0; i < n; i++) {
            System.out.println("Termo " + (i + 1) + ": " + fibonacci[i]);
        }
    }
}