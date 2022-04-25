package test;

import domain.*;

public class TestMundoPC {

    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("cable", "HP");
        Raton ratonHP = new Raton("cable", "HP");
        Computadora computadoraHP = new Computadora("PC HP", monitorHP, tecladoHP, ratonHP);

        Monitor monitorGM = new Monitor("Gamer", 21);
        Teclado tecladoGM = new Teclado("bluetoot", "GM");
        Raton ratonGM = new Raton("bluetoot", "GM");
        Computadora computadoraGM = new Computadora("PC GAMER", monitorGM, tecladoGM, ratonGM);
 
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraGM);
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGM);

        orden1.mostrarOrden();
    }
}
