//#7

CREATE TABLE Customer_Order (
  customer_name VARCHAR(255),
  order_id varchar(255),
  status varchar(255)
);

INSERT INTO Customer_Order (customer_name, order_id, status) VALUES ('John', 'J1', 'DELIVERED');

INSERT INTO Customer_Order (customer_name, order_id, status) VALUES ('John', 'J2', 'DELIVERED');

INSERT INTO Customer_Order (customer_name, order_id, status) VALUES ('David', 'D1', 'DELIVERED');

INSERT INTO Customer_Order (customer_name, order_id, status) VALUES ('David', 'D3', 'CREATED');

INSERT INTO Customer_Order (customer_name, order_id, status) VALUES ('Smith', 'S1', 'SUBMITTED');

INSERT INTO Customer_Order (customer_name, order_id, status) VALUES ('KRISH', 'K1', 'CREATED');


//SOLUTION
SELECT Customer_Order.customer_name,

	CASE
    	WHEN (created.customer_name IS NOT NULL OR submitted.customer_name IS NOT NULL) AND delivered.customer_name IS NOT NULL THEN 'IN PROGRESS'

    	WHEN submitted.customer_name IS NULL AND created.customer_name IS NULL THEN 'COMPLETED'

    	WHEN delivered.customer_name IS NULL AND created.customer_name IS NULL THEN 'AWAITING PROGRESS'

        ELSE 'AWAITING SUBMISSION'

    END AS Final_Status


FROM Customer_Order

LEFT JOIN

		(SELECT customer_name FROM Customer_Order

           WHERE status = 'DELIVERED') AS delivered ON Customer_Order.customer_name = delivered.customer_name

LEFT JOIN

        (SELECT customer_name FROM Customer_Order

         	WHERE status = 'SUBMITTED') AS submitted ON Customer_Order.customer_name = submitted.customer_name

LEFT JOIN

		(SELECT customer_name FROM Customer_Order

         WHERE status = 'CREATED') AS created ON Customer_Order.customer_name = created.customer_name

GROUP BY Customer_Order.customer_name
ORDER BY Customer_Order.customer_name


//#8

CREATE TABLE DEPARTMENT (
  ID int,
  NAME varchar(255),
  LOCATION varchar(255)
);

INSERT INTO DEPARTMENT (ID, NAME, LOCATION) VALUES (1, 'Recruitment', 'Rhode Island');

INSERT INTO DEPARTMENT (ID, NAME, LOCATION) VALUES (2, 'Sales', 'Rhode Island');

INSERT INTO DEPARTMENT (ID, NAME, LOCATION) VALUES (3, 'Engineering', 'Rhode Island');

INSERT INTO DEPARTMENT (ID, NAME, LOCATION) VALUES (4, 'Product', 'Rhode Island');

INSERT INTO DEPARTMENT (ID, NAME, LOCATION) VALUES (5, 'R&D', 'Rhode Island');

INSERT INTO DEPARTMENT (ID, NAME, LOCATION) VALUES (6, 'Operations', 'Rhode Island');

INSERT INTO DEPARTMENT (ID, NAME, LOCATION) VALUES (7, 'Finance', 'Rhode Island');

INSERT INTO DEPARTMENT (ID, NAME, LOCATION) VALUES (8, 'Legal', 'Rhode Island');

INSERT INTO DEPARTMENT (ID, NAME, LOCATION) VALUES (9, 'Marketing', 'Rhode Island');

INSERT INTO DEPARTMENT (ID, NAME, LOCATION) VALUES (10, 'HR', 'Rhode Island');


CREATE TABLE EMPLOYEE (
  ID int,
  NAME varchar(255),
  SALARY int,
  DEPT_ID int
);

INSERT INTO EMPLOYEE (ID, NAME, SALARY, DEPT_ID) VALUES ( 1,'John', 100, 1);

INSERT INTO EMPLOYEE (ID, NAME, SALARY, DEPT_ID) VALUES ( 2,'John', 100, 2);

INSERT INTO EMPLOYEE (ID, NAME, SALARY, DEPT_ID) VALUES ( 3,'John', 100, 3);

INSERT INTO EMPLOYEE (ID, NAME, SALARY, DEPT_ID) VALUES ( 4,'John', 100, 4);

INSERT INTO EMPLOYEE (ID, NAME, SALARY, DEPT_ID) VALUES ( 5,'John', 100, 5);

INSERT INTO EMPLOYEE (ID, NAME, SALARY, DEPT_ID) VALUES ( 6,'John', 100, 6);

INSERT INTO EMPLOYEE (ID, NAME, SALARY, DEPT_ID) VALUES ( 7,'John', 100, 7);

INSERT INTO EMPLOYEE (ID, NAME, SALARY, DEPT_ID) VALUES ( 8,'John', 100, 8);

INSERT INTO EMPLOYEE (ID, NAME, SALARY, DEPT_ID) VALUES ( 9,'John', 100, 1);

INSERT INTO EMPLOYEE (ID, NAME, SALARY, DEPT_ID) VALUES ( 10,'John', 100, 2);

INSERT INTO EMPLOYEE (ID, NAME, SALARY, DEPT_ID) VALUES ( 11,'John', 100, 1);


//SOLUTION
SELECT DEPARTMENT.NAME,
    COUNT(EMPLOYEE.ID) AS EmpCount
FROM EMPLOYEE

RIGHT JOIN DEPARTMENT
	ON EMPLOYEE.DEPT_ID=DEPARTMENT.ID

GROUP BY DEPARTMENT.NAME
ORDER BY EmpCount DESC
