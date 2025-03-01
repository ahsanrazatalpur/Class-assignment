#include<stdio.h>
#include<conio.h>
int main () {
clrscr ();
int num,sum=0,temp,digit;

	printf("Enter any number :");
	scanf("%d",&num);
	temp=num;
while(temp>0) {          // Calculation
	digit=temp%10;
	sum+=digit;
	temp/=10;
}
	printf("\nSum of digits of   = %d\n",sum);

getch();
return 0;
}