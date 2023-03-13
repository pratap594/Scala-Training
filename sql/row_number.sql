SELECT 
  id,
  first_name,
  last_name,
  salary,
  ROW_NUMBER() OVER (ORDER BY salary DESC) as row_number
FROM employees
