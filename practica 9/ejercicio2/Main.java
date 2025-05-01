package Ejercicio2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Figura[] figuras = new Figura[5];

        for (int i = 0; i < figuras.length; i++) {
            int tipoFigura = random.nextInt(2) + 1; 
            String color = getRandomColor();

            if (tipoFigura == 1) {
                double lado = random.nextDouble() * 10 + 1; 
                figuras[i] = new Cuadrado(lado, color);
            } else {
                double radio = random.nextDouble() * 10 + 1;
                figuras[i] = new Circulo(radio, color);
            }
        }

        for (Figura figura : figuras) {
            System.out.println(figura);

            System.out.println("Área: " + figura.area());
            System.out.println("Perímetro: " + figura.perimetro());

            if (figura instanceof Coloreado) {
                Coloreado coloreado = (Coloreado) figura;
                System.out.println("Cómo colorear: " + coloreado.comoColorear());
            }

            System.out.println("-------------------------------------");
        }
    }

    private static String getRandomColor() {
        String[] colors = {"Rojo", "Azul", "Verde", "Amarillo", "Rosa"};
        return colors[new Random().nextInt(colors.length)];
    }
}