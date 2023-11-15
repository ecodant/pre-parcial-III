package co.edu.uniquindio.poo.Productos;

public class Panaderia extends Producto {
    private boolean conservantes;

public Panaderia(String nombre,int valor,boolean conservantes){
    super(nombre, valor);
    this.conservantes=conservantes;
}
public boolean getConservantes(){
    return conservantes;
}
@Override
public float calcularPrecio(){
    float precio=valor;
    if (conservantes==true) {
        precio= (float)(valor+valor*0.18);
    }
    return precio;
}
}
