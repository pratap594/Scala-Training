from pyspark.sql.functions import col, desc

# Load data into a DataFrame
employees = spark.read.format("csv").option("header", True).load("employees.csv")

# Cache the DataFrame to avoid re-reading the data from disk
employees.cache()

# Find the second-highest salary using a subquery
second_highest_salary = employees.filter(
    col("salary") == employees.select("salary").distinct().orderBy(desc("salary")).limit(2).last().salary
)

# Persist the DataFrame in memory to avoid recomputing the subquery
second_highest_salary.persist()

# Do some operations with the DataFrame
...

# Unpersist the DataFrame when you're done with it
second_highest_salary.unpersist()
