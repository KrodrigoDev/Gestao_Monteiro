package view;

import dao.AdminDao;
import entidades.Admin;
import entidades.Email;
import java.awt.HeadlessException;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;

/**
 * @since 13/08/2023
 * @author Kauã Rodrigo
 * @erro #7 pode ser algo com a entidade email
 * @OBS : Implementar um carregamanto 
 */
public class EsqueceuSenha extends javax.swing.JFrame {

    // Objetos da classes AdminDao
    AdminDao adminDao = new AdminDao();

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
        campoDataNascimento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

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
        jLabel5.setText("Lembrou a Senha ?");

        javax.swing.GroupLayout painelBrancoLayout = new javax.swing.GroupLayout(painelBranco);
        painelBranco.setLayout(painelBrancoLayout);
        painelBrancoLayout.setHorizontalGroup(
            painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBrancoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(bntVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelBrancoLayout.setVerticalGroup(
            painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBrancoLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
        painelVerde.add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 84, 190, 28));

        campoDataNascimento.setBackground(new java.awt.Color(31, 115, 52));
        campoDataNascimento.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        campoDataNascimento.setForeground(new java.awt.Color(255, 255, 255));
        campoDataNascimento.setBorder(null);
        campoDataNascimento.setCaretColor(new java.awt.Color(255, 255, 255));
        campoDataNascimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoDataNascimentoKeyTyped(evt);
            }
        });
        painelVerde.add(campoDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 160, 190, 28));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("___________________________________________");
        painelVerde.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 230, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("____________________________________________");
        painelVerde.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 230, -1));

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
            .addComponent(painelVerde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(540, 306));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // chamando o método que vai formatar o e-mail enquanto o usuário digita
    private void campoDataNascimentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDataNascimentoKeyTyped
        formatarCampoNascimento(campoDataNascimento);
    }//GEN-LAST:event_campoDataNascimentoKeyTyped

    // ao ser clicado vai chamar o método para recuperar a conta
    private void bntRecuperarSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntRecuperarSenhaMouseClicked
        recuperarSenha();
    }//GEN-LAST:event_bntRecuperarSenhaMouseClicked

    // ao ser clicado vai voltar o uusário para tela de login e asenha não vai ser trocada
    private void bntVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntVoltarMouseClicked
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bntVoltarMouseClicked

    // Método para formatar a data enquanto o usuário digita
    private void formatarCampoNascimento(javax.swing.JTextField campo) {
        String dadosAtuais = campo.getText();
        int tamanho = dadosAtuais.length();

        if (tamanho > 0) {
            // Verifica se o caractere digitado pelo usuário é um dígito numérico (0 a 9)
            if (Character.isDigit(dadosAtuais.charAt(tamanho - 1))) {
                // Se o tamanho atual for 2 ou 5 (posições onde precisamos adicionar "/")
                if (tamanho == 2 || tamanho == 5) {
                    campo.setText(dadosAtuais + '/');
                }
            } else {
                // Se o caractere digitado pelo usuário não for um dígito numérico (0 a 9)
                // Verifica se o tamanho atual é 3 ou 6 (posições onde a barra "/" precisa ser removida)
                if (tamanho == 3 || tamanho == 6) {
                    // Remove o último caractere (a barra "/") dos dados atuais digitados no campo de nascimento
                    campo.setText(dadosAtuais.substring(0, tamanho - 1));
                }
            }
        }
    }

    // método para atualizar a senha e envia-la no email
    public void recuperarSenha() {
        try {
            String email = campoEmail.getText().trim();
            String nascimento = campoDataNascimento.getText().trim();

            Admin admin = new Admin(email, nascimento, SENHA_PADRAO);

            if (admin.validarCamposPreenchidosString(email)) {
                if (adminDao.atualizarSenha(admin)) {
                    // Cria um novo objeto Email
                    Email emailNovaConta = new Email();

                    // Define os detalhes do email
                    String destinatario = campoEmail.getText().trim();

                    // Chama o método para criar o email
                    emailNovaConta.criarEmail(destinatario);

                    // fazendo a limpa 
                    limparCampos();

                    // Chama o método para enviar o email 
                    emailNovaConta.enviarEmail();

                    this.dispose();
                    login.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "O endereço de e-mail ou a data de nascimento inseridos estão incorretos", "Aviso - Recuperação", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (HeadlessException | MessagingException erro) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro ao tentar recuperar a senha:\n" + erro.getMessage(), "Erro - Recuperação #7", JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JTextField campoDataNascimento;
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
