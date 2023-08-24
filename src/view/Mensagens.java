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
 * @erro #6 o arquivo que guarda os bytes não foi encontrado ou algum erro
 * relacionado a ele
 */
public class Mensagens {

    // falta adicionar a classe de conexão
    // Mensagens para janela de login
    public void tipoMensagemLogin(int numeroSituacao) {

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
    public void tipoMensagemEsqueceuSenha(int numeroSituacao) {

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
    public void tipoMensagemCriarContas(int numeroSituacao) {

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
            case 4:
                JOptionPane.showMessageDialog(null,
                        "<html><strong>As senhas não são iguais!</strong></html>",
                        "Aviso - Janela Criar Conta", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }

    // Mensagens para janela de Carregamento
    public void tipoMensagemCarregamento() {
        JOptionPane.showMessageDialog(null,
                "<html><strong>Ocorreu um erro durante o carregamento ! </strong> <br> Informe o código de erro #5</html>",
                "Erro - Janela Carregamento #5", JOptionPane.ERROR_MESSAGE);
    }

    // Mensagens para a entidade AtletaDao
    public void tipoMensagemAtletaDao(int numeroSituacao) {

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
    public void tipoMensagemAdminDao(int numeroSituacao) {

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

    // Mensagens para BytesAdmin
    public void tipoMensagemBytesAdmin() {
        JOptionPane.showMessageDialog(null, // em caso de erro no try catch
                "<html><strong>Ocorreu um erro inesperado</strong><br>"
                + "Informe o código de erro #6</html>",
                "Erro - Bytes Admin #6", JOptionPane.ERROR_MESSAGE);
    }

    // Mensagens para classe Email
    public void tipoMensagemEmail() {
        JOptionPane.showMessageDialog(null,
                "<html><strong>Verifique seu email para visualizar a senha atualizada</strong></html>",
                "Aviso - Email Enviado", JOptionPane.INFORMATION_MESSAGE);
    }
    
    // Mensagens para classe abstrata Pessoa
    public void tipoMensagemPessoa(){
        // implemetar ou mudar o setnascimento da classe abstrata pessoa
    }

}
