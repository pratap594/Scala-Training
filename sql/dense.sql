SELECT 
  id,
  first_name,
  last_name,
  salary,
  DENSE_RANK() OVER (ORDER BY salary DESC) as rank
FROM employees
