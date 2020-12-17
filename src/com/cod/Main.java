package com.cod;

public class Main {
    public static void main(String[] args) {
        if (mirar("pepe@danielcastelao.org")) {
            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }
        if (mirar2()) {
            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }
        ;
    }

    public static boolean mirar(String u) {
        /** Java Doc **/
        Comprobar obx1 =  Comprobar.getInstance();
        System.out.println("Conectando a " + obx1.ip + ", con el usuario " + u);
        return obx1.con();
    }

    public static boolean mirar2() {
        Comprobar obx2 =  Comprobar.getInstance();
        System.out.println("Conectando a " + obx2.ip + ", con el usuario " + obx2.usuario);
        return obx2.con();
    }
}
