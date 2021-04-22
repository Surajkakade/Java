class test{

class Address {

    String addressLine;

    String city;

    String zip;
  
  Address(String aline,String c,String z){
    this.addressLine=aline;
    this.city=c;
    this.zip=z;
  }
  

}

 
class Person extends Address{
 

 int id;
 String name;
  Address add;

  Person(int id, String name,Address a){
    this.id=id;
    this.name=name;
    this.add=a;
  }

}
 

class NaturalPerson extends Person

{

    Date dateOfBirth;

    int age;
    Person per;

NaturalPerson(Person p, Date d, int a){
  this.per=p;
  this.date=d;
  this.age.a;
 
 }
    
    

}

 

 

class LegalPerson extends Person

{

    int numberOfEmployees;
    Person per;
    LegalPerson(Person p, int n){
    this.per=p;
    this.numberOfEmployees=n;
}

public static void main(String args[])
{
 System.out.println("printing for no operations");
}
  
  
  
} //test
