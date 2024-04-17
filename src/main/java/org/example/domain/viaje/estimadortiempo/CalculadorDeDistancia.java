package org.example.domain.viaje.estimadortiempo;

import org.example.domain.viaje.Posicion;

public interface  CalculadorDeDistancia {
  int distanciaEntre(Posicion posicion1, Posicion posicion2);
}
