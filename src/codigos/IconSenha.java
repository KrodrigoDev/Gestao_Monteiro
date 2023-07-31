package codigos;

import javax.swing.JOptionPane;

/**
 * @author Kauã Rodrigo
 * @version 0.1
 * @since 30/07/2023
 * @erro #1 é sobre algo na imagem ou o caminho dela
 */
public class IconSenha {

    // mostrar e ocultar senha
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

    // mostrar validação para o usuário
    public String validarSenhas(javax.swing.JPasswordField campoSenha1, javax.swing.JPasswordField campoSenha2, javax.swing.JLabel iconSenha1, javax.swing.JLabel iconSenha2) {
        try {
            String senha1 = new String(campoSenha1.getPassword());
            String senha2 = new String(campoSenha2.getPassword());

            if (senha1.equals(senha2)) {
                iconSenha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/senhasIguais.png")));
                iconSenha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/senhasIguais.png")));
                return senha1;
            } else {
                iconSenha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/senhasNaoIguais.png")));
                iconSenha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/senhasNaoIguais.png")));
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "<html> <strong> Ocorreu um erro inesperado! </strong> por favor, entre em contato com o suporte técnico, <br> informado o código de erro <strong>#1</strong></html>"
                    + "", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    
    
}
