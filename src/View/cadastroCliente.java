package View;

import Model.Atendimento;
import Model.Cliente;
import Model.Pet;
import Model.Procedimento;
import Model.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class cadastroCliente extends javax.swing.JFrame {

   private ArrayList<Atendimento> atendimento = new ArrayList<>();
    private ArrayList<Cliente> cliente = new ArrayList<>();
    private ArrayList<Pet> pet = new ArrayList<>();
    private ArrayList<Produto> produto = new ArrayList<>();
    private ArrayList<Procedimento> procedimento = new ArrayList<>();
   
    
    public cadastroCliente(ArrayList<Atendimento> atendimento, ArrayList<Cliente> cliente, ArrayList<Pet> pet, ArrayList<Produto> produto, ArrayList<Procedimento> procedimento) {
        initComponents();
        this.atendimento = atendimento;
        this.cliente = cliente;
        this.pet = pet;
        this.produto = produto;
        this.procedimento = procedimento;
       
                
        telefone.setOpaque(false);
        telefone.setBackground(new java.awt.Color(0,0,0,1));
        cpf.setOpaque(false);
        cpf.setBackground(new java.awt.Color(0,0,0,1));
        email.setOpaque(false);
        email.setBackground(new java.awt.Color(0,0,0,1));
        nome.setOpaque(false);
        nome.setBackground(new java.awt.Color(0,0,0,1));
    }
    private cadastroCliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void limpar() {
        this.cpf.setText("");
        this.nome.setText("");
        this.telefone.setText("");
        this.email.setText("");
        this.nome.requestFocus();
        
    }
    
    private void sair() {
        if (JOptionPane.showConfirmDialog(this.principal, "Deseja voltar para o menu anterior?", "SAIR", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            this.dispose();
            Menu tela = new Menu(atendimento, cliente, pet, produto,  procedimento);
            tela.setVisible(true);
        }
    }
     private void cadastrar() {
        if (!nome.getText().isEmpty()) {
            if (!telefone.getText().isEmpty()) {
                
                    if (!email.getText().isEmpty()) {
                        if (!cpf.getText().isEmpty()) {
                            boolean achou = false;
                            for (int x = 0; x < this.cliente.size(); x++) {
                                if (this.cliente.get(x).getCpf().equals(this.cpf.getText())) {
                                    achou = true;
                                    break;
                                }
                            }
                            if (!achou) {
                                this.cliente.add(new Cliente(this.nome.getText(), this.cpf.getText(), this.telefone.getText(), this.email.getText()));
                                JOptionPane.showMessageDialog(this.principal, "Cliente cadastrado!", "CADASTRO", JOptionPane.INFORMATION_MESSAGE);
                                this.limpar();
                                
                            } else {
                                JOptionPane.showMessageDialog(this.principal, "Já existe cliente cadastrado com esse CPF!", "EXISTENTE", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(this.principal, "Favor preencher o campo CPF!", "CAMPO VAZIO", JOptionPane.ERROR_MESSAGE);
                        }

                    } else {
                        JOptionPane.showMessageDialog(this.principal, "Favor preencher o campo Email!", "CAMPO VAZIO", JOptionPane.ERROR_MESSAGE);
                    }

                

            } else {
                JOptionPane.showMessageDialog(this.principal, "Favor preencher o campo Telefone!", "CAMPO VAZIO", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this.principal, "Favor preencher o campo Nome!", "CAMPO VAZIO", JOptionPane.ERROR_MESSAGE);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telefone = new javax.swing.JTextField();
        cpf = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        apagar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        principal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PetPlus - Cadastro de Cliente\n");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        telefone.setBackground(new java.awt.Color(242, 242, 242));
        telefone.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        telefone.setBorder(null);
        telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneActionPerformed(evt);
            }
        });
        getContentPane().add(telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 360, 40));

        cpf.setBackground(new java.awt.Color(242, 242, 242));
        cpf.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        cpf.setBorder(null);
        cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfActionPerformed(evt);
            }
        });
        getContentPane().add(cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 380, 40));

        email.setBackground(new java.awt.Color(242, 242, 242));
        email.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        email.setBorder(null);
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 380, 40));

        nome.setBackground(new java.awt.Color(242, 242, 242));
        nome.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        nome.setBorder(null);
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        getContentPane().add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 380, 40));

        apagar.setBorder(null);
        apagar.setBorderPainted(false);
        apagar.setContentAreaFilled(false);
        apagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarActionPerformed(evt);
            }
        });
        getContentPane().add(apagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, 120, 40));

        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 520, 130, 40));

        voltar.setBorder(null);
        voltar.setBorderPainted(false);
        voltar.setContentAreaFilled(false);
        voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 520, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadastroCliente.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 960, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneActionPerformed

    private void cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apagarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        Menu tela = new Menu(atendimento, cliente, pet, produto,  procedimento);
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
            java.util.logging.Logger.getLogger(cadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apagar;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nome;
    private javax.swing.JPanel principal;
    private javax.swing.JTextField telefone;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
