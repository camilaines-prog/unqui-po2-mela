package testMetodoDePago;

import Registros.ArchivoDeRegistros;
import Registros.Voucher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

public class RegistroTest {

    ArchivoDeRegistros registro;
    Voucher voucher;

    @BeforeEach
    void setUp() {
        voucher=mock(Voucher.class);
        registro = new ArchivoDeRegistros();
    }
    @Test
    void testRegistroDeUnVoucherEnMiRegistroDeVouchers(){
        registro.archivarRegistro(voucher);

        assertEquals(1, registro.getRegistroVoucher().size());
        assertTrue(registro.getRegistroVoucher().contains(voucher));


    }
}
