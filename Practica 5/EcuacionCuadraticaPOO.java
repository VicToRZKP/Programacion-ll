import java.util.Scanner;

public class EcuacionCuadraticaPOO {
    private double a;
    private double b;
    private double c;

    public EcuacionCuadraticaPOO(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        return (b * b) - (4 * a * c);
    }

    public void resolverEcuacion() {
        if (a == 0) {
            System.out.println("No es una ecuación cuadrática válida (a no puede ser 0).");
            return;
        }

        double discriminante = getDiscriminante();

        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("La ecuación tiene 2 raíces reales: " + raiz1 + " y " + raiz2);
        } else if (discriminante == 0) {
            double raiz = -b / (2 * a);
            System.out.println("La ecuación tiene una única raíz real: " + raiz);
        } else {
            System.out.println("La ecuación no tiene raíces reales.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el valor de c: ");
        double c = scanner.nextDouble();

        EcuacionCuadraticaPOO ecuacion = new EcuacionCuadraticaPOO(a, b, c);
        ecuacion.resolverEcuacion();

        scanner.close();
    }
}