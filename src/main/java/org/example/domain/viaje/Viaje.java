package org.example.domain.viaje;



import org.example.domain.usuario.Persona;
import org.example.domain.viaje.estimadortiempo.CalculadorDeDistancia;
import org.example.domain.viaje.estimadortiempo.DistanceMatrixAdapter;
import org.example.domain.viaje.reaccionaranteincidente.ReaccionarAnteIncidente;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Viaje {
  private Posicion origen;
  private Posicion destino;
  private List<Persona> cuidadores;
  private int duracionEstimada;
  private LocalDateTime fechaInicio;
  private LocalDateTime fechaFin;
  private Persona transeunte;

  private CalculadorDeDistancia calculadorDeDistancia = new DistanceMatrixAdapter();

  public Viaje(Posicion origen, Posicion destino, List<Persona> cuidadores, Integer duracionEstimada, LocalDateTime fechaInicio, Persona transeunte) {
    this.origen = origen;
    this.destino = destino;
    this.cuidadores = cuidadores;
    this.duracionEstimada = duracionEstimada;
    this.fechaInicio = fechaInicio;
    this.transeunte = transeunte;
    this.cuidadores = new ArrayList<>();
  }

  public List<Persona> getCuidadores(){
    return cuidadores;
  }

  public int getDuracionEstimada(){
    return this.calculadorDeDistancia.distanciaEntre(origen, destino);
  }
}
