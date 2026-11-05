package metodosDePago;

import java.util.ArrayList;
import java.util.Collection;

public class RegistroVoucher {

    //atributos
    private ArrayList<Voucher> registroVoucher;

    //constructor
    public RegistroVoucher() {
        registroVoucher= new ArrayList<Voucher>();
    }

    //getters y setters

    public ArrayList<Voucher> getRegistroVoucher() {
        return registroVoucher;
    }

    //metodos
    public void registrar(Voucher voucher){
        registroVoucher.add(voucher);
    }

}
