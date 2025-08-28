import java.util.Scanner;

class prime{

public static void main(String[] args) {

int a, c=0;

Scanner in = new Scanner(System.in);

System.out.println("enter a number");

a = in.nextInt();

for (int i = 1; i <= a; i++) {

if(a%i==0)

c++;

}

if(c==2)

System.out.println("prime no");

else

System.err.println("no prime");


}

}