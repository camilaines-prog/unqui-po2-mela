package testMetodoDeTraslado;

import metodosDeTraslado.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AltaGamaTest {

    TrasladoAltaGama trasladoAltaGama;
    Reserva reserva;
    TrasladoVip vip;

    @BeforeEach
    void setUp(){
        vip=mock(TrasladoVip.class);
        trasladoAltaGama= new TrasladoAltaGama(vip);
        reserva= mock(Reserva.class);

    }
    @Test

    void testCalcularCostoDelMetodoDeTrasladoAltaGama(){

        when(reserva.getValorTotal()).thenReturn(800.0);
        when(vip.calcularCosto(800.0)).thenReturn(90.0);

        assertEquals(90.0, trasladoAltaGama.calcularCosto(reserva));
    }
}
