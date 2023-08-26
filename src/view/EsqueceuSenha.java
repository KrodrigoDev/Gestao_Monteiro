package view;

import modeldao.AdminDao;
import model.Admin;
import model.Email;
import javax.mail.MessagingException;

/**
 * @since 13/08/2023
 * @author Kauã Rodrigo
 * @OBS : Implementar um carregamanto
 */
public class EsqueceuSenha extends javax.swing.JFrame {

    // Objetos de classes
    AdminDao adminDao = new AdminDao();
    Mensagens mensagens = new Mensagens();
    Progresso progressoEmail = new Progresso();

    // constante que vai definir a minha senha padrão
    private final String SENHA_PADRAO = "ArenaMonteiro2024";

    private Login login;

    // construtor
    public EsqueceuSenha(Login login) {
        initComponents();
        this.login = login;
    }

    // código padrão do java
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelBranco = new javax.swing.JPanel();
        bntVoltar = new view.BotaoPersonalizado();
        jLabel5 = new javax.swing.JLabel();
        painelVerde = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bntRecuperarSenha = new view.BotaoPersonalizado();
        jLabel4 = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoDataNascimento = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Recuperar Senha"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        painelBranco.setBackground(new java.awt.Color(255, 255, 255));

        bntVoltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 115, 52)));
        bntVoltar.setForeground(new java.awt.Color(31, 115, 52));
        bntVoltar.setText("Voltar");
        bntVoltar.setBorderColor(new java.awt.Color(31, 115, 52));
        bntVoltar.setBorderPainted(false);
        bntVoltar.setColorClick(new java.awt.Color(0, 146, 120));
        bntVoltar.setColorOver(new java.awt.Color(255, 255, 255));
        bntVoltar.setFocusPainted(false);
        bntVoltar.setFocusable(false);
        bntVoltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bntVoltar.setRadius(10);
        bntVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bntVoltarMouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(31, 115, 52));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Finalizou o processo ?");

        javax.swing.GroupLayout painelBrancoLayout = new javax.swing.GroupLayout(painelBranco);
        painelBranco.setLayout(painelBrancoLayout);
        painelBrancoLayout.setHorizontalGroup(
            painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(painelBrancoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(bntVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelBrancoLayout.setVerticalGroup(
            painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBrancoLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel5)
                .addGap(12, 12, 12)
                .addComponent(bntVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelVerde.setBackground(new java.awt.Color(31, 115, 52));
        painelVerde.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("E-mail");
        painelVerde.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 62, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data Nascimento");
        painelVerde.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        bntRecuperarSenha.setBorder(null);
        bntRecuperarSenha.setForeground(new java.awt.Color(31, 115, 52));
        bntRecuperarSenha.setText("Recuperar Senha");
        bntRecuperarSenha.setBorderColor(new java.awt.Color(31, 115, 52));
        bntRecuperarSenha.setBorderPainted(false);
        bntRecuperarSenha.setColorClick(new java.awt.Color(0, 146, 120));
        bntRecuperarSenha.setColorOver(new java.awt.Color(255, 255, 255));
        bntRecuperarSenha.setFocusPainted(false);
        bntRecuperarSenha.setFocusable(false);
        bntRecuperarSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bntRecuperarSenha.setRadius(10);
        bntRecuperarSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bntRecuperarSenhaMouseClicked(evt);
            }
        });
        painelVerde.add(bntRecuperarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 239, 194, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Recuperar Senha Cadastrada");
        painelVerde.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 373, -1));

        campoEmail.setBackground(new java.awt.Color(31, 115, 52));
        campoEmail.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        campoEmail.setForeground(new java.awt.Color(255, 255, 255));
        campoEmail.setBorder(null);
        campoEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        painelVerde.add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 84, 210, 28));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("___________________________________________");
        painelVerde.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 230, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("____________________________________________");
        painelVerde.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 230, -1));

        campoDataNascimento.setBackground(new java.awt.Color(31, 115, 52));
        campoDataNascimento.setBorder(null);
        campoDataNascimento.setForeground(new java.awt.Color(255, 255, 255));
        try {
            campoDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoDataNascimento.setCaretColor(new java.awt.Color(255, 255, 255));
        campoDataNascimento.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        painelVerde.add(campoDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 160, 200, 30));

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
            .addComponent(painelBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelVerde, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(540, 306));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // ao ser clicado vai chamar o método para recuperar a conta
    private void bntRecuperarSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntRecuperarSenhaMouseClicked
        recuperarSenha();
    }//GEN-LAST:event_bntRecuperarSenhaMouseClicked

    // ao ser clicado vai voltar o uusário para tela de login e asenha não vai ser trocada
    private void bntVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntVoltarMouseClicked
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bntVoltarMouseClicked

    // método para atualizar a senha e envia-la no email
    public void recuperarSenha() {
        try {
            String email = campoEmail.getText().trim();
            String nascimento = campoDataNascimento.getText().trim();

            Admin admin = new Admin(email, nascimento, SENHA_PADRAO);

            if (!admin.validarCamposPreenchidosString(email)) {
                mensagens.tipoMensagemCriarContas(1);
                return;
            }

            if (adminDao.atualizarSenha(admin)) {
                // Cria um novo objeto Email
                Email emailDestinatario = new Email();

                // Chama o método para passar o email
                emailDestinatario.passarEmail(campoEmail.getText().trim());

                // fazendo a limpa 
                limparCampos();

                progressoEmail.setVisible(true);

                // Inicia a thread que envia o email
                Thread emailThread = new Thread(() -> {
                    emailDestinatario.enviarEmail();

                    // Fecha a janela de progresso após o envio do email
                    progressoEmail.dispose();
                });

                // Inicie outra thread para atualizar a barra de progresso na janela de progresso
                Thread progressoThread = new Thread(progressoEmail::gerenciamentoCarregamentoEmail);

                emailThread.start();
                progressoThread.start();

            } else {
                mensagens.tipoMensagemEsqueceuSenha(1);
            }

        } catch (MessagingException erro) {
            mensagens.tipoMensagemEsqueceuSenha(2);
        }
    }

    // método para limpar os campos
    public void limparCampos() {
        campoDataNascimento.setText("");
        campoEmail.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.BotaoPersonalizado bntRecuperarSenha;
    private view.BotaoPersonalizado bntVoltar;
    private javax.swing.JFormattedTextField campoDataNascimento;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel painelBranco;
    private javax.swing.JPanel painelVerde;
    // End of variables declaration//GEN-END:variables
}
