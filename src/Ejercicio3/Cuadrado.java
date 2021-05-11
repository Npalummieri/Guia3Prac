package Ejercicio3;

public class Cuadrado extends Figura{

    private double lado;

    public Cuadrado()
    {
        super();
    }

    public Cuadrado(String color,double lado)
    {
        super(color);
        this.lado=lado;
    }

    public void setLado(double lado)
    {
        this.lado=lado;
    }

    public double getLado()
    {
        return lado;
    }

    @Override
    public double calculoPerimetro() {
        return lado*4;
    }

    @Override
    public double calculoArea() {
        return Math.pow(lado,2);
    }

    @Override
    public String toString()
    {
        return ""+super.toString()+" Los lados del cuadrado miden = "+lado+" dando un perimetro de ="+calculoPerimetro()+
                " y un area de ="+calculoArea();
    }
}
