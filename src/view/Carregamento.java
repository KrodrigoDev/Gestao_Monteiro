package view;

import conexaomsql.Conexao;
import javax.swing.JOptionPane;
import java.sql.Connection;

/**
 *
 * @author Kauã Rodrigo
 * @version 0.1
 * @since 01/08/2023
 * @erro #5 algo está de errado ao tentar criar a tela de carregamento
 *
 */
public class Carregamento extends javax.swing.JFrame {

    // construtor
    public Carregamento() {
        initComponents();
    }

    // código padrão do java
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelVerde = new javax.swing.JPanel();
        barraCarregamento = new javax.swing.JProgressBar();
        nPorcentagem = new javax.swing.JLabel();
        iconCarregamento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setName("Login"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        painelVerde.setBackground(new java.awt.Color(31, 115, 52));
        painelVerde.setForeground(new java.awt.Color(31, 115, 52));

        barraCarregamento.setBackground(new java.awt.Color(31, 115, 52));
        barraCarregamento.setForeground(new java.awt.Color(255, 255, 255));
        barraCarregamento.setBorder(null);
        barraCarregamento.setBorderPainted(false);

        nPorcentagem.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        nPorcentagem.setForeground(new java.awt.Color(255, 255, 255));
        nPorcentagem.setText("99");

        iconCarregamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gifCarregamento.gif"))); // NOI18N

        javax.swing.GroupLayout painelVerdeLayout = new javax.swing.GroupLayout(painelVerde);
        painelVerde.setLayout(painelVerdeLayout);
        painelVerdeLayout.setHorizontalGroup(
            painelVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVerdeLayout.createSequentialGroup()
                .addGroup(painelVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelVerdeLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(nPorcentagem))
                    .addGroup(painelVerdeLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(barraCarregamento, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelVerdeLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(iconCarregamento)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        painelVerdeLayout.setVerticalGroup(
            painelVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelVerdeLayout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(iconCarregamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(barraCarregamento, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nPorcentagem)
                .addGap(98, 98, 98))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelVerde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelVerde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(473, 303));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Carregamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carregamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carregamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carregamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        // chamando o método gerenciamentoCarregamento
        gerenciamentoCarregamento();

    }

    // método que vai gerenciar o carregamento da tela e validar a conexão com o banco de dados
    public static void gerenciamentoCarregamento() {

        // Criando um objeto da janela carregamento 
        Carregamento carregamento = new Carregamento();
        carregamento.setVisible(true); // deixando vísivel 

        try {

            // for para alterar os números do nPorcentagem
            for (int contador = 0; contador <= 100; contador += 3) {
                Thread.sleep(70); // vai deixar o for mais lento
                carregamento.barraCarregamento.setValue(contador); // alterando o valor da barraProgresso
                carregamento.nPorcentagem.setText(Integer.toString(contador) + "%"); // colocando o valor da progresso no nPorcentagem
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(carregamento, "<html><strong>Ocorreu um erro durante o carregamento ! </strong> <br> Informe o código de erro #5</html>" + erro.getMessage(), "Erro  #5", JOptionPane.ERROR_MESSAGE);
        }

        // Fechando a janela após o loop ser concluído
        carregamento.dispose();

        // Verificar a conexão com o banco de dados
        Connection conexao = Conexao.getConexao();
        if (conexao != null) {
            // A conexão foi bem-sucedida e a próxima janela tela vai ser aberta
            Login login = new Login();
            login.setVisible(true);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JProgressBar barraCarregamento;
    protected javax.swing.JLabel iconCarregamento;
    protected javax.swing.JLabel nPorcentagem;
    protected javax.swing.JPanel painelVerde;
    // End of variables declaration//GEN-END:variables
}
