package POO_FUNDAMENTAL_EXERCISES;

//Crea una clase Auto con atributos privados: marca (String), modelo (String) y año (int).
//Implementa un constructor para inicializar estos atributos y
//crea métodos mostrarInfo() que imprima todos los datos del auto en una sola línea.
//En el main, crea un objeto y llama a mostrarInfo().


import java.util.Arrays;

class MyAuto {
    private String make;
    private String model;
    private int year;

    MyAuto(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

class Info {
    String mostrarInfo(String make, String model, int year) {
        //imprimer make model year
        System.out.println("PRINT MAKE MODEL YEAR");
        System.out.println(make + " " + model + " " + year);

        return make + model + year;
    }
}

public class ClassFundamentalEx1 {


    public static void main(String[] args) {
        MyAuto auto = new MyAuto("ford", "ranger", 2021);
        Info info = new Info();
        String autoInfo = info.mostrarInfo(auto.getMake(), auto.getModel(), auto.getYear());
        System.out.println("PRINT AUTO INFORMATION");
        System.out.println(autoInfo);
    }
}
