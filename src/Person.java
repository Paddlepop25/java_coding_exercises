public class Person {
    private String firstName;
    private String lastName;
    private int age;

    // getter
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }

    // setter
    public void setFirstName(String fName) {
        this.firstName = fName;
    }
    public void setLastName(String lName) {
        this.lastName = lName;
    }
    public void setAge(int age) {
        if(age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty() ) {
            return "";
        }
        if ( lastName.isEmpty()) {
            return firstName;
        }
        if ( firstName.isEmpty()) {
            return lastName;
        }
        return firstName + " " + lastName;
    }
}
