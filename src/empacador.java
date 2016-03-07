
import static java.lang.Thread.sleep;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author distribuidos
 */
public class empacador extends Thread{
    
    bodega bode;
    
    public empacador(bodega bodega){
        this.bode=bodega;
    }
    
      public void run(){
        
        while(true){
            //mesa.atenderPedido();

            int tiempoEntregando = 2;
            System.out.println("Espera por " + tiempoEntregando + " segundos para armar paquete");

            try {
                sleep(tiempoEntregando*1000);
            } catch (InterruptedException e) {
            }
            bode.crearPaquete();
            

        }

    }
}
