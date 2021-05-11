package Ejercicio3;

public class Circulo extends Figura{

    private double radio;

    public Circulo()
    {
        super();
    }

    public Circulo(String color,double radio)
    {
        super(color);
        this.radio=radio;
    }

    public void setRadio(double radio)
    {
        this.radio=radio;
    }

    public double getRadio()
    {
        return radio;
    }

    @Override
    public double calculoArea()
    {
        return Math.PI*Math.pow(radio,2);
    }

    @Override
    public double calculoPerimetro() {
        return Math.PI*radio*2;
    }

    @Override
    public String toString()
    {
        return ""+super.toString()+" Circulo con un radio de ="+radio+" da como resultado un area de = "+calculoArea()+
                " y un perimetro de = "+calculoPerimetro();
    }
}
