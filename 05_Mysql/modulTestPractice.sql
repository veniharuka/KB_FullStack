use world;

INSERT INTO `city` (Name,countryCode, District, Population)
values('TETZ','KOR','TETZ',1);

select *
from city
where Name = 'TETZ';

update city set population =0 where Name='TETZ';
delete from city where name = 'TETZ';

select name, countryCode, population from city
order by Population desc;

select * from country ;

select Name, IFNULL(IndepYear,"독립") from country;
select LOWER(Code) FROM country;
select UPPER(Name) as '대문자나라' FROM country;
select * from city;
select CONCAT(ID," / ", Name, " / ", Population) as 정리 From city;

select * from country ;
select replace(continent, 'Asia','아시아당') from country;
select Name, CEILING(LifeExpectancy) from country;
select Name, ROUND(LifeExpectancy) from country;
select Name, FLOOR(LifeExpectancy) from country;
select Name, length(Name) from country;
select MAX(population) from city;
select MIN(population) from city;
select AVG(population) from city;

select co.Code, ci.Name, co.Name
from city ci INNER JOIN country co ON ci.CountryCode = co.code;

select co.code, co.Name, cl.Language 
from countrylanguage cl right join country co on cl.CountryCode = co.code;


#join 함수
select ci.CountryCode, co.Name, sum(ci.Population) from city ci INNER JOIN country co on 
ci.CountryCode = co.Code
group by ci.CountryCode;

select ci.CountryCode, co.Name, avg(ci.Population) from city ci INNER JOIN country co on 
ci.CountryCode = co.Code
group by ci.CountryCode;

select * from city
where population > (select population from city where name='Amsterdam');




