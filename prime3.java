import java.util.Scanner;

class prime3{

public static void main(String[] args) {

int low, high,c=0;
Scanner in = new Scanner(System.in);
System.out.println("enter lower limit and upper limit");

low = in.nextInt();
high = in.nextInt();
for(int j = low;j<=high;j++){
c = 0 ;
for (int i = 1; i <= j; i++) {

if(j%i==0)
c++;
if(c==2)
System.out.println(j);
}
}

}