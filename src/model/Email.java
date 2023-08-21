package model;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Transport;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Kauã Rodrigo
 */
public class Email {


    private String emailDestinatario;
    private final String assunto = "Gestão Monteiro";
    private final String mensagem = "<html>Olá Administrador<br><br>"
            + "Sua senha foi redefinida para : <strong> ArenaMonteiro2024 </strong><br><br>"
            + "Você poderá altera-la quando efetuar o primeiro login</html>";

    private Properties mProperties;
    private Session mSession;
    private MimeMessage mCorreio;

    public Email() {
        mProperties = new Properties();
    }

    // Cria o objeto MimeMessage para enviar o email
    public void criarEmail(String email) throws MessagingException {
        emailDestinatario = email;

        // Configurações do servidor SMTP do Gmail
        mProperties.put("mail.smtp.host", "smtp.gmail.com");
        mProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        mProperties.setProperty("mail.smtp.starttls.enable", "true");
        mProperties.setProperty("mail.smtp.port", "587");
        mProperties.setProperty("mail.smtp.user", EMAIL_REMETENTE);
        mProperties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        mProperties.setProperty("mail.smtp.auth", "true");

        mSession = Session.getDefaultInstance(mProperties);

        try {
            // Criação do objeto MimeMessage com as informações do email
            mCorreio = new MimeMessage(mSession);
            mCorreio.setFrom(new InternetAddress(EMAIL_REMETENTE));
            mCorreio.setRecipient(Message.RecipientType.TO, new InternetAddress(emailDestinatario));
            mCorreio.setSubject(assunto);
            mCorreio.setText(mensagem, "ISO-8859-1", "html");
        } catch (AddressException ex) {
            Logger.getLogger(Email.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Envia o email
    public void enviarEmail() {
        try {
            // Conecta-se ao servidor SMTP e envia o email
            Transport mTransport = mSession.getTransport("smtp");
            mTransport.connect(EMAIL_REMETENTE, SENHA_EMAIL);
            mTransport.sendMessage(mCorreio, mCorreio.getRecipients(Message.RecipientType.TO));
            mTransport.close();

            String mensagem = "<html><strong>Verifique seu email para visualizar a senha atualizada</strong></html>";

            JOptionPane.showMessageDialog(null, mensagem, "Aviso de Senha Alterada", JOptionPane.INFORMATION_MESSAGE);

        } catch (NoSuchProviderException ex) {
            Logger.getLogger(Email.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Email.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
