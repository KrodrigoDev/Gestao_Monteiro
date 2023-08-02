package codigos;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 * @author Kauã Rodrigo
 * @version 0.1
 * @since 30/07/2023
 * @erro #1 é sobre algo na imagem ou o caminho dela
 */
public class IconSenha {

    private static final ImageIcon ICON_VISIVEL = new ImageIcon(IconSenha.class.getResource("/imagens/iconVisivel.png"));
    private static final ImageIcon ICON_OCULTAR = new ImageIcon(IconSenha.class.getResource("/imagens/iconOcultar.png"));

    // Mostrar e ocultar senha ( na janela de login )
    public void mostrarSenha(JPasswordField campoSenha, JLabel iconSenhaOculta) {
        char echoChar = campoSenha.getEchoChar();
        char visivelChar = (char) 0;

        if (echoChar == '*') {
            // Se a senha está oculta, torna-a visível
            campoSenha.setEchoChar(visivelChar);
            iconSenhaOculta.setIcon(ICON_VISIVEL);
        } else {
            // Se a senha está visível, torna-a oculta novamente
            campoSenha.setEchoChar('*');
            iconSenhaOculta.setIcon(ICON_OCULTAR);
        }
    }

    // Validar senhas ( na janela de criar Admin )
    public static String validarSenhas(JPasswordField campoSenha1, JPasswordField campoSenha2) {
        try {
            String senha1 = new String(campoSenha1.getPassword());
            String senha2 = new String(campoSenha2.getPassword());

            if (senha1.equals(senha2)) {
                // Senhas coincidem, não há problemas
                return senha1;
            } else {
                // Retorna null se as senhas não forem iguais
                return null;
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "<html><strong>Ocorreu um erro durante o carregamento ! </strong> <br> Informe o código de erro #1</html>", "Erro", JOptionPane.ERROR_MESSAGE);
            return null; // Retorna null em caso de erro
        }
    }

}
