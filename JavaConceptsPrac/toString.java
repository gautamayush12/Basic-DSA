package JavaConceptsPrac;

public class toString{
    public toString(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        Email = email;
    }
    private String firstName;
    private String lastName;
    private String Email;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    @Override
    public String toString() {
        return "First name : " + firstName + "\n" +
               "Last name : " + lastName + "\n" +
               "Email : " + Email + "\n";
    }

    public static void main(String[] args) {
        toString person = new toString("Testing", "Tester", "testing@tester.com");
        System.out.print(person.toString());
    }

}