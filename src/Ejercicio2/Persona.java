package Ejercicio2;

public class Persona {

    private int dni;
    private String nombre;
    private String email;
    private String direcc;



    public Persona()
    {

    }

    public Persona(int dni,String nombre,String email,String direcc)
    {
        this.dni=dni;
        this.nombre=nombre;
        this.email=email;
        this.direcc=direcc;
    }

    public void setDni(int dni)
    {
        this.dni=dni;
    }

    public int getDni()
    {
        return dni;
    }

    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setEmail(String email)
    {
        this.email=email;
    }

    public String getEmail()
    {
        return email;
    }

    public void setDirecc(String direcc)
    {
        this.direcc=direcc;
    }

    public String getDirecc()
    {
        return direcc;
    }


    public String toString()
    {
        return "Sujeto [ DNI : "+dni+" Nombre y Apellido :"+nombre+" Email : "+email+" Direccion : "+direcc+"]";

    }





}
