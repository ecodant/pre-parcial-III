
package co.edu.uniquindio.poo.Clientes;

public class Profesor extends Cliente {
    private Categoria categoria;

public Profesor(String cedula,String nombre,String apellido,String correo,Categoria categoria){
    super(cedula, nombre, apellido, correo);
    this.categoria=categoria;
}

public Categoria getCategoria() {
    return categoria;
}
@Override
public float calcularDescuento(){
    float descuento=(float)0.03;
    if(this.categoria == Categoria.ASISTENTE){
        descuento=(float)0.05;
    }
    else if (this.categoria == Categoria.ASOCIADO){
        descuento=(float)0.1;
    }
    else if(this.categoria == Categoria.TITULAR){
        descuento=(float) 0.16;
    }
    return descuento;
}
}
