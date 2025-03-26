import java.util.Scanner;

public class EstadisticaModular {
    
    public static double calcularPromedio(double[] numeros) {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    public static double calcularDesviacion(double[] numeros, double promedio) {
        double sumaDiferencias = 0;
        for (double num : numeros) {
            sumaDiferencias += Math.pow(num - promedio, 2);
        }
        return Math.sqrt(sumaDiferencias / (numeros.length - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        
        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextDouble();
        }
        
        double promedio = calcularPromedio(numeros);
        double desviacion = calcularDesviacion(numeros, promedio);
        
        System.out.printf("El promedio es %.2f%n", promedio);
        System.out.printf("La desviación estándar es %.5f%n", desviacion);

        scanner.close();
    }
}
