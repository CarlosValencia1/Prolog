mult [] = 0
mult (x:xs) = x * mult xs

main = print $ mult[1,3,7]