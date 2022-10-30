// Abdul Qayyum 
//2k22
//Roll no 06

Quetion 5



import java.util.*;
class lab{
	public static void main(String[] args){
		String email,password;
		String[][] userinfo = { {"Safiullah@gmail.com","00000000"}, {"Zubairali@hotmail.com","11111111"},{"Farazali@yahoo.com","22222222"},
        {"Farooqali@gmail.com","33333333"},{"Adnanali@gmail.com", "44444444"}};
            System.out.println("welcome to pakistan ARMY'S WEBSITE ");
			Scanner obj = new Scanner(System.in);
			System.out.println("Enter Your Email Address: ");
			email = obj.nextLine();
            if(email.equalsIgnoreCase(userinfo[0][0])|| email.equalsIgnoreCase(userinfo[1][0]) || email.equalsIgnoreCase(userinfo[2][0])|| email.equalsIgnoreCase(userinfo[3][0]) || email.equalsIgnoreCase(userinfo[4][0]))
            {
                System.out.println("enter the passward");
            }
            else 
            {
                System.out.print("invalid email");
            }
            password=obj.nextLine();
           if(password.equalsIgnoreCase(userinfo[0][1])|| password.equalsIgnoreCase(userinfo[1][1])||password.equalsIgnoreCase(userinfo[2][1])||password.equalsIgnoreCase(userinfo[3][1])||password.equalsIgnoreCase(userinfo[4][1]))
            {
              
            System.out.println("welcome to the the login page");
        }
          else
{
             System.out.print("sorry wrong password");
    }
}
}





Question 6

// Abdul Qayyum
//2k22
//Roll no 06


import java.util.Scanner;
class menu{
public static void main(String org[]){
Scanner obj=new Scanner(System.in);


System.out.println("Enter The choice ");


System.out.println("Enter 1 to find the price of Large pizza");

System.out.println("Enter 2 to find the price of Medium pizza");

System.out.println("Enter 3 to find the price of Small pizza");


System.out.println("Enter 4 to find the price Zingar burgar");

System.out.println("Enter 5 to find the price Mango Juice");

System.out.println("Enter 6 to find the price Chicken");

System.out.println("Enter 7 to find the price Beef");

int choice =obj.nextInt();

switch(choice){

case 1: System.out.println("The Price Of Large pizza is: 950");
break;


case 2: System.out.println("The Price Of Medium pizza is: 600");
break;


case 3: System.out.println("The Price Of Small pizza is: 250");
break;


case 4: System.out.println("The Price Of  Zingar burgur is: 250");
break;


case 5: System.out.println("The Price of Mango juice is: 250");
break;


case 6: System.out.println("The Price of Chicken is: 500");
break;


case 7: System.out.println("The Price Of Beef is: 1200");
break;
}
}
}



Question 7


//Abdul Qayyum
//2k22
//Roll no 06


class esc{
public static void main(String[] org){
System.out.println("uses of Single quote \' in java");
System.out.println("uses of double quote \" in java");
System.out.println("uses of backslash \\ in java");
System.out.println("uses of backspace \b in java");
System.out.println("uses of formeed \f in java");
System.out.println("uses of newline \n in java");
System.out.println("uses of carriage return \r in java");
}
}








Question 8


//Abdul Qayyum
//2k22
//Roll no 06


import java.util.Scanner;
class add{
public static void main(String org[]){
Scanner obj=new Scanner(System.in);
System.out.println("Enter The value of X");
int x=obj.nextInt();

System.out.println("Enter The value of Y");
int y=obj.nextInt();

System.out.println("The Addition of X+Y is "+(x+y));

System.out.println("The Subtraction of X-Y is "+(x-y));

System.out.println("The Multiplication of X*Y is "+(x*y));

System.out.println("The Division of X/Y is "+(x/y));
}
}




Question 9

//Abdul Qayyum
//2k22
//RollNo 06



import java.util.Scanner;
class fibonnanci{
public static void main(String org[]){
Scanner obj=new Scanner(System.in);
int a=0;
int b=1;
int c;
int count=0;
System.out.println("Enter The Number of trems ");

int num =obj.nextInt();

System.out.printf("%d\n",a);

System.out.printf("%d\n",b);

count=2;

while(count<num){

c=a+b;
count++;

System.out.printf("%d\n",c);

a=b;

b=c;
}



}
}








