class j11 {
int empno;
String name;
float sal;
j11() {
System.out.println("*****"); // Prints a separator line
empno = 101; // Default employee number
name = "Aashish"; // Default employee name
sal = 5000f; // Default salary
}
void displayDetails(){
    System.out.println(empno + " | " + name + " | " + sal);
}
}
class j10{
public static void main(String[] args) {
    j9  ob1 = new j9 ();
     j9  ob2 = new j9 ();
      j9  ob3 = new j9 ();
      ob1.displayDetails();
      ob2.displayDetails();
      ob3.displayDetails();

      
}
}