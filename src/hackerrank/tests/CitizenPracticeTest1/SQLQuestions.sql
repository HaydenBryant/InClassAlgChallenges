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