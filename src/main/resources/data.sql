-- DROP TABLE user_roles IF EXISTS;
DROP TABLE restaurant IF EXISTS;
DROP TABLE users IF EXISTS;

CREATE TABLE users
(
    id       LONG AUTO_INCREMENT PRIMARY KEY,
    login    VARCHAR(255)                    NOT NULL,
    name     VARCHAR(255)                    NOT NULL,
    password VARCHAR(255)                    NOT NULL,
    role     VARCHAR(30) default 'ROLE_USER' NOT NULL
);


CREATE TABLE restaurant
(
    id   LONG AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
--     FOREIGN KEY (user_id) REFERENCES USERS (id) ON DELETE CASCADE
);


INSERT INTO users (id, name, login, password, role)
VALUES (100000, 'Admin', 'a', 'a', 'ROLE_ADMIN'),
       (100001, 'Roma', 'usa', 'usa', 'ROLE_USER');

INSERT INTO users (name, login, password)
VALUES ('Jora', 'Hrebet', 'slomayu' );


INSERT INTO restaurant (id, name)
VALUES (1, 'Shaurma'),
       (2, 'Pelmennaay');
