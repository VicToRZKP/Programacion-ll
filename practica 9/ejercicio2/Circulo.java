package Ejercicio2;

public class Circulo extends Figura {
    private double radio;

    // Constructor
    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circulo [Radio=" + radio + ", " + super.toString() + "]";
    }
}