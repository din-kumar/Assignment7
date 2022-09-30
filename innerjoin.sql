create database company;
use company;
create table companydetails(
CompanyId int, 
CompanyName varchar(25),
CompanyCity varchar(25)
);

INSERT INTO companydetails values
(1, 'Dominos','Los Angeles'),
(2, 'Pizza Hut','San Francisco'),
(3, 'Papa jhons','San Diego'),
(4, 'Ah Pizz','Fremont'),
(5, 'Nino Pizza','Las Vegas'),
(6, 'Pizzeria','Boston'),
 (7, 'chuck e cheese','Chicago')
;


create table Itemsold(ItemId int, ItemName varchar(25),UnitsSold int, CompanyId int);
INSERT INTO Itemsold values
(1, 'Large Pizza', 5, 2),
(2, 'Garlic Knots', 6, 3),
(3, 'Large Pizza', 3, 3),
(4, 'Medium Pizza', 8, 4),
(5, 'Breadsticks', 7, 1),
(6, 'Medium Pizza', 11, 1),
(7, 'Small Pizza', 9, 6),
(8, 'Small Pizza', 6, 7)
;

select companydetails.CompanyName, itemsold.ItemName , itemsold.UnitsSold
from companydetails
inner join itemsold
on companydetails.CompanyId = itemsold.CompanyId;