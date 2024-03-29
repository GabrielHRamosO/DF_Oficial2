/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gabrielhro;

import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form CadastroMedico
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuCadastroMedico = new javax.swing.JMenuItem();
        menuCadastroPaciente = new javax.swing.JMenuItem();
        menuCadastroConsulta = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prova 2 - Agendador de consultas");

        menuArquivo.setText("ARQUIVOS");

        menuCadastroMedico.setText("MÉDICO");
        menuCadastroMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroMedicoActionPerformed(evt);
            }
        });
        menuArquivo.add(menuCadastroMedico);

        menuCadastroPaciente.setText("PACIENTE");
        menuCadastroPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroPacienteActionPerformed(evt);
            }
        });
        menuArquivo.add(menuCadastroPaciente);

        menuCadastroConsulta.setText("CONSULTA");
        menuCadastroConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroConsultaActionPerformed(evt);
            }
        });
        menuArquivo.add(menuCadastroConsulta);

        menuSair.setText("SAIR");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuArquivo.add(menuSair);

        jMenuBar1.add(menuArquivo);

        menuSobre.setText("SOBRE");
        menuSobre.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menuSobreMenuSelected(evt);
            }
        });
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadastroMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroMedicoActionPerformed
        // TODO add your handling code here:
        CadastroMedico telaCadastro = new CadastroMedico();
        telaCadastro.show();
    }//GEN-LAST:event_menuCadastroMedicoActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        // TODO add your handling code here:    
    }//GEN-LAST:event_menuSobreActionPerformed

    private void menuCadastroPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroPacienteActionPerformed
        // TODO add your handling code here:
        CadastroPaciente telaCadastro = new CadastroPaciente();
        telaCadastro.show();
    }//GEN-LAST:event_menuCadastroPacienteActionPerformed

    private void menuCadastroConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroConsultaActionPerformed
        // TODO add your handling code here:
        CadastroConsulta telaCadastro = new CadastroConsulta();
        telaCadastro.show();
    }//GEN-LAST:event_menuCadastroConsultaActionPerformed

    private void menuSobreMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menuSobreMenuSelected
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Feito por Gabriel Henrique Ramos Oliveira");
    }//GEN-LAST:event_menuSobreMenuSelected

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuItem menuCadastroConsulta;
    private javax.swing.JMenuItem menuCadastroMedico;
    private javax.swing.JMenuItem menuCadastroPaciente;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenu menuSobre;
    // End of variables declaration//GEN-END:variables
}
