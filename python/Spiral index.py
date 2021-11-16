def spiral_index(x, y):
	number1 = 1
	number2 = 0
	counter = 1
	upperlimit = max(abs(x),abs(y))
	for i in range(1,upperlimit):
		counter = counter + 8*i
	number1 = upperlimit
	number2 = -1*upperlimit + 1
	while (number1 != number2):
		if (number1 == x and number2 == y):
			print("Spiral index of ({}, {}) is {}".format(x, y, counter))
		number2 += 1
		counter += 1
	while (number1 != -1 * number2):
		if (number1 == x and number2 == y):
			print("Spiral index of ({}, {}) is {}".format(x, y, counter))
		number1 -= 1
		counter += 1
	while (number2 != number1):
		if (number1 == x and number2 == y):
			print("Spiral index of ({}, {}) is {}".format(x, y, counter))
		number2 -= 1
		counter += 1
	while (number1 != -1 * number2):
		if (number1 == x and number2 == y):
			print("Spiral index of ({}, {}) is {}".format(x, y, counter))
		number1 += 1
		counter += 1
	if (number1 == x and number2 == y):
		print("Spiral index of ({}, {}) is {}.".format(x, y, counter))
	number1 += 1
	counter += 1
	if (number1 == x and number2 == y):
		print("Spiral index of ({}, {}) is {}".format(x, y, counter))



print(spiral_index(10000,10000))
