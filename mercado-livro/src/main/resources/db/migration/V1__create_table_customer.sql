CREATE TABLE customer(
	id int primary key auto_increment,
    name varchar(255) not null,
    email varchar(255) not null unique
);