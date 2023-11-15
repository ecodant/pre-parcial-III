package co.edu.uniquindio.poo.Clientes;

import co.edu.uniquindio.poo.Util.AssertionUtil;

public class Estudiante extends Cliente {
    private byte semestre;

public Estudiante(String cedula,String nombre,String apellido,String correo,byte semestre){
    super(cedula, nombre, apellido, correo);
    AssertionUtil.ASSERTION.assertion(semestre>0 && semestre<=10,"el semestre debe estar entre 1 y 10");
    this.semestre=semestre;
}

public byte getSemestre() {
    return semestre;
}
@Override
public float calcularDescuento(){
    float descuento=0;
    for(int i = 0; i<semestre; i++){
        descuento+=0.012;
  }
    return descuento;
}
}
