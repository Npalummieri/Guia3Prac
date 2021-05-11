package Ejercicio2;

public class Staff extends Persona {

    private double salario;
    private char turno;

    public Staff()
    {
        super();
    }

    public Staff(int dni,String nombre,String email,String direcc,double salario,char turno)
    {
        super(dni,nombre,email,direcc);
        this.salario=salario;
        this.turno=turno;
    }

    public void setSalario(double salario)
    {
        this.salario=salario;
    }

    public double getSalario()
    {
        return salario;
    }

    public void setTurno(char turno)
    {
        this.turno=turno;
    }

    public char getTurno()
    {
        return turno;
    }

    @Override
    public String toString()
    {
        return ""+super.toString()+"|STAFF| Salario : "+salario+" Turno : "+turno;
    }

    public double salarioAnual()
    {
        return getSalario()*13;
    }

}
