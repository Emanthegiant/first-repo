class j9 {
int empno;
String name;
float sal;
j9() {
System.out.println("*****"); // Prints a separator line
empno = 101; // Default employee number
name = "Aashish"; // Default employee name
sal = 5000f; // Default salary
}
void displayDetails(){
    System.out.println(empno + " | " + name + " | " + sal);
}
}
