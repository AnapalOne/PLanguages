public class Tester
{
    // public static void main(String[] args) 
    // {
    //     Student student1 = new Student();
    //     student1.setName("Sang");
    //     System.out.println("Calling getName() method: name is " + student1.getName());

    //     PisayStudent student2 = new PisayStudent();
    //     Student student3 = new PisayStudent();

    //     student1.setHobby("reading");
    //     student2.setHobby("dancing");

    //     String hobby2 = student1.getHobby();
    //     System.out.println("Hobby of student2 " + hobby2);
    //     String hobby3 = student2.getHobby();
    //     System.out.println("Hobby of student3 " + hobby3);
    // }

    public static void main(String[] args) 
    {
        Person ref;
        // Student studentObject = new Student("Sang", "1 Dreamland");
        Employee employeeObject = new Employee("Young", "2Dreamland");
        // ref = studentObject;
        // String temp1 = ref.getName();
        // System.out.println("temp1 -" + temp1 + "\n");
        ref = employeeObject;
        String temp2 = ref.getName();
        System.out.println("temp2 -" + temp2 + "\n");
    }
}