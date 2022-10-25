#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
//Complete the following function.


void calculate_the_maximum(int n, int k) {
  int a=0, o=0, x=0; //and, or, xor
  int n1, k1;
  int i=0;
  
  while(1)
  {
  	n1=n%2;
  	k1=k%2;
  	n=n/2;
  	k=n/2;
  	if(n1 & k1)
  	a++;
  	if(n1 || k1)
  	o++;
  	if((n1 || k1) & ! (n1 & k1))
  	x++;
  	i++;
  	if(n==0 & k==0)
  	{
  		printf("%d\n",a);
  		printf("%d\n",o);
  		printf("%d\n",x);
  		break;
	  }
  }
}

int main() {
    int n, k;
  
    scanf("%d %d", &n, &k);
    calculate_the_maximum(n, k);
 
    return 0;
}
