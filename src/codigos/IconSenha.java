package codigos;

import javax.swing.JOptionPane;
/**
 * @author Kauã Rodrigo
 * @version 0.1
 * @since  30/07/2023
 * @erro #1 é sobre algo na imagem ou o caminho dela
 */
public class IconSenha {
    /**
     * Alterna a visibilidade da senha em um campo de senha, permitindo ao usuário
     * exibir ou ocultar a senha digitada.
     * 
     * @param campoSenha      O campo de senha onde a visibilidade será alternada.
     * @param iconSenhaOculta O ícone associado ao campo de senha que muda para indicar a visibilidade da senha.
     * 
     */
    public void mostrarSenha(javax.swing.JPasswordField campoSenha, javax.swing.JLabel iconSenhaOculta) {
        try {
            if (campoSenha.getEchoChar() == '*') {
                // Se a senha está oculta, torna-a visível
                campoSenha.setEchoChar((char) 0);
                iconSenhaOculta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconVisivel.png")));
            } else {
                // Se a senha está visível, torna-a oculta novamente
                campoSenha.setEchoChar('*');
                iconSenhaOculta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconOcultar.png")));
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "<html> <strong> Ocorreu um erro inesperado! </strong> por favor, entre em contato com o suporte técnico, <br> informado o código de erro <strong>#1</strong></html>"
                    + "", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

}
