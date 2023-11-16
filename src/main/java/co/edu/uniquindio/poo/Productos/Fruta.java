package co.edu.uniquindio.poo.Productos;

import co.edu.uniquindio.poo.Util.AssertionUtil;

public class Fruta extends Producto {
    private float peso;

public Fruta(String nombre,int valor,float peso){
    super(nombre, valor);
    AssertionUtil.ASSERTION.assertion( peso > 0,"el peso debe tener un valor positivo.");
    this.peso = peso;
}
public float getPeso(){
    return peso;
}
@Override
public float calcularPrecio(){
    float precio = valor;
    double impuestoInicial = 0.07;
    int i = 3;
    if (peso > 3 && peso <= 10) {
    while ( i < peso) {
        i += 1;
        impuestoInicial -= 0.01;
    }
    precio = (float)(valor + valor * impuestoInicial);
    }
    else if (peso > 10) {
        precio = valor;
    }
    else{
        precio = valor+(float)( valor * 0.07);
    }
    return precio;
}
}
