-- Question - 2 
use anudip;

CREATE TABLE Departments (
	department_id INT PRIMARY KEY,
    department_name VARCHAR(20)
    );

CREATE TABLE Employees (
	employee_id INT PRIMARY KEY,
    first_name VARCHAR(20),
    last_name VARCHAR(20),
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES Departments(department_id)
    );

INSERT INTO Departments VALUE 	(4,"Creative"),
								(1,"IT"),
								(2,"HR"),
                                (3,"Sales");

INSERT INTO Employees VALUE (121,"Prince ","garg",1),
							(151,"Vishal ","garg",1),
							(131,"Jatin ","Sharma",2),
                            (111,"Anmol ","Sharma",3);

-- Write an SQL query to retrieve a list of all departments and the names of employees who belong to each department. Use a LEFT JOIN to include departments that have no employees. 
SELECT Departments.department_id, department_name, CONCAT(first_name,' ',last_name) "Employee Name" FROM Departments LEFT OUTER JOIN Employees ON Departments.department_id = Employees.department_id;