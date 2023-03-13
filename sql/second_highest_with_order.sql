SELECT id, CONCAT(first_name, ' ', last_name) as name, salary 
FROM employees 
ORDER BY salary DESC 
LIMIT 1 OFFSET 1;