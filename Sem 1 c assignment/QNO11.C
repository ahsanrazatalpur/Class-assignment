#include<stdio.h>
#include<conio.h>
int main () {
clrscr ();
int num,digit1,digit2,digit3,digit4,digit5,sum;

	printf("Enter five digit number : ");
	scanf("%d",&num);
	digit1=num/10000;
	digit2=(num/1000)%10;
	digit3=(num/100)%10;
	digit4=(num/10)%10;
	digit5=num%10;
	sum=digit1+digit2+digit3+digit4+digit5;
	printf("\nSeparated from one another b three spaces : %d %d %d %d %d\n",digit1,digit2,digit3,digit4,digit5);
	printf("Sum of five digits : %d\n",sum);
getch();
return 0;

}