#include <stdio.h>

int max_of_four(a,b,c,d)
{
    if(b>a)
    a=b;
    if(c>a)
    a=c;
    if(d>a)
    a=d;
    return a;
}

int main() {
    int a, b, c, d;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    int ans = max_of_four(a, b, c, d);
    printf("%d", ans);
    
    return 0;
}
