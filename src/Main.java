import Ejercicio1.Cilindro;
import Ejercicio1.Circulo;

import Ejercicio2.Estudiante;
import Ejercicio2.Persona;
import Ejercicio2.Staff;
import Ejercicio3.Cuadrado;
import Ejercicio3.Rectangulo;

public class Main {

    public static void main(String[] args) {

       /*                                                      PUNTO 1
        Circulo circulito1 = new Circulo(2.5,"verde");
        Cilindro cilindrito1 = new Cilindro(2.5,"verde",8,5);
        Cilindro cilindrito2 =new Cilindro(3,"rojo",10,5);

        System.out.println(circulito1.calcularArea());
        System.out.println(circulito1);
        System.out.println(circulito1.toString());

        System.out.println(cilindrito1.calcularVolumen());
        System.out.println(cilindrito1.toString());

        */

        /*                                                     PUNTO 2
        Persona humano1 = new Persona(41392592,"Martino Martinez","martinez@gmail.com","Salta 2523");
        Estudiante student1 =new Estudiante(111111,"Gonzalo Gonzales","gonza1@gmail.com","Jujuy 1111",2020,5500,"Programacion");
        Estudiante student2 =new Estudiante(222222,"Gonzalo Perez","gonza2@gmail.com","Jujuy 2222",2021,2000,"Ingeneria");
        Estudiante student3 =new Estudiante(333333,"Gonzalo Martinez","gonza3@gmail.com","Jujuy 3333",2019,2200,"Sistemas");
        Estudiante student4 =new Estudiante(444444,"Gonzalo Romero","gonza4@gmail.com","Jujuy 4444",2020,5500,"Informatica");
        Staff empleado1 = new Staff(55555,"Empleado 1","empleado1@gmail.com","Santa Cruz 1111",20000,'m');
        Staff empleado2 = new Staff(66666,"Empleado 2","empleado2@gmail.com","Santa Cruz 2222",10000,'n');
        Staff empleado3 = new Staff(77777,"Empleado 3","empleado3@gmail.com","Santa Cruz 3333",10000,'n');
        Staff empleado4  = new Staff(88888,"Empleado 4","empleado4@gmail.com","Santa Cruz 4444",20000,'m');

        System.out.println(humano1.toString());
        System.out.println(student1.toString());
        System.out.println(empleado1.toString());
        System.out.println(empleado1.salarioAnual());

        Persona[] personas = new Persona[8];

        personas[0] = student1;
        personas[1] = student2;
        personas[2] = student3;
        personas[3] = student4;
        personas[4] = empleado1;
        personas[5] = empleado2;
        personas[6] = empleado3;
        personas[7] = empleado4;

        int emp=0;
        int est=0;
        for(Persona pers : personas) ///En este caso asumo que sirve el else xq solo contamos con 2 tipos de personas
        {
            if(pers !=null)
            {
                if(pers instanceof Staff)
                {
                    emp++;
                }else
                {
                    est++;
                }
            }

        }

        System.out.println("En el instituo hay : "+emp+" empleados");
        System.out.println("En el instituo hay : "+est+" estudiantes");

        double totalCuotas=0;
        for(Persona pers : personas)
        {
            if(pers != null && pers instanceof Estudiante)
            {
                totalCuotas=totalCuotas+ ((Estudiante) pers).getCuota()*12;
            }

        }
        System.out.println("Total de dinero recaudado por la institucion = "+totalCuotas);


    */

        /*                                                  PUNTO 3
        Rectangulo rectangulin = new Rectangulo("Rojo",5,3);
        Circulo circulin = new Circulo(4,"Azul");  ///No tengo idea porque el constructor esta al reves acá wtf
        Cuadrado cuadradin = new Cuadrado("Verde",2);

        System.out.println(rectangulin.toString());
        System.out.println(circulin.toString());
        System.out.println(cuadradin.toString());

         */
    }

    /*
    Considerar que en el ultimo no los puse en un arreglo,ver 'getClass().getSimpleName()' En general parece bastante bien
    Sigo medio confundido en la cantidad de funciones que puedo llegar a usar en el main sin que parezca sobrecargado
    pero sin hacer que las funciones hagan de más.

    REPASAR FOR EACH Y EL MANEJO DE ARRAYS!

     */




}
