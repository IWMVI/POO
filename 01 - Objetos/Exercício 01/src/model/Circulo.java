package model;

public class Circulo {

    public double raio;
    public double area;

    public Circulo() {
        super();
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public void setArea(double area) {
        this.area = area;
    }
}
