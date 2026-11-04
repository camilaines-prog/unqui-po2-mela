package metodosDePago;

import java.util.ArrayList;

public class RegistroComprobante {

    //atributos

    private ArrayList<Comprobante> comprobantes;
    //constructor

    public RegistroComprobante() {
        this.comprobantes = new ArrayList<Comprobante>();
    }

    //getter y setters

    //metodos

    public void registrar(Comprobante comprobante){
        comprobantes.add(comprobante);
    };
}
