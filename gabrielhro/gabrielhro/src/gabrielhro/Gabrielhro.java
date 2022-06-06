//
//   create database gabrielhro;
//
//   use gabrielhro;
//   
//   create table medico (
//		idmedico int primary key auto_increment,
//       nome varchar(255) not null,
//       especialidade int not null,
//       crm int not null,
//       cpf varchar(255) not null
//   );
//
//   create table paciente (
//		idpaciente int primary key auto_increment,
//       nome varchar(255) not null,
//       cpf varchar(255) not null,
//       idade int not null
//   );
//
//    create table consulta (
//		idconsulta int primary key auto_increment,
//       idmedico int not null,
//       idpaciente int not null,
//       convenio varchar(255) not null,
//
//       foreign key (idmedico) references medico(idmedico) on delete cascade on update cascade,
//       foreign key (idpaciente) references paciente(idpaciente) on delete cascade on update cascade
//   );