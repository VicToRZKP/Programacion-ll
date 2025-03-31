import java.util.Scanner;

class Vector { 
   private double x;
   private double y;
   private double z;

public Vector(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
}

public Vector suma(Vector b) {
    return new Vector(this.x + b.x, this.y + b.y, this.z + b.z);
}

public double productoEscalar(Vector b) {
    return this.x * b.x + this.y * b.y + this.z * b.z;
}

public Vector productoVectorial(Vector b) {
    return new Vector(
        this.y * b.z - this.z * b.y,
        this.z * b.x - this.x * b.z,
        this.x * b.y - this.y * b.x
    );
}

public void mostrar() {
    System.out.println("(" + x + ", " + y + ", " + z + ")");
}

public void leerVector(Scanner sc) {
    System.out.print("Ingrese x: ");
    this.x = sc.nextDouble();
    System.out.print("Ingrese y: ");
    this.y = sc.nextDouble();
    System.out.print("Ingrese z: ");
    this.z = sc.nextDouble();
}

}

public class OperacionesVectoriales { public static void main(String[] args) { Scanner sc = new Scanner(System.in);

System.out.println("Ingrese el primer vector:");
    Vector v1 = new Vector(0, 0, 0);
    v1.leerVector(sc);
    
    System.out.println("Ingrese el segundo vector:");
    Vector v2 = new Vector(0, 0, 0);
    v2.leerVector(sc);
    
    System.out.print("Suma: ");
    v1.suma(v2).mostrar();
    
    System.out.println("Producto escalar: " + v1.productoEscalar(v2));
    
    System.out.print("Producto vectorial: ");
    v1.productoVectorial(v2).mostrar();
    
    sc.close();
}

}
