availabe_toppings = ['mushrooms', 'olives', 'green peppers', 'pepperoni', 'pineapple', 'extra cheese']

requested_toppings = ['mushrooms', 'french fries', 'extra cheese']

#if requested_topping != 'anchovies':
    #print("Hold the anchovies!")

#for requested_topping in requested_toppings:
    #if requested_topping == 'green peppers':
        #print("Sorry, we are out of green peppers right now.")
    #else:
        #print(f"Adding {requested_topping}.")


for requested_topping in requested_toppings:
    if requested_topping in availabe_toppings:
        print(f"Adding {requested_topping}.")
    else:
        print(f"Sorry, we don't have {requested_topping}.")

print("\nFinished making your pizza!")
