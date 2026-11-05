package testMetodoDePago;

import metodosDePago.RegistroVoucher;
import metodosDePago.Voucher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

public class RegistroTest {

    RegistroVoucher registro;
    Voucher voucher;

    @BeforeEach
    void setUp() {
        voucher=mock(Voucher.class);
        registro = new RegistroVoucher();
    }
    @Test
    void testRegistroDeUnVoucherEnMiRegistroDeVouchers(){
        registro.registrar(voucher);

        assertEquals(1, registro.getRegistroVoucher().size());
        assertTrue(registro.getRegistroVoucher().contains(voucher));


    }
}
