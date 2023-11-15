package co.edu.uniquindio.poo.Productos.Bebidas;

import co.edu.uniquindio.poo.Productos.Producto;

public class Agua extends Producto{

public Agua(String nombre,int valor){
    super(nombre, valor);
}
@Override
public float calcularPrecio(){
    return valor;
}
}
