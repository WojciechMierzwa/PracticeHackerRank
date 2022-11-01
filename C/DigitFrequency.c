#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
	
	int counter[10]={0,0,0,0,0,0,0,0,0,0};
	char num[1000];
	
	scanf("%[^\n]", num);
	int length;
	length = strlen(num);
	int i;
	for(i=0; i<length; i++)
	{
		if(num[i]=='0')
		counter[0]++;
		if(num[i]=='1')
		counter[1]++;
		if(num[i]=='2')
		counter[2]++;
		if(num[i]=='3')
		counter[3]++;
		if(num[i]=='4')
		counter[4]++;
		if(num[i]=='5')
		counter[5]++;
		if(num[i]=='6')
		counter[6]++;
		if(num[i]=='7')
		counter[7]++;
		if(num[i]=='8')
		counter[8]++;
		if(num[i]=='9')
		counter[9]++;
	}
	for(i=0; i<10;i++)
	printf("%d ", counter[i]);
	
    return 0;
}

