package org.example.domain.usuario;

import org.example.domain.viaje.Ubicacion;

public class Persona {
  Usuario usuario;
  String nombre;
  String apellido;
  String direccion;
  int edad;
  Sexo sexo;
  Ubicacion ubicacionActual;
  boolean tieneAppInstalada;

  boolean esTranseunte;


  public Persona(String nombre, String apellido, String direccion, Integer edad, Sexo sexo, boolean esTranseunte) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.direccion = direccion;
    this.edad = edad;
    this.sexo = sexo;
    this.esTranseunte = esTranseunte;
  }

  public void solicitarAcompaniamiento(Ubicacion ubicacionActual,Ubicacion ubicacionDestino, Persona cuidador) {
    //TODO



  }

  public void notificarAcompaniamiento(Persona cuidador) {
    //TODO

  }

  public void aceptarResponsabilidad(Persona persona) {
    //TODO

  }


}
