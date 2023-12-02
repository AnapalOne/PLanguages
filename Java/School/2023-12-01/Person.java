class Person
{
    protected String name;
    protected String address;

    public Person ()
    {
        System.out.println("Inside Person:Constructor");
    }

    public Person (String lname, String laddr)
    {
        System.out.println("Inside Person:Constructor 2");
        this.name = lname;
        this.address = laddr;
    }

    public String getName () {
        return name;
    }

    public String getAddress () {
        return address;
    }

    public void setName (String lname) {
        this.name = lname;
    }

    public void setAddress (String laddr) {
        this.address = laddr;
    }
}

class Employee extends Person
{
    public Employee ()
    {
        System.out.println("Inside Employee:Constructor");
    }

    public Employee (String lname, String laddr)
    {
        super(lname, laddr);
        System.out.println("Inside Employee:Constructor2 recieving 2 parameters: " 
                          + name + ", " + laddr);
    }
    
    public void /*String*/ getHobby () {}

    public void setHobby (String s) {}
    
    public String getName () {
        System.out.println("Employe: getName()");
        return "Hardworking employee " + super.getName();
    }
}

class Student extends Person
{
    protected String hobby;

    public Student ()
    {
        System.out.println("Inside Student:Constructor");
    }
    
    public String getHobby () {
        return hobby;
    }

    public void setHobby (String lHobby) {
        this.hobby = lHobby;
    }

    public String getName () {
        System.out.println("Student: getName():");
        return "Determined Student" + super.getName();
    }
}

class Teacher extends Person
{
    public String getName() {
        System.out.println("Teacher: getName()");
        return "A Passionate Teacher" + super.getName();
    }
}

class PisayStudent extends Student
{
    public PisayStudent ()
    {
        System.out.println("Inside PisayStudent:Constructor");
    }

    public String getHobby () {
        System.out.println("Inside PisayStudent:getHobby() method");
        return "My hobby is " + super.getHobby();
    }

    public void setHobby (String s) {
        System.out.println("Inside PisayStudent:setHobby() method");
        super.setHobby(s);
    }
}