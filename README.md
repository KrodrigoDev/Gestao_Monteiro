# Gestão Monteiro

> Status do projeto :  desenvolvimento 🏗️

## Acesse a Versão Inicial do Projeto
Clique [aqui](https://www.figma.com/file/Mu1LGR9cZThZe7wpjWipOx/Arena-Monteiro?type=design&node-id=0-1&mode=design&t=W2p3JexDMv1tQ1pC-0) para visualizar a versão Alpha do projeto no Figma.

## Lista de tarefas
- [X] Conexão com mysql
- [ ] Documentação para lidar com os erros
- [ ] Finalizar janelas
- [ ] Diagrama UML com todas as classes
- [ ] Projeto lógico e físico 


## Projeto Físico 
```sql da tabela admin
create table admin(
id int primary key auto_increment,
nome varchar(30) not null,
sobrenome varchar(40) not null,
senha char(64) not null, -- O hash sempre vai gerar 64 caracteres
nascimento date not null,
email varchar(60) not null unique
);
```

## Projeto Lógico
<p align="center">
  <img width="600px" src="https://github.com/KrodrigoDev/Gestao_Monteiro/assets/126525471/ac21b455-f070-47d6-93a1-51c9303e1b4e">
</p>

