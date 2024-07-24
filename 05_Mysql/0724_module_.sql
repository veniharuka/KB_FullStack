#1-1
SELECT * FROM city;
#1-2
SELECT Language,Percentage
FROM countrylanguage
WHERE CountryCode ='CHE';

#1-3
INSERT INTO `city` (Name, CountryCode, District, Population) VALUES
('Cairo','EGY',' Cairo Governorate',9500000);

#1-4
UPDATE city SET Name='GoodSite' where CountryCode='PNG';

#1-5
SELECT *
FROM country
ORDER BY Name;

#2-1
SELECT upper(Name)
FROM city;

#2-2
SELECT concat(ID,'-',CountryCode)
FROM city;

#2-3
SELECT length(District)
FROM city;

#2-4
SELECT avg(Population)
FROM city;

#2-5
SELECT Continent,max(GNP) 
FROM country
GROUP BY Continent
ORDER BY max(GNP);

select *
from country;

select *
from city;

#3-1
SELECT c.Name, co.Name
FROM city c JOIN country co
ON c.CountryCode = co.Code;
#3-2
SELECT  co.Name,cl.Language
FROM countrylanguage cl RIGHT OUTER JOIN country co
ON cl.CountryCode = co.Code;

#3-3
SELECT Name 
FROM city
WHERE Population = (SELECT MAX(Population) FROM city);















