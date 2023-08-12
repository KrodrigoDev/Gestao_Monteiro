package view;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

/**
 *
 * @author Kauã Rodrigo
 */
public class RolarPersonalizado extends JScrollBar {
    
    
    public RolarPersonalizado(){
        setUI(new RolarTabela());
        setPreferredSize(new Dimension(8,8));
        setForeground(new Color(48,144,216));
        setBackground(new Color(30,30,30));
    }
}
