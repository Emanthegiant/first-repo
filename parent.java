class parent
{
int age , id;
String name;
void naming(String name)
{
System.out.println(name);
}
}
class child extends parent
{
 void ageN(int age)
 {
    System.out.println("Age of a student is:"+age);
 }
 public static void main(String[] args) 
 {
    child s= new child();//creating object of child class
    s.naming("Eman");
    s.ageN(14);
 }
}