
package umg;


public class Alumno implements Comprador{
    String carne;
    String nombre;
    int edad;

    public Alumno(String carne, String nombre, int edad) {
        this.carne = carne;
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public boolean igualQue(Object par1) {
        Alumno a = (Alumno)par1;
        return this.edad==a.edad;
    }

    @Override
    public boolean menorQue(Object par2){
        Alumno a = (Alumno)par2;
        return this.edad==a.edad; 
    }

    @Override
    public boolean menorIgualQue(Object par3) {
        Alumno a = (Alumno)par3;
        return this.edad==a.edad;
    }

    @Override
    public boolean mayorQue(Object par4) {
        Alumno a = (Alumno)par4;
        return this.edad==a.edad;

    }

    @Override
    public boolean mayorIgualQue(Object par5) {
        Alumno a = (Alumno)par5;
        return this.edad==a.edad;
    }


  
}
