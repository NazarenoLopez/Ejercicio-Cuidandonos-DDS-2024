import org.example.domain.viaje.Posicion;
import org.example.domain.viaje.estimadortiempo.CalculadorDeDistancia;
import org.example.domain.viaje.estimadortiempo.DistanceMatrixAdapter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDistancia {


    @Test
    public void testDistanciaEntrePosiciones() {
    Posicion posicion1 = new Posicion(1D, 1D, "Calle Falsa 123");
    Posicion posicion2 = new Posicion(2, 2, "Calle Falsa 456");
    CalculadorDeDistancia calculador = new DistanceMatrixAdapter();
    //Act
    int distancia = calculador.distanciaEntre(posicion1, posicion2);
    //Assert
    Assertions.assertEquals(0, distancia);
  }
}
