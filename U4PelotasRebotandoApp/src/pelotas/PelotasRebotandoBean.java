/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                      Bean para la clase PelotasRebotando
:*        
:*  Archivo     : PelotasRebotandoBean.java
:*  Autor       : Jesus Rafael Medina Dimas     19130547
:*  Fecha       : 14/01/2021
:*  Compilador  : NetBeans IDE 8.2
:*  Descripcion : Clase que inicializa un nuevo objeto de la clase Pelota, inicia su
                  proceso y determina si debe seguir rebotando por un método.
:*  Ultima modif: 14/01/2021
:*  Fecha       Modificacion            Motivo
:*========================================================================================== 
:*  14/01/2021  Rafael     Creación de la clase
:*------------------------------------------------------------------------------------------*/
package pelotas;

public class PelotasRebotandoBean extends javax.swing.JPanel {

    Pelota pelota;
    
    public PelotasRebotandoBean() {
        initComponents();     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlMarcoPelota = new javax.swing.JPanel();
        jbtnIniciar = new javax.swing.JButton();
        jbtnDetener = new javax.swing.JButton();

        jpnlMarcoPelota.setBackground(new java.awt.Color(255, 255, 255));
        jpnlMarcoPelota.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jpnlMarcoPelotaLayout = new javax.swing.GroupLayout(jpnlMarcoPelota);
        jpnlMarcoPelota.setLayout(jpnlMarcoPelotaLayout);
        jpnlMarcoPelotaLayout.setHorizontalGroup(
            jpnlMarcoPelotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );
        jpnlMarcoPelotaLayout.setVerticalGroup(
            jpnlMarcoPelotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 205, Short.MAX_VALUE)
        );

        jbtnIniciar.setText("Iniciar");
        jbtnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIniciarActionPerformed(evt);
            }
        });

        jbtnDetener.setText("Detener");
        jbtnDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDetenerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnIniciar)
                        .addGap(108, 108, 108)
                        .addComponent(jbtnDetener))
                    .addComponent(jpnlMarcoPelota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnlMarcoPelota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnIniciar)
                    .addComponent(jbtnDetener))
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIniciarActionPerformed
        pelota = new Pelota ( jpnlMarcoPelota );
        pelota.start();
    }//GEN-LAST:event_jbtnIniciarActionPerformed

    private void jbtnDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDetenerActionPerformed
        pelota.seguirRebotando = false;
    }//GEN-LAST:event_jbtnDetenerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnDetener;
    private javax.swing.JButton jbtnIniciar;
    private javax.swing.JPanel jpnlMarcoPelota;
    // End of variables declaration//GEN-END:variables
}
