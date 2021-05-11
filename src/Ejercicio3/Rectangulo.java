package Ejercicio3;

public class Rectangulo extends Figura{

    private double base;
    private double altura;

    public Rectangulo()
    {
        super();
    }

    public Rectangulo(String color,double base,double altura)
    {
        super(color);
        this.base=base;
        this.altura=altura;
    }

    @Override
    public double calculoArea() {
        return base*altura;
    }

    @Override
    public double calculoPerimetro()
    {
        return 2*base+2*altura;
    }

    @Override
    public String toString()
    {
        return ""+super.toString()+" Rectangulo : Base "+base+" Altura : "+altura+
                " Da como resultado un area de = "+calculoArea()+" y perimetro de = "+calculoPerimetro();
    }
}
