SELECT id, CONCAT(first_name, ' ', last_name) as name, salary 
FROM (
  SELECT id, first_name, last_name, salary, RANK() OVER (ORDER BY salary DESC) AS rank
  FROM employees 
) ranked_employees
WHERE rank = 2;