POJO(Plane Old Java Object) - Only follows Java Programming Rules
-----------------------------------------------------------------

class Student{
int studentId;
String name;

void display(){}

}

----------------------------------------------------------------------
Java Bean - Special type of POJO follows special rules
------------------------------------------------------
- Must implements Serializable interface
- Data must be private
- Should have default constructor
- Should have getter and setter

class Student implements Serializable{
private int studentId;
private String name;

Student(){}

getter & setter

// toString()
}
