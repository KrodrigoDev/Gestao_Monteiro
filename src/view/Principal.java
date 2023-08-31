package view;

import java.awt.Color;
import javax.swing.JPanel;
import modeldao.AtletaDao;
import modeldao.JogosDao;

/**
 * @author Kauã Rodrigo
 * @since 11/08/2023
 * @version 0.1
 */
public class Principal extends javax.swing.JFrame {

    // objeto da classe mensagem
    Mensagens mensagens = new Mensagens();

    // atributo para guardar o id do admin atual
    private String idAdmin;

    // construtor
    public Principal() {
        initComponents();

        quantidadesTotalAtletas();
        quantidadeTotalJogos();
    }

    // código padrão do java
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelMenuVerde = new javax.swing.JPanel();
        campoMenuPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoMenuAtletas = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoMenuJogos = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoMenuSair = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        painelBranco = new javax.swing.JPanel();
        painelAdminInfo = new javax.swing.JPanel();
        textNomeAdmin = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        textNumIdade = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        painelLogoClube = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        painelJogos = new javax.swing.JPanel();
        quantidadeJogos = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        painelAtletas = new javax.swing.JPanel();
        quantidadeAtletas = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        painelVerdeCurto = new javax.swing.JPanel();
        painelBntFechar = new javax.swing.JPanel();
        iconFechar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        painelMenuVerde.setBackground(new java.awt.Color(31, 115, 52));

        campoMenuPrincipal.setBackground(new java.awt.Color(31, 115, 52));
        campoMenuPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                campoMenuPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                campoMenuPrincipalMouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconMenuCasa.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Principal");

        javax.swing.GroupLayout campoMenuPrincipalLayout = new javax.swing.GroupLayout(campoMenuPrincipal);
        campoMenuPrincipal.setLayout(campoMenuPrincipalLayout);
        campoMenuPrincipalLayout.setHorizontalGroup(
            campoMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(campoMenuPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        campoMenuPrincipalLayout.setVerticalGroup(
            campoMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        campoMenuAtletas.setBackground(new java.awt.Color(31, 115, 52));
        campoMenuAtletas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoMenuAtletasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                campoMenuAtletasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                campoMenuAtletasMouseExited(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconMenuJogadores.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Atletas");

        javax.swing.GroupLayout campoMenuAtletasLayout = new javax.swing.GroupLayout(campoMenuAtletas);
        campoMenuAtletas.setLayout(campoMenuAtletasLayout);
        campoMenuAtletasLayout.setHorizontalGroup(
            campoMenuAtletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(campoMenuAtletasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        campoMenuAtletasLayout.setVerticalGroup(
            campoMenuAtletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        campoMenuJogos.setBackground(new java.awt.Color(31, 115, 52));
        campoMenuJogos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoMenuJogosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                campoMenuJogosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                campoMenuJogosMouseExited(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconMenuAgenda.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Jogos");

        javax.swing.GroupLayout campoMenuJogosLayout = new javax.swing.GroupLayout(campoMenuJogos);
        campoMenuJogos.setLayout(campoMenuJogosLayout);
        campoMenuJogosLayout.setHorizontalGroup(
            campoMenuJogosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(campoMenuJogosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        campoMenuJogosLayout.setVerticalGroup(
            campoMenuJogosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        campoMenuSair.setBackground(new java.awt.Color(31, 115, 52));
        campoMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoMenuSairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                campoMenuSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                campoMenuSairMouseExited(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconMenuSair.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Sair");

        javax.swing.GroupLayout campoMenuSairLayout = new javax.swing.GroupLayout(campoMenuSair);
        campoMenuSair.setLayout(campoMenuSairLayout);
        campoMenuSairLayout.setHorizontalGroup(
            campoMenuSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(campoMenuSairLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        campoMenuSairLayout.setVerticalGroup(
            campoMenuSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconLetraM.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ARENA MONTEIRO");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout painelMenuVerdeLayout = new javax.swing.GroupLayout(painelMenuVerde);
        painelMenuVerde.setLayout(painelMenuVerdeLayout);
        painelMenuVerdeLayout.setHorizontalGroup(
            painelMenuVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(campoMenuAtletas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(campoMenuJogos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(campoMenuSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMenuVerdeLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        painelMenuVerdeLayout.setVerticalGroup(
            painelMenuVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMenuVerdeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(campoMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(campoMenuAtletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(campoMenuJogos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(campoMenuSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelBranco.setBackground(new java.awt.Color(255, 255, 255));

        painelAdminInfo.setBackground(new java.awt.Color(0, 0, 0));

        textNomeAdmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textNomeAdmin.setForeground(new java.awt.Color(255, 255, 255));
        textNomeAdmin.setText("Adenilson Monteiro");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Administador");

        textNumIdade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textNumIdade.setForeground(new java.awt.Color(31, 115, 52));
        textNumIdade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textNumIdade.setText("56");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("anos");

        javax.swing.GroupLayout painelAdminInfoLayout = new javax.swing.GroupLayout(painelAdminInfo);
        painelAdminInfo.setLayout(painelAdminInfoLayout);
        painelAdminInfoLayout.setHorizontalGroup(
            painelAdminInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAdminInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAdminInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(textNomeAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 429, Short.MAX_VALUE)
                .addGroup(painelAdminInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(textNumIdade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        painelAdminInfoLayout.setVerticalGroup(
            painelAdminInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAdminInfoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(painelAdminInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNomeAdmin)
                    .addComponent(textNumIdade))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(painelAdminInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Usuário Atual");

        painelLogoClube.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Escudo (2).png"))); // NOI18N
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout painelLogoClubeLayout = new javax.swing.GroupLayout(painelLogoClube);
        painelLogoClube.setLayout(painelLogoClubeLayout);
        painelLogoClubeLayout.setHorizontalGroup(
            painelLogoClubeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
        );
        painelLogoClubeLayout.setVerticalGroup(
            painelLogoClubeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        painelJogos.setBackground(new java.awt.Color(255, 255, 255));
        painelJogos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        quantidadeJogos.setFont(new java.awt.Font("Segoe UI", 1, 45)); // NOI18N
        quantidadeJogos.setForeground(new java.awt.Color(255, 255, 255));
        quantidadeJogos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantidadeJogos.setText("50");
        painelJogos.add(quantidadeJogos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 220, 50));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Jogos");
        painelJogos.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imgPreta.png"))); // NOI18N
        painelJogos.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("História do Clube");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(143, 143, 143));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("<html>A Arena Monteiro ganha vida, como símbolo de determinação e persistência.<br>   Onde antes encontrávamos apenas promessas entre amigos em um campinho de terra, hoje ergue-se em um espaço para a paixão do futebol.<br>     Aqui é onde os sonhos se tornam reais, onde histórias são escritas e onde a emoção do jogo pulsa intensamente. Essa é a Arena Monteiro, onde o sonho ganha vida! </html> ");
        jLabel20.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconFundacao.png"))); // NOI18N

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Fundação");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("2023");

        painelAtletas.setBackground(new java.awt.Color(255, 255, 255));
        painelAtletas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        quantidadeAtletas.setFont(new java.awt.Font("Segoe UI", 1, 45)); // NOI18N
        quantidadeAtletas.setForeground(new java.awt.Color(255, 255, 255));
        quantidadeAtletas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantidadeAtletas.setText("50");
        painelAtletas.add(quantidadeAtletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 220, 50));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Atletas");
        painelAtletas.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, 40));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imgPreta.png"))); // NOI18N
        painelAtletas.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout painelBrancoLayout = new javax.swing.GroupLayout(painelBranco);
        painelBranco.setLayout(painelBrancoLayout);
        painelBrancoLayout.setHorizontalGroup(
            painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBrancoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(painelAtletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(painelLogoClube, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(painelJogos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(painelBrancoLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19)
                    .addComponent(jLabel14)
                    .addComponent(painelAdminInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0))
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelBrancoLayout.setVerticalGroup(
            painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBrancoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBrancoLayout.createSequentialGroup()
                        .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelJogos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(painelLogoClube, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(jLabel14)
                        .addGap(0, 0, 0)
                        .addComponent(painelAdminInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel19)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                    .addComponent(painelAtletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addGap(0, 0, 0)
                .addComponent(jLabel22)
                .addGap(0, 0, 0)
                .addComponent(jLabel23)
                .addContainerGap())
        );

        painelVerdeCurto.setBackground(new java.awt.Color(31, 115, 52));

        painelBntFechar.setBackground(new java.awt.Color(31, 115, 52));

        iconFechar.setBackground(new java.awt.Color(31, 115, 52));
        iconFechar.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        iconFechar.setForeground(new java.awt.Color(255, 255, 255));
        iconFechar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconFechar.setText("X");
        iconFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconFecharMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconFecharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconFecharMouseExited(evt);
            }
        });

        javax.swing.GroupLayout painelBntFecharLayout = new javax.swing.GroupLayout(painelBntFechar);
        painelBntFechar.setLayout(painelBntFecharLayout);
        painelBntFecharLayout.setHorizontalGroup(
            painelBntFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconFechar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );
        painelBntFecharLayout.setVerticalGroup(
            painelBntFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconFechar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout painelVerdeCurtoLayout = new javax.swing.GroupLayout(painelVerdeCurto);
        painelVerdeCurto.setLayout(painelVerdeCurtoLayout);
        painelVerdeCurtoLayout.setHorizontalGroup(
            painelVerdeCurtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelVerdeCurtoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(painelBntFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelVerdeCurtoLayout.setVerticalGroup(
            painelVerdeCurtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBntFechar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelMenuVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelVerdeCurto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelVerdeCurto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(painelBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(painelMenuVerde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(999, 670));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // ao passar o mouse por cima do campo a cor será alterada
    private void iconFecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconFecharMouseEntered
        mudarCor(painelBntFechar, new Color(196, 43, 28));
    }//GEN-LAST:event_iconFecharMouseEntered

    // quando o mouse sair de cima a cor vai voltar ao normal
    private void iconFecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconFecharMouseExited
        mudarCor(painelBntFechar, new Color(31, 115, 52));
    }//GEN-LAST:event_iconFecharMouseExited

    // ao ser clicado via fechar a janela e encerrar o programa
    private void iconFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconFecharMouseClicked
        System.exit(0);
    }//GEN-LAST:event_iconFecharMouseClicked

    private void campoMenuPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoMenuPrincipalMouseEntered
        mudarCor(campoMenuPrincipal, new Color(21, 80, 36));
    }//GEN-LAST:event_campoMenuPrincipalMouseEntered

    private void campoMenuPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoMenuPrincipalMouseExited
        mudarCor(campoMenuPrincipal, new Color(31, 115, 52));
    }//GEN-LAST:event_campoMenuPrincipalMouseExited

    private void campoMenuAtletasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoMenuAtletasMouseEntered
        mudarCor(campoMenuAtletas, new Color(21, 80, 36));
    }//GEN-LAST:event_campoMenuAtletasMouseEntered

    private void campoMenuAtletasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoMenuAtletasMouseExited
        mudarCor(campoMenuAtletas, new Color(31, 115, 52));
    }//GEN-LAST:event_campoMenuAtletasMouseExited

    private void campoMenuJogosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoMenuJogosMouseEntered
        mudarCor(campoMenuJogos, new Color(21, 80, 36));
    }//GEN-LAST:event_campoMenuJogosMouseEntered

    private void campoMenuJogosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoMenuJogosMouseExited
        mudarCor(campoMenuJogos, new Color(31, 115, 52));
    }//GEN-LAST:event_campoMenuJogosMouseExited

    private void campoMenuSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoMenuSairMouseEntered
        mudarCor(campoMenuSair, new Color(21, 80, 36));
    }//GEN-LAST:event_campoMenuSairMouseEntered

    private void campoMenuSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoMenuSairMouseExited
        mudarCor(campoMenuSair, new Color(31, 115, 52));
    }//GEN-LAST:event_campoMenuSairMouseExited

    // ao ser clicado vai redirecionar o usuário para a tela com uma lista de atletas
    private void campoMenuAtletasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoMenuAtletasMouseClicked
        ListaAtletas listaAtletas = new ListaAtletas(this);
        listaAtletas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_campoMenuAtletasMouseClicked

    // ao ser clicado vai para lista de jogos
    private void campoMenuJogosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoMenuJogosMouseClicked
        ListaJogos listaJogos = new ListaJogos(this);
        listaJogos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_campoMenuJogosMouseClicked

    // ao ser clicado vai voltar para tela de login
    private void campoMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoMenuSairMouseClicked
        if (mensagens.confirmarSaida()) {
            Login telaLogin = new Login(); // Substitua "TelaLogin" pelo nome da classe da tela de login
            telaLogin.setVisible(true);
            this.dispose(); // Fecha a tela atual
        }
    }//GEN-LAST:event_campoMenuSairMouseClicked

    // método para alternar as cores dos campos
    public void mudarCor(JPanel campo, Color cor) {
        campo.setBackground(cor);
    }

    // método com todas as quantidades de atletas cadastrados 
    public void quantidadesTotalAtletas() {
        AtletaDao atletaDao = new AtletaDao();
        int quantidadeTotal = atletaDao.contarTotalAtletas();
        quantidadeAtletas.setText(String.valueOf(quantidadeTotal));
    }

    // método com todas as qantidades de jogos cadastrados
    public void quantidadeTotalJogos() {
        JogosDao jogosDao = new JogosDao();
        int quantidadeTotal = jogosDao.contarTotalJogos();
        quantidadeJogos.setText(String.valueOf(quantidadeTotal));
    }

    //gets e sets (Gambiarra)
    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    // método Set para recuperar o nome junto com o sobrenome do admin
    public void setNomeAdmin(String nomeSobrenome) {
        textNomeAdmin.setText(nomeSobrenome);
    }

    // método para recuperar a idade do admin
    public void setIdadeAdmin(int idadeAdmin) {
        textNumIdade.setText(Integer.toString(idadeAdmin));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel campoMenuAtletas;
    private javax.swing.JPanel campoMenuJogos;
    private javax.swing.JPanel campoMenuPrincipal;
    private javax.swing.JPanel campoMenuSair;
    private javax.swing.JLabel iconFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel painelAdminInfo;
    private javax.swing.JPanel painelAtletas;
    private javax.swing.JPanel painelBntFechar;
    private javax.swing.JPanel painelBranco;
    private javax.swing.JPanel painelJogos;
    private javax.swing.JPanel painelLogoClube;
    private javax.swing.JPanel painelMenuVerde;
    private javax.swing.JPanel painelVerdeCurto;
    private javax.swing.JLabel quantidadeAtletas;
    private javax.swing.JLabel quantidadeJogos;
    private javax.swing.JLabel textNomeAdmin;
    private javax.swing.JLabel textNumIdade;
    // End of variables declaration//GEN-END:variables
}
