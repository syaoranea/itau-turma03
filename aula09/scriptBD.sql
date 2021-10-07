-- cria um novo BD - Database
create database bd_itau;

-- marca o BD como default (padrão)
use bd_itau;

-- criar uma table no BD
create table carro (
	codigo integer not null auto_increment,
    marca varchar(50) not null,
    modelo varchar(100),
    anoFabricacao integer,
    constraint pk_carro primary key (codigo)
);

-- primary key serve para identificar unicamente uma linha na tabela
-- foreign key serve para relacionar as tabelas

create table cliente (
	codigo integer not null auto_increment,
    nome varchar(120) not null,
    telefone varchar(15) not null unique,
    cod_carro integer,
    constraint pk_cliente primary key (codigo),
    constraint fk_carro foreign key (cod_carro) references carro(codigo)
);

-- inserir dados na tabela
insert into carro values (
	null, "Chevrolet", "Cruze", 2020
 );
insert into carro values (
	null, "Volvo", "A200", 2021
 );
 insert into carro values (
	null, "Ferrari", "F400", 2018
 );
 
 insert into cliente values(
	null, "Carlos Augusto", "(11) 11111-1111", 1
 );
 insert into cliente values(
	null, "Marcos Silva", "(11) 11111-2222", 2
 );
insert into cliente values(
	null, "Fabiana", "(11) 11111-5555", 2
 );

-- buscar todas as informações da tabela

-- selecione todas as colunas da tabela carro
select * from carro;

-- busque apenas a marca, o mdelo e o ano
select marca, modelo, anoFabricacao from carro;

-- busque as informações sobre os carros fabricados após o ano de 2019
select * from carro where anoFabricacao > 2019;

-- SELECT <quais colunas>
-- FROM <qual(is) tabela(s)
-- WHERE <condição>

-- listar todos os clientes
select * from cliente;

-- listar os carros com seus proprietarios
select * 
from carro inner join cliente on carro.codigo = cliente.cod_carro;

-- alteração de dados 

-- alterar o telefone do cliente Carlos
update cliente 
set telefone = "(19) 9999-8888"
where codigo = 1;

-- apagar dados

-- apagar um carro do BD
-- primeiro precisa apagar o cliente para depois poder apagar o carro

delete from cliente where codigo = 4;

delete
from carro
where codigo = 3;