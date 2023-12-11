public class NumerosPrimos {
    public static void main(String[] args) {
        int iterador = 0;
        for (int numeroActual = 2; iterador < 10; numeroActual++) {
            if (esPrimo(numeroActual)) {
                System.out.println(numeroActual);
                iterador++;
            }
        }
    }

    private static boolean esPrimo(int numero) {
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
