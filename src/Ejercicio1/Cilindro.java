package Ejercicio1;

public class Cilindro extends Circulo {

    private double altura = 1.0;
    private double areaBase;

    public Cilindro() {
        super();
    }

    public Cilindro(double radio, String color, double altura, double areaBase) {
        super(radio, color);
        this.altura = altura;
        this.areaBase = areaBase;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
    }

    public double getAreaBase() {
        return areaBase;
    }

    public double calcularVolumen()
    {
        return Math.PI*Math.pow(getRadio(),2)*altura;
    }

    /* lo comenté por un error que salta en el 2do ejercicio (nada que ver) para que no moleste
    @Override
    public double calcularArea() {
        return 2*Math.PI*(getRadio()*altura) + 2*Math.PI*Math.pow(getRadio()*2);
    }

     */

    @Override
    public String toString()
    {
        return "Cilindro subclase de :"+super.toString()+"[Radio : "+getRadio()+" Altura : "+altura+" Area base : "+areaBase+" Volumen :"+calcularVolumen();
    }
}
