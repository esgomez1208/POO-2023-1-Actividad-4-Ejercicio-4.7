package animales;


public class Prueba {

    public static void main(String[] args) {
        
        Animal[] animales = new Animal[4];
        animales[0] = new gato();
        animales[1] = new perro();
        animales[2] = new lobo();
        animales[3] = new leon();
        for (int i = 0; i < animales.length; i++) {
            System.out.println(animales[i].getNombreCientífico());
            System.out.println("Sonido: " + animales[i].getSonido());
            System.out.println("Alimentos: " + animales[i].getAlimentos());
            System.out.println("Habitad: " + animales[i].getHabitat());
            System.out.println("");
}
    }
}
