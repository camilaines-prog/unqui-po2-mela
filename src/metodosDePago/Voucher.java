package metodosDePago;

public class Voucher {

    //constructor
    public Voucher() {
    }

    //metodos
    public void registrarVoucher(RegistroVoucher registroVoucher){
        registroVoucher.guardar(this);
    }
}
