create database art_gallery;
use art_gallery;
-- Create User table
create table users(
`id` varchar(100) not null primary key,
`name` varchar(100) not null,
`email` varchar(100) not null unique key,
`password` varchar(100) not null
);
select * from users;
delete from users;

