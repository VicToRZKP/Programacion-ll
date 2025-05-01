public class Galeria extends Boleto {
    private int diasAnticipacion;

    public Galeria(int numero, int diasAnticipacion) {
        super(numero);
        this.diasAnticipacion = diasAnticipacion;
        this.precio = calcularPrecio();
    }

    private double calcularPrecio() {
        if (diasAnticipacion >= 10) {
            return 25.0; 
        } else {
            return 30.0; 
        }
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
