package co.edu.uniquindio.poo.Clientes;

import co.edu.uniquindio.poo.Util.AssertionUtil;

public abstract class Cliente {
    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;

public Cliente(String cedula,String nombre,String apellido,String correo){
    AssertionUtil.ASSERTION.assertion(cedula!=null && !cedula.isBlank(),"la cedula es requerida.");
    AssertionUtil.ASSERTION.assertion(nombre!=null && !nombre.isBlank(),"el nombre es requerido.");
    AssertionUtil.ASSERTION.assertion(apellido!=null && !apellido.isBlank(),"el apellido es requerido.");
    AssertionUtil.ASSERTION.assertion(correo!=null && !correo.isBlank(),"el correo es requerido.");
    this.cedula=cedula;
    this.nombre=nombre;
    this.apellido=apellido;
    this.correo=correo;
}

public String getCedula() {
    return cedula;
}

public String getNombre() {
    return nombre;
}

public String getApellido() {
    return apellido;
}

public String getCorreo() {
    return correo;
}
public abstract float calcularDescuento();
}
