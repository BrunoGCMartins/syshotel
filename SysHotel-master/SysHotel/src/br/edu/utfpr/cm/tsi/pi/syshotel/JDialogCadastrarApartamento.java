/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.pi.syshotel;

import br.edu.utfpr.cm.pi.conexao.TransactionUtil;
import br.edu.utfpr.cm.pi.dao.DaoApartamento;
import br.edu.utfpr.cm.pi.modal.Apartamento;
import br.edu.utfpr.cm.tsi.pi.sessao.Data;
import br.edu.utfpr.cm.tsi.pi.syshotel.Util.Util;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author JoaoPaulo
 */
public class JDialogCadastrarApartamento extends javax.swing.JDialog {

    /**
     * Creates new form JDialogCadastrarApartamento
     */
    public JDialogCadastrarApartamento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        novo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCadAptImagem = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelCadAptCodigo = new javax.swing.JLabel();
        jLabelDescricao = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfNumero = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonApagar = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        tfDescricao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfAndar = new javax.swing.JTextField();
        lbImagem = new javax.swing.JLabel();
        btObter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(603, 283));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCadAptImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadAptImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/CadApartamento.png"))); // NOI18N
        getContentPane().add(jLabelCadAptImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 360, 40));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 580, 10));

        jSeparator2.setMaximumSize(new java.awt.Dimension(1, 649));
        jSeparator2.setMinimumSize(new java.awt.Dimension(1, 649));
        jSeparator2.setPreferredSize(new java.awt.Dimension(1, 649));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 202, 580, 10));

        jLabelCadAptCodigo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelCadAptCodigo.setText("Código:");
        getContentPane().add(jLabelCadAptCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabelDescricao.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelDescricao.setText("Descrição:");
        getContentPane().add(jLabelDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        tfCodigo.setEditable(false);
        tfCodigo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tfCodigo.setMaximumSize(new java.awt.Dimension(6, 22));
        getContentPane().add(tfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 100, 25));

        tfNumero.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        getContentPane().add(tfNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 100, 25));

        jButtonSalvar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/save01.png"))); // NOI18N
        jButtonSalvar.setToolTipText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jButtonLimpar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/clear02.png"))); // NOI18N
        jButtonLimpar.setToolTipText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        jButtonApagar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/trash.png"))); // NOI18N
        jButtonApagar.setToolTipText("Apagar");
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonApagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        btFechar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/Close.png"))); // NOI18N
        btFechar.setToolTipText("Fechar");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });
        getContentPane().add(btFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));
        getContentPane().add(tfDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 250, 25));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setText("Número:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 60, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Andar:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 50, -1));

        tfAndar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAndarActionPerformed(evt);
            }
        });
        getContentPane().add(tfAndar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 90, 25));

        lbImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/Apartamento.png"))); // NOI18N
        getContentPane().add(lbImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 150, 120));

        btObter.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btObter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/Add.png"))); // NOI18N
        btObter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btObterActionPerformed(evt);
            }
        });
        getContentPane().add(btObter, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 30, 25));

        setSize(new java.awt.Dimension(580, 322));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        if (Util.imprimirConfirmacao("Deseja Limpar?")) {
            novo();
        }
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        if (Util.imprimirConfirmacao("Deseja Sair?")) {
            dispose();
        }
    }//GEN-LAST:event_btFecharActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (Util.imprimirConfirmacao("Deseja Salvar?")) {
            salvar();
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed
        if (Util.imprimirConfirmacao("Deseja Deletar?")) {
            remover();
        }
    }//GEN-LAST:event_jButtonApagarActionPerformed

    private void tfAndarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAndarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAndarActionPerformed

    private void btObterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btObterActionPerformed
        obter();
    }//GEN-LAST:event_btObterActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btObter;
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCadAptCodigo;
    private javax.swing.JLabel jLabelCadAptImagem;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbImagem;
    private javax.swing.JTextField tfAndar;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfNumero;
    // End of variables declaration//GEN-END:variables

    private void salvar() {

        if (verificarCampos()) {
            try {
                Apartamento apt = new Apartamento();
                if (!tfCodigo.getText().isEmpty()) {  //verifica se o campo Codigo esta vazio
                    apt.setId(Integer.parseInt(tfCodigo.getText()));
                }
                try {
                    apt.setAndar(Integer.parseInt(tfAndar.getText()));
                } catch (Exception e) {
                    Util.dispayMsg("Andar tem que ser uma número!");
                    Logger.getLogger(JDialogCadastrarApartamento.class.getName()).log(Level.SEVERE, null, e);//erro

                }
                try {
                    apt.setNumero(Integer.parseInt(tfNumero.getText()));

                } catch (Exception e) {
                    Util.dispayMsg("Número tem que ser uma número!");
                    Logger.getLogger(JDialogCadastrarApartamento.class.getName()).log(Level.SEVERE, null, e);//erro
                }
                try {
                    apt.setDescricao(tfDescricao.getText());
                } catch (Exception e) {
                    Util.dispayMsg("Andar tem que ser letars!");
                    Logger.getLogger(JDialogCadastrarApartamento.class.getName()).log(Level.SEVERE, null, e);//erro
                }


                TransactionUtil.beginTransaction();
                try {
                    new DaoApartamento().persistir(apt);
                    TransactionUtil.commit();
                } catch (Exception ex) {
                    TransactionUtil.rollback();
                    Logger.getLogger(JDialogCadastrarApartamento.class.getName()).log(Level.SEVERE, null, ex);//erro
                }

            } catch (RuntimeException ex) {
                ex.printStackTrace();
            }
            novo();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Contem campo vazio ou tipo incorreto de dado !");
        }
    }

    protected boolean verificarCampos() {
        if (!tfNumero.getText().trim().equals("") && !tfNumero.getText().trim().isEmpty()
                && !tfDescricao.getText().trim().equals("") && !tfDescricao.getText().trim().isEmpty()
                && !tfAndar.getText().trim().equals("") && !tfAndar.getText().trim().isEmpty()) {
            return true;
        }
        return false;
    }

    private void novo() {
        tfCodigo.setEditable(false);
        tfDescricao.setText(null);
        tfAndar.setText(null);
        tfNumero.setText(null);
    }

    private void remover() {
        if (!tfCodigo.getText().isEmpty()) {
            int id = Integer.parseInt(tfCodigo.getText().trim());
            TransactionUtil.beginTransaction();
            try {
                DaoApartamento dao = new DaoApartamento();
                dao.remover(dao.obterPorId(id));
                TransactionUtil.commit();
            } catch (Exception ex) {
                TransactionUtil.rollback();
                Logger.getLogger(JDialogCadastrarApartamento.class.getName()).log(Level.SEVERE, null, ex);//erro

            }
            novo();

        } else {
            JOptionPane.showMessageDialog(rootPane, "Nenhum registro selecionando!");
        }
    }

    private void obter() {
        JDialog dialog = new JDialogPesquisarApartamento(null, true);
        Util.abrirJDialogCentralizado(dialog);

        if (Data.hash.get("apartamento") == null) {
            return;
        } else {
            if (Data.hash.get("apartamento") instanceof Apartamento) {
                Apartamento apartamento = (Apartamento) Data.hash.get("apartamento");
                Data.hash.remove("apartamento");
                if (apartamento == null) {
                    return;
                }
                tfCodigo.setText(String.valueOf(apartamento.getId()));
                tfDescricao.setText(apartamento.getDescricao());
                tfAndar.setText(String.valueOf(apartamento.getAndar()));
                tfNumero.setText(String.valueOf(apartamento.getNumero()));

            } else {
                JOptionPane.showMessageDialog(null, "Selecione um Apartamento.");
                Data.hash.remove("apartamento");
            }
        }
    }
}