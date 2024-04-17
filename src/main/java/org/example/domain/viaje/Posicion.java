package org.example.domain.viaje;

public class Posicion {
  double longitud;
  double latitud;
  String direccionCompleta;

  public Posicion(double longitud, double latitud, String direccionCompleta) {
    this.longitud = longitud;
    this.latitud = latitud;
    this.direccionCompleta = direccionCompleta;
  }
}
