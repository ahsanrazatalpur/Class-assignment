#include<stdio.h>
#include<conio.h>
int main () {
clrscr ();
int seconds,hours,minutes,remaining_seconds;
	printf("Enter seconds :");
	scanf("%d",&seconds);
	hours = seconds/3600;
	minutes=(seconds%3600)/60;
	remaining_seconds=seconds % 60;
	printf("\n\n\tOutput:\n");
	printf("\tHours \tMinutes\tSeconds\n");
	printf("\t%d \t%d\t%d\n",hours,minutes,remaining_seconds);
	getch();
return 0;
}
