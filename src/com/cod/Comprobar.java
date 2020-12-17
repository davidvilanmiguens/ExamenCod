package com.cod;

public class Comprobar {
    String usuario = "";
    String ip = "127.0.0.2";

    Comprobar() {
        usuario = "anonymous@danielcastelao.org";
    }

    Comprobar(String param1) {
        this.usuario = param1;
    }

    public boolean con() {
        if (usuario != "anonymous@danielcastelao.org") {
            return true;
        } else {
            return false;
        }
    }
}
