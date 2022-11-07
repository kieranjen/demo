create table books
(
    id   bigint auto_increment primary key,
    name varchar(255) not null,
    author_name varchar(255) not null,
    constraint UK_name unique (name)
);

insert into books(name, author_name) VALUES ('Carrie', 'Steven King'), ('IT', 'Steven King');