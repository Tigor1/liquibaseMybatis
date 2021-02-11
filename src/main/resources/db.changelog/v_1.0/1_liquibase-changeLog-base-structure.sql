CREATE TABLE users
(
  id SERIAL PRIMARY KEY NOT NULL,
  email varchar(100),
  first_name TEXT NOT NULL,
  last_name TEXT NOT NULL ,
  password TEXT NOT NULL,
  username VARCHAR UNIQUE NOT NULL
);
