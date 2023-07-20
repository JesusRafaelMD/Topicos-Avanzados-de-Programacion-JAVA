/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                Clase muestra de hilos con runnable          
:*        
:*  Archivo     : MiHilo.java
:*  Autor       : Jesus Rafael Medina Dimas     19130547
:*  Fecha       : 13/01/2021
:*  Compilador  : NetBeans IDE 8.2
:*  Descripcion : Clase java para crear un hilo implementado la interface runnable
:*  Ultima modif: 13/01/2021
:*  Fecha       Modificacion            Motivo
:*========================================================================================== 
:*  13/01/2021  Rafael     Creación de la clase
:*------------------------------------------------------------------------------------------*/
package Hilo.runnable;

import java.util.logging.Level;
import java.util.logging.Logger;
//--------------------------------------------------------------------------------------------
public class MiHilo implements Runnable {

    private String nombre = "";
    
//--------------------------------------------------------------------------------------------    
    public MiHilo() {
        
    }
    
//--------------------------------------------------------------------------------------------    
    public MiHilo ( String nombre ) {
        this.nombre = nombre;
    }
    
 //--------------------------------------------------------------------------------------------   
    public void start () {
        Thread thread = new Thread ( this );
        thread.start();
    }

//--------------------------------------------------------------------------------------------    
    public String getNombre() {
        return nombre;
    }

//--------------------------------------------------------------------------------------------    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
//--------------------------------------------------------------------------------------------    
    @Override
    public void run () {
        for (int i = 0; i <= 100; i++) {
            System.out.println( getNombre () + ": " + i);
            try {
                Thread.sleep ( 100 );
            } catch (InterruptedException ex) {
                Logger.getLogger(MiHilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
