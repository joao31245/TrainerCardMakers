create database pokedex;
use pokedex;

create table treinadores 
(
id int primary key auto_increment not null,
id_treiandor varchar(45) not null,
senha varchar(45) not null,
sexo varchar(1) not null,
primeiraEscolha varchar(45),
segundaEscolha varchar(45),
primeiraEscolha varchar(45),
terceiraEscolha varchar(45),
quartaEscolha varchar(45),
quintaEscolha varchar(45),
sextaEscolha varchar(45)
);

describe treinadores;