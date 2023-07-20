/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                      JFrame para la ver globos crecer    
:*        
:*  Archivo     : GlobosFrame.java
:*  Autor       : Jesus Rafael Medina Dimas     19130547
:*  Fecha       : 15/01/2021
:*  Compilador  : NetBeans IDE 8.2
:*  Descripcion : Clase de tipo JFrame que incializa objetos de la clase Globos
                  y permite verlos crecer mediante el uso de Threads y sus respectivos
                  métodos.
:*  Ultima modif: 15/01/2021
:*  Fecha       Modificacion            Motivo
:*========================================================================================== 
:*  15/01/2021  Rafael     Creación de la clase
:*------------------------------------------------------------------------------------------*/
package globos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class GlobosFrame extends javax.swing.JFrame {

    public static final int MAX_GLOBOS = 10;
    
    private Globo [] globos  = new Globo [ MAX_GLOBOS ];
    private Color [] colores = new Color [] {
        Color.CYAN, Color.BLACK, Color.MAGENTA, Color.PINK, Color.RED, Color.BLUE, 
        Color.ORANGE, Color.YELLOW, Color.GRAY      
    };
    
    private int ancho;
    private int alto;
    
    private Image image;
    private Graphics grpImage;

//--------------------------------------------------------------------------------------------     
    public GlobosFrame() {
        initComponents();
        
        ancho = this.getWidth();
        alto = this.getHeight();
        
        for (int i = 0; i < MAX_GLOBOS; i++) {
            Color color = colores [ (int)(Math.random() * 8)];
            int radio   = 5 + (int)( Math.random() * alto * 0.2 );
            int sleep   = 10 + (int)( Math.random() * 40);
            int x       = (int)( Math.random() * ( ancho - radio * 2 ) );
            int y       = (int)( Math.random() * ( alto - radio * 2 ) );
            globos [ i ] = new Globo ( this, color, radio, sleep, x, y );
            globos [ i ].start ();
            
        }
    }

//--------------------------------------------------------------------------------------------     
    @Override
    public void paint ( Graphics g ){
        //super.paint ( g );
        
        if ( image == null ) {
        image = this.createImage( ancho , alto );
        grpImage = image.getGraphics();
        }
        
        grpImage.setColor ( Color.white );
        grpImage.fillRect ( 0, 0, ancho, alto);
        for (int i = 0; i < MAX_GLOBOS; i++) {
            globos [ i ].dibujar ( grpImage );
        }
        
        g.drawImage ( image , 0, 0, null );
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Globos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GlobosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GlobosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GlobosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GlobosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GlobosFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
