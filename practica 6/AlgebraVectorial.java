// ejercicio 1

import java.util.Scanner;

public class AlgebraVectorial { 
  private double x;
  private double y;
  private double z;

  public AlgebraVectorial(double x, double y, double z) {
      this.x = x;
      this.y = y;
      this.z = z;
  }
  
  public boolean esPerpendicularA(AlgebraVectorial b) {
      return this.productoPunto(b) == 0;
  }
  
  public boolean esParaleloA(AlgebraVectorial b) {
      return this.productoCruz(b).esCero();
  }
  
  public AlgebraVectorial proyeccionSobre(AlgebraVectorial b) {
      double escalar = this.productoPunto(b) / b.productoPunto(b);
      return b.multiplicarPorEscalar(escalar);
  }
  
  public double componenteEn(AlgebraVectorial b) {
      return this.productoPunto(b) / b.magnitud();
  }
  
  public double productoPunto(AlgebraVectorial b) {
      return this.x * b.x + this.y * b.y + this.z * b.z;
  }
  
  public AlgebraVectorial productoCruz(AlgebraVectorial b) {
      return new AlgebraVectorial(
          this.y * b.z - this.z * b.y,
          this.z * b.x - this.x * b.z,
          this.x * b.y - this.y * b.x
      );
  }
  
  public AlgebraVectorial multiplicarPorEscalar(double escalar) {
      return new AlgebraVectorial(this.x * escalar, this.y * escalar, this.z * escalar);
  }
  
  public double magnitud() {
      return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
  }
  
  public boolean esCero() {
      return this.x == 0 && this.y == 0 && this.z == 0;
  }
  
  public String toString() {
      return "(" + x + ", " + y + ", " + z + ")";
  }
  
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Ingrese las coordenadas del vector a (x, y, z):");
      double ax = scanner.nextDouble();
      double ay = scanner.nextDouble();
      double az = scanner.nextDouble();
      
      System.out.println("Ingrese las coordenadas del vector b (x, y, z):");
      double bx = scanner.nextDouble();
      double by = scanner.nextDouble();
      double bz = scanner.nextDouble();
      
      AlgebraVectorial a = new AlgebraVectorial(ax, ay, az);
      AlgebraVectorial b = new AlgebraVectorial(bx, by, bz);
      
      System.out.println("¿Son perpendiculares? " + a.esPerpendicularA(b));
      System.out.println("¿Son paralelos? " + a.esParaleloA(b));
      System.out.println("Proyección de a sobre b: " + a.proyeccionSobre(b));
      System.out.println("Componente de a en b: " + a.componenteEn(b));
      
      scanner.close();
  }
}
