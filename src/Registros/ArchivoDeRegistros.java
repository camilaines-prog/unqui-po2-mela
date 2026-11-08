package Registros;

import java.util.ArrayList;

public class ArchivoDeRegistros {

    //atributos
    private ArrayList<Registro> registros;

    //constructor
    public ArchivoDeRegistros() {
        registros= new ArrayList<Registro>();
    }

    //getters y setters

    //metodos
    public void archivarRegistro(Registro registro){
        registros.add(registro);
    }

}
