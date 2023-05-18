public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Toby");
        perro.hacerSonido();
        perro.dormir();
        perro.moverCola();

        Gato gato = new Gato("Luna");
        gato.hacerSonido();
        gato.dormir();
        gato.moverCola();

        Vaca vaca = new Vaca("Margarita");
        vaca.hacerSonido();
        vaca.dormir();
        vaca.moverCola();
        vaca.comerHierba();
    }
}