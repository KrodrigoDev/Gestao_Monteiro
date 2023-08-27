package view;

import controller.BytesAdmin;
import modeldao.AdminDao;
import model.Admin;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JPanel;

/**
 * @author Kauã Rodrigo
 * @version 0.1
 * @since 30/07/2023
 */
public class Login extends javax.swing.JFrame {

    // Objetos de classes 
    AdminDao adminDao = new AdminDao();
    BytesAdmin bytesAdmin = new BytesAdmin();
    Mensagens mensagens = new Mensagens();

    // construtor
    public Login() {
        initComponents();
        campoSenha.setEchoChar('\u25cf'); // fazendo a inicialização para evitar atrasos no click
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
        jLabel14 = new javax.swing.JLabel();
        textCriarConta = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        painelBntFechar = new javax.swing.JPanel();
        iconFechar = new javax.swing.JLabel();
        bntAcessar = new view.BotaoPersonalizado();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setName("Login"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        painelBranco.setBackground(new java.awt.Color(255, 255, 255));

        imgEscudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoOFicialArena.png"))); // NOI18N

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
        checkLembrarSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        checkLembrarSenha.setFocusPainted(false);
        painelVerde.add(checkLembrarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 420, -1, -1));

        textEsqueceuSenha.setBackground(new java.awt.Color(255, 255, 255));
        textEsqueceuSenha.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        textEsqueceuSenha.setForeground(new java.awt.Color(255, 255, 255));
        textEsqueceuSenha.setText("Esqueceu a senha ?");
        textEsqueceuSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textEsqueceuSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textEsqueceuSenhaMouseClicked(evt);
            }
        });
        painelVerde.add(textEsqueceuSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 422, -1, -1));

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
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(painelBntFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(iconFechar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );
        painelBntFecharLayout.setVerticalGroup(
            painelBntFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(painelBntFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(iconFechar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        painelVerde.add(painelBntFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 40, 40));

        bntAcessar.setBorder(null);
        bntAcessar.setForeground(new java.awt.Color(31, 115, 52));
        bntAcessar.setText("ACESSAR");
        bntAcessar.setBorderColor(new java.awt.Color(31, 115, 52));
        bntAcessar.setBorderPainted(false);
        bntAcessar.setColorClick(new java.awt.Color(0, 146, 120));
        bntAcessar.setColorOver(new java.awt.Color(255, 255, 255));
        bntAcessar.setFocusPainted(false);
        bntAcessar.setFocusable(false);
        bntAcessar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        bntAcessar.setRadius(10);
        bntAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAcessarActionPerformed(evt);
            }
        });
        painelVerde.add(bntAcessar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 350, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelBranco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(painelVerde, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBranco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelVerde, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(892, 686));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // vai ocultar a janela de login e abrir a janela Criar Admin
    private void textCriarContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textCriarContaMouseClicked
        this.setVisible(false);
        CriarAdmin criarAdmin = new CriarAdmin(this);
        criarAdmin.setVisible(true);
    }//GEN-LAST:event_textCriarContaMouseClicked

    // vai chamar o método trocarImagensICon
    private void iconSenhaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconSenhaMousePressed
        trocarImagensIcon();
    }//GEN-LAST:event_iconSenhaMousePressed

    // ao passar o mouse por cima do campo a cor será alterada
    private void painelBntFecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBntFecharMouseEntered
        mudarCor(painelBntFechar, new Color(196, 43, 28));
    }//GEN-LAST:event_painelBntFecharMouseEntered

    // quando o mouse sair de cima a cor vai voltar ao normal
    private void painelBntFecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBntFecharMouseExited
        mudarCor(painelBntFechar, new Color(31, 115, 52));
    }//GEN-LAST:event_painelBntFecharMouseExited

    // ao ser clicado via fechar a janela e encerrar o programa
    private void painelBntFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBntFecharMouseClicked
        this.dispose();
    }//GEN-LAST:event_painelBntFecharMouseClicked

    // método que leva para janela esqueceu a senha
    private void textEsqueceuSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textEsqueceuSenhaMouseClicked
        EsqueceuSenha esqueceuSenha = new EsqueceuSenha(this);
        esqueceuSenha.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_textEsqueceuSenhaMouseClicked

    // método que chama o fazer login
    private void bntAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAcessarActionPerformed
        fazerLogin();
    }//GEN-LAST:event_bntAcessarActionPerformed

    // Método para logar 
    public void fazerLogin() {
        try {
            // passando os dados para o construtor com sobrecarga
            Admin admin = new Admin(
                    campoEmail.getText(),
                    new String(campoSenha.getPassword())
            );

            // Instância do ResultSet pra lidar com o retorno da query sql
            ResultSet rs = adminDao.entrarAdmin(admin);

            if (rs.next()) { // caso a query tenha um retorno vai cair aqui
                String nomeAdmin = rs.getString("nome");
                String sobrenomeAdmin = rs.getString("sobrenome");
                LocalDate nascimentoAdmin = rs.getDate("nascimento").toLocalDate(); // toLocalDate faz a formatação da data que vem do banco de dados
                int id = rs.getInt("id");

                // Armazenar o ID em um arquivo de texto
                bytesAdmin.pegarIdPorByte(Integer.toString(id)); // Converte o ID para String

                Principal principal = new Principal();
                principal.setNomeAdmin(nomeAdmin + " " + sobrenomeAdmin);
                principal.setIdadeAdmin(admin.calcularIdade(nascimentoAdmin));

                principal.setVisible(true);
                this.dispose();

            } else {
                mensagens.tipoMensagemLogin(1);
            }

        } catch (SQLException erro) {
            mensagens.tipoMensagemLogin(2);
        }
    }

    // Método para exibir e ocultar a senha, além de trocar a imagem 
    public void trocarImagensIcon() {
        char echoChar = campoSenha.getEchoChar();

        if (echoChar == '\u25cf') {
            // Se a senha está oculta, torna visível
            campoSenha.setEchoChar((char) 0);
            iconSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconVisivel.png")));
        } else {
            // Se a senha está visível, torna oculta
            campoSenha.setEchoChar('\u25cf');
            iconSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconOcultar.png")));
        }
    }

    // método para alternar as cores dos bntFechar
    public void mudarCor(JPanel campo, Color cor) {
        campo.setBackground(cor);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected view.BotaoPersonalizado bntAcessar;
    protected javax.swing.JTextField campoEmail;
    protected javax.swing.JPasswordField campoSenha;
    protected javax.swing.JCheckBox checkLembrarSenha;
    protected javax.swing.JLabel iconFechar;
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
    protected javax.swing.JPanel painelBntFechar;
    protected javax.swing.JPanel painelBranco;
    protected javax.swing.JPanel painelVerde;
    protected javax.swing.JLabel textCriarConta;
    protected javax.swing.JLabel textEsqueceuSenha;
    // End of variables declaration//GEN-END:variables
}
