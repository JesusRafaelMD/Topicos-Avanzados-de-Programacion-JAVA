/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                     Clase muestra de hilos con Threads  
:*        
:*  Archivo     : MiHilo.java
:*  Autor       : Jesus Rafael Medina Dimas     19130547
:*  Fecha       : 13/01/2021
:*  Compilador  : NetBeans IDE 8.2
:*  Descripcion : Clase javar para crear hilos con la clase Thread
:*  Ultima modif: 13/01/2021
:*  Fecha       Modificacion            Motivo
:*========================================================================================== 
:*  13/01/2021  Rafael     Creación de la clase
:*------------------------------------------------------------------------------------------*/
package Hilo.thread;

import app.HilosFrame;
import java.util.logging.Level;
import java.util.logging.Logger;

//--------------------------------------------------------------------------------------------
public class MiHilo extends Thread {
    
    private HilosFrame frame;
  
//--------------------------------------------------------------------------------------------    
    public MiHilo () {
        
    }

//--------------------------------------------------------------------------------------------    
    public MiHilo ( String nombre ) {
        super ( nombre );
    }

//--------------------------------------------------------------------------------------------    
    public MiHilo ( String nombre, HilosFrame frame ) {
        super ( nombre );
        this.frame = frame;
    }    

//--------------------------------------------------------------------------------------------    
    @Override
    public void run () {
        for (int i = 0; i <= 100; i++) {
            System.out.println( getName () + ": " + i);
            if ( frame != null ){
                frame.setProgreso ( getName(), i );
            }
            try {
                Thread.sleep ( 50 );
            } catch (InterruptedException ex) {
                Logger.getLogger(MiHilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
