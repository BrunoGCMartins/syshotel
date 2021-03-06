/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.pi.syshotel;

import br.edu.utfpr.cm.tsi.pi.syshotel.Util.Util;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JoaoPaulo
 */
public class JDialogPesquisarFornecedor extends javax.swing.JDialog {

    /**
     * Creates new form JDialogPesquisarFornecedor
     */
    public JDialogPesquisarFornecedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    DefaultTableModel tmFornecedor = new DefaultTableModel(null, new String[]{"Código", "Nome", "Celular", "E-mail",});
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelpesClienteImagem = new javax.swing.JLabel();
        jTextFieldPesFornCod = new javax.swing.JTextField();
        jLabelPesClienteCod = new javax.swing.JLabel();
        jLabel1PesFornCodNome = new javax.swing.JLabel();
        jTextFieldpesPesFornCod = new javax.swing.JTextField();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonCadFornecedor = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFornecedor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(800, 450));
        setMinimumSize(new java.awt.Dimension(800, 450));
        setPreferredSize(new java.awt.Dimension(800, 450));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelpesClienteImagem.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelpesClienteImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelpesClienteImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/PesquisarFornecedor.png"))); // NOI18N
        getContentPane().add(jLabelpesClienteImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 280, 50));

        jTextFieldPesFornCod.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        getContentPane().add(jTextFieldPesFornCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 110, 30));

        jLabelPesClienteCod.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelPesClienteCod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPesClienteCod.setText("Código:");
        getContentPane().add(jLabelPesClienteCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel1PesFornCodNome.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1PesFornCodNome.setText("Nome:");
        jLabel1PesFornCodNome.setToolTipText("");
        getContentPane().add(jLabel1PesFornCodNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jTextFieldpesPesFornCod.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTextFieldpesPesFornCod.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextFieldpesPesFornCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 230, 30));

        jButtonAtualizar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/update.png"))); // NOI18N
        jButtonAtualizar.setToolTipText("Atualizar");
        getContentPane().add(jButtonAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, -1));

        jButtonLimpar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/clear02.png"))); // NOI18N
        jButtonLimpar.setToolTipText("Limpar");
        getContentPane().add(jButtonLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, -1));

        jButtonFechar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/Close.png"))); // NOI18N
        jButtonFechar.setToolTipText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, -1, -1));

        jSeparator1.setPreferredSize(new java.awt.Dimension(620, 1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 800, -1));

        jButtonCadFornecedor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonCadFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/Forn.png"))); // NOI18N
        jButtonCadFornecedor.setToolTipText("Cadastrar Fornecedor");
        getContentPane().add(jButtonCadFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, -1, -1));

        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/PesquisarPadrao.png"))); // NOI18N
        btPesquisar.setMaximumSize(new java.awt.Dimension(30, 30));
        btPesquisar.setMinimumSize(new java.awt.Dimension(30, 30));
        btPesquisar.setPreferredSize(new java.awt.Dimension(28, 25));
        getContentPane().add(btPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 30, 30));

        tbFornecedor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tbFornecedor.setModel(tmFornecedor);
        tbFornecedor.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbFornecedor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 740, 160));

        setSize(new java.awt.Dimension(816, 489));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
      if (Util.imprimirConfirmacao("Deseja Sair?")) {
            dispose();
        }
    }//GEN-LAST:event_jButtonFecharActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonCadFornecedor;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JLabel jLabel1PesFornCodNome;
    private javax.swing.JLabel jLabelPesClienteCod;
    private javax.swing.JLabel jLabelpesClienteImagem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldPesFornCod;
    private javax.swing.JTextField jTextFieldpesPesFornCod;
    private javax.swing.JTable tbFornecedor;
    // End of variables declaration//GEN-END:variables
}
