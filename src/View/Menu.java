/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Cliente;
import Model.Colaborador;
import Model.Pet;
import Model.Procedimento;
import Model.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author isabe
 */
public class Menu extends javax.swing.JFrame {
    
    private ArrayList<Model.Atendimento> atendimento = new ArrayList<>();
    private ArrayList<Cliente> cliente = new ArrayList<>();
    private ArrayList<Pet> pet = new ArrayList<>();
    private ArrayList<Produto> produto = new ArrayList<>();
    private ArrayList<Procedimento> procedimento = new ArrayList<>();

  
    public Menu(ArrayList<Model.Atendimento> atendimento, ArrayList<Cliente> cliente, ArrayList<Pet> pet, ArrayList<Produto> produto, ArrayList<Procedimento> procedimento) {
        initComponents();
         this.atendimento = atendimento;
        this.cliente = cliente;
        this.pet = pet;
        this.produto = produto;
        this.procedimento = procedimento;
        
        if (this.cliente.isEmpty()) {
            this.cad_atendimento.setEnabled(false);
            this.cad_pet.setEnabled(false);
        } else {
            this.cad_atendimento.setEnabled(true);
            this.cad_pet.setEnabled(true);
        }
    }

    public Menu(){
     }
    
     private void sair() {
        if (JOptionPane.showConfirmDialog(this.principal, "Deseja Sair?", "SAIR", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }
     
       
    private void cadastrarCliente() {
        cadastroCliente tela = new cadastroCliente(atendimento, cliente, pet, produto,  procedimento);
        tela.setVisible(true);
        this.dispose();
    }

    
    private void cadastrarPet() {
        cadastroPet tela = new cadastroPet(atendimento, cliente, pet, produto, procedimento);
        tela.setVisible(true);
        this.dispose();
    }

    
    private void cadastrarProduto() {
        Produtos tela = new Produtos(atendimento, cliente, pet, produto,  procedimento);
        tela.setVisible(true);
        this.dispose();
    }

    
    private void cadastrarProcedimento() {
        Procedimentos tela = new Procedimentos(atendimento, cliente, pet, produto,  procedimento);
        tela.setVisible(true);
        this.dispose();
    }
    
    
    private void atendimento() {
        Atendimento tela = new Atendimento(atendimento, cliente, pet, produto,  procedimento);
        tela.setVisible(true);
        this.dispose();
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cad_prod = new javax.swing.JButton();
        cad_cliente = new javax.swing.JButton();
        cad_produto = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        cad_atendimento = new javax.swing.JButton();
        edit_pet = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        cad_pet = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        principal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PetPlus - MENU");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cad_prod.setBorder(null);
        cad_prod.setBorderPainted(false);
        cad_prod.setContentAreaFilled(false);
        cad_prod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cad_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad_prodActionPerformed(evt);
            }
        });
        getContentPane().add(cad_prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 210, 30));

        cad_cliente.setBorder(null);
        cad_cliente.setBorderPainted(false);
        cad_cliente.setContentAreaFilled(false);
        cad_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cad_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad_clienteActionPerformed(evt);
            }
        });
        getContentPane().add(cad_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 210, 30));

        cad_produto.setBorder(null);
        cad_produto.setBorderPainted(false);
        cad_produto.setContentAreaFilled(false);
        cad_produto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cad_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad_produtoActionPerformed(evt);
            }
        });
        getContentPane().add(cad_produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 210, 30));

        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, 210, 30));

        cad_atendimento.setBorder(null);
        cad_atendimento.setBorderPainted(false);
        cad_atendimento.setContentAreaFilled(false);
        cad_atendimento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cad_atendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad_atendimentoActionPerformed(evt);
            }
        });
        getContentPane().add(cad_atendimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, 210, 30));

        edit_pet.setBorder(null);
        edit_pet.setBorderPainted(false);
        edit_pet.setContentAreaFilled(false);
        edit_pet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit_pet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_petActionPerformed(evt);
            }
        });
        getContentPane().add(edit_pet, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, 210, 30));

        sair.setBorder(null);
        sair.setBorderPainted(false);
        sair.setContentAreaFilled(false);
        sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        getContentPane().add(sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 530, 120, 30));

        cad_pet.setBorder(null);
        cad_pet.setBorderPainted(false);
        cad_pet.setContentAreaFilled(false);
        cad_pet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cad_pet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad_petActionPerformed(evt);
            }
        });
        getContentPane().add(cad_pet, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 210, 30));

        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/menu.png"))); // NOI18N
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 990, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cad_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad_prodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cad_prodActionPerformed

    private void cad_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cad_clienteActionPerformed

    private void cad_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cad_produtoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cad_atendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad_atendimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cad_atendimentoActionPerformed

    private void edit_petActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_petActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_petActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sairActionPerformed

    private void cad_petActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad_petActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cad_petActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cad_atendimento;
    private javax.swing.JButton cad_cliente;
    private javax.swing.JButton cad_pet;
    private javax.swing.JButton cad_prod;
    private javax.swing.JButton cad_produto;
    private javax.swing.JButton edit_pet;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel label;
    private javax.swing.JPanel principal;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}
