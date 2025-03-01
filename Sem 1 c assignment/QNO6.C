#include<stdio.h>
#include<conio.h>
 int main() {
 clrscr ();
 char name [50];
 int seat_no[50];
 int english_marks,physics_marks,calculus_marks,computer_programming_marks;
 float total_marks,percentage;

	printf(" Enter name of student :");
	scanf("%c",&name);
	printf("Enter seat no :");
	scanf("%d",&seat_no);
	printf("Enter marks of English :");
	scanf("%d",&english_marks);
	printf("Enter marks of physics :");
	scanf("%d",&physics_marks);
	printf("Enter marks of calculus:");
	scanf("%d",&calculus_marks);
	printf("Enter marks ofcomputer programming:");
	scanf("%d",&computer_programming_marks );

	total_marks=english_marks+physics_marks+calculus_marks+computer_programming_marks;
	percentage=(total_marks/400)*100;
	printf("\n\n\n\t\t MARKSHEET \n");
	printf("\tName :%s\t seatNo :%s\n",name,seat_no);
	printf("\tsubjects\t\tMarks\n\n");
	printf("\t1. English\t %d\n",english_marks);
	printf("\t2. Physics\t %d\n",physics_marks);
	printf("\t3. Calculus\t %d\n",calculus_marks);
	printf("\t4. Computer_programming\t %d\n",computer_programming_marks);
	printf("\n\n");
	printf("Total : \t%.0f\t \n percentage :%.2f%%\n",total_marks,percentage);
	getch();
	return 0;
	}