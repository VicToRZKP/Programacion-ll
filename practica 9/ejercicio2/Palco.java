
public class Palco extends Boleto {
    public Palco(int numero) {
        super(numero);
        this.precio = 100.0;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
