package co.edu.uniquindio.poo.Productos.Bebidas;

import co.edu.uniquindio.poo.Productos.Producto;
import co.edu.uniquindio.poo.Util.AssertionUtil;

public class BebidaAlcoholica extends Producto{
    protected double alcoholContenido;
    protected OrigenAlcohol origen;

public BebidaAlcoholica(String nombre,int valor,double alcoholContenido, OrigenAlcohol origen){
    super(nombre, valor);
    AssertionUtil.ASSERTION.assertion(alcoholContenido>0 && alcoholContenido<=1,"el alcohol contenido debe ser superior a (0) e inferior o igual a (1)");
    AssertionUtil.ASSERTION.assertion(origen != null,"El origen tiene que ser declarado.");
    this.alcoholContenido=alcoholContenido;
    this.origen = origen;
}
public double getAlcoholContenido(){
    return alcoholContenido;
}
public double getOrigen(){
    return origen;
}
public float calcularPrecio(){
    if (this.origen == OrigenAlcohol.NACIONAL) {
        float precio = valor;
        double impuesto = Math.pow(0.02,alcoholContenido);
        double impuestoMax = Math.pow(0.02,0.5);
        if (alcoholContenido<=0.5) {
          precio = (float)(valor + valor * impuesto);  
        }
        else{
            precio = (float)(valor + valor * impuestoMax) ;
        };
        return precio;
    }
    else{
        float precio=(float)(valor*1.3)*(float)(1+(0.3*alcoholContenido));;
        return precio;
    }
}
}
