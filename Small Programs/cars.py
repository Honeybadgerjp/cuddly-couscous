cars = ['bmw', 'audi', 'toyota', 'subaru']

#print("Here is the orginal list:")
#print(cars)

#print("\nHere is the sorted list:")
#print(sorted(cars))

#print("\nHere is the orginal list again:")
#print(cars)

#len(cars)

cars.sort()

for car in cars:
    if car == 'bmw':
        print(car.upper())
    else:
        print(car.title())
