package testMetodoDeTraslado;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import metodosDeTraslado.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdaptadorTrasladoEstandarTest {

    PlataformaTransporte plataforma;
    AdaptadorTrasladoEstandar trasladoEstandar;

    @BeforeEach
    public void setUp(){
        plataforma=mock(PlataformaTransporte.class);
        trasladoEstandar=new AdaptadorTrasladoEstandar(plataforma);
    }

    @Test
    public void testVerificarObtencionDeLaPlataformaDeTransporteEnElAdaptadorDeTrasladoEstandar(){

        assertEquals(plataforma, trasladoEstandar.getPlataformaTransporte());
    }
    @Test
    public void testVerificarCambioDePlataformaDeTransporteEnMiAdaptadorTrasladoEstandar(){
        PlataformaTransporte otraPlataforma;
        otraPlataforma=mock(PlataformaTransporte.class);

        trasladoEstandar.setPlataformaTransporte(otraPlataforma);

        assertEquals(otraPlataforma,trasladoEstandar.getPlataformaTransporte());
    }
}
