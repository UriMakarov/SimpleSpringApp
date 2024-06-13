create table employees
(
    id serial primary key,
    first_name varchar(100)   not null,
    last_name  varchar(100)   not null,
    salary     numeric(10, 2) not null,
    department varchar(100)   not null
);
create sequence employees_id_seq as integer;

create table payment_orders
(
    id serial primary key,
    employee_id   integer        not null
        references employees,
    amount        numeric(10, 2) not null,
    transfer_date date           not null
);

create sequence payment_orders_id_seq as integer;
