
package domain;


public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private static final int MAX_COMPUTADORAS=10;
    
    public Orden(){
        this.idOrden=++Orden.contadorOrdenes;
        this.computadoras=new Computadora[Orden.MAX_COMPUTADORAS];
        
    }
    public void agregarComputadora(Computadora computadora){
        this.computadoras[Orden.contadorComputadoras++]=computadora;
    }
    public void mostrarOrden(){
        System.out.println("Orden #: "+this.idOrden);
        System.out.println("Computadoras de la orden #:"+this.idOrden);
        
        for (int i = 0; i < Orden.contadorComputadoras; i++) {
            System.out.println(computadoras[i]);
        }
    }
}
