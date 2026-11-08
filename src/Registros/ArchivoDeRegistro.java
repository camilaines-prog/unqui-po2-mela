package Registros;

import java.util.ArrayList;

public class ArchivoDeRegistro {

    //atributos
    private ArrayList<Registro> registros;

    //constructor
    public ArchivoDeRegistro() {
        registros= new ArrayList<Registro>();
    }

    //getters y setters

    public ArrayList<Registro> getRegistros() {
        return registros;
    }

    //metodos
    public void registrar(Registro registro){
        registros.add(registro);
    }

}
