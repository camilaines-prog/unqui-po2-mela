package testMetodoDePago;
import metodosDePago.*;
import metodosDePago.Voucher;
import metodosDeTraslado.Reserva;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class BilleteraVirtualTest {

    BilleteraVirtualCripto billetera;
    ValidacionBilleteraVirtualAPI api;
    double valorTotal=400.0;

    @BeforeEach
    void setUp() {
        api = mock(ValidacionBilleteraVirtualAPI.class);
        billetera = new BilleteraVirtualCripto(api);
    };
    @Test
    void testValidacionDeDatosEnUnaBilleteraVirtualCripto(){

        when(api.validarSaldo()).thenReturn(true);
        when(api.bloquearSaldo(billetera)).thenReturn(true);
        when(api.acreditacion(valorTotal)).thenReturn(true);

        billetera.procesamientoDePago(valorTotal);

        verify(api).validarSaldo();
    }
    @Test
    void testValidacionDeDatosDenegadaEnUnaBilleteraVirtualCripto(){

        when(api.validarSaldo()).thenReturn(false);
        when(api.bloquearSaldo(billetera)).thenReturn(true);
        when(api.acreditacion(valorTotal)).thenReturn(true);

        assertThrows(
                IllegalArgumentException.class,
                () -> billetera.procesamientoDePago(valorTotal)
        );
        verify(api).validarSaldo();
    }
    @Test
    void testReservaDeFondosAprobadaEnUnaBilleteraVirtualCripto(){

        when(api.validarSaldo()).thenReturn(true);
        when(api.bloquearSaldo(billetera)).thenReturn(true);
        when(api.acreditacion(valorTotal)).thenReturn(true);

        billetera.procesamientoDePago(valorTotal);

        //en la reserva de fondos se realiza el bloqueo de saldo
        verify(api).bloquearSaldo(billetera);
    }
    @Test
    void testReservaDeFondosRechazadaEnUnaBilleteraVirtualCripto(){

        when(api.validarSaldo()).thenReturn(true);
        when(api.bloquearSaldo(billetera)).thenReturn(false);
        when(api.acreditacion(valorTotal)).thenReturn(true);

        assertThrows(
                IllegalArgumentException.class,
                () -> billetera.procesamientoDePago(valorTotal)
        );
        verify(api).bloquearSaldo(billetera);
    }
    @Test
    void testEjecutarTransaccionExitosaEnUnaBilleteraVirtualCripto(){

        when(api.validarSaldo()).thenReturn(true);
        when(api.bloquearSaldo(billetera)).thenReturn(true);
        when(api.acreditacion(valorTotal)).thenReturn(true);

        billetera.procesamientoDePago(valorTotal);

        verify(api).acreditacion(valorTotal);
    }
    @Test
    void testEjecutarTransaccionDenegadaEnUnaBilleteraVirtualCripto(){

        when(api.validarSaldo()).thenReturn(true);
        when(api.bloquearSaldo(billetera)).thenReturn(true);
        when(api.acreditacion(valorTotal)).thenReturn(false);

        assertThrows(
                IllegalArgumentException.class,
                () -> billetera.procesamientoDePago(valorTotal)
        );
        verify(api).acreditacion(valorTotal);
    }
    @Test
    void testNotificacionDeResultadoUnaBilleteraVirtualCripto(){

        when(api.validarSaldo()).thenReturn(true);
        when(api.bloquearSaldo(billetera)).thenReturn(true);
        when(api.acreditacion(valorTotal)).thenReturn(true);

        billetera.procesamientoDePago(valorTotal);

        verify(api).notificacionPush();
    }


}
