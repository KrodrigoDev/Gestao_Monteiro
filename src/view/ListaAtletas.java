package view;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 * @author Kauã Rodrigo
 * @since 12/08/2023
 * @version 0.1
 */
public class ListaAtletas extends javax.swing.JFrame {

    // Objeto da classe principal
    private Principal principal;

    // construtor
    public ListaAtletas(Principal principal) {
        initComponents();

        this.principal = principal;

        tabelaAtletas.rolamentoDaTabela(jScrollPane1);

        DefaultTableModel mode = (DefaultTableModel) tabelaAtletas.getModel(); // lembrar de pagar

        for (int i = 1; i <= 300; i++) {
            mode.addRow(new Object[]{"Kauã Rodrigo", "SUB-20", "ATIVO", "82991305810", "EM BREVE"});  // lembrar de pagar
        }

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
        campoMenuAjustes = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        painelBranco = new javax.swing.JPanel();
        painelAtletasInativos = new javax.swing.JPanel();
        quantidadeAtletasInativos = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        painelAtletas = new javax.swing.JPanel();
        quantidadeTotalAtletas = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        iconPesquisar = new javax.swing.JLabel();
        painelAtletasAtivos = new javax.swing.JPanel();
        quantidadeAtletasAtivos = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAtletas = new view.TabelaPersonalizada();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        bntCriarAtleta = new view.BotaoPersonalizado();
        painelVerdeCurto = new javax.swing.JPanel();
        painelBntFechar = new javax.swing.JPanel();
        iconFechar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        painelMenuVerde.setBackground(new java.awt.Color(31, 115, 52));

        campoMenuPrincipal.setBackground(new java.awt.Color(31, 115, 52));
        campoMenuPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoMenuPrincipalMouseClicked(evt);
            }
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

        campoMenuAjustes.setBackground(new java.awt.Color(31, 115, 52));
        campoMenuAjustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                campoMenuAjustesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                campoMenuAjustesMouseExited(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconMenuEngrenagem.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Ajustes");

        javax.swing.GroupLayout campoMenuAjustesLayout = new javax.swing.GroupLayout(campoMenuAjustes);
        campoMenuAjustes.setLayout(campoMenuAjustesLayout);
        campoMenuAjustesLayout.setHorizontalGroup(
            campoMenuAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(campoMenuAjustesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        campoMenuAjustesLayout.setVerticalGroup(
            campoMenuAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
            .addComponent(campoMenuAjustes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(campoMenuAjustes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelBranco.setBackground(new java.awt.Color(255, 255, 255));

        painelAtletasInativos.setBackground(new java.awt.Color(255, 255, 255));
        painelAtletasInativos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        quantidadeAtletasInativos.setFont(new java.awt.Font("Segoe UI", 1, 45)); // NOI18N
        quantidadeAtletasInativos.setForeground(new java.awt.Color(255, 255, 255));
        quantidadeAtletasInativos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantidadeAtletasInativos.setText("50");
        painelAtletasInativos.add(quantidadeAtletasInativos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 220, 50));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Inativos");
        painelAtletasInativos.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imgPreta.png"))); // NOI18N
        painelAtletasInativos.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        painelAtletas.setBackground(new java.awt.Color(255, 255, 255));
        painelAtletas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        quantidadeTotalAtletas.setFont(new java.awt.Font("Segoe UI", 1, 45)); // NOI18N
        quantidadeTotalAtletas.setForeground(new java.awt.Color(255, 255, 255));
        quantidadeTotalAtletas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantidadeTotalAtletas.setText("50");
        painelAtletas.add(quantidadeTotalAtletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 220, 50));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Total");
        painelAtletas.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, 40));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imgPreta.png"))); // NOI18N
        painelAtletas.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("LISTA DE ATLETAS");

        iconPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        iconPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconPesquisar (2).png"))); // NOI18N

        painelAtletasAtivos.setBackground(new java.awt.Color(255, 255, 255));
        painelAtletasAtivos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        quantidadeAtletasAtivos.setFont(new java.awt.Font("Segoe UI", 1, 45)); // NOI18N
        quantidadeAtletasAtivos.setForeground(new java.awt.Color(255, 255, 255));
        quantidadeAtletasAtivos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantidadeAtletasAtivos.setText("50");
        painelAtletasAtivos.add(quantidadeAtletasAtivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 220, 50));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Ativos");
        painelAtletasAtivos.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, 40));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imgPreta.png"))); // NOI18N
        painelAtletasAtivos.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tabelaAtletas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "CATEGORIA", "STATUS", "CONTATO", "AÇÕES"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaAtletas);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        bntCriarAtleta.setBackground(new java.awt.Color(0, 146, 120));
        bntCriarAtleta.setForeground(new java.awt.Color(255, 255, 255));
        bntCriarAtleta.setText("ADD ATLETA");
        bntCriarAtleta.setBorderColor(new java.awt.Color(255, 255, 255));
        bntCriarAtleta.setBorderPainted(false);
        bntCriarAtleta.setColor(new java.awt.Color(0, 146, 120));
        bntCriarAtleta.setColorClick(new java.awt.Color(21, 80, 36));
        bntCriarAtleta.setColorOver(new java.awt.Color(0, 146, 120));
        bntCriarAtleta.setFocusPainted(false);
        bntCriarAtleta.setFocusable(false);
        bntCriarAtleta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bntCriarAtleta.setRadius(50);

        javax.swing.GroupLayout painelBrancoLayout = new javax.swing.GroupLayout(painelBranco);
        painelBranco.setLayout(painelBrancoLayout);
        painelBrancoLayout.setHorizontalGroup(
            painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBrancoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBrancoLayout.createSequentialGroup()
                        .addComponent(painelAtletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(painelAtletasAtivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(painelAtletasInativos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator2)
                    .addComponent(jLabel11)
                    .addGroup(painelBrancoLayout.createSequentialGroup()
                        .addComponent(iconPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(bntCriarAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        painelBrancoLayout.setVerticalGroup(
            painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBrancoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBrancoLayout.createSequentialGroup()
                        .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelAtletasInativos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(painelAtletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(iconPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntCriarAtleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(painelAtletasAtivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(233, Short.MAX_VALUE))
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
                .addGap(0, 744, Short.MAX_VALUE)
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
                    .addComponent(painelVerdeCurto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelVerdeCurto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(painelBranco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(244, 244, 244))
            .addComponent(painelMenuVerde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1000, 696));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // ao passar o mouse por cima do campo a cor será alterada
    private void iconFecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconFecharMouseEntered
        mudarCor(painelBntFechar, new Color(21, 80, 36));
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

    private void campoMenuAjustesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoMenuAjustesMouseEntered
        mudarCor(campoMenuAjustes, new Color(21, 80, 36));
    }//GEN-LAST:event_campoMenuAjustesMouseEntered

    private void campoMenuAjustesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoMenuAjustesMouseExited
        mudarCor(campoMenuAjustes, new Color(31, 115, 52));
    }//GEN-LAST:event_campoMenuAjustesMouseExited

    // ao ser clicado vai voltar para a tela inicial e vai fechar a tela atual
    private void campoMenuPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoMenuPrincipalMouseClicked

        // Adicionar um atraso de 100 milissegundos (0,1 segundos) antes de mostrar a nova tela
        try {
            Thread.sleep(100);
        } catch (InterruptedException erro) {
            JOptionPane.showMessageDialog(null,
                    "<html><strong>Ocorreu um erro inesperado durante o login!</strong><br>"
                    + "Detalhes: " + erro.getMessage() + "<br>",
                    "Erro #8", JOptionPane.ERROR_MESSAGE);
        }

        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_campoMenuPrincipalMouseClicked

    // código padrão do java com alterações
    public static void main(String args[]) {
        /* Set the Metal ou Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Metal (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaAtletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    // método para alternar as cores dos campos
    public void mudarCor(JPanel campo, Color cor) {
        campo.setBackground(cor);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.BotaoPersonalizado bntCriarAtleta;
    private javax.swing.JPanel campoMenuAjustes;
    private javax.swing.JPanel campoMenuAtletas;
    private javax.swing.JPanel campoMenuJogos;
    private javax.swing.JPanel campoMenuPrincipal;
    private javax.swing.JLabel iconFechar;
    private javax.swing.JLabel iconPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel painelAtletas;
    private javax.swing.JPanel painelAtletasAtivos;
    private javax.swing.JPanel painelAtletasInativos;
    private javax.swing.JPanel painelBntFechar;
    private javax.swing.JPanel painelBranco;
    private javax.swing.JPanel painelMenuVerde;
    private javax.swing.JPanel painelVerdeCurto;
    private javax.swing.JLabel quantidadeAtletasAtivos;
    private javax.swing.JLabel quantidadeAtletasInativos;
    private javax.swing.JLabel quantidadeTotalAtletas;
    private view.TabelaPersonalizada tabelaAtletas;
    // End of variables declaration//GEN-END:variables
}
