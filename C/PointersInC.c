#include <stdio.h>

void update(int *a,int *b) {
	*a=*a+*b;
    
   	*b=*b-*c;
}

int main() {
    int a, b;
    int *pa = &a, *pb = &b;
    int c;
	int *pc=&a;
    
    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("%d\n%d", a, b);

    return 0;
}
