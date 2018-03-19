CREATE TABLE billet (
	id int not null auto_increment,
	nom varchar(25) not null,
	prenom varchar(25) not null,
	email varchar(50) not null,
	concert varchar(50) not null,
	place_assise varchar(3) not null,
	numero_place int auto_increment,
	prix float,
	primary Key(id)
);