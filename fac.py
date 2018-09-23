def factorial(n):
	assert n >= 0 and type(n) == int
	return 1 if n ==0 else n*factorial(n-1)

print(factorial(4.3))
