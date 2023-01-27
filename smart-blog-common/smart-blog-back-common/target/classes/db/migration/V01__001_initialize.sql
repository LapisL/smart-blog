-- V01__0x_xxx.sql
-- install uuid extension
CREATE EXTENSION IF NOT EXISTS "pgcrypto" WITH SCHEMA public;


-- create table
CREATE TABLE posts (
    post_id integer NOT NULL,
    author varchar(20) NOT NULL,
    title varchar,
    contents_date date,
    content text NOT NULL,
    post_status	varchar NOT NULL default 'draft',
    ${commonColumns}
);

CREATE TABLE users (
    user_id varchar(20) NOT NULL,
    user_name varchar(20) NOT NULL,
    email text NOT NULL,
    password varchar(128) NOT NULL,
    user_status boolean NOT NULL default false,
    ${commonColumns}
);


-- alter table add constraint pk
ALTER TABLE ONLY posts
    ADD CONSTRAINT post_pkey PRIMARY KEY (post_id);

ALTER TABLE ONLY users
    ADD CONSTRAINT user_pkey PRIMARY KEY (user_id);

