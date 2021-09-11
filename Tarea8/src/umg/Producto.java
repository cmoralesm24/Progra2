
package umg;


public class Producto implements Comprador {
    int id;
    String nombre;
    double precio;

    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public boolean igualQue(Object par1) {
        Producto p =(Producto)par1;
        return this.precio==p.precio;
    }

    @Override
    public boolean menorQue(Object par2) {
        Producto p =(Producto)par2;
        return this.precio==p.precio;
    }

    @Override
    public boolean menorIgualQue(Object par3) {
        Producto p =(Producto)par3;
        return this.precio==p.precio;
    }

    @Override
    public boolean mayorQue(Object par4) {
        Producto p =(Producto)par4;
        return this.precio==p.precio;
    }

    @Override
    public boolean mayorIgualQue(Object par5) {
        Producto p =(Producto)par5;
        return this.precio==p.precio;
    }
    
}
