package testMetodoDePago;

import Registros.ArchivoDeRegistros;
import metodosDePago.*;
import Registros.Voucher;
import metodosDeTraslado.Reserva;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class TarjetaCreditoInternacionalTest {

    TarjetaDeCreditoInternacional tarjeta;
    ValidacionTarjetaAPI api;
    String numeroTarjeta;
    String vencimiento;
    int cvv;
    ArchivoDeRegistros registro;
    Voucher voucher;
    Reserva reserva;
    double valorReserva= 800.0;
    int codigoTransaccion=1;

    @BeforeEach
    void setUp(){

        registro= mock(ArchivoDeRegistros.class);
        api=mock(ValidacionTarjetaAPI.class);
        voucher=mock(Voucher.class);
        reserva=mock(Reserva.class);
        tarjeta= new TarjetaDeCreditoInternacional(api,numeroTarjeta,cvv,registro,vencimiento);

    }
    @Test

    void testVerificarTarjetaValideDatosAlProcesarElPago(){
        when(reserva.getValorTotal()).thenReturn(valorReserva);
        when(api.validarTarjeta(numeroTarjeta,cvv,vencimiento)).thenReturn(true);
        when(api.preAutorizar()).thenReturn(true);

        tarjeta.procesamientoDePago(valorReserva);

        verify(api).validarTarjeta(numeroTarjeta,cvv,vencimiento);
    }
    @Test

    void testVerificarTarjetaNoValideDatosAlProcesarElPago(){
        when(reserva.getValorTotal()).thenReturn(valorReserva);
        when(api.validarTarjeta(numeroTarjeta,cvv,vencimiento)).thenReturn(false);
        when(api.preAutorizar()).thenReturn(true);


        assertThrows(
                IllegalArgumentException.class,
                () -> tarjeta.procesamientoDePago(valorReserva)
        );
        verify(api).validarTarjeta(numeroTarjeta,cvv,vencimiento);
    }

    @Test
    void testVerificarTarjetaSeEncuentrePreAutorizadaAlProcesarElPago(){
        when(reserva.getValorTotal()).thenReturn(800.0);
        when(api.validarTarjeta(numeroTarjeta,cvv,vencimiento)).thenReturn(true);
        when(api.preAutorizar()).thenReturn(true);

        tarjeta.procesamientoDePago(valorReserva);

        verify(api).preAutorizar();
    }
    @Test
    void testVerificarTarjetaNoSeEncuentrePreAutorizadaAlProcesarElPago(){
        when(reserva.getValorTotal()).thenReturn(valorReserva);
        when(api.validarTarjeta(numeroTarjeta,cvv,vencimiento)).thenReturn(true);
        when(api.preAutorizar()).thenReturn(false);

        assertThrows(
                IllegalArgumentException.class,
                () -> tarjeta.procesamientoDePago(valorReserva)
        );

        verify(api).preAutorizar();
    }
    @Test

    void testVerificarTarjetaEjecuteTransaccionAlProcesarElPago(){
        when(reserva.getValorTotal()).thenReturn(valorReserva);
        when(api.validarTarjeta(numeroTarjeta,cvv,vencimiento)).thenReturn(true);
        when(api.preAutorizar()).thenReturn(true);

        tarjeta.procesamientoDePago(valorReserva);

        verify(api).ejecutarTransferencia(valorReserva);
    }
    @Test
    void testVerificarTrajetaNotifiqueResultadoAlProcesarElPago(){
        when(reserva.getValorTotal()).thenReturn(valorReserva);
        when(api.validarTarjeta(numeroTarjeta,cvv,vencimiento)).thenReturn(true);
        when(api.preAutorizar()).thenReturn(true);

        tarjeta.procesamientoDePago(valorReserva);

        verify(registro).archivarRegistro(any(Voucher.class));
    }

}
