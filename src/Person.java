public class Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }


    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
        if(age<0 || age>100){
            this.age=0;
        }
    }

    public boolean isTeen(){

        if(getAge()>12 && getAge()<20 ) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullName(){
        String fullname = getFirstName() + " "  + getLastName();

        if(firstName.isEmpty() && lastName.isEmpty()){
            System.out.print(" ");
        }

        if(lastName.isEmpty()) {
            return getFirstName();
        }

        if(firstName.isEmpty()) {
            return getLastName();
        }

        return fullname;
    }
}
