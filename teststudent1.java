class Student{
String name;
int sem;
void insert(String s,int i)
{
name=s;
sem=i;
}
void display()
{
System.out.println("name is:"+name+" "+"sem is:"+ " "+sem);
}
}
class teststudent1{
public static void main(String args[]){
Student obj=new Student();
obj.insert("PAVANKUMAR",4);
obj.display();
}
}
