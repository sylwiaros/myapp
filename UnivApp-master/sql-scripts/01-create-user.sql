CREATE USER 'testuser'@'localhost' IDENTIFIED BY 'testuser';

GRANT ALL PRIVILEGES ON * . * TO 'testuser'@'localhost';

ALTER USER 'testuser'@'localhost' IDENTIFIED WITH mysql_native_password BY 'testuser';