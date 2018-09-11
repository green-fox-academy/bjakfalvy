create database blog;

use blog;

create table users (
		id int primary key auto_increment,
        name varchar(30),
        age int
);

insert into users (name, age) values ('sanyi',30);
insert into users (name, age) values ('mano',10);
insert into users (name, age) values ('baba',11);

select * from users;

drop database posts;

use blog;

create table posts (
		id int primary key auto_increment,
        title varchar(100),
        content text,
        author_id int
);

insert into posts (title, content, author_id)
values ('New blogpost', 'Nice new blogpost', 1);

insert into posts (title, content, author_id)
values ('aboeelmk', 'user 2', 2);

insert into posts (title, content, author_id)
values ('migiri', 'ez is user2', 2);

select name, count(posts.id)  from users
left join posts on posts.author_id =users.id
group by users.name
order by users.name;
