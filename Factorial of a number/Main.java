n=int(input())
fact=1
for i in range(n,0,-1):
  fact=fact*i
  i=i-1
print(fact)