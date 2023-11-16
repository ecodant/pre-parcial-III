package co.edu.uniquindio.poo.Productos.Bebidas;

import co.edu.uniquindio.poo.Productos.Producto;
import co.edu.uniquindio.poo.Util.AssertionUtil;

public class BebidaAlcoholica extends Producto{
    protected double alcoholContenido;
    protected OrigenAlcohol origen;

    public BebidaAlcoholica(String nombre,int valor,double alcoholContenido, OrigenAlcohol origen){
        super(nombre, valor);
        AssertionUtil.ASSERTION.assertion(alcoholContenido > 0 && alcoholContenido <= 1,"el alcohol contenido debe ser superior a (0) e inferior o igual a (1)");
        AssertionUtil.ASSERTION.assertion(origen != null,"El origen tiene que ser declarado.");
        this.alcoholContenido = alcoholContenido;
        this.origen = origen;
    }
    public double getAlcoholContenido(){
        return alcoholContenido;
    }
    public OrigenAlcohol getOrigen(){
        return origen;
    }
    @Override  
    public float calcularPrecio(){
        float precio;
        if (this.origen == OrigenAlcohol.NACIONAL) {
            precio = valor;
            double impuesto = 0.02 * alcoholContenido;
            double impuestoMax = 0.02 * 0.5;
            if (alcoholContenido <= 0.5) {
                precio = (float) (valor + valor * impuesto);  
            }
            else{
                precio = (float) (valor + valor * impuestoMax);
            }
            return precio;
        }
        else{
            precio = (float) (valor * 1.3) * (float) (1 + (0.3 * alcoholContenido));
            return precio;
        }
    }
}


