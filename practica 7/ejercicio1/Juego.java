public class Juego {
    protected int numeroDeVidas;
    protected int record;

    public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.record = 0; 
    }
    public void reiniciaPartida() {
        System.out.println("Reiniciando partida...");
        this.numeroDeVidas = 3; 
        this.record = 0;
    }

    public void actualizaRecord() {
        System.out.println("Actualizando récord...");
        this.record++;
    }

    public boolean quitaVida() {
        if (this.numeroDeVidas > 0) {
            this.numeroDeVidas--;
            System.out.println("Te has equivocado. Te quedan " + this.numeroDeVidas + " vidas.");
            return true;
        } else {
            System.out.println("Has perdido todas tus vidas. Fin del juego.");
            return false; 
        }
    }
}
