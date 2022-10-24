#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

/*or each integer  in the interval  (given as input) :

If , then print the English representation of it in lowercase. That is "one" for , "two" for , and so on.
Else if  and it is an even number, then print "even".
Else if  and it is an odd number, then print "odd".*/

int main() 
{
    int a, b;
    scanf("%d\n%d", &a, &b);
      for(a; a<b+1; a++)
      {
          if(a>=1 & a<=9)
          {
              if(a==1)
          printf("one\n");
          if(a==2)
          printf("two\n");
          if(a==3)
          printf("three\n");
          if(a==4)
          printf("four\n");
          if(a==5)
          printf("five\n");
          if(a==6)
          printf("six\n");
          if(a==7)
          printf("seven\n");
          if(a==8)
          printf("eight\n");
          if(a==9)
          printf("nine\n");
          }
          else if(a%2==0)
          {
              printf("even\n");
          }
          else
          printf("odd\n");
      }

    return 0;
}

