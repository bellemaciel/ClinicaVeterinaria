
package View;

import Model.Cliente;
import Model.Pet;
import Model.Procedimento;
import Model.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author isabe
 */
public class Procedimentos extends javax.swing.JFrame {

    private ArrayList<Model.Atendimento> atendimento = new ArrayList<>();
    private ArrayList<Cliente> cliente = new ArrayList<>();
    private ArrayList<Pet> pet = new ArrayList<>();
    private ArrayList<Produto> produto = new ArrayList<>();
    private ArrayList<Procedimento> procedimento = new ArrayList<>();
    
    public Procedimentos(ArrayList<Model.Atendimento> atendimento, ArrayList<Cliente> cliente, ArrayList<Pet> pet, ArrayList<Produto> produto, ArrayList<Procedimento> procedimento) {
        initComponents();
         this.atendimento = atendimento;
        this.cliente = cliente;
        this.pet = pet;
        this.produto = produto;
        this.procedimento = procedimento;
        
        nome.setOpaque(false);
        nome.setBackground(new java.awt.Color(0,0,0,1));
        valor.setOpaque(false);
        valor.setBackground(new java.awt.Color(0,0,0,1));
    }
    private void limpar() {
        String t = "";
        nome.setText(t);
        valor.setText(t);

        
        confirma.setEnabled(true);

        
    }
     private void cadastrar() {
       
        if (!(nome.getText().isEmpty() || valor.getText().isEmpty())) {
            //01 - verifica se tem o produto ja cadastrado
            boolean achou = false;
            for (int x = 0; x < procedimento.size(); x++) {
                if (procedimento.get(x).getNomeProced().equalsIgnoreCase(nome.getText())) {
                    achou = true;
                    break;
                }
            }
            
            try {
                if (!achou) {
                    double Valor = Double.parseDouble(valor.getText());
                    procedimento.add(new Procedimento(nome.getText(), Valor));
                    JOptionPane.showMessageDialog(this, "Serviço cadastrado!");
                    limpar();
                    
                } else {
                    double Valor = Double.parseDouble(valor.getText());
                    JOptionPane.showMessageDialog(this, "Serviço já cadastrado no sistema!", "SERVIÇO JÀ CADASTRADO", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Valor digitado invalido!\nEx.: 00.00", "CAMPO VAZIO", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Favor preencher todos os campos!", "CAMPO VAZIO", JOptionPane.ERROR_MESSAGE);
        }

    }

    private Procedimentos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nome = new javax.swing.JTextField();
        valor = new javax.swing.JTextField();
        apaga = new javax.swing.JButton();
        confirma = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PetPlus - Cadastro de Procedimentos\n");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nome.setBackground(new java.awt.Color(242, 242, 242));
        nome.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        nome.setBorder(null);
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        getContentPane().add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 380, 40));

        valor.setBackground(new java.awt.Color(242, 242, 242));
        valor.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        valor.setBorder(null);
        valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorActionPerformed(evt);
            }
        });
        getContentPane().add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 380, 40));

        apaga.setBorder(null);
        apaga.setBorderPainted(false);
        apaga.setContentAreaFilled(false);
        apaga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        apaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagaActionPerformed(evt);
            }
        });
        getContentPane().add(apaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 530, 120, 30));

        confirma.setBorder(null);
        confirma.setBorderPainted(false);
        confirma.setContentAreaFilled(false);
        confirma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmaActionPerformed(evt);
            }
        });
        getContentPane().add(confirma, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 530, 120, 30));

        voltar.setBorder(null);
        voltar.setBorderPainted(false);
        voltar.setContentAreaFilled(false);
        voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/procedimentos.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorActionPerformed

    private void apagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagaActionPerformed
        limpar();
    }//GEN-LAST:event_apagaActionPerformed

    private void confirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmaActionPerformed
         cadastrar();
    }//GEN-LAST:event_confirmaActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
       Menu tela = new Menu(atendimento, cliente, pet, produto, procedimento);
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

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
            java.util.logging.Logger.getLogger(Procedimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Procedimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Procedimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Procedimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Procedimentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apaga;
    private javax.swing.JButton confirma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField valor;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
