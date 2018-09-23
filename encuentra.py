def encuentra(n,l):
	return False if len(l) == 0 else True if l[0] == n else encuentra(n,l[1:])
	
print (encuentra(5,[1,2,3,4,5,6,7,8,9])