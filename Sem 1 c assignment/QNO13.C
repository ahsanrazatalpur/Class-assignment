#include<stdio.h>
#include<conio.h>
int main () {
int num,reversed_num=0,remainder;
	printf("Enter any numbers :");
	scanf("%d",&num) ;
while (num !=0)
{
	remainder = num %10;
	reversed_num=reversed_num*10+remainder ;
	num/=10;
}
	printf("\nReverse of entered number is =%d\n",reversed_num);
	getch();
return 0;
}