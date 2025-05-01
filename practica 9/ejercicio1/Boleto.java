public abstract class Boleto {
    protected int numero;
    protected double precio;

    public Boleto(int numero) {
        this.numero = numero;
    }

    public abstract double getPrecio();

    @Override
    public String toString() {
        return "Número: " + numero + ", Precio: " + precio;
    }
}
