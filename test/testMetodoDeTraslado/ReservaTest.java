package testMetodoDeTraslado;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import metodosDeTraslado.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReservaTest {

    MetodoDeTraslado metodoDeTraslado;
    Direccion destino;
    int cantidadDePasajeros;
    Reserva reserva;

    @BeforeEach
    public void setUp(){
        metodoDeTraslado= mock(MetodoDeTraslado.class);
        destino= mock(Direccion.class);
        cantidadDePasajeros= 2;
        reserva = new Reserva(metodoDeTraslado, destino, cantidadDePasajeros);
    }
    //EMPIEZO CON TEST RESERVA BASICO LUEGO ORGANIZAR BIEN !
    
    @Test
    public void testVerificarCantidadDePasajerosEnUnaReserva(){

        assertEquals(2,reserva.getCantidadDePasajeros());
    }
   @Test
   public void testVerificarGetterDeMetodoDeTrasladoDeUnaReserva(){

        assertEquals( metodoDeTraslado, reserva.getMetodoDeTraslado());
   }
   @Test
    public void testVerificarGetterDeDestinoEnUnaReserva(){

        assertEquals( destino , reserva.getDestino());
   }
   @Test
    public void testVerificarSetterDeCantidadDePasajerosEnUnaReserva(){
        reserva.setCantidadDePasajeros(3);

        assertEquals(3,reserva.getCantidadDePasajeros());
   }
   @Test
    public void testVerificarCambioDeMetodoDeTrasladoEnUnaReserva(){
        MetodoDeTraslado metodoDeTrasladoVip;
        metodoDeTrasladoVip=mock(AdaptadorTrasladoVip.class);

        reserva.setMetodoDeTraslado(metodoDeTrasladoVip);

        assertEquals(metodoDeTrasladoVip,reserva.getMetodoDeTraslado());
   }
   @Test
    public void testVerificarCambioDeDestinoEnUnaReserva(){
        Direccion otroDestino;
        otroDestino= mock(Direccion.class);

        reserva.setDestino(otroDestino);

        assertEquals(otroDestino, reserva.getDestino());
   }
}
