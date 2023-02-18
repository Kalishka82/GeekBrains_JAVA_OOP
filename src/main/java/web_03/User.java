package web_03;

public class User implements Comparable<User> {
    private String firstName;
    private String lastName;
    private Integer age;
    private Personal personal = new Personal();

    public User(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Personal getPersonal() {
        return personal;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %d", firstName, lastName, age);
    }

    @Override
    public int compareTo(User o) {
        int compareFirstName = this.firstName.compareTo(o.firstName);
        if (compareFirstName != 0) {
            return compareFirstName;
        }
        int compareLastName = this.lastName.compareTo(o.lastName);
        if (compareLastName != 0) {
            return compareLastName;
        }

        return this.age - o.age;
    }
}
