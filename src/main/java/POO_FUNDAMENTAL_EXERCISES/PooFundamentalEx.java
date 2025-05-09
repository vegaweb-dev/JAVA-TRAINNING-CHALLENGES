package POO_FUNDAMENTAL_EXERCISES;
//Crea una clase llamada Persona que tenga dos atributos públicos: nombre (String) y edad (int). Luego crea un objeto de esa clase en el método main y asigna valores a esos atributos.

 /*public class PooFundamentalEx {
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

}*/


//Modifica la clase anterior para que los atributos nombre y edad sean privados. Luego crea métodos públicos setNombre, getNombre, setEdad y getEdad para acceder y modificar estos atributos. Usa el main para probarlos.?

public class PooFundamentalEx {
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    PooFundamentalEx(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public static void main(String[] args) {
        PooFundamentalEx objeto = new PooFundamentalEx("carlos", 34);
        System.out.println(objeto.nombre);
        System.out.println(objeto.edad);
    }


}