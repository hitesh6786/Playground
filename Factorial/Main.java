#include<stdio.h>  
  
long factorial(int n)  
{  
  if (n == 0)  
    return 1;  
  else  
    return(n * factorial(n-1));  
}  
   
int main()  
{  
  int number;  
  long fact;  
  scanf("%d", &number);   
   
  fact = factorial(number);  
  printf("The factorial of %d is %ld\n", number, fact);  
  return 0;  
}  