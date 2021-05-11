package Ejercicio1;

public class Circulo {
     private double radio=1.0;
     private String color="rojo";

     public Circulo()
     {

     }

     public Circulo(double radio,String color) ///Si siempre voy a tener el valor de radio podria calcular Area desde el inicio
     {
         this.radio=radio;
         this.color=color;
     }

     public void setRadio(double radio)
     {
         this.radio=radio;
     }

     public double getRadio()
     {
         return radio;
     }

     public void setColor(String color)
     {
         this.color=color;
     }

     public String getColor()
     {
         return color;
     }

     public double calcularArea()
     {
         return Math.PI*Math.pow(getRadio(),2);
     }

     @Override
    public String toString()
     {
         return "Circulo = [Radio : "+radio+" Color : "+color+" Area : "+calcularArea()+"]";
     }





}
