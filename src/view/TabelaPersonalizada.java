package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Kauã Rodrigo
 */
public class TabelaPersonalizada extends JTable {

    // construtor
    public TabelaPersonalizada() {
        getTableHeader().setDefaultRenderer(new CabecaTabela());
        getTableHeader().setPreferredSize(new Dimension(0, 35));
        setDefaultRenderer(Object.class, new CorpoTabela());
        setRowHeight(30);
    }

    // método que vai fazer a edição no scroll 
    public void rolamentoDaTabela(JScrollPane rolar) {
        rolar.setVerticalScrollBar(new RolarPersonalizado());
        JPanel painelRolamento = new JPanel();
        painelRolamento.setBackground(new Color(30, 30, 30));
        rolar.setCorner(JScrollPane.UPPER_RIGHT_CORNER, painelRolamento);
        rolar.getViewport().setBackground(new Color(30, 30, 30));
        rolar.setBorder(BorderFactory.createLineBorder(new Color(60, 60, 60), 2));
    }

    // classe com herança e sobrecarga para alterar a cabeça da tabela
    private class CabecaTabela extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            com.setBackground(Color.BLACK); // alterando a cor da coluna principal
            com.setForeground(Color.white); // alterando a cor da fonte
            com.setFont(com.getFont().deriveFont(Font.BOLD, 15));

            // Centralizar o alinhamento do texto nos cabeçalhos das colunas
            ((JLabel) com).setHorizontalAlignment(SwingConstants.CENTER);

            return com;
        }

    }

    // classe com herança e sobrecarga para alterar o corpo da tabela
    private class CorpoTabela extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            if (isCellSelected(row, column)) { // mudando as cores do corpo com base célula par ou impar
                if (row % 2 == 0) {
                    com.setBackground(new Color(33, 103, 153)); // cor base (linha par)
                } else {
                    com.setBackground(new Color(29, 86, 127)); // proxíma cor (linha impar)
                }
            } else {
                if (row % 2 == 0) {
                    com.setBackground(new Color(50, 50, 50));
                } else {
                    com.setBackground(new Color(30, 30, 30));
                }
            }

            com.setForeground(Color.white);
            setBorder(new EmptyBorder(0, 5, 0, 5));

            // Centralizar o alinhamento do texto nas células da tabela
            ((JLabel) com).setHorizontalAlignment(SwingConstants.CENTER);

            return com;
        }

    }

}
