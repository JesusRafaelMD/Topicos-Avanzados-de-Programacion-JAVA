/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                      Clase molde para los objetos Globo    
:*        
:*  Archivo     : Globo.java
:*  Autor       : Jesus Rafael Medina Dimas     19130547
:*  Fecha       : 15/01/2021
:*  Compilador  : NetBeans IDE 8.2
:*  Descripcion : Clase que define los atributos del objeto Globo, además del método
                  run para el uso de Threads.
:*  Ultima modif: 15/01/2021
:*  Fecha       Modificacion            Motivo
:*========================================================================================== 
:*  15/01/2021  Rafael     Creación de la clase
:*------------------------------------------------------------------------------------------*/
package globos;

import java.awt.Color;
import java.awt.Graphics;

public class Globo extends Thread{
    
    private GlobosFrame parent;
    private Color color;
    private int radioInicial;
    private int radioActual;
    private int periodoSleep;
    private int x;
    private int y;
    boolean creciendo;
//--------------------------------------------------------------------------------------------    
    public Globo ( GlobosFrame parent, Color color, int radioInicial, int periodoSleep, 
                    int x, int y ){
        this.parent         = parent;
        this.color          = color;
        this.radioInicial   = radioInicial;
        this.radioActual    = radioInicial;
        this.periodoSleep   = periodoSleep;
        this.x              = x;
        this.y              = y;
        creciendo           = ( Math.random () > 0.5 ) ? true : false ;
    }
    
//--------------------------------------------------------------------------------------------     
    @Override
    public void run () {
        while ( true ){
            if ( creciendo ) {
                radioActual++;
            }
            else 
                radioActual--;
            if ( radioActual < 5 || radioActual > radioInicial * 2 ) {
                creciendo = !creciendo;
            }
            
            parent.repaint();
            
            try {
                Thread.sleep ( periodoSleep );
            } catch ( InterruptedException ex ) {
                System.out.println( ex );
            }
        }
    }

//--------------------------------------------------------------------------------------------     
    public void dibujar ( Graphics g ){
        g.setColor ( color );
        g.fillOval ( x-radioActual, y-radioActual, 2*radioActual, 2*radioActual );
    }
    
}
