from pyspark.sql import SparkSession

# Create a SparkSession
spark = SparkSession.builder.appName("EmployeeAnalysis").getOrCreate()

# Read the employees data into a DataFrame
employees_df = spark.read.option("header", True).csv("employees.csv")

# Convert the salary column to numeric data type
employees_df = employees_df.withColumn("salary", employees_df["salary"].cast("double"))

# Find the employee with the highest salary
highest_salary = employees_df.agg({"salary": "max"}).collect()[0][0]
highest_salary_employee = employees_df.filter(employees_df["salary"] == highest_salary).select("id", "first_name", "last_name", "salary").collect()[0]

# Print the employee's name and salary
print(highest_salary_employee["first_name"], highest_salary_employee["last_name"], highest_salary_employee["salary"])

# Stop the SparkSession
spark.stop()