#첫번째 장
-- SHOW DATABASES;

-- USE employees;

-- SHOW tables;

-- DESCRIBE employees;

-- SHOW COLUMNS FROM employees;



-- #두 번째 장
-- SELECT * FROM titles;
-- SELECT first_name From employees;
-- SELECT first_name,last_name,gender FROM employees;

-- # 세번째 장
-- SELECT first_name AS 이름, last_name AS 성별, hire_date AS '회사 입사일' FROM employees;

# 네번째 장
-- SELECT * FROM usertbl WHERE name = '김경호';
-- SELECT * FROM usertbl WHERE birthYear>=1970 and height >=182;

# 다섯번째 장
-- SELECT * FROM usertbl WHERE height between 180 and 183;
-- SELECT * FROM usertbl WHERE addr IN ('경남', '전남', '경북' );
-- SELECT * FROM usertbl WHERE name Like '김%';

# 여섯번째 장
-- SELECT name, height FROM usertbl WHERE height > (SELECT height from usertbl where name='김경호');

# 일곱번째 장
-- SELECT * FROM usertbl ORDER BY mDate ASC;
-- SELECT * FROM usertbl ORDER BY mDate DESC;
-- SELECT * FROM usertbl ORDER BY height DESC, name DESC ; 

# 여덟번째 장
-- SELECT DISTINCT addr FROM usertbl ORDER BY addr ASC;
