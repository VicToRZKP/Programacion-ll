import java.util.Scanner;

class EstadisticaPOO {
    
	private double[] numeros;
    
    public EstadisticaPOO(double[] numeros) {
        this.numeros = numeros;
    }
    public double Promedio() {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }
    public double DesviacionEstandar() {
        double promedio = Promedio();
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
        EstadisticaPOO estadistica = new EstadisticaPOO(numeros);
        
        System.out.printf("El promedio es %.2f%n", estadistica.Promedio());
        System.out.printf("La desviación estándar es %.5f%n", estadistica.DesviacionEstandar());

        scanner.close();
    }
}