package org.example.domain.viaje.estimadortiempo;

import org.example.domain.viaje.Posicion;


public class DistanceMatrixAdapter implements CalculadorDeDistancia{
  private DistanceMatrixApi distanceMatrixApi = new DistanceMatrixApi();

  public int distanciaEntre(Posicion posicion1, Posicion posicion2) {
    return this.distanceMatrixApi.calcularDistanciaEnMetros(posicion1, posicion2);
  }
}
