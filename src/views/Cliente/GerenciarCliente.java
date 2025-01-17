/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.Cliente;

import DAO.ClienteDAO;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Cliente;
import views.Home;

/**
 *
 * @author rober
 */
public class GerenciarCliente extends javax.swing.JFrame {

    /**
     * Creates new form GerenciarCliente
     */
    public GerenciarCliente() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tCliente.getModel();
        tCliente.setRowSorter(new TableRowSorter(modelo));

        readJTable();
    }

    public void readJTable() {

        DefaultTableModel modelo = (DefaultTableModel) tCliente.getModel();
        modelo.setNumRows(0);
        ClienteDAO cdao = new ClienteDAO();

        for (Cliente c : cdao.read()) {

            modelo.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getCPF(),
                c.getCNH(),
                c.getEndereco(),
                c.getTelefone()

            });

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCliente = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        botaoVoltarTelaHome = new javax.swing.JButton();
        botaoExcluirCliente = new javax.swing.JButton();
        botaoAtualizarCliente = new javax.swing.JButton();
        botaoTelaCadastrarCliente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCNH = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GERENCIAR CLIENTES");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CLIENTES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(293, 22, 121, 29);

        tCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "nome", "CPF", "CNH", "endereco", "telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tCliente);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 85, 649, 176);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(244, 57, 229, 10);

        botaoVoltarTelaHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/img/Voltar.png"))); // NOI18N
        botaoVoltarTelaHome.setToolTipText("Voltar");
        botaoVoltarTelaHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarTelaHomeActionPerformed(evt);
            }
        });
        getContentPane().add(botaoVoltarTelaHome);
        botaoVoltarTelaHome.setBounds(650, 520, 38, 39);

        botaoExcluirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/img/excluir.png"))); // NOI18N
        botaoExcluirCliente.setToolTipText("Excluir");
        botaoExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirClienteActionPerformed(evt);
            }
        });
        getContentPane().add(botaoExcluirCliente);
        botaoExcluirCliente.setBounds(260, 270, 74, 49);

        botaoAtualizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/img/atualizada.png"))); // NOI18N
        botaoAtualizarCliente.setToolTipText("Atualizar");
        botaoAtualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAtualizarCliente);
        botaoAtualizarCliente.setBounds(481, 403, 50, 53);

        botaoTelaCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/img/novo-arquivo.png"))); // NOI18N
        botaoTelaCadastrarCliente.setToolTipText("Cadastrar novo cliente");
        botaoTelaCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTelaCadastrarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(botaoTelaCadastrarCliente);
        botaoTelaCadastrarCliente.setBounds(380, 270, 74, 49);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CNH:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 450, 29, 16);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Endereço:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 490, 70, 16);
        getContentPane().add(txtEndereco);
        txtEndereco.setBounds(100, 490, 303, 22);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telefone:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(220, 410, 70, 16);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 370, 36, 16);

        txtCNH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCNHActionPerformed(evt);
            }
        });
        getContentPane().add(txtCNH);
        txtCNH.setBounds(100, 450, 166, 22);
        getContentPane().add(txtNome);
        txtNome.setBounds(100, 370, 303, 22);

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtTelefone);
        txtTelefone.setBounds(280, 410, 120, 22);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CPF:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 410, 40, 16);

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtCPF);
        txtCPF.setBounds(100, 410, 99, 22);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(30, 328, 649, 23);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/img/fundo-Cliente.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 730, 600);

        setSize(new java.awt.Dimension(725, 610));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarTelaHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarTelaHomeActionPerformed
        Home voltarTelaHome = new Home();
        voltarTelaHome.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVoltarTelaHomeActionPerformed

    private void botaoTelaCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTelaCadastrarClienteActionPerformed
        CadastrarCliente telaCadastrarCliente = new CadastrarCliente();
        telaCadastrarCliente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoTelaCadastrarClienteActionPerformed

    private void botaoAtualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarClienteActionPerformed
        int id = (int) tCliente.getValueAt(tCliente.getSelectedRow(), 0);
        String nome = txtNome.getText();
        String CPF = txtCPF.getText();
        String CNH = txtCNH.getText();
        String endereco = txtEndereco.getText();
        String telefone = txtTelefone.getText();

        Cliente cliente = new Cliente(nome, CPF, CNH, endereco, telefone, id);
        ClienteDAO c = new ClienteDAO();

        c.alterar(cliente);

        txtNome.setText("");
        txtCPF.setText("");
        txtCNH.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");

        readJTable();
    }//GEN-LAST:event_botaoAtualizarClienteActionPerformed

    private void botaoExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirClienteActionPerformed
        if (tCliente.getSelectedRow() != -1) {
            int id = (int) tCliente.getValueAt(tCliente.getSelectedRow(), 0);
            String nome = txtNome.getText();
            String CPF = txtCPF.getText();
            String CNH = txtCNH.getText();
            String endereco = txtEndereco.getText();
            String telefone = txtTelefone.getText();

            Cliente cliente = new Cliente(nome, CPF, CNH, endereco, telefone, id);
            ClienteDAO c = new ClienteDAO();

            c.deletar(cliente);

            txtNome.setText("");
            txtCPF.setText("");
            txtCNH.setText("");
            txtEndereco.setText("");
            txtTelefone.setText("");

            readJTable();
        }
    }//GEN-LAST:event_botaoExcluirClienteActionPerformed

    private void txtCNHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCNHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCNHActionPerformed

    private void tClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tClienteMouseClicked
        String nome = tCliente.getValueAt(tCliente.getSelectedRow(), 1).toString();
        String CPF = tCliente.getValueAt(tCliente.getSelectedRow(), 2).toString();
        String CNH = tCliente.getValueAt(tCliente.getSelectedRow(), 3).toString();
        String endereco = tCliente.getValueAt(tCliente.getSelectedRow(), 4).toString();
        String telefone = tCliente.getValueAt(tCliente.getSelectedRow(), 5).toString();

        txtNome.setText(nome);
        txtCPF.setText(CPF);
        txtCNH.setText(CNH);
        txtEndereco.setText(endereco);
        txtTelefone.setText(telefone);

    }//GEN-LAST:event_tClienteMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAtualizarCliente;
    private javax.swing.JButton botaoExcluirCliente;
    private javax.swing.JButton botaoTelaCadastrarCliente;
    private javax.swing.JButton botaoVoltarTelaHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTable tCliente;
    private javax.swing.JTextField txtCNH;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
