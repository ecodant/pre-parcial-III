package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.Clientes.Estudiante;
import co.edu.uniquindio.poo.Productos.Dulce;
import co.edu.uniquindio.poo.Productos.Panaderia;
import co.edu.uniquindio.poo.Productos.Producto;
import co.edu.uniquindio.poo.Productos.Bebidas.BebidaAzucarada;
import co.edu.uniquindio.poo.Productos.Bebidas.TipoBebidaAzucarada;

public class FacturaTest {
    private final static Logger LOG = Logger.getLogger(FacturaTest.class.getName());

@Test
public void calcularFacturaCorrectamente(){
    LOG.info("inicio de prueba calcular factura correctamente...");
    Estudiante estudiante = new Estudiante("1011081696", "edwin", "viña", "edwin68@gmail.com", (byte)3);
    Panaderia panRollo = new Panaderia("Pan Rollo", 2500, true);
    Dulce nucita = new Dulce("nucita", 2000, (float)0.60);
    BebidaAzucarada cocacola = new BebidaAzucarada("Coca cola", 1800, 0.30, TipoBebidaAzucarada.GASEOSA);
    ArrayList<Producto>productos= new ArrayList<>();
    productos.add(panRollo);
    productos.add(nucita);
    productos.add(cocacola);
    Factura factura = new Factura(estudiante, productos);
    float precioaPagar= (float)6979.36;
    assertEquals(precioaPagar,factura.costoFinal());
    LOG.info("Fin de prueba calcular factura correctamente");
}
}
