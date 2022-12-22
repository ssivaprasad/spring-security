create table users(
    user_name varchar_ignorecase(50) not null primary key,
    password varchar_ignorecase(50) not null,
    active boolean not null,
    roles varchar_ignorecase(50) not null
);
