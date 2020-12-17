package com.cod;

public class Comprobar {
    private static Comprobar instance=null;


    String usuario = "";
    String ip = "127.0.0.2";

    Comprobar() {
        usuario = "anonymous@danielcastelao.org";
    }

    Comprobar(String param1) {
        this.usuario = param1;
    }
    public static Comprobar getInstance() {
        // compruebo si ya está creada
        if (instance == null) {
            // la creamos
            instance = new Comprobar();
        }
        // devuelvo la instancia
        return instance;
    }
    public boolean con() {
        if (usuario != "anonymous@danielcastelao.org") {
            return true;
        } else {
            return false;
        }
    }
}
