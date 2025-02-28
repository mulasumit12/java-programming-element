# Level 1 Practice Programs

## 1. Find Harry's Age
```python
# Given
birth_year = 2000
current_year = 2024
# Output
print(f"Harry's age in 2024 is {current_year - birth_year}")
```

## 2. Calculate Sam's Average PCM Marks
```python
# Given
maths = 94
physics = 95
chemistry = 96
# Output
average = (maths + physics + chemistry) / 3
print(f"Sam’s average mark in PCM is {average}")
```

## 3. Convert Kilometers to Miles
```python
# Given
km = 10.8
# Output
miles = km / 1.6
print(f"The distance {km} km in miles is {miles}")
```

## 4. Calculate Profit and Profit Percentage
```python
# Given
cost_price = 129
selling_price = 191
# Output
profit = selling_price - cost_price
profit_percentage = (profit / cost_price) * 100
print(f"The Cost Price is INR {cost_price} and Selling Price is INR {selling_price}\nThe Profit is INR {profit} and the Profit Percentage is {profit_percentage}%")
```

## 5. Divide Pens Equally
```python
# Given
pens = 14
students = 3
# Output
pens_per_student = pens // students
remaining_pens = pens % students
print(f"The Pen Per Student is {pens_per_student} and the remaining pen not distributed is {remaining_pens}")
```

## 6. Calculate Discount on Course Fee
```python
# Given
fee = 125000
discount_percent = 10
# Output
discount_amount = (fee * discount_percent) / 100
discounted_fee = fee - discount_amount
print(f"The discount amount is INR {discount_amount} and final discounted fee is INR {discounted_fee}")
```

## 7. Compute Volume of Earth
```python
import math
# Given
radius = 6378
# Output
volume_km3 = (4/3) * math.pi * (radius ** 3)
volume_miles3 = volume_km3 / (1.6 ** 3)
print(f"The volume of earth in cubic kilometers is {volume_km3} and cubic miles is {volume_miles3}")
```

## 8. Convert User Input Kilometers to Miles
```python
# Input
km = float(input("Enter distance in km: "))
# Output
miles = km / 1.6
print(f"The total miles is {miles} miles for the given {km} km")
```

## 9. Calculate Discount Based on User Input
```python
# Input
fee = float(input("Enter fee amount: "))
discount_percent = float(input("Enter discount percentage: "))
# Output
discount_amount = (fee * discount_percent) / 100
discounted_fee = fee - discount_amount
print(f"The discount amount is INR {discount_amount} and final discounted fee is INR {discounted_fee}")
```

## 10. Convert Height from cm to Feet and Inches
```python
# Input
height_cm = float(input("Enter height in cm: "))
# Output
inches = height_cm / 2.54
feet = int(inches // 12)
inches = inches % 12
print(f"Your Height in cm is {height_cm} while in feet is {feet} and inches is {inches}")
```

## 11. Basic Calculator for Arithmetic Operations
```python
# Input
num1 = float(input("Enter first number: "))
num2 = float(input("Enter second number: "))
# Output
print(f"Addition: {num1 + num2}, Subtraction: {num1 - num2}, Multiplication: {num1 * num2}, Division: {num1 / num2}")
```

## 12. Find Area of a Triangle
```python
# Input
base = float(input("Enter base: "))
height = float(input("Enter height: "))
# Output
area_cm = (1/2) * base * height
area_inches = area_cm / 2.54**2
print(f"Area in cm²: {area_cm}, Area in inches²: {area_inches}")
```

## 13. Find Side of Square from Perimeter
```python
# Input
perimeter = float(input("Enter perimeter: "))
# Output
side = perimeter / 4
print(f"The length of the side is {side} whose perimeter is {perimeter}")
```

## 14. Convert Feet to Yards and Miles
```python
# Input
distance_feet = float(input("Enter distance in feet: "))
# Output
yards = distance_feet / 3
miles = yards / 1760
print(f"Distance in yards: {yards}, Distance in miles: {miles}")
```

## 15. Calculate Total Purchase Price
```python
# Input
unit_price = float(input("Enter unit price: "))
quantity = int(input("Enter quantity: "))
# Output
total_price = unit_price * quantity
print(f"The total purchase price is INR {total_price} if the quantity {quantity} and unit price is INR {unit_price}")
```

## 16. Find Maximum Handshakes Among N Students
```python
# Input
num_students = int(input("Enter number of students: "))
# Output
handshakes = (num_students * (num_students - 1)) // 2
print(f"The maximum number of handshakes is {handshakes}")