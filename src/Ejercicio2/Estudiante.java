package Ejercicio2;

public class Estudiante extends Persona {

    private int anioIngreso;
    private double cuota;
    private String carrera;

    public Estudiante(){
        super();
    }

    public Estudiante(int dni,String nombre,String email,String direcc,int anioIngreso,int cuota,String carrera)
    {
        super(dni,nombre,email,direcc);
        this.anioIngreso=anioIngreso;
        this.cuota=cuota;
        this.carrera=carrera;
    }

    public void setAnioIngreso(int anioIngreso)
    {
        this.anioIngreso=anioIngreso;
    }

    public int getAnioIngreso()
    {
        return anioIngreso;
    }

    public void setCuota(double cuota)
    {
        this.cuota=cuota;
    }

    public double getCuota()
    {
        return cuota;
    }

    public void setCarrera(String carrera)
    {
        this.carrera=carrera;
    }

    public String getCarrera()
    {
        return carrera;
    }

    public String toString()
    {
        return ""+super.toString()+"|ALUMNO|  Ingreso : "+anioIngreso+" Valor cuota : "+cuota+" Carrera "+carrera;
    }



}
