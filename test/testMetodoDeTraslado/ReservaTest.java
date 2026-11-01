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

public class ReservaTest {

    MetodoDeTraslado metodoDeTraslado;
    Direccion destino;
    int cantidadDePasajeros;
    Reserva reserva;
    TarjetaDeCreditoInternacional metodoDePago;

    @BeforeEach
    public void setUp(){
        metodoDeTraslado= mock(MetodoDeTraslado.class);
        destino= mock(Direccion.class);
        cantidadDePasajeros= 2;
        metodoDePago= mock(TarjetaDeCreditoInternacional.class);
        reserva = new Reserva(metodoDeTraslado, destino, cantidadDePasajeros,metodoDePago);
    }

}
