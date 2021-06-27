DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS employees;

create table users (
  id SERIAL PRIMARY KEY,
  name VARCHAR(128),
  email VARCHAR(256),
  password VARCHAR(256)
);

INSERT INTO users (name, email, password) VALUES ('Paul Name', 'paul@yopmail.com', 'kfjdskj24342');
INSERT INTO users (name, email, password) VALUES ('Paul', 'paul123@yopmail.com', 'kfjdskj24342');

-- create table admins (
--   title varchar(128),
--   author varchar(256)
-- );

-- create table banners (
--   title varchar(128),
--   author varchar(256)
-- );

-- create table categories (
--   title varchar(128),
--   author varchar(256)
-- );

-- create table merchants (
--   title varchar(128),
--   author varchar(256)
-- );

-- create table products (
--   title varchar(128),
--   merchant_id varchar(256)
-- );

-- create table orders (
--   title varchar(128),
--   author varchar(256),
-- );