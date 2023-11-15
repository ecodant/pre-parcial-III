package co.edu.uniquindio.poo.Productos.Bebidas;


public class Importada extends BebidaAlcoholica{

public Importada(String nombre,int valor,float alcoholContenido){
    super(nombre, valor, alcoholContenido);
}
@Override
public float calcularPrecio(){
    float precio=(float)(valor*1.3)*(float)(1+(0.3*alcoholContenido));;
    return precio;
}
}
