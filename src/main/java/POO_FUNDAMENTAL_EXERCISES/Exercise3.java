package POO_FUNDAMENTAL_EXERCISES;
/*
Crea una clase Auto con atributos privados: marca (String), modelo (String) y año (int). Implementa un constructor para inicializar estos atributos y crea métodos mostrarInfo() que imprima todos los datos del auto en una sola línea. En el main, crea un objeto y llama a mostrarInfo().
 */


class Auto {
    private String marca;
    private String modelo;
    private int anio;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    Auto(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String mostrarInfo() {
        return marca + " " + modelo + " " + anio;
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        Auto objeto = new Auto("Ford", "captiva", 2021);
        String respuesta = objeto.mostrarInfo();
        System.out.println(respuesta);
    }

}
