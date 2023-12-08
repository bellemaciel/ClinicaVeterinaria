
package View;

import Model.Cliente;
import Model.Pet;
import Model.Procedimento;
import Model.Produto;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author isabe
 */
public class Atendimento extends javax.swing.JFrame {

    private ArrayList<Model.Atendimento> atendimento = new ArrayList<>();
    private ArrayList<Cliente> cliente = new ArrayList<>();
    private ArrayList<Pet> pet = new ArrayList<>();
    private ArrayList<Produto> produto = new ArrayList<>();
    private ArrayList<Procedimento> procedimento = new ArrayList<>();
   
    public Atendimento(ArrayList<Model.Atendimento> atendimento, ArrayList<Cliente> cliente, ArrayList<Pet> pet, ArrayList<Produto> produto, ArrayList<Procedimento> procedimento) {
        initComponents();
        this.atendimento = atendimento;
        this.cliente = cliente;
        this.pet = pet;
        this.produto = produto;
        this.procedimento = procedimento;
        listaClientes.setVisible(false);
        listaProduto();
        listaProcedimento();
        confirma.setEnabled(false);
        
        pettxt.setOpaque(false);
        pettxt.setBackground(new java.awt.Color(0,0,0,1));
        clientetxt.setOpaque(false);
        clientetxt.setBackground(new java.awt.Color(0,0,0,1));
        procedimentotxt.setOpaque(false);
        procedimentotxt.setBackground(new java.awt.Color(0,0,0,1));
        produtotxt.setOpaque(false);
        produtotxt.setBackground(new java.awt.Color(0,0,0,1));
        datatxt.setOpaque(false);
        datatxt.setBackground(new java.awt.Color(0,0,0,1));
         
         datatxt.setText(String.valueOf("MOSTRAR TEXTO"));
     
    }
    
    public void atualizarCampoLista(String nome) {
        try {
            listaClientes.setVisible(true);
            DefaultListModel<String> model = new DefaultListModel<>();
            model.removeAllElements();
            for (int x = 0; x < this.cliente.size(); x++) {
                String nome2 = this.cliente.get(x).getNome().substring(0, nome.length());
                if (nome.equalsIgnoreCase(nome2)) {
                    model.addElement(this.cliente.get(x).getNome());

                }
            }
            this.listaClientes.setModel(model);
        } catch (Exception e) {

        }
    }
    
    private void listaPet(Cliente cliente) {
        DefaultComboBoxModel<String> modelPet = new DefaultComboBoxModel<>();
        modelPet.addElement("...");
        for (int x = 0; x < pet.size(); x++) {
            if (pet.get(x).getCliente().equals(cliente)) {
                modelPet.addElement(pet.get(x).getNome());
            }
        }
        petcomb.setModel(modelPet);
    }
    
    private void listaProduto() {
        DefaultComboBoxModel<String> modelProd = new DefaultComboBoxModel<>();
        modelProd.addElement("...");
        for (int x = 0; x < produto.size(); x++) {
            modelProd.addElement(produto.get(x).getNomeProd());
        }
        produtocomb.setModel(modelProd);
    }
    
    private void listaProcedimento() {
        DefaultComboBoxModel<String> modelServ = new DefaultComboBoxModel<>();
        modelServ.addElement("...");
        for (int x = 0; x < procedimento.size(); x++) {
            modelServ.addElement(procedimento.get(x).getNomeProced());
        }
        procedimentocomb.setModel(modelServ);
    }
    
    public void selecionandoLista() {
        try {
            String nome = (listaClientes.getSelectedValue());
            Cliente c = null;
            for (int x = 0; x < cliente.size(); x++) {
                if (nome.equalsIgnoreCase(cliente.get(x).getNome())) {
                    int pos = x;
                    c = cliente.get(x);
                    clientetxt.setText(nome);
                    listaClientes.setVisible(false);
                    break;
                }
            }
            listaPet(c);
            confirma.setEnabled(true);
        } catch (Exception e) {

        }
    }
    
    private void limpar() {
        String t = "";
        clientetxt.setText(t);
        petcomb.setSelectedItem("...");
        produtocomb.setSelectedIndex(0);
        procedimentocomb.setSelectedIndex(0);
        datatxt.setText(t);
        confirma.setEnabled(false);
    }
    
    private void confirmar() {
        if (petcomb.getSelectedIndex() == 0 || datatxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Favor, selecionar um Pet para o atendimento ou digitar uma data!", "PET", JOptionPane.WARNING_MESSAGE);
        } else {
            double total = 0;
            boolean vai = true;
            if (procedimentocomb.getSelectedIndex() != 0) {
                total += procedimento.get(procedimentocomb.getSelectedIndex() - 1).getValor();
            }
            if (produtocomb.getSelectedIndex() != 0) {
                total += produto.get(produtocomb.getSelectedIndex() - 1).getValor();
            }
            if (vai) {
                fatura tela = new fatura(total, datatxt.getText());
                JOptionPane.showMessageDialog(this, "Atendimento confirmado!");
                limpar();
                tela.setVisible(true);
            }
        }
    }
    private Atendimento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listaClientes = new javax.swing.JList<>();
        petcomb = new javax.swing.JComboBox<>();
        procedimentocomb = new javax.swing.JComboBox<>();
        produtocomb = new javax.swing.JComboBox<>();
        voltar = new javax.swing.JButton();
        datatxt = new javax.swing.JTextField();
        produtotxt = new javax.swing.JTextField();
        procedimentotxt = new javax.swing.JTextField();
        pettxt = new javax.swing.JTextField();
        clientetxt = new javax.swing.JTextField();
        confirma = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PetPlus - Cadastro de Atendimento\n");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listaClientes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        getContentPane().add(listaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 380, -1));

        petcomb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(petcomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 420, 40));

        procedimentocomb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(procedimentocomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 320, 40));

        produtocomb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(produtocomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 370, 50));

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

        datatxt.setBackground(new java.awt.Color(242, 242, 242));
        datatxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        datatxt.setBorder(null);
        datatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datatxtActionPerformed(evt);
            }
        });
        getContentPane().add(datatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 400, 40));

        produtotxt.setBackground(new java.awt.Color(242, 242, 242));
        produtotxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        produtotxt.setBorder(null);
        produtotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtotxtActionPerformed(evt);
            }
        });
        getContentPane().add(produtotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 370, 40));

        procedimentotxt.setBackground(new java.awt.Color(242, 242, 242));
        procedimentotxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        procedimentotxt.setBorder(null);
        procedimentotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procedimentotxtActionPerformed(evt);
            }
        });
        getContentPane().add(procedimentotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 320, 40));

        pettxt.setBackground(new java.awt.Color(242, 242, 242));
        pettxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pettxt.setBorder(null);
        pettxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pettxtActionPerformed(evt);
            }
        });
        getContentPane().add(pettxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 420, 40));

        clientetxt.setBackground(new java.awt.Color(242, 242, 242));
        clientetxt.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        clientetxt.setBorder(null);
        clientetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientetxtActionPerformed(evt);
            }
        });
        getContentPane().add(clientetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 380, 40));

        confirma.setBorder(null);
        confirma.setContentAreaFilled(false);
        confirma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmaActionPerformed(evt);
            }
        });
        getContentPane().add(confirma, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 530, 110, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/atendimento.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 380, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pettxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pettxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pettxtActionPerformed

    private void clientetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientetxtActionPerformed
    private void clientetxtKeyTyped(java.awt.event.KeyEvent evt) {                                    
        // TODO add your handling code here:
        atualizarCampoLista(clientetxt.getText() + evt.getKeyChar());
     }   
    private void procedimentotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procedimentotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_procedimentotxtActionPerformed
    private void listaClientesMouseClicked(java.awt.event.MouseEvent evt) {                                           
        // TODO add your handling code here:
        selecionandoLista();
    } 
    private void confirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmaActionPerformed
        confirmar();
    }//GEN-LAST:event_confirmaActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
       Menu tela = new Menu(atendimento, cliente, pet, produto, procedimento);
        tela.setVisible(true);
        this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_voltarActionPerformed

    private void produtotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produtotxtActionPerformed

    private void datatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datatxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datatxtActionPerformed

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
            java.util.logging.Logger.getLogger(Atendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Atendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Atendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Atendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Atendimento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField clientetxt;
    private javax.swing.JButton confirma;
    private javax.swing.JTextField datatxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaClientes;
    private javax.swing.JComboBox<String> petcomb;
    private javax.swing.JTextField pettxt;
    private javax.swing.JComboBox<String> procedimentocomb;
    private javax.swing.JTextField procedimentotxt;
    private javax.swing.JComboBox<String> produtocomb;
    private javax.swing.JTextField produtotxt;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
