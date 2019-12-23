create database insurance_db;

create table customer(
id bigint auto_increment not null,
first_name varchar(50),
last_name varchar(50),
email varchar(50)not null,
phone bigint,
gender varchar(30),
last_four_ssn varchar(35) unique,
dob varchar (45),
primary key (id)
);

create table policy(
id bigint auto_increment not null,
type varchar (50) not null,
policy_number varchar(50) not null unique,
start_date varchar(60),
expiration_date varchar(60),
price varchar (65),
customer_id bigint,
primary key(id),
foreign key(customer_id) references customer(id)
);

create table address(
id bigint auto_increment not null,
street1 varchar(100),
street2 varchar(100),
city varchar(80),
state varchar(25),
zipcode bigint,
type varchar(50),
customer_id bigint,
primary key(id),
foreign key(customer_id) references customer(id)
);

create table covered_driver(
id bigint auto_increment not null,
first_name varchar(60),
last_name varchar(60),
licence_No varchar(60) unique,
licence_state varchar(60),
is_active boolean not null default true,
policy_id bigint,
primary key(id),
foreign key(policy_id) references policy(id)
);
 create table covered_vehicle(
 id bigint auto_increment not null,
 make varchar(50) not null,
 model varchar(50) not null,
 year bigint not null,
 color varchar(45),
 vin varchar(70) not null unique,
 is_active boolean not null default true,
 policy_id bigint,
 primary key(id),
 foreign key (policy_id) references policy(id)
 );
 
