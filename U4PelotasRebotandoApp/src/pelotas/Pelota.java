/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                          Clase para los objetos Pelota
:*        
:*  Archivo     : Pelota.java
:*  Autor       : Jesus Rafael Medina Dimas     19130547
:*  Fecha       : 14/01/2021
:*  Compilador  : NetBeans IDE 8.2
:*  Descripcion : Clase java que define los atributos, constructores y métodos
                  propios de un objeto Pelota.
:*  Ultima modif: 14/01/2021
:*  Fecha       Modificacion            Motivo
:*========================================================================================== 
:*  14/01/2021 Rafael     Creación de la clase
:*------------------------------------------------------------------------------------------*/
package pelotas;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class Pelota extends Thread {
    
    private JPanel jpnlMarcoPelota;
    private int x;
    private int y;
    private int ancho;
    private int alto;
    private int despX, despY;
    boolean seguirRebotando = true ;
    Graphics lienzo;
    private int periodo; 
    
//-------------------------------------------------------------------------------------    
    public Pelota ( JPanel jpnlMarcoPelota ){
        super ();
        this.jpnlMarcoPelota = jpnlMarcoPelota;
        lienzo  = jpnlMarcoPelota.getGraphics();
        ancho   = jpnlMarcoPelota.getWidth();
        alto    = jpnlMarcoPelota.getHeight();
        x       = ancho / 2;
        y       = alto / 2;
        despX   = (int)( Math.random() * 7 )+ 1 ;
        despY   = (int)( Math.random() * 3 )+ 1;
        periodo = 10 + (int)( Math.random () * 40 );
    }
 
//-------------------------------------------------------------------------------------    
    @Override
    public void run () {
        while ( seguirRebotando ){
            mover ();
            rebotar();
            limpiar ();
            dibujar();
            pausa ();
            
        }
    }

//-------------------------------------------------------------------------------------    
    public void mover () {
        x += despX;
        y += despY;
    }
 
//-------------------------------------------------------------------------------------    
    private void rebotar (){
        if ( x <= 0 || x >= ancho-20 ) {
            despX *= -1;
        }
        if ( y <= 0 || y >= alto-20 ) {
            despY *= -1;
        }
    }
 
//-------------------------------------------------------------------------------------    
    private void dibujar () {
        lienzo.setColor ( Color.red );
        lienzo.drawOval ( x, y, 20, 20 );
        lienzo.fillOval ( x, y, 20, 20 );
        
    }
    
//-------------------------------------------------------------------------------------    
    private void pausa (){
        try {
            Thread.sleep ( periodo );
        } catch ( InterruptedException ex ) {
            Logger.getLogger(Pelota.class.getName()).log( Level.SEVERE, null, ex );
        }
    }
    
 //-------------------------------------------------------------------------------------   
    private void limpiar (){
        lienzo.setColor ( Color.white );
        lienzo.fillRect ( 0, 0, ancho, alto );
    }
}
