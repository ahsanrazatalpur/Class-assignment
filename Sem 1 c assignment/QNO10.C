#include<stdio.h>
#include<conio.h>
int main () {
clrscr ();
int num1,num2,temp;

	printf("Enter value of N1 :");
	scanf("%d",&num1);
	printf("Enter value of N2 :");
	scanf(" %d",&num2);

	temp=num1;
	num1=num2;
	num2=temp;
	printf("\nValue of N1 is :%d\n",num1);
	printf("\nValue of N2 is :%d\n",num2);

getch();
return 0;
}
