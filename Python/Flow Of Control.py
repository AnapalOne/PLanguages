print("This program will compute the Body Mass Index (BMI) based on the height (m) and weight (kg)\nprovided by the user.")
print("-------------------------------")

#Input
h = int(input("Please Input Height (cm): "))
w = int(input("Please Input Weight (kg): "))
print ("-------------------------------")

#Operations
bmi = w / h * h

if bmi > 29:
    print("Results: Obese")
elif bmi > 24:
    print("Results: Overweight")
elif bmi > 17.5:
    print("Results: Normal")
else:
    print("Results: Underweight")
