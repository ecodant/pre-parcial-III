package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;

import co.edu.uniquindio.poo.Clientes.Cliente;
import co.edu.uniquindio.poo.Productos.Producto;
import co.edu.uniquindio.poo.Util.AssertionUtil;

public class Factura {
    private Cliente cliente;
    private Collection<Producto> productos;

public Factura(Cliente cliente){
    AssertionUtil.ASSERTION.assertion(cliente!=null,"el cliente es requerido.");
    this.cliente=cliente;
    this.productos= new ArrayList<>();
    }
public Factura(Cliente cliente, Collection<Producto>productos){
    AssertionUtil.ASSERTION.assertion(cliente!=null,"el cliente es requerido");
    AssertionUtil.ASSERTION.assertion(productos!=null && productos.size()>0,"la lista de productos debe tener al menos un producto");
    this.cliente=cliente;
    this.productos=productos;
}

public Cliente getCliente() {
    return cliente;
}
public Collection<Producto> getProductos() {
    return productos;
}
public float sumatoria(){
    float suma=0;
    for (Producto producto : productos) {
     suma+= producto.calcularPrecio();
    }
    return suma;
}
public float costoFinal(){
    float costo=sumatoria();
    float descuento= cliente.calcularDescuento();
    return costo-costo*descuento;
}
}
