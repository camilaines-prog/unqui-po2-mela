package testMetodoDeTraslado;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import metodosDeTraslado.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdaptadorTrasladoVipTest {

    AdaptadorTrasladoVip adaptadorVip;
    TrasladoVip trasladoVip;

    @BeforeEach
    public void setUp(){
        trasladoVip= mock(TrasladoVip.class);
        adaptadorVip= new AdaptadorTrasladoVip(trasladoVip);
    }

    @Test
    public void testVerificarObtencionDeTrasladoVipEnElAdaptadorTrasladoVip(){
        assertEquals(trasladoVip, adaptadorVip.getMetodoTrasladoVip());
    }
    @Test
    public void testVerificarCambioAOtroTrasladoVipEnElAdaptadorTrasladoVip(){
        TrasladoVip otroTrasladoVip;
        otroTrasladoVip=mock(TrasladoVip.class);

        adaptadorVip.setMetodoTrasladoVip(otroTrasladoVip);

        assertEquals(otroTrasladoVip,adaptadorVip.getMetodoTrasladoVip());
    }
}
