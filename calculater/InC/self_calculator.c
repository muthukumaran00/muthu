#include<stdio.h>

void add(){
	float a,b,c;
	printf("Enter two numbers for adding: \n");
	scanf("%f%f",&a,&b);
	c=a+b;
	printf("%f \n",c);
}

void sub(){
	float a,b,c;
	printf("Enter two numbers for subtract: \n");
	scanf("%f%f",&a,&b);
	c=a-b;
	printf("%f \n",c);
}

void mult(){
	float a,b,c;
	printf("Enter two numbers for multiply: \n");
	scanf("%f%f",&a,&b);
	c=a*b;
	printf("%f \n",c);
}

void dev(){
	float a,b,c;
	printf("Enter two numbers for devite: \n");
	scanf("%f%f",&a,&b);
	c=a/b;
	printf("%f \n",c);
}
int main(){
	int n,i,c;
	
	while(1){
	printf("sellect the value to calculate \n");
	printf("1.Add \n");
	printf("2.Subtract \n");
	printf("3.Multiple \n");
	printf("4.Devide \n");
	printf("5.Exit \n");
	printf("and your choice is:");
	scanf("%d",&n);
	switch(n) {
		case 1:
			add();
			break;
		case 2:
			sub();
			break;
		case 3:
			mult();
			break;
		case 4:
			dev();
			break;
		case 5:
			printf("\n Press Enter to Exit \n");
			getch();
			return 0;
		default:
			printf("Enter the correct value \n");
		}
	}
	return 0;
	}