/*
Create two table ORDER and PRODUCT where Order table will be parent table and product will be child table 
try to establish primary & foreign key connection between tables
*/

-- Parent table
CREATE TABLE if not exists Orders (
    OrderID INT PRIMARY KEY,
    address varchar(20) not null
);

-- Child table
CREATE TABLE if not exists Product (
    ProductID INT PRIMARY KEY,
    ProductName VARCHAR(50),
    OrderID INT,
    FOREIGN KEY (OrderID) REFERENCES Orders(OrderID)
);
