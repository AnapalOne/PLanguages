# Intro
print("This program will accept 10 numbers and will display the sum and product.\n")

# Equations
i = 0
sum = 0
product = 1
while i < 10:
    num = int(input("Input a number: "))
    sum = sum + num
    product = product * num
    i += 1

print("\nThe sum of all numbers are:",sum,"\nThe product of all numbers are:",product)