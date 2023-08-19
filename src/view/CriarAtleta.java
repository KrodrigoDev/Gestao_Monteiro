package view;

import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Kauã Rodrigo
 * @since 19/08/2023
 * @version 0.1
 */
public class CriarAtleta extends javax.swing.JFrame {

    // Objeto da classe ListaAtleta
    private ListaAtletas listaAtleta;

    // construtor
    public CriarAtleta(ListaAtletas listaAtleta) {
        initComponents();

        this.listaAtleta = listaAtleta;

        mudarCoresSpinner(); // inicilizando a mudança de cores
    }

    // código padrão do java 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        separadorText = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bntCadastrar = new view.BotaoPersonalizado();
        jTextField1 = new javax.swing.JTextField();
        textIdAdmin = new javax.swing.JLabel();
        separadorText1 = new javax.swing.JSeparator();
        separadorText2 = new javax.swing.JSeparator();
        separadorText4 = new javax.swing.JSeparator();
        spinnerCategoria = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        separadorText5 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        bntVoltar = new view.BotaoPersonalizado();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(31, 115, 52));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconMenuJogadores.png"))); // NOI18N
        jLabel1.setText("Cadastrar novo atleta ");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 7, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Boletim de inscrição");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 36, -1, -1));

        separadorText.setBackground(new java.awt.Color(31, 115, 52));
        separadorText.setForeground(new java.awt.Color(255, 255, 255));
        separadorText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        separadorText.setEnabled(false);
        separadorText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(separadorText, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 58, 610, 12));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sobrenome");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 142, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 142, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Categoria");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 289, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Id do admin logado : ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 38, -1, -1));

        bntCadastrar.setForeground(new java.awt.Color(31, 115, 52));
        bntCadastrar.setText("CADASTRAR ATLETA");
        bntCadastrar.setBorderColor(new java.awt.Color(31, 115, 52));
        bntCadastrar.setBorderPainted(false);
        bntCadastrar.setColorClick(new java.awt.Color(0, 146, 120));
        bntCadastrar.setColorOver(new java.awt.Color(255, 255, 255));
        bntCadastrar.setFocusPainted(false);
        bntCadastrar.setFocusable(false);
        bntCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        bntCadastrar.setRadius(10);
        jPanel1.add(bntCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 436, 270, 36));

        jTextField1.setBackground(new java.awt.Color(31, 115, 52));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jTextField1.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 172, 210, 30));

        textIdAdmin.setBackground(new java.awt.Color(255, 255, 255));
        textIdAdmin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textIdAdmin.setForeground(new java.awt.Color(240, 240, 240));
        textIdAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textIdAdmin.setText("10");
        jPanel1.add(textIdAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 38, 27, -1));

        separadorText1.setBackground(new java.awt.Color(31, 115, 52));
        separadorText1.setForeground(new java.awt.Color(255, 255, 255));
        separadorText1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        separadorText1.setEnabled(false);
        separadorText1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(separadorText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 202, 215, 12));

        separadorText2.setBackground(new java.awt.Color(31, 115, 52));
        separadorText2.setForeground(new java.awt.Color(255, 255, 255));
        separadorText2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        separadorText2.setEnabled(false);
        separadorText2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(separadorText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 202, 215, 12));

        separadorText4.setBackground(new java.awt.Color(31, 115, 52));
        separadorText4.setForeground(new java.awt.Color(255, 255, 255));
        separadorText4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        separadorText4.setEnabled(false);
        separadorText4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(separadorText4, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 349, 215, 12));

        spinnerCategoria.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        spinnerCategoria.setModel(new javax.swing.SpinnerListModel(new String[] {"SUB-13", "SUB-15", "SUB-17", "SUB-20"}));
        spinnerCategoria.setBorder(null);
        spinnerCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        spinnerCategoria.setEditor(new javax.swing.JSpinner.ListEditor(spinnerCategoria));
        spinnerCategoria.setFocusable(false);
        spinnerCategoria.setRequestFocusEnabled(false);
        jPanel1.add(spinnerCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 315, 210, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cadastre com resposabilidade !");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 478, -1, -1));

        jTextField4.setBackground(new java.awt.Color(31, 115, 52));
        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setBorder(null);
        jTextField4.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 172, 210, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefone");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 80, -1));

        jTextField5.setBackground(new java.awt.Color(31, 115, 52));
        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setBorder(null);
        jTextField5.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 210, 30));

        separadorText5.setBackground(new java.awt.Color(31, 115, 52));
        separadorText5.setForeground(new java.awt.Color(255, 255, 255));
        separadorText5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        separadorText5.setEnabled(false);
        separadorText5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(separadorText5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 215, 12));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        bntVoltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 115, 52)));
        bntVoltar.setForeground(new java.awt.Color(31, 115, 52));
        bntVoltar.setText("Cancelar");
        bntVoltar.setBorderColor(new java.awt.Color(31, 115, 52));
        bntVoltar.setBorderPainted(false);
        bntVoltar.setColorClick(new java.awt.Color(0, 146, 120));
        bntVoltar.setColorOver(new java.awt.Color(255, 255, 255));
        bntVoltar.setFocusPainted(false);
        bntVoltar.setFocusable(false);
        bntVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bntVoltar.setRadius(10);
        bntVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bntVoltarMouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(31, 115, 52));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(31, 115, 52));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Não deseja continuar ?");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bntVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bntVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(291, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(885, 599));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // vai fechar a janela atual e voltar para a janela da listagem
    private void bntVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntVoltarMouseClicked
        this.dispose();
        listaAtleta.setVisible(true);
    }//GEN-LAST:event_bntVoltarMouseClicked

    // código padrão do java
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarAtleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    // método para  alaterar as cores do spinner 
    public void mudarCoresSpinner() {
        JComponent editorComponent = (JComponent) spinnerCategoria.getEditor().getComponent(0);
        editorComponent.setForeground(Color.white);
        editorComponent.setBackground(new Color(31, 115, 52));

        JTextField textField = (JTextField) editorComponent;
        textField.setCaretColor(Color.white); // Define a cor do caret (cursor de texto) no JTextField
    }

    // método para alternar as cores dos campos
    public void mudarCor(JPanel campo, Color cor) {
        campo.setBackground(cor);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.BotaoPersonalizado bntCadastrar;
    private view.BotaoPersonalizado bntVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JSeparator separadorText;
    private javax.swing.JSeparator separadorText1;
    private javax.swing.JSeparator separadorText2;
    private javax.swing.JSeparator separadorText4;
    private javax.swing.JSeparator separadorText5;
    private javax.swing.JSpinner spinnerCategoria;
    private javax.swing.JLabel textIdAdmin;
    // End of variables declaration//GEN-END:variables
}
