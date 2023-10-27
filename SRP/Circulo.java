package SRP;

public class Circulo extends Forma {

    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double calcularArea(){
        return Math.PI*Math.pow(radio,2);
    }
}
