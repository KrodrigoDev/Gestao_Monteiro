package view;

import javax.swing.JOptionPane;

/**
 * @since 20/08/2023
 * @author Kauã Rodrigo de Lima Barbosa
 *
 * @erro #2 tem relação com o erro #1 ! pode ser algo na conexão do banco ou até
 * um dado errado no momento da inserção. Verificar o banco de dados, além
 * disso, pode ser algo no drive da conexão ou algum atributo da classe Conexao
 * ou até algo no momento da inserção
 *
 * @erro #3 pode ser algo com a entidade email
 *
 * @erro #4 algo na entidade Admin ou AdminDao, também vale a pena verificar a
 * classe Pessoa
 *
 * @erro #5 algo está de errado ao tentar criar a tela de carregamento
 *
 */
public class MensagensAdmin {

    // Mensagens para janela de login
    public void TipoMensagemLogin(int numeroSituacao) {

        switch (numeroSituacao) {

            case 1:
                JOptionPane.showMessageDialog(null, // em caso de senha ou email errados
                        "Verififique o e-mail ou senha informados e tente novamente.",
                        "Aviso - Janela Login", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, // em caso de erro no try catch
                        "<html><strong>Ocorreu um erro inesperado durante o login!</strong><br>"
                        + "Informe o código de erro #2</html>",
                        "Erro - Janela Login #2", JOptionPane.ERROR_MESSAGE);
                break;

        }
    }

    // Mensagens para janela Esqueceu Senha
    public void TipoMensagemEsqueceuSenha(int numeroSituacao) {

        switch (numeroSituacao) {

            case 1:
                JOptionPane.showMessageDialog(null,
                        "O endereço de e-mail ou a data de nascimento inseridos estão incorretos",
                        "Aviso - Janela Esqueceu Senha", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null,
                        "<html>Ocorreu um erro ao tentar recuperar a senha<br>"
                        + "Informe o código de erro #3</html>",
                        "Erro - Janela Esqueceu Senha #3", JOptionPane.ERROR_MESSAGE);
                break;

        }
    }

    // Mensagens para janela Criar Admin e Janela de Criar Atleta
    public void TipoMensagemCriarContas(int numeroSituacao) {

        switch (numeroSituacao) {

            case 1:
                JOptionPane.showMessageDialog(null,
                        "<html><strong>Por favor, verifique se todos os campos foram preenchidos corretamente!</strong></html>",
                        "Aviso - Preencha todos os campos", // mais generica por que vai ser reutilizada 
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null,
                        "<html><strong>Ocorreu um erro ao tentar realizar o cadastro</strong><br>"
                        + "Informe o código de erro #4</html>",
                        "Erro - Janela Esqueceu Senha #4", JOptionPane.ERROR_MESSAGE);
                break;
            case 3: // mensagem de sucesso
                JOptionPane.showMessageDialog(null, 
                        "<html><strong>Criado com sucesso!</strong>",
                        "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                break;

        }
    }

    // Mensagens para janela de Carregamento
    public void TipoMensagemCarregamento() {
        JOptionPane.showMessageDialog(null,
                "<html><strong>Ocorreu um erro durante o carregamento ! </strong> <br> Informe o código de erro #5</html>",
                 "Erro - Janela Carregamento #5", JOptionPane.ERROR_MESSAGE);
    }

    // Mensagens para a entidade AtletaDao
    public void TipoMensagemAtletaDao(int numeroSituacao) {

        switch (numeroSituacao) {

            case 1:
                JOptionPane.showMessageDialog(null,
                        "<html><strong>O contato já existe na nossa base de dados!</strong><br>"
                        + "Por favor, cadastre um número diferente para evitar duplicidade</html>",
                        "Aviso - Cadastrar Atleta", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, // em caso de erro no try catch
                        "<html><strong>Ocorreu um erro inesperado</strong><br>"
                        + "Informe o código de erro #2</html>",
                        "Erro - Atleta Dao #2", JOptionPane.ERROR_MESSAGE);
                break;

        }
    }
    
    // mensagens para o admin dao 
     public void TipoMensagemAdminDao(int numeroSituacao) {

        switch (numeroSituacao) {

            case 1:
                JOptionPane.showMessageDialog(null,
                        "<html><strong>O e-mail já existe na nossa base de dados!</strong><br>"
                        + "Por favor, cadastre um e-mail diferente para evitar duplicidade</html>",
                        "Aviso - Cadastrar Admin", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, // em caso de erro no try catch
                        "<html><strong>Ocorreu um erro inesperado</strong><br>"
                        + "Informe o código de erro #2</html>",
                        "Erro - Admin Dao #2", JOptionPane.ERROR_MESSAGE);
                break;

        }
    }
}
