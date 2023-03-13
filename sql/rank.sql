SELECT 
  id,
  first_name,
  last_name,
  salary,
  RANK() OVER (ORDER BY salary DESC) as rank
FROM employees
