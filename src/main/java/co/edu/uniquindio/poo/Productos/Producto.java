package co.edu.uniquindio.poo.Productos;

import co.edu.uniquindio.poo.Util.AssertionUtil;

public abstract class Producto {
    protected String nombre;
    protected int valor;

    public Producto(String nombre,int valor){
        AssertionUtil.ASSERTION.assertion(nombre!=null && !nombre.isBlank(),"el nombre del producto es requerido.");
        AssertionUtil.ASSERTION.assertion(valor>=0,"el valor no puede ser negativo.");
        this.nombre=nombre;
        this.valor=valor;
    }

    public String getNombre() {
        return nombre;
    }

    public int getValor() {
        return valor;
    }
    public abstract float calcularPrecio();
}
