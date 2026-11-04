package testMetodoDeTraslado;

import metodosDeTraslado.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class PuntoDeEncuentroTest {

    CupoDeGuias cupo;
    PuntoDeEncuentro puntoDeEncuentro;
    Reserva reserva;


    @BeforeEach
    void setUp(){
        cupo= mock(CupoDeGuias.class);
        reserva=mock(Reserva.class);
        puntoDeEncuentro= new PuntoDeEncuentro(cupo);
    }
    @Test
    void testCalcularCostoMetodoDeTrasladoPuntoDeEncuentroConCupo(){

        when(cupo.hayCupo()).thenReturn(true);

        assertEquals(0,puntoDeEncuentro.calcularCosto(reserva));
    }
    @Test
    void testCalcularCostoMetodoDeTrasladoPuntoDeEncuentroSinCupo(){

        when(cupo.hayCupo()).thenReturn(false);

        assertThrows(
                IllegalArgumentException.class,
                () -> puntoDeEncuentro.calcularCosto(reserva)
        );

        verify(cupo).hayCupo();
    }

}
