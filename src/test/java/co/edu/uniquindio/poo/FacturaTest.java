package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.Clientes.Categoria;
import co.edu.uniquindio.poo.Clientes.Estudiante;
import co.edu.uniquindio.poo.Clientes.Profesor;
import co.edu.uniquindio.poo.Productos.Dulce;
import co.edu.uniquindio.poo.Productos.Fruta;
import co.edu.uniquindio.poo.Productos.Panaderia;
import co.edu.uniquindio.poo.Productos.Producto;
import co.edu.uniquindio.poo.Productos.Bebidas.Agua;
import co.edu.uniquindio.poo.Productos.Bebidas.BebidaAlcoholica;
import co.edu.uniquindio.poo.Productos.Bebidas.BebidaAzucarada;
import co.edu.uniquindio.poo.Productos.Bebidas.OrigenAlcohol;
import co.edu.uniquindio.poo.Productos.Bebidas.TipoBebidaAzucarada;

public class FacturaTest {
    private final static Logger LOG = Logger.getLogger(FacturaTest.class.getName());

//Prueba de calculo de factura correcto para un estudiante.
@Test
public void calcularFacturaCorrectamente(){
    LOG.info("inicio de prueba calcular factura correctamente...");
    Estudiante estudiante = new Estudiante("1011081696", "edwin", "viña", "edwin68@gmail.com", (byte)3);
    Panaderia panRollo = new Panaderia("Pan Rollo", 2500, true);
    Dulce nucita = new Dulce("nucita", 2000, (float)0.60);
    BebidaAzucarada cocacola = new BebidaAzucarada("Coca cola", 1800, 0.30, TipoBebidaAzucarada.GASEOSA);
    Fruta guayaba = new Fruta("Guayaba", 5000, 7);
    BebidaAlcoholica aguardiente = new BebidaAlcoholica("Aguardiente", 24000, (float) 0.25, OrigenAlcohol.NACIONAL);
    BebidaAlcoholica jackDaniels = new BebidaAlcoholica("Jack Daniels", 45000, (float) 0.60, OrigenAlcohol.IMPORTADO);
    Agua cristal = new Agua("Cristal", 1500);
    ArrayList<Producto>productos= new ArrayList<>();
    productos.add(panRollo);
    productos.add(nucita);
    productos.add(cocacola);
    productos.add(guayaba);
    productos.add(aguardiente);
    productos.add(jackDaniels);
    productos.add(cristal);
    Factura factura = new Factura(estudiante, productos);
    float precioaPagar= (float)103186.56;
    assertEquals(precioaPagar,factura.costoFinal());
    LOG.info("Fin de prueba calcular factura correctamente...");
}
//calcular factura correctamente con tipo de cliente profesor
    @Test 
    public void calcularFacturaCorrectamente2(){
    LOG.info("inicio prueba calcular factura correctamente...");
        Profesor profesor = new Profesor("79327277", "Daniel", "Cubillos", "Dani69@gmail.com", Categoria.ASOCIADO);
        Panaderia panRollo = new Panaderia("Pan Rollo", 2500, true);
        Dulce nucita = new Dulce("nucita", 2000, (float) 0.60);
        BebidaAzucarada cocacola = new BebidaAzucarada("Coca cola", 1800, 0.30, TipoBebidaAzucarada.GASEOSA);
        Fruta guayaba = new Fruta("Guayaba", 5000, 7);
        BebidaAlcoholica aguardiente = new BebidaAlcoholica("Aguardiente", 24000, (float) 0.25, OrigenAlcohol.NACIONAL);
        BebidaAlcoholica jackDaniels = new BebidaAlcoholica("Jack Daniels", 45000, (float) 0.60, OrigenAlcohol.IMPORTADO);
        Agua cristal = new Agua("Cristal", 1500);
        ArrayList<Producto>productos= new ArrayList<>();
        productos.add(panRollo);
        productos.add(nucita);
        productos.add(cocacola);
        productos.add(guayaba);
        productos.add(aguardiente);
        productos.add(jackDaniels);
        productos.add(cristal);
        Factura factura = new Factura(profesor, productos);
        float precioaPagar = (float) 96336;
        assertEquals(precioaPagar,factura.costoFinal());
        LOG.info("Fin de prueba calcular factura correctamente...");
    }
}