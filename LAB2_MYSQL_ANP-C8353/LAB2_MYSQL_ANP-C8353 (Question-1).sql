-- Question 1 

-- database
use anudip;

CREATE TABLE customers (
	customer_id INT PRIMARY KEY,
    first_name VARCHAR(20),
    last_name VARCHAR(20)
);
    
CREATE TABLE Orders (
	order_id INT PRIMARY KEY,
    customer_id INT ,
    order_date DATE,
    total_amount DOUBLE,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
    );

insert into customers value (121,"Prince","garg"),
							(131,"Jatin","Sharma"),
                            (111,"Kajal","Baghel");
insert into orders value 	(1,121,'2024-11-12',200),
							(2,131,'2023-4-20',54),
                            (3,111,'2023-8-19',242);

-- Write an SQL query to retrieve the first and last names of customers along with the order date and total amount of their orders. Use an INNER JOIN to connect the two tables.
SELECT first_name, last_name, order_date, total_amount FROM customers INNER JOIN orders ON customers.customer_id = orders.customer_id;
