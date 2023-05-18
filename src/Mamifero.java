public abstract class Mamifero {
    private String nombre;

    public Mamifero(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void hacerSonido();

    public void dormir() {
        System.out.println(nombre + " está durmiendo...");
    }

    public void moverCola() {
        System.out.println(nombre + " está moviendo la cola.");
    }
}