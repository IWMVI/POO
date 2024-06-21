package model;

public class Trapezio extends Quadrilatero {
    private float baseMenor;

    public Trapezio(float baseMaior, float baseMenor, float altura) {
        super(baseMaior, altura);
        this.baseMenor = baseMenor;
    }

    public float getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(float baseMenor) {
        this.baseMenor = baseMenor;
    }

    @Override
    public float calcArea() {
        return ((getBase() + baseMenor) * getAltura()) / 2;
    }
}
