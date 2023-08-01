package arenamonteiro;

// Importações necessárias
import codigos.IconSenha;
import dao.AdminDao;
import entidades.Admin;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
/**
 * Tela para criar um novo administrador (admin). Permite inserir informações
 * como nome, sobrenome, senha, data de nascimento e sexo.
 *
 * @author Kauã Rodrigo
 * @version 0.1
 * @since 31/07/2023
 */
public class CriarAdmin extends javax.swing.JFrame {

    // Objetos da classes Admin e IconSenha
    Admin admin = new Admin();
    AdminDao adminDao = new AdminDao();
    IconSenha iconSenha = new IconSenha();

    // Criação do ButtonGroup para os checkboxes de gênero
    ButtonGroup grupoGenero = new ButtonGroup();

    // Construtor
    public CriarAdmin() {
        initComponents();
        // Adiciona os checkboxes de gênero ao grupo, para permitir seleção única
        grupoGenero.add(checkMasculino);
        grupoGenero.add(checkFeminino);
    }

    // código padrão do java
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bntFechar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        checkMasculino = new javax.swing.JCheckBox();
        checkFeminino = new javax.swing.JCheckBox();
        bntCriarConta = new javax.swing.JButton();
        textTemConta = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        campoSobrenome = new javax.swing.JTextField();
        campoNascimento = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        iconCampo2 = new javax.swing.JLabel();
        campoConfirmarSenha = new javax.swing.JPasswordField();
        iconCampo1 = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Criar conta");
        setName("Criar Conta"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoEscudo.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(128, 203, 79));
        jLabel16.setText("© Kauã Rodrigo - 2023");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(128, 203, 79));
        jLabel17.setText("ARENA");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(128, 203, 79));
        jLabel18.setText("MONTEIRO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jLabel17))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel16)))
                        .addGap(0, 84, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addGap(0, 0, 0)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(31, 115, 52));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bntFechar.setBackground(new java.awt.Color(31, 115, 52));
        bntFechar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bntFechar.setForeground(new java.awt.Color(255, 255, 255));
        bntFechar.setText("X");
        bntFechar.setBorder(null);
        bntFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntFecharActionPerformed(evt);
            }
        });
        jPanel2.add(bntFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 30, 32));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("________________________________________");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sobrenome");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("________________________________________");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 330, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("________________________________________");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 410, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Confirmar senha");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("________________________________________");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 410, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Senha");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("________________________________________");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 490, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Data nascimento");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Sexo");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, -1, -1));

        checkMasculino.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkMasculino.setForeground(new java.awt.Color(255, 255, 255));
        checkMasculino.setText("Masculino");
        jPanel2.add(checkMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 490, 85, -1));

        checkFeminino.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkFeminino.setForeground(new java.awt.Color(255, 255, 255));
        checkFeminino.setText("Feminino");
        jPanel2.add(checkFeminino, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 490, 85, -1));

        bntCriarConta.setBackground(new java.awt.Color(255, 255, 255));
        bntCriarConta.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        bntCriarConta.setForeground(new java.awt.Color(31, 115, 52));
        bntCriarConta.setText("CRIAR MINHA CONTA ");
        bntCriarConta.setBorder(null);
        bntCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCriarContaActionPerformed(evt);
            }
        });
        jPanel2.add(bntCriarConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 549, 335, 33));

        textTemConta.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        textTemConta.setForeground(new java.awt.Color(255, 255, 255));
        textTemConta.setText("Já tenho uma conta !");
        textTemConta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textTemConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textTemContaMouseClicked(evt);
            }
        });
        jPanel2.add(textTemConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 588, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("GESTÃO MONTEIRO");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("CRIAR NOVA CONTA");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        campoSobrenome.setBackground(new java.awt.Color(31, 115, 52));
        campoSobrenome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoSobrenome.setForeground(new java.awt.Color(255, 255, 255));
        campoSobrenome.setBorder(null);
        campoSobrenome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(campoSobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 220, 30));

        campoNascimento.setBackground(new java.awt.Color(31, 115, 52));
        campoNascimento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoNascimento.setForeground(new java.awt.Color(255, 255, 255));
        campoNascimento.setBorder(null);
        campoNascimento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campoNascimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoNascimentoKeyTyped(evt);
            }
        });
        jPanel2.add(campoNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 230, 30));

        campoNome.setBackground(new java.awt.Color(31, 115, 52));
        campoNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoNome.setForeground(new java.awt.Color(255, 255, 255));
        campoNome.setBorder(null);
        campoNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 230, 30));

        iconCampo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/senhasIguais.png"))); // NOI18N
        jPanel2.add(iconCampo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, -1, 30));

        campoConfirmarSenha.setBackground(new java.awt.Color(31, 115, 52));
        campoConfirmarSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoConfirmarSenha.setForeground(new java.awt.Color(255, 255, 255));
        campoConfirmarSenha.setBorder(null);
        campoConfirmarSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(campoConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 230, 30));

        iconCampo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/senhasIguais.png"))); // NOI18N
        jPanel2.add(iconCampo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, 30));

        campoSenha.setBackground(new java.awt.Color(31, 115, 52));
        campoSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoSenha.setForeground(new java.awt.Color(255, 255, 255));
        campoSenha.setBorder(null);
        campoSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 230, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1039, 686));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // bnt que vai fechar a janela
    private void bntFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_bntFecharActionPerformed

    // vai a fechar janela atual e voltar para de login
    private void textTemContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textTemContaMouseClicked
        this.dispose(); // vai fechar a janela
        Login janelaLogin = new Login(); // criando um objeto da classe Login
        janelaLogin.setVisible(true);
    }//GEN-LAST:event_textTemContaMouseClicked

    // Método que vai criar um novo admin
    private void bntCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCriarContaActionPerformed

        // Validação das senhas e obtenção da senha validada
        String senhaValidada = iconSenha.validarSenhas(campoSenha, campoConfirmarSenha, iconCampo1, iconCampo2);

        // Atribuição dos valores do admin com base nos campos preenchidos
        admin.setNome(campoNome.getText());
        admin.setSobrenome(campoSobrenome.getText());
        admin.setSenha(senhaValidada);
        admin.setNascimento(campoNascimento.getText());

        // Atribuição do valor do sexo (masculino ou feminino)
        if (checkMasculino.isSelected()) {
            admin.setSexo("Masculino");
        } else if (checkFeminino.isSelected()) {
            admin.setSexo("Feminino");
        }

        // Validação de campos obrigatórios e criação do admin 
        if (admin.validacaoDasInfo(this)) {
            return; // Se a validação falhar, retorne e não prossiga com o cadastro
        }
        
        limparCampos();
        
        adminDao.cadastrarAdmin(admin); // método da classe AdminDao
        

        // exibir uma mensagem personalizada quando o usuário for criado
        JOptionPane.showMessageDialog(this, admin.infoAdmin(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        // Fechar a janela atual (CriarAdmin)
        this.dispose();

        // Voltar para a tela de login
        Login janelaLogin = new Login();
        janelaLogin.setVisible(true);

    }//GEN-LAST:event_bntCriarContaActionPerformed

    // Método para formatar a data enquanto o usuário digita
    private void campoNascimentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNascimentoKeyTyped

        // Vou pegar os dados digitados no campo de nascimento
        String dadosAtuais = campoNascimento.getText();

        // Obtém o tamanho da string atual
        int tamanho = dadosAtuais.length();

        // Verifica se o caractere digitado pelo usuário é um dígito numérico (0 a 9)
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            // Se o tamanho atual for 2 ou 5 (posições onde precisamos adicionar "/")
            if (tamanho == 2 || tamanho == 5) {
                // Adiciona a barra "/" aos dados atuais digitados no campo de nascimento
                campoNascimento.setText(dadosAtuais + '/');
            }
        } else {
            // Se o caractere digitado pelo usuário não for um dígito numérico (0 a 9)
            // Verifica se o tamanho atual é 3 ou 6 (posições onde a barra "/" precisa ser removida)
            if (tamanho == 3 || tamanho == 6) {
                // Remove o último caractere (a barra "/") dos dados atuais digitados no campo de nascimento
                campoNascimento.setText(dadosAtuais.substring(0, tamanho - 1));
            }
        }

    }//GEN-LAST:event_campoNascimentoKeyTyped

    // código padrão do java
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
            java.util.logging.Logger.getLogger(CriarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriarAdmin().setVisible(true);
            }
        });
    }

    // Método para limpar os campos após cada criação de conta
    public void limparCampos() {
        campoNome.setText("");
        campoSobrenome.setText("");
        campoSenha.setText("");
        campoConfirmarSenha.setText("");
        campoNascimento.setText("");
        grupoGenero.clearSelection();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCriarConta;
    private javax.swing.JButton bntFechar;
    private javax.swing.JPasswordField campoConfirmarSenha;
    private javax.swing.JTextField campoNascimento;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JTextField campoSobrenome;
    private javax.swing.JCheckBox checkFeminino;
    private javax.swing.JCheckBox checkMasculino;
    private javax.swing.JLabel iconCampo1;
    private javax.swing.JLabel iconCampo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel textTemConta;
    // End of variables declaration//GEN-END:variables
}
