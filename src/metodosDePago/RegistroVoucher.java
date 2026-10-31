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
    public ArrayList<Voucher> getRegistroVoucher() {
        return registroVoucher;
    }

    public void setRegistroVoucher(ArrayList<Voucher> registroVoucher) {
        this.registroVoucher = registroVoucher;
    }

    //metodos
    public void guardar(Voucher voucher){
        registroVoucher.add(voucher);
    }
}
