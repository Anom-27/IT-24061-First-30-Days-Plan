# Example 01
```java
public class Car {
    String color;
    String model;
    int year;
    void displayInfo(){
        System.out.println("Car's Color : "+color);
        System.out.println("Car's Model : "+model);
        System.out.println("Car's Year  : "+year);
    }
}
public class Main{
    public static void main(String[] args){
  Car myCar=new Car();
  myCar.color="Red";
  myCar.model="Toyota";
  myCar.year=2025;
  myCar.displayInfo();
    }
}
```
# Example 02
```java
public class Student{
    String name;
    int Roll;
    String district;
    String Number;
    void Show() {
        System.out.println(name);
        System.out.println(Roll);
        System.out.println(district);
        System.out.println(Number);
    }
}
public class MainStudent{
    static void main(String[] args){
        Student s1=new Student();
        s1.name="Pritom Kumar Sen Anom";
        s1.Roll=61;
        s1.district="Tangail";
        s1.Number="01997931225";
        s1.Show();
        Student s2=new Student();
        s2.name="Hasin Siam";
        s2.Roll=21;
        s2.district="Jamalpur";
        s2.Number="01629279879";
        s2.Show();
        Student s3=new Student();
        s3.name="Mahathir Mahi";
        s3.Roll=29;
        s3.district="Dhaka";
        s3.Number="01749123786";
        s3.Show();
    }
}
```
