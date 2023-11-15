package co.edu.uniquindio.poo.Productos.Bebidas;

import co.edu.uniquindio.poo.Productos.Producto;
import co.edu.uniquindio.poo.Util.AssertionUtil;

public class BebidaAzucarada extends Producto {
    private double azucarContenido;
    private TipoBebidaAzucarada tipo;

public BebidaAzucarada(String nombre,int valor,double azucarContenido,TipoBebidaAzucarada tipo){
    super(nombre, valor);
    AssertionUtil.ASSERTION.assertion(azucarContenido>=0 && azucarContenido<=1,"el azucar contenido debe estar entre (0 y 1).");
    this.azucarContenido = azucarContenido;
}
public double getAzucarContenido(){
    return azucarContenido;
}
public TipoBebidaAzucarada getTipoBebidaAzucarada(){
    return tipo;
}
@Override 
public float calcularPrecio(){
    float precio=0;
    if (azucarContenido > 0.35) {
        precio = (float) (valor+valor*0.25);
    }
    else{
        precio = (float) (valor+valor*0.05);
    }
    return precio;
}
}
