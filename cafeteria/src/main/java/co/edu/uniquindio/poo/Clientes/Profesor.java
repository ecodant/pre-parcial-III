package co.edu.uniquindio.poo.Productos.Bebidas;

public class Nacional extends BebidaAlcoholica {
    public Nacional(String nombre,int valor,double alcoholContenido){
        super(nombre, valor, alcoholContenido);
    }
    @Override
    public float calcularPrecio(){
        float precio=valor;
        double impuesto=0.02*alcoholContenido;
        double impuestoMax= 0.02*0.5;
        if (alcoholContenido<=0.5) {
          precio = (float)(valor+valor*impuesto);
        }
        else{
            precio = (float)(valor+valor*impuestoMax) ;
        };
        return precio;
    }
}