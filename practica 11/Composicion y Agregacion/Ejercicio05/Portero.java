package Composicion5;

public class Portero extends Jugador {
    private String habilidadEspecial;

    public Portero(String nombre, int numero, String habilidadEspecial) {
        super(nombre, numero, "Portero");
        this.habilidadEspecial = habilidadEspecial;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Habilidad especial: " + habilidadEspecial);
    }
}