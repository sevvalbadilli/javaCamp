Select CustomerName Adi,ContactName Sirketadi,City Sehir from Customers
Select * from Customers where City = 'London'
Select * from Products where CategoryId= 1 or CategoryId = 3
Select * from Products where CategoryId= 1 and Price>=10
Select * from Products order by Price asc  
Select * from Products order by Price desc 
Select * from Products where CategoryId= 1 order by Price desc 
Select count(*) from Products 
Select count(*) from Products where CategoryId= 1
Select count(*) Adet from Products where CategoryId= 1
Select CategoryId from Products group by CategoryId
Select CategoryId, count(*) from Products group by CategoryId
Select CategoryId, count(*) from Products group by CategoryId having count(*)<10
Select CategoryId, count(*) from Products where Price>20 group by CategoryId having count(*)<10
Select * from Products inner join Categories on Products.CategoryId = Categories.CategoryID 
Select Products.ProductID, Products.ProductName, Products.Price, Categories.CategoryID from Products inner join Categories on Products.CategoryId = Categories.CategoryID
Select Products.ProductID, Products.ProductName, Products.Price, Categories.CategoryID from Products inner join Categories on Products.CategoryId = Categories.CategoryID where Price>10
--DTO Data Transforöation object
Select * from Products p inner join OrderDetails od on p.ProductID = od.ProductId
Select * from Products p left join OrderDetails od on p.ProductID = od.ProductId
Select * from Customers c inner join Orders o on c.CustomerID = o.CustomerID
Select * from Customers c left join Orders o on c.CustomerID = o.CustomerID


