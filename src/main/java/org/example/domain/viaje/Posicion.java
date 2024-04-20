package org.example.domain.viaje;

public class Posicion {
  private double longitud;
  private double latitud;
  private String direccionCompleta;

  public Posicion(double longitud, double latitud, String direccionCompleta) {
    this.longitud = longitud;
    this.latitud = latitud;
    this.direccionCompleta = direccionCompleta;
  }
}
