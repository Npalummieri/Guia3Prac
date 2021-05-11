package Ejercicio3;

public abstract class Figura {

   protected String color;

    public Figura()
    {

    }

    public Figura(String color)
    {
        this.color=color;
    }

    public void setColor(String color)
    {
        this.color=color;
    }

    public String getColor()
    {
        return color;
    }



    public abstract double calculoPerimetro();
    public abstract double calculoArea();

    @Override
    public String toString()
    {
        return "[Figura : Color "+color+"]";
    }
}
