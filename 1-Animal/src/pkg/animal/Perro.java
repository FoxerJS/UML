package pkg.animal;

public class Perro  extends Animal{

    private String cola;
    private String raza;
    private String color;
    private Double tamaño;

    public String getCola() {
        return cola;
    }

    public void setCola(String cola) {
        this.cola = cola;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getTamaño() {
        return tamaño;
    }

    public void setTamaño(Double tamaño) {
        this.tamaño = tamaño;
    }

    public Perro(String cola, String raza, String color, Double tamaño, String ojos, String boca) {
        super(ojos, boca);
        this.cola = cola;
        this.raza = raza;
        this.color = color;
        this.tamaño = tamaño;
    }

 
}
