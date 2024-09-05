public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //tipos primitivos de variaveis no Java
        
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        System.out.println(numero);
        numero = 10;

        System.out.println(numero);
        
        final double valorDePi = 3.14;
    }
}
