public class Platea extends Boleto {
    private int diasAnticipacion;

    public Platea(int numero, int diasAnticipacion) {
        super(numero);
        this.diasAnticipacion = diasAnticipacion;
        this.precio = calcularPrecio();
    }

    private double calcularPrecio() {
        if (diasAnticipacion >= 10) {
            return 50.0;
        } else {
            return 60.0; 
        }
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
