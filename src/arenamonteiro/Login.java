package arenamonteiro;

import dao.AdminDao;
import entidades.Admin;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Kauã Rodrigo
 * @version 0.1
 * @since 30/07/2023
 * @erro #3 tem relação com o erro #2 ! pode ser algo na conexão do banco ou até
 * um dado errado no momento da inserção. ( Verificar 0 AdminDao e o banco de dados 
 *
 */
public class Login extends javax.swing.JFrame {

    // Objetos da classes AdminDao
    AdminDao adminDao = new AdminDao();

    // construtor
    public Login() {
        initComponents();
    }

    // código padrão do java
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelBranco = new javax.swing.JPanel();
        imgEscudo = new javax.swing.JLabel();
        painelVerde = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        iconSenha = new javax.swing.JLabel();
        iconUsuario = new javax.swing.JLabel();
        checkLembrarSenha = new javax.swing.JCheckBox();
        textEsqueceuSenha = new javax.swing.JLabel();
        bntAcessar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        textCriarConta = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        bntFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setName("Login"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        painelBranco.setBackground(new java.awt.Color(255, 255, 255));

        imgEscudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoEscudo03.png"))); // NOI18N

        javax.swing.GroupLayout painelBrancoLayout = new javax.swing.GroupLayout(painelBranco);
        painelBranco.setLayout(painelBrancoLayout);
        painelBrancoLayout.setHorizontalGroup(
            painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBrancoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgEscudo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelBrancoLayout.setVerticalGroup(
            painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBrancoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgEscudo)
                .addGap(163, 163, 163))
        );

        painelVerde.setBackground(new java.awt.Color(31, 115, 52));
        painelVerde.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("GESTÃO MONTEIRO");
        painelVerde.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 146, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ACESSE SUA CONTA");
        painelVerde.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 167, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("E-mail");
        painelVerde.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 256, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("___________________________________________________________");
        painelVerde.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 299, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Senha");
        painelVerde.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 333, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("___________________________________________________________");
        painelVerde.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 376, -1, -1));

        iconSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconOcultar.png"))); // NOI18N
        iconSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconSenhaMousePressed(evt);
            }
        });
        painelVerde.add(iconSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 355, -1, 37));

        iconUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconUsuario.png"))); // NOI18N
        painelVerde.add(iconUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 278, -1, 37));

        checkLembrarSenha.setBackground(new java.awt.Color(31, 115, 52));
        checkLembrarSenha.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        checkLembrarSenha.setForeground(new java.awt.Color(255, 255, 255));
        checkLembrarSenha.setText("Lembrar Senha");
        checkLembrarSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkLembrarSenha.setFocusPainted(false);
        painelVerde.add(checkLembrarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 420, -1, -1));

        textEsqueceuSenha.setBackground(new java.awt.Color(255, 255, 255));
        textEsqueceuSenha.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        textEsqueceuSenha.setForeground(new java.awt.Color(255, 255, 255));
        textEsqueceuSenha.setText("Esqueceu a senha ?");
        textEsqueceuSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        painelVerde.add(textEsqueceuSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 422, -1, -1));

        bntAcessar.setBackground(new java.awt.Color(255, 255, 255));
        bntAcessar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        bntAcessar.setForeground(new java.awt.Color(31, 115, 52));
        bntAcessar.setText("ACESSAR");
        bntAcessar.setBorder(null);
        bntAcessar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntAcessar.setFocusPainted(false);
        bntAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAcessarActionPerformed(evt);
            }
        });
        painelVerde.add(bntAcessar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 347, 33));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Não tem uma conta ?");
        painelVerde.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, -1, -1));

        textCriarConta.setBackground(new java.awt.Color(255, 255, 255));
        textCriarConta.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        textCriarConta.setForeground(new java.awt.Color(255, 255, 255));
        textCriarConta.setText("Crie agora");
        textCriarConta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textCriarConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textCriarContaMouseClicked(evt);
            }
        });
        painelVerde.add(textCriarConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, -1, -1));

        campoEmail.setBackground(new java.awt.Color(31, 115, 52));
        campoEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoEmail.setForeground(new java.awt.Color(255, 255, 255));
        campoEmail.setBorder(null);
        campoEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        painelVerde.add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 282, 280, 30));

        campoSenha.setBackground(new java.awt.Color(31, 115, 52));
        campoSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoSenha.setForeground(new java.awt.Color(255, 255, 255));
        campoSenha.setBorder(null);
        campoSenha.setCaretColor(new java.awt.Color(255, 255, 255));
        painelVerde.add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 280, 30));

        bntFechar.setBackground(new java.awt.Color(31, 115, 52));
        bntFechar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bntFechar.setForeground(new java.awt.Color(255, 255, 255));
        bntFechar.setText("X");
        bntFechar.setBorder(null);
        bntFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntFechar.setFocusPainted(false);
        bntFechar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bntFechar.setRequestFocusEnabled(false);
        bntFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntFecharActionPerformed(evt);
            }
        });
        painelVerde.add(bntFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 36, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelBranco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(painelVerde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBranco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelVerde, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(888, 686));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // bnt que vai fechar a janela
    private void bntFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_bntFecharActionPerformed

    // vai ocultar a janela de login e abrir a janela Criar Admin
    private void textCriarContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textCriarContaMouseClicked
        this.setVisible(false);
        CriarAdmin criarAdmin = new CriarAdmin(this);
        criarAdmin.setVisible(true);
    }//GEN-LAST:event_textCriarContaMouseClicked

    // método para ocultar e remover a senha, além de trocar a imagem do icon
    private void iconSenhaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconSenhaMousePressed
        char echoChar = campoSenha.getEchoChar();

        if (echoChar == '*') {
            // Se a senha está oculta, torna visível
            campoSenha.setEchoChar((char) 0);
            iconSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconVisivel.png")));
        } else {
            // Se a senha está visível, torna oculta
            campoSenha.setEchoChar('*');
            iconSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconOcultar.png")));
        }

    }//GEN-LAST:event_iconSenhaMousePressed

    // método para acessar a janela principal 
    private void bntAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAcessarActionPerformed

        try {
            Admin admin = new Admin(
                    campoEmail.getText(),
                    new String(campoSenha.getPassword())
            );

            // Instância do ResultSet pra lidar com o retorno da query sql
            ResultSet rs = adminDao.entrarAdmin(admin);

            if (rs.next()) { // caso a query tenha um retorno vai cair aqui

                Principal principal = new Principal();
                principal.setVisible(true);
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(null,
                        "Verififique o e-mail ou senha informados e tente novamente.",
                        "Aviso - Login", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,
                    "<html><strong>Ocorreu um erro inesperado durante o login!</strong><br>"
                    + "Detalhes: " + erro.getMessage() + "<br>"
                    + "Informe o código de erro #3</html>",
                    "Erro #3", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_bntAcessarActionPerformed

    // código padrão do java
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton bntAcessar;
    protected javax.swing.JButton bntFechar;
    protected javax.swing.JTextField campoEmail;
    protected javax.swing.JPasswordField campoSenha;
    protected javax.swing.JCheckBox checkLembrarSenha;
    protected javax.swing.JLabel iconSenha;
    protected javax.swing.JLabel iconUsuario;
    protected javax.swing.JLabel imgEscudo;
    protected javax.swing.JLabel jLabel10;
    protected javax.swing.JLabel jLabel14;
    protected javax.swing.JLabel jLabel5;
    protected javax.swing.JLabel jLabel6;
    protected javax.swing.JLabel jLabel7;
    protected javax.swing.JLabel jLabel8;
    protected javax.swing.JLabel jLabel9;
    protected javax.swing.JPanel painelBranco;
    protected javax.swing.JPanel painelVerde;
    protected javax.swing.JLabel textCriarConta;
    protected javax.swing.JLabel textEsqueceuSenha;
    // End of variables declaration//GEN-END:variables
}
