package Ejercicio2;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero {
    // Constructor
    public JuegoAdivinaImpar(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    @Override
    public boolean validaNumero(int numero) {
        if (!super.validaNumero(numero)) {
            System.out.println("Número inválido. Debe estar entre 0 y 10.");
            return false;
        }
        if (numero % 2 == 0) {
            System.out.println("Número inválido. Debe ser impar.");
            return false;
        }
        return true;
    }
}