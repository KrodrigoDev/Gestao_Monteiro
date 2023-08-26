# Gestão Monteiro

> Status do projeto :  desenvolvimento 🏗️

## Lista de tarefas
- [X] Conexão com mysql
- [ ] Documentação para com as execeções e erros
- [ ] Criar todas as janelas 
- [ ] Diagrama UML com todas as classes
- [X] Projeto lógico e físico
- [X] Criar um modelo de alta fidelidade no figma

## Acesse a Versão Inicial do Projeto
Clique [aqui](https://www.figma.com/file/Mu1LGR9cZThZe7wpjWipOx/Arena-Monteiro?type=design&node-id=0-1&mode=design&t=W2p3JexDMv1tQ1pC-0) para visualizar a versão Alpha do projeto no Figma.

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
```sql da tabela atletas
create table atletas(
id int primary key auto_increment,
nome varchar(30) not null,
sobrenome varchar(40) not null,
categoria enum('SUB-13','SUB-15','SUB-17', 'SUB-20') not  null,
status enum('Ativo','Inativo') default 'Ativo',
contato char(14) unique,
admin_id int not null,
Foreign key(admin_id) references admin(id)
);
```

## Projeto Lógico
<p align="center">
  <img width="600px" src="https://github.com/KrodrigoDev/Gestao_Monteiro/assets/126525471/ac21b455-f070-47d6-93a1-51c9303e1b4e">
</p>

