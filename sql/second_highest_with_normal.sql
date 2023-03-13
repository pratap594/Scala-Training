SELECT id, concat(first_name, ' ',last_name) as name, salary 
FROM employees 
WHERE salary = (
  SELECT MAX(salary) 
  FROM employees 
  WHERE salary < (
    SELECT MAX(salary) 
    FROM employees
  )
);