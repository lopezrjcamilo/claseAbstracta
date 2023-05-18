
public class Perro extends Mamifero {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace: ¡Guau guau!");
    }
}
