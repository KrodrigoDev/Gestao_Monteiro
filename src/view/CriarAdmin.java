package view;

// Importações necessárias
import modeldao.AdminDao;
import model.Admin;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JPanel;

/**
 *
 * @author Kauã Rodrigo
 * @version 0.1
 * @since 07/08/2023
 *
 */
public class CriarAdmin extends javax.swing.JFrame {

    // Objetos de classes 
    AdminDao adminDao = new AdminDao();
    Mensagens mensagens = new Mensagens();

    // Objeto da classe login ( vai ser usado para deixar a tela anterior vísivel )
    private Login login;

    // Construtor
    public CriarAdmin(Login login) {
        initComponents();
        this.login = login;
    }

    // código padrão do java
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelBranco = new javax.swing.JPanel();
        imgEscudo = new javax.swing.JLabel();
        painelVerde = new javax.swing.JPanel();
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
        textTemConta = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        campoSobrenome = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        campoConfirmarSenha = new javax.swing.JPasswordField();
        campoSenha = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        painelBntFechar = new javax.swing.JPanel();
        iconFechar = new javax.swing.JLabel();
        bntCriarConta = new view.BotaoPersonalizado();
        campoNascimento = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Criar conta");
        setName("Criar Conta"); // NOI18N
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
                .addComponent(imgEscudo, javax.swing.GroupLayout.PREFERRED_SIZE, 287, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelBrancoLayout.setVerticalGroup(
            painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBrancoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgEscudo, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );

        painelVerde.setBackground(new java.awt.Color(31, 115, 52));
        painelVerde.setForeground(new java.awt.Color(255, 255, 255));
        painelVerde.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome");
        painelVerde.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("________________________________________");
        painelVerde.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sobrenome");
        painelVerde.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("________________________________________");
        painelVerde.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 330, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("________________________________________");
        painelVerde.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 410, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Confirmar Senha");
        painelVerde.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("________________________________________");
        painelVerde.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 410, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Senha");
        painelVerde.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("________________________________________");
        painelVerde.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 490, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("E-mail");
        painelVerde.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Data Nascimento");
        painelVerde.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, -1, -1));

        textTemConta.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        textTemConta.setForeground(new java.awt.Color(255, 255, 255));
        textTemConta.setText("Já tenho uma conta !");
        textTemConta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textTemConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textTemContaMouseClicked(evt);
            }
        });
        painelVerde.add(textTemConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 600, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("GESTÃO MONTEIRO");
        painelVerde.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("CRIAR NOVA CONTA");
        painelVerde.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        campoSobrenome.setBackground(new java.awt.Color(31, 115, 52));
        campoSobrenome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoSobrenome.setForeground(new java.awt.Color(255, 255, 255));
        campoSobrenome.setBorder(null);
        campoSobrenome.setCaretColor(new java.awt.Color(255, 255, 255));
        campoSobrenome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        painelVerde.add(campoSobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 220, 30));

        campoEmail.setBackground(new java.awt.Color(31, 115, 52));
        campoEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoEmail.setForeground(new java.awt.Color(255, 255, 255));
        campoEmail.setBorder(null);
        campoEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        campoEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        painelVerde.add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 230, 30));

        campoNome.setBackground(new java.awt.Color(31, 115, 52));
        campoNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoNome.setForeground(new java.awt.Color(255, 255, 255));
        campoNome.setBorder(null);
        campoNome.setCaretColor(new java.awt.Color(255, 255, 255));
        campoNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        painelVerde.add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 230, 30));

        campoConfirmarSenha.setBackground(new java.awt.Color(31, 115, 52));
        campoConfirmarSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoConfirmarSenha.setForeground(new java.awt.Color(255, 255, 255));
        campoConfirmarSenha.setBorder(null);
        campoConfirmarSenha.setCaretColor(new java.awt.Color(255, 255, 255));
        campoConfirmarSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        painelVerde.add(campoConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 230, 30));

        campoSenha.setBackground(new java.awt.Color(31, 115, 52));
        campoSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoSenha.setForeground(new java.awt.Color(255, 255, 255));
        campoSenha.setBorder(null);
        campoSenha.setCaretColor(new java.awt.Color(255, 255, 255));
        campoSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        painelVerde.add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 230, 30));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("________________________________________");
        painelVerde.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, -1, -1));

        painelBntFechar.setBackground(new java.awt.Color(31, 115, 52));
        painelBntFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelBntFecharMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                painelBntFecharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                painelBntFecharMouseExited(evt);
            }
        });

        iconFechar.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        iconFechar.setForeground(new java.awt.Color(255, 255, 255));
        iconFechar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconFechar.setText("X");

        javax.swing.GroupLayout painelBntFecharLayout = new javax.swing.GroupLayout(painelBntFechar);
        painelBntFechar.setLayout(painelBntFecharLayout);
        painelBntFecharLayout.setHorizontalGroup(
            painelBntFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconFechar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        painelBntFecharLayout.setVerticalGroup(
            painelBntFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBntFecharLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(iconFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        painelVerde.add(painelBntFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 40, 40));

        bntCriarConta.setBorder(null);
        bntCriarConta.setForeground(new java.awt.Color(31, 115, 52));
        bntCriarConta.setText("CRIAR MINHA CONTA");
        bntCriarConta.setBorderColor(new java.awt.Color(31, 115, 52));
        bntCriarConta.setBorderPainted(false);
        bntCriarConta.setColorClick(new java.awt.Color(0, 146, 120));
        bntCriarConta.setColorOver(new java.awt.Color(255, 255, 255));
        bntCriarConta.setFocusPainted(false);
        bntCriarConta.setFocusable(false);
        bntCriarConta.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        bntCriarConta.setRadius(10);
        bntCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCriarContaActionPerformed(evt);
            }
        });
        painelVerde.add(bntCriarConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, 340, 40));

        campoNascimento.setBackground(new java.awt.Color(31, 115, 52));
        campoNascimento.setBorder(null);
        campoNascimento.setForeground(new java.awt.Color(255, 255, 255));
        try {
            campoNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoNascimento.setCaretColor(new java.awt.Color(255, 255, 255));
        campoNascimento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        painelVerde.add(campoNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 230, 30));

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

        setSize(new java.awt.Dimension(1040, 686));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // vai a fechar janela atual e voltar para de login
    private void textTemContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textTemContaMouseClicked
        this.dispose(); // vai fechar a janela
        login.setVisible(true);
    }//GEN-LAST:event_textTemContaMouseClicked

    // método para fechar o programa completamente (Essa outra forma de se fechar é pq tem a janela de login oculta)
    private void painelBntFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBntFecharMouseClicked
        System.exit(0);
    }//GEN-LAST:event_painelBntFecharMouseClicked

    private void painelBntFecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBntFecharMouseEntered
        mudarCor(painelBntFechar, new Color(21, 80, 36));
    }//GEN-LAST:event_painelBntFecharMouseEntered

    private void painelBntFecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBntFecharMouseExited
        mudarCor(painelBntFechar, new Color(31, 115, 52));
    }//GEN-LAST:event_painelBntFecharMouseExited

    private void bntCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCriarContaActionPerformed
        criarAdmin();
    }//GEN-LAST:event_bntCriarContaActionPerformed

    // Método para limpar os campos após cada criação de conta
    public void limparCampos() {
        campoNome.setText("");
        campoSobrenome.setText("");
        campoSenha.setText("");
        campoConfirmarSenha.setText("");
        campoEmail.setText("");
        campoNascimento.setText("");
    }

    // Método para realizar a criação da conta
    public void criarAdmin() {
        try {

            String nome = campoNome.getText().trim();
            String sobrenome = campoSobrenome.getText().trim();
            String email = campoEmail.getText().trim();
            String nascimento = campoNascimento.getText().trim();
            String senha = new String(campoSenha.getPassword()).trim();
            String confirmarSenha = new String(campoConfirmarSenha.getPassword()).trim();

            Admin admin = new Admin(nome, sobrenome, email, nascimento, senha, confirmarSenha);

            // Validações dos campos
            if (!admin.validarCamposPreenchidosString(nome, sobrenome, email)) {
                mensagens.tipoMensagemCriarContas(1);
                return;
            }

            // Validações da senha
            if (!admin.validarSenha(senha, confirmarSenha)) {
                mensagens.tipoMensagemCriarContas(4);
                return;
            }
            
            // Se tudo deu certo vai criar o admin
            if (adminDao.cadastrarAdmin(admin)) {
                limparCampos();
                mensagens.tipoMensagemCriarContas(3);
                this.dispose();
                login.setVisible(true);
            }

        } catch (HeadlessException erro) {
            mensagens.tipoMensagemCriarContas(2);
        }

    }

    // método para alternar as cores dos bntFechar
    public void mudarCor(JPanel campo, Color cor) {
        campo.setBackground(cor);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.BotaoPersonalizado bntCriarConta;
    private javax.swing.JPasswordField campoConfirmarSenha;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JFormattedTextField campoNascimento;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JTextField campoSobrenome;
    private javax.swing.JLabel iconFechar;
    private javax.swing.JLabel imgEscudo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel painelBntFechar;
    private javax.swing.JPanel painelBranco;
    private javax.swing.JPanel painelVerde;
    private javax.swing.JLabel textTemConta;
    // End of variables declaration//GEN-END:variables
}
