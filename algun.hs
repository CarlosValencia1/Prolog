algun::[Bool]->Bool

algun [n] = n
algun (n:ns) = n || algun(ns)

main = print $ algun [True,False,True]

