package metodosDePago;

import java.util.ArrayList;

public class RegistroVoucher {

    //atributos
    private ArrayList<Voucher> registroVoucher;

    //constructor
    public RegistroVoucher() {
        registroVoucher= new ArrayList<Voucher>();
    }

    //getters y setters

    //metodos
    public void registrar(Voucher voucher){
        registroVoucher.add(voucher);
    }
}
