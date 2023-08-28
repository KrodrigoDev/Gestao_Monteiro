package view;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import model.Jogos;
import modeldao.JogosDao;

/**
 * @author Kauã Rodrigo
 * @since 19/08/2023
 * @version 0.1
 */
public class AtualizarDadosJogos extends javax.swing.JFrame {

    // atleta selecioando na tabela
    private Jogos jogoSelecionado;

    // Objeto de classes
    ListaJogos listaJogos;
    JogosDao jogosDao = new JogosDao();
    Mensagens mensagens = new Mensagens();

    // construtor
    public AtualizarDadosJogos(ListaJogos listaJogos, Jogos jogoSelecionado) {
        initComponents();

        this.jogoSelecionado = jogoSelecionado; // Armazenar o objeto Atleta
        this.listaJogos = listaJogos;

        // passando os campos com os dados que o atleta já possue 
        campoTime1.setText(jogoSelecionado.getTime1());
        campoTime2.setText(jogoSelecionado.getTime2());
        campoDataHora.setText(jogoSelecionado.getDataHoraJogo());
        spinnerStatus.setValue(jogoSelecionado.getStatus());
        textIdJogo.setText(Integer.toString(jogoSelecionado.getIdJogo())); // gambiarra

        // inicilizando a mudança de cores
        mudarCoresSpinner(spinnerStatus);
    }

    // código padrão do java 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelVerde = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        separadorText = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bntCadastrar = new view.BotaoPersonalizado();
        campoTime2 = new javax.swing.JTextField();
        textIdJogo = new javax.swing.JLabel();
        separadorText1 = new javax.swing.JSeparator();
        separadorText2 = new javax.swing.JSeparator();
        separadorText4 = new javax.swing.JSeparator();
        spinnerStatus = new javax.swing.JSpinner();
        campoTime1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        separadorText5 = new javax.swing.JSeparator();
        campoDataHora = new javax.swing.JFormattedTextField();
        painelBranco = new javax.swing.JPanel();
        painelBntFechar = new javax.swing.JPanel();
        textX = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        painelVerde.setBackground(new java.awt.Color(31, 115, 52));
        painelVerde.setForeground(new java.awt.Color(0, 0, 0));
        painelVerde.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconMenuJogadores.png"))); // NOI18N
        jLabel1.setText("Atualizar Registro");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        painelVerde.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 7, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Boletim do Atleta");
        painelVerde.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 36, -1, -1));

        separadorText.setBackground(new java.awt.Color(31, 115, 52));
        separadorText.setForeground(new java.awt.Color(255, 255, 255));
        separadorText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        separadorText.setEnabled(false);
        separadorText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        painelVerde.add(separadorText, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 58, 610, 12));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Time 2");
        painelVerde.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 142, 100, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Time 1");
        painelVerde.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 142, 60, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Status");
        painelVerde.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 255, 90, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Id do jogo : ");
        painelVerde.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 38, 70, -1));

        bntCadastrar.setForeground(new java.awt.Color(31, 115, 52));
        bntCadastrar.setText("ATUALIZAR DADOS");
        bntCadastrar.setBorderColor(new java.awt.Color(31, 115, 52));
        bntCadastrar.setBorderPainted(false);
        bntCadastrar.setColorClick(new java.awt.Color(0, 146, 120));
        bntCadastrar.setColorOver(new java.awt.Color(255, 255, 255));
        bntCadastrar.setFocusPainted(false);
        bntCadastrar.setFocusable(false);
        bntCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        bntCadastrar.setRadius(10);
        bntCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCadastrarActionPerformed(evt);
            }
        });
        painelVerde.add(bntCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 270, 36));

        campoTime2.setBackground(new java.awt.Color(31, 115, 52));
        campoTime2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        campoTime2.setForeground(new java.awt.Color(255, 255, 255));
        campoTime2.setBorder(null);
        campoTime2.setCaretColor(new java.awt.Color(255, 255, 255));
        painelVerde.add(campoTime2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 172, 210, 30));

        textIdJogo.setBackground(new java.awt.Color(255, 255, 255));
        textIdJogo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textIdJogo.setForeground(new java.awt.Color(240, 240, 240));
        textIdJogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textIdJogo.setText("10");
        painelVerde.add(textIdJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 38, 30, -1));

        separadorText1.setBackground(new java.awt.Color(31, 115, 52));
        separadorText1.setForeground(new java.awt.Color(255, 255, 255));
        separadorText1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        separadorText1.setEnabled(false);
        separadorText1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        painelVerde.add(separadorText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 202, 215, 12));

        separadorText2.setBackground(new java.awt.Color(31, 115, 52));
        separadorText2.setForeground(new java.awt.Color(255, 255, 255));
        separadorText2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        separadorText2.setEnabled(false);
        separadorText2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        painelVerde.add(separadorText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 202, 210, 12));

        separadorText4.setBackground(new java.awt.Color(31, 115, 52));
        separadorText4.setForeground(new java.awt.Color(255, 255, 255));
        separadorText4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        separadorText4.setEnabled(false);
        separadorText4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        painelVerde.add(separadorText4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 210, 12));

        spinnerStatus.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        spinnerStatus.setModel(new javax.swing.SpinnerListModel(new String[] {"AGENDADO", "FINALIZADO", "CANCELADO"}));
        spinnerStatus.setBorder(null);
        spinnerStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        spinnerStatus.setEditor(new javax.swing.JSpinner.ListEditor(spinnerStatus));
        spinnerStatus.setFocusable(false);
        spinnerStatus.setRequestFocusEnabled(false);
        painelVerde.add(spinnerStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 210, 30));

        campoTime1.setBackground(new java.awt.Color(31, 115, 52));
        campoTime1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        campoTime1.setForeground(new java.awt.Color(255, 255, 255));
        campoTime1.setBorder(null);
        campoTime1.setCaretColor(new java.awt.Color(255, 255, 255));
        painelVerde.add(campoTime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 210, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Data e Hora");
        painelVerde.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 110, -1));

        separadorText5.setBackground(new java.awt.Color(31, 115, 52));
        separadorText5.setForeground(new java.awt.Color(255, 255, 255));
        separadorText5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        separadorText5.setEnabled(false);
        separadorText5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        painelVerde.add(separadorText5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 215, 12));

        campoDataHora.setBackground(new java.awt.Color(31, 115, 52));
        campoDataHora.setBorder(null);
        campoDataHora.setForeground(new java.awt.Color(255, 255, 255));
        try {
            campoDataHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/#### ##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoDataHora.setCaretColor(new java.awt.Color(255, 255, 255));
        campoDataHora.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        painelVerde.add(campoDataHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 210, 30));

        painelBranco.setBackground(new java.awt.Color(255, 255, 255));

        painelBntFechar.setBackground(new java.awt.Color(255, 255, 255));
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

        textX.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textX.setForeground(new java.awt.Color(31, 115, 52));
        textX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textX.setText("X");

        javax.swing.GroupLayout painelBntFecharLayout = new javax.swing.GroupLayout(painelBntFechar);
        painelBntFechar.setLayout(painelBntFecharLayout);
        painelBntFecharLayout.setHorizontalGroup(
            painelBntFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBntFecharLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(textX, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelBntFecharLayout.setVerticalGroup(
            painelBntFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBntFecharLayout.createSequentialGroup()
                .addComponent(textX, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoOFicialArena.png"))); // NOI18N

        javax.swing.GroupLayout painelBrancoLayout = new javax.swing.GroupLayout(painelBranco);
        painelBranco.setLayout(painelBrancoLayout);
        painelBrancoLayout.setHorizontalGroup(
            painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBrancoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(painelBntFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelBrancoLayout.setVerticalGroup(
            painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBrancoLayout.createSequentialGroup()
                .addComponent(painelBntFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelVerde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(painelBranco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelVerde, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
            .addComponent(painelBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(906, 599));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // quando o mouse entrar vai fazer com que o campo mude de cor
    private void painelBntFecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBntFecharMouseEntered
        mudarCor(painelBntFechar, new Color(196, 43, 28));
        textX.setForeground(Color.WHITE);
    }//GEN-LAST:event_painelBntFecharMouseEntered

    // quando o mouse sair do campo ele vai retornar a cor branca
    private void painelBntFecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBntFecharMouseExited
        mudarCor(painelBntFechar, Color.WHITE);
        textX.setForeground(new Color(31, 115, 52));
    }//GEN-LAST:event_painelBntFecharMouseExited

    // método que vai fechar a tela atual e voltar para anterior
    private void painelBntFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBntFecharMouseClicked
        this.dispose();
        listaJogos.setVisible(true);
    }//GEN-LAST:event_painelBntFecharMouseClicked

    // bnt que vai chamar o método de cadastrar o atleta
    private void bntCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCadastrarActionPerformed
        atualizarDados();
    }//GEN-LAST:event_bntCadastrarActionPerformed

    // método para  alaterar as cores do spinner 
    public void mudarCoresSpinner(JSpinner spinner) {
        JComponent editorComponent = (JComponent) spinner.getEditor().getComponent(0);
        editorComponent.setForeground(Color.white);
        editorComponent.setBackground(new Color(31, 115, 52));

        JTextField textField = (JTextField) editorComponent;
        textField.setCaretColor(Color.white); // Define a cor do caret (cursor de texto) no JTextField
    }

    // método para alternar as cores dos campos
    public void mudarCor(JPanel campo, Color cor) {
        campo.setBackground(cor);
    }

    // método para cadastrar atleta
    public void atualizarDados() { // implementar a mensagem de numero
        try {

            String time1 = campoTime1.getText().trim();
            String time2 = campoTime2.getText().trim();
            String dataHora = campoDataHora.getText().trim();
            String status = spinnerStatus.getValue().toString();
            int idJogo = Integer.parseInt(textIdJogo.getText());

            Jogos jogos = new Jogos(idJogo, time1, time2, dataHora, status);

            if (!jogos.validarCamposPreenchidosString( time1, time2,status, dataHora)) {
                mensagens.tipoMensagemCriarContas(1);
                return;
            }

            if (jogosDao.atualizarDadosJogo(jogos)) {
                limparCampos();
                listaJogos.atualizarQuantidades();
                listaJogos.tabelaJogos();
                this.dispose();
                listaJogos.setVisible(true);
            }

        } catch (HeadlessException erro) {
            mensagens.tipoMensagemCriarContas(2); // mudar
        }
    }

    // método para limpar os campos
    public void limparCampos() {
        campoTime1.setText("");
        campoTime2.setText("");
        campoDataHora.setText("");
        campoTime1.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.BotaoPersonalizado bntCadastrar;
    private javax.swing.JFormattedTextField campoDataHora;
    private javax.swing.JTextField campoTime1;
    private javax.swing.JTextField campoTime2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel painelBntFechar;
    private javax.swing.JPanel painelBranco;
    private javax.swing.JPanel painelVerde;
    private javax.swing.JSeparator separadorText;
    private javax.swing.JSeparator separadorText1;
    private javax.swing.JSeparator separadorText2;
    private javax.swing.JSeparator separadorText4;
    private javax.swing.JSeparator separadorText5;
    private javax.swing.JSpinner spinnerStatus;
    private javax.swing.JLabel textIdJogo;
    private javax.swing.JLabel textX;
    // End of variables declaration//GEN-END:variables
}
