package testMetodoDeTraslado;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import metodosDePago.MetodoDePago;
import metodosDePago.TarjetaDeCreditoInternacional;
import metodosDePago.TransferenciaBancariaDirecta;
import metodosDeTraslado.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TrasladoEstandarTest {

    private TrasladoEstandar trasladoEstandar;
    private PlataformaTransporte plataforma;
    private Reserva reserva;

    @BeforeEach
    void setUp(){
        plataforma = mock(PlataformaTransporte.class);
        trasladoEstandar= new TrasladoEstandar(plataforma);
        reserva= mock(Reserva.class);

    }
    @Test

    void testCalcularCostoDelMetodoDeTrasladoEstandar(){
        int pasajeros=2;
        String direccion= "avenida calchaqui 87";
        when(reserva.getCantidadDePasajeros()).thenReturn(pasajeros);
        when(reserva.getDestino()).thenReturn(direccion);
        when(plataforma.estimarTraslado(direccion, pasajeros)).thenReturn(800.0);

        assertEquals(800.0, trasladoEstandar.calcularCosto(reserva));
    }
}
