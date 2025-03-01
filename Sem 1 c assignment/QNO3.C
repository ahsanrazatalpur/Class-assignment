#include<stdio.h>
#include<conio.h>
int main () {
clrscr();
float basic_pay,house_rent,medical_allowance,total_pay,computer_allowance;
	printf(" Please enter basic pay :");
	scanf("%f",&basic_pay);
house_rent = basic_pay* 0.4;
medical_allowance = basic_pay*0.18;
computer_allowance = basic_pay*0.15;
total_pay = basic_pay+house_rent+medical_allowance+computer_allowance;

	printf("Pay Slip\n Basic pay:%.0f\n House rent(40%%) : %.0f\n Medical Allowance (18%%) : %.0f \n Computer Allowance (15%%) %.0f \n........\nTotal pay : %.0f",basic_pay , house_rent,medical_allowance,computer_allowance,total_pay);

	getch();
	return );
	}
