import java.util.Scanner;

public class EcuacionCuadraticaModular {
    
    
    public static double calcularDiscriminante(double a, double b, double c) {
        return (b * b) - (4 * a * c);
    }
    public static double calcularRaiz1(double a, double b, double discriminante) {
        return (-b + Math.sqrt(discriminante)) / (2 * a);
    }
    public static double calcularRaiz2(double a, double b, double discriminante) {
        return (-b - Math.sqrt(discriminante)) / (2 * a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el coeficiente a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el coeficiente b: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese el coeficiente c: ");
        double c = scanner.nextDouble();
        double discriminante = calcularDiscriminante(a, b, c);

        if (discriminante > 0) {
            double raiz1 = calcularRaiz1(a, b, discriminante);
            double raiz2 = calcularRaiz2(a, b, discriminante);
            System.out.println("La ecuación tiene dos raíces: " + raiz1 + " y " + raiz2);
        } else if (discriminante == 0) {
            double raiz = calcularRaiz1(a, b, discriminante);
            System.out.println("La ecuación tiene una raíz única: " + raiz);
        } else {
            System.out.println("La ecuación no tiene raíces reales.");
        }

        scanner.close();
    }
}