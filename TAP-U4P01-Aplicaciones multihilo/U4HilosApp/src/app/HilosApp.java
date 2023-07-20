/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                     Clase para inicializar los hilos     
:*        
:*  Archivo     : HilosApp.java
:*  Autor       : Jesus Rafael Medina Dimas     19130547
:*  Fecha       : 13/01/2021
:*  Compilador  : NetBeans IDE 8.2
:*  Descripcion : Clase java para inicializar los hilos de la carrera de tios
:*  Ultima modif: 13/01/2021
:*  Fecha       Modificacion            Motivo
:*========================================================================================== 
:*  13/01/2021  Rafael     Creación de la clase
:*------------------------------------------------------------------------------------------*/
package app;

import Hilo.runnable.MiHilo;

//--------------------------------------------------------------------------------------------
public class HilosApp {
    public static void main ( String [] args ){
        
        MiHilo hilo1 = new MiHilo ( "Tio Rios"    );
        MiHilo hilo2 = new MiHilo ( "Tio Oswi "   );
        MiHilo hilo3 = new MiHilo ( "Tio Ulloita" );
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
