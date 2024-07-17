use sqldb;
select * from buytbl;

START transaction;
DELETE FROM buytbl WHERE num=1;
DELETE FROM buytbl WHERE num=2;

SELECT* FROM buytbl;

rollback;

CREATE DATABASE jdbc_ex;
CREATE USER 'jdbc_ex'@'%' IDENTIFIED BY 'jdbc_ex';
GRANT ALL PRIVILEGES ON jdbc_ex.* TO 'jdbc_ex'@'%';
FLUSH PRIVILEGES;
