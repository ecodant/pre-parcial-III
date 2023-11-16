package co.edu.uniquindio.poo.Productos;

import co.edu.uniquindio.poo.Util.AssertionUtil;

public class Dulce extends Producto {
    private float azucarContenido;

    public Dulce(String nombre,int valor,float azucarContenido){
        super(nombre, valor);
        AssertionUtil.ASSERTION.assertion(azucarContenido>=0,"el azúcar contenido no puede ser negativo");
        this.azucarContenido=azucarContenido;
    }
    public float getAzucarContenido(){
        return azucarContenido;
    }
    @Override
    public float calcularPrecio(){
        float precio=0;
        if (azucarContenido>0.5) {
            precio = (float) (valor+valor*0.20);
        }
        else {
            precio= (float)(valor+valor*0.10);
        }
        return precio;
    }
}
