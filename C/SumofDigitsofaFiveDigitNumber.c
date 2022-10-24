#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
//Print the sum of the digits of the five digit number.
int main() {
	
    int n, n1,n2,n3,n4, n5;
    scanf("%d", &n);
    n1=n/10000;
    n2=(n/1000)%10;
    n3=(n/100)%10;
    n4=(n/10)%10;
    n5=n%10;
    printf("%d\n", n1+n2+n3+n4+n5);
    return 0;
}
