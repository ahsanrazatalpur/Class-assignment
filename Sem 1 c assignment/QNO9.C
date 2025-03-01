#include<stdio.h>
#include<conio.h>
int main () {
clrscr();
int days ,weeks,years;

	printf("Enter number of days :");
	scanf("%d",&days );
	years = days /365;
	weeks =( days % 365)/7;
	days =days -((years*365)+(weeks*7));
	printf("\n\n\t\t Output:\n");
	printf("\tYears :%d\n",years);
	printf("\tweeks :%d\n",weeks);
	printf("\tdays  :%d\n",days);
getch();
return 0;
}