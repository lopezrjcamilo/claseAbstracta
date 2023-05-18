
public class Vaca extends Mamifero {
    public Vaca(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace: ¡Muu muu!");
    }

    /*
    @Override
    public void dormir() {
        System.out.println(getNombre() + " está durmiendo profundamente...");
    }
    */


    public void comerHierba() {
        System.out.println(getNombre() + " está comiendo hierba.");
    }
}