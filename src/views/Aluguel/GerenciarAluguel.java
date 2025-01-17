/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.Aluguel;

import DAO.AluguelDAO;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Aluguel;
import model.AluguelApoio;
import views.Aluguel.CadastrarAluguel;
import views.Home;

/**
 *
 * @author Carlos Roberto
 */
public class GerenciarAluguel extends javax.swing.JFrame {

    /**
     * Creates new form Aluguel
     */
    public GerenciarAluguel() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tAluguel.getModel();
        tAluguel.setRowSorter(new TableRowSorter(modelo));
        
        readJTable();
    }
    
    public void readJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) tAluguel.getModel();
        modelo.setNumRows(0);
        AluguelDAO adao = new AluguelDAO();
        
        List<AluguelApoio> alugueis = adao.read();
        
        for (AluguelApoio a : alugueis) {

            modelo.addRow(new Object[]{
                a.getIdAluguel(),
                a.getNomeCliente(),
                a.getNomeVeiculo(),
                a.getDataInicio(),
                a.getDataFinal()
                
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

        botaoExcluir = new javax.swing.JButton();
        botaoCadastrar = new javax.swing.JButton();
        botaoAtualizar = new javax.swing.JButton();
        LabelTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAluguel = new javax.swing.JTable();
        botaoExcluir1 = new javax.swing.JButton();
        botaoCadastrar1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        txtVeiculo = new javax.swing.JTextField();
        txtDataFinal = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDataInicio = new javax.swing.JFormattedTextField();
        btVoltar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        botaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/img/excluir.png"))); // NOI18N
        botaoExcluir.setToolTipText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        botaoCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/img/novo-arquivo.png"))); // NOI18N
        botaoCadastrar.setToolTipText("Cadastrar novo veiculo");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        botaoAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/img/atualizada.png"))); // NOI18N
        botaoAtualizar.setToolTipText("Atualizar");
        botaoAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GERENCIAR ALUGUEL");
        getContentPane().setLayout(null);

        LabelTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitle.setText("ALUGUEL");
        getContentPane().add(LabelTitle);
        LabelTitle.setBounds(340, 20, 113, 29);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(260, 60, 270, 10);

        tAluguel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Cliente", "Veículo", "Data de Inicio", "Data de Devolução"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tAluguel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tAluguelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tAluguel);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 90, 770, 172);

        botaoExcluir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/img/devolucao.png"))); // NOI18N
        botaoExcluir1.setToolTipText("Excluir");
        botaoExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluir1ActionPerformed(evt);
            }
        });
        getContentPane().add(botaoExcluir1);
        botaoExcluir1.setBounds(570, 420, 80, 50);

        botaoCadastrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/img/carro-alugado.png"))); // NOI18N
        botaoCadastrar1.setToolTipText("Cadastrar novo veiculo");
        botaoCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCadastrar1);
        botaoCadastrar1.setBounds(330, 280, 80, 50);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(50, 350, 700, 20);
        getContentPane().add(txtVeiculo);
        txtVeiculo.setBounds(420, 410, 64, 22);
        getContentPane().add(txtDataFinal);
        txtDataFinal.setBounds(420, 460, 93, 22);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Data Final:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(340, 460, 100, 16);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Veículo:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(340, 410, 90, 16);

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtCliente);
        txtCliente.setBounds(180, 410, 64, 22);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cliente:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 410, 90, 16);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data Inicio:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 460, 80, 16);
        getContentPane().add(txtDataInicio);
        txtDataInicio.setBounds(180, 460, 95, 22);

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btVoltar);
        btVoltar.setBounds(690, 510, 72, 23);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/img/Aluguel12.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-20, -10, 880, 620);

        setSize(new java.awt.Dimension(810, 595));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        /*if (tAluguel.getSelectedRow() != -1) {
            int id = (int) tAluguel.getValueAt(tAluguel.getSelectedRow(), 0);
            Integer idVeiculo = txtVeiculo.getInt();
            Integer idCliente = txtCliente.getInt();
            Date dataInicio = txtDataInicio.getDate();
            Date dataFinal = txtDataFinal.getDate();

            Aluguel aluguel = new Aluguel(idVeiculo, idCliente, dataInicio, dataFinal);
            AluguelDAO a = new AluguelDAO();

            a.deletar(aluguel);

            txtVeiculo.setText("");
            txtCliente.setText("");
            txtDataInicio.setText("");
            txtDataFinal.setText("");

            readJTable();
        }*/
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        CadastrarAluguel telaCadastrarAluguel = new CadastrarAluguel();
        telaCadastrarAluguel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarActionPerformed
     
    }//GEN-LAST:event_botaoAtualizarActionPerformed

    private void botaoExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluir1ActionPerformed
        if (tAluguel.getSelectedRow() != -1) {
            int idAluguel = (int) tAluguel.getValueAt(tAluguel.getSelectedRow(), 0);
          
            AluguelDAO a = new AluguelDAO();

            a.deletar(idAluguel);

            txtVeiculo.setText("");
            txtCliente.setText("");
            txtDataInicio.setText("");
            txtDataFinal.setText("");

            readJTable();
        }
    }//GEN-LAST:event_botaoExcluir1ActionPerformed

    private void botaoCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrar1ActionPerformed
        CadastrarAluguel telaCadastrarAluguel = new CadastrarAluguel();
        telaCadastrarAluguel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCadastrar1ActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        Home home = new Home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void tAluguelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tAluguelMouseClicked
        String cliente = tAluguel.getValueAt(tAluguel.getSelectedRow(), 1).toString();
        String veiculo = tAluguel.getValueAt(tAluguel.getSelectedRow(), 2).toString();
        String dataInicio = tAluguel.getValueAt(tAluguel.getSelectedRow(), 3).toString();
        String dataFinal = tAluguel.getValueAt(tAluguel.getSelectedRow(), 4).toString();
        
        
        txtCliente.setText( cliente);
        txtVeiculo.setText(veiculo);
        txtDataInicio.setText(dataInicio);
        txtDataFinal.setText(dataFinal);
        
    }//GEN-LAST:event_tAluguelMouseClicked

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
            java.util.logging.Logger.getLogger(GerenciarAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarAluguel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelTitle;
    private javax.swing.JButton botaoAtualizar;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoCadastrar1;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoExcluir1;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tAluguel;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JFormattedTextField txtDataFinal;
    private javax.swing.JFormattedTextField txtDataInicio;
    private javax.swing.JTextField txtVeiculo;
    // End of variables declaration//GEN-END:variables
}
