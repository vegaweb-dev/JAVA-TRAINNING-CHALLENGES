package POO_FUNDAMENTAL_EXERCISES;

public class PooFundamentalEx {
    public String nombre;
    public int edad;

    PooFundamentalEx(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public static void main(String[] args) {

        PooFundamentalEx obj = new PooFundamentalEx("carlos", 34);
        System.out.println("mi nombre es: " + obj.nombre + " mi edad es: " + obj.edad);
    }

}
