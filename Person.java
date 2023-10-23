public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String birthday;
    private String address;

    public Person(String firstName, String middleName, String lastName, int age, String birthday, String address) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.birthday = birthday;
        this.address = address;

        // Print the attributes upon creation
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Birthday: " + birthday);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Person person = new Person("Rachel", "Endab", "Barruel", 19, "2003-12-06", "Singson Compound Guadalupe C.C");
    }
}
