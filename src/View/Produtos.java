
package View;

import Model.Cliente;
import Model.Pet;
import Model.Procedimento;
import Model.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Produtos extends javax.swing.JFrame {
    private ArrayList<Model.Atendimento> atendimento = new ArrayList<>();
    private ArrayList<Cliente> cliente = new ArrayList<>();
    private ArrayList<Pet> pet = new ArrayList<>();
    private ArrayList<Produto> produto = new ArrayList<>();
    private ArrayList<Procedimento> procedimento = new ArrayList<>();
    
    public Produtos(ArrayList<Model.Atendimento> atendimento, ArrayList<Cliente> cliente, ArrayList<Pet> pet, ArrayList<Produto> produto, ArrayList<Procedimento> procedimento) {
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
      
        confirmar.setEnabled(true);
    }
    private void cadastrar() {
        try {
            int posicao = 0;
            if (!(nome.getText().isEmpty() || valor.getText().isEmpty())) {
                //01 - Verifica se produto já está cadastrado no sistema
                boolean achou = false;

                for (int x = 0; x < produto.size(); x++) {
                    if (produto.get(x).getNomeProd().equalsIgnoreCase(nome.getText())) {
                        achou = true;
                        posicao = x;
                        break;
                    }
                }
                
                try {
                   
                    if (!achou) {
                        String Nome = nome.getText();
                        double Valor = Double.parseDouble(valor.getText());
                        produto.add(new Produto(Nome, Valor));
                        JOptionPane.showMessageDialog(this, "Produto cadastrado!");
                        
                        this.limpar();

                       
                    } 
                    
                    //03 - FIM
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Digitar só numeros no campo:\n Valor!", "ERRO", JOptionPane.ERROR_MESSAGE);
                    
                }

            } else {
                JOptionPane.showMessageDialog(this, "Favor preencher todos os campos!", "CAMPO VAZIO", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Digitar só numeros nos campo:Valor!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private Produtos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nome = new javax.swing.JTextField();
        valor = new javax.swing.JTextField();
        apagar = new javax.swing.JButton();
        confirmar = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PetPlus - Cadastro de Produtos\n");
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

        apagar.setBorder(null);
        apagar.setBorderPainted(false);
        apagar.setContentAreaFilled(false);
        apagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarActionPerformed(evt);
            }
        });
        getContentPane().add(apagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, 120, 30));

        confirmar.setBorder(null);
        confirmar.setBorderPainted(false);
        confirmar.setContentAreaFilled(false);
        confirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });
        getContentPane().add(confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 520, 120, 30));

        voltar.setBorder(null);
        voltar.setBorderPainted(false);
        voltar.setContentAreaFilled(false);
        voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 520, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/produtos.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorActionPerformed

    private void apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apagarActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmarActionPerformed

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
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produtos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apagar;
    private javax.swing.JButton confirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField valor;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
