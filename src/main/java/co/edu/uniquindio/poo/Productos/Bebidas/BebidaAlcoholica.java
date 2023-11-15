package co.edu.uniquindio.poo.Productos.Bebidas;

import co.edu.uniquindio.poo.Productos.Producto;
import co.edu.uniquindio.poo.Util.AssertionUtil;

public abstract class BebidaAlcoholica extends Producto{
    protected double alcoholContenido;

public BebidaAlcoholica(String nombre,int valor,double alcoholContenido){
    super(nombre, valor);
    AssertionUtil.ASSERTION.assertion(alcoholContenido>0 && alcoholContenido<=1,"el alcohol contenido debe ser superior a (0) e inferior o igual a (1)");
    this.alcoholContenido=alcoholContenido;
}
public double getAlcoholContenido(){
    return alcoholContenido;
}
@Override
public float calcularPrecio(){
    return 0;
}
}
