package org.example.domain.usuario;

import org.example.domain.viaje.Posicion;
import org.example.domain.viaje.reaccionaranteincidente.ReaccionarAnteIncidente;

public class Persona {
  private Usuario usuario;
  private String nombre;
  private String apellido;
  private String direccion;
  private int edad;
  private Sexo sexo;
  private boolean tieneAppInstalada;
  private Posicion posicion;
  private Estado estado;
  private ReaccionarAnteIncidente reaccionarAnteIncidente;


  public Persona(String nombre, String apellido, String direccion, Integer edad, Sexo sexo, boolean esTranseunte) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.direccion = direccion;
    this.edad = edad;
    this.sexo = sexo;
  }



}
