package Ejercicio2;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
    private int numeroAAdivinar;

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas); 
    }

    public boolean validaNumero(int numero) {
        return numero >= 0 && numero <= 10;
    }

    public void juega() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        reiniciaPartida();

        this.numeroAAdivinar = random.nextInt(11);

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Tienes " + numeroDeVidas + " vidas.");

        while (true) {
            System.out.print("Adivina un número entre 0 y 10: ");
            try {
                int intento = scanner.nextInt();

               
                if (!validaNumero(intento)) {
                    System.out.println("Número inválido. Debe estar entre 0 y 10.");
                    continue;
                }

                if (intento == numeroAAdivinar) {
                    System.out.println("¡Acertaste! El número era " + numeroAAdivinar + ".");
                    actualizaRecord();
                    break;
                } else {
                    if (!quitaVida()) {
                        System.out.println("El número era " + numeroAAdivinar + ". ¡Fin del juego!");
                        break; 
                    } else {
                        if (intento < numeroAAdivinar) {
                            System.out.println("Demasiado bajo. Intenta de nuevo.");
                        } else {
                            System.out.println("Demasiado alto. Intenta de nuevo.");
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, ingresa un número válido.");
                scanner.next(); 
            }
        }
    }
}