import java.time.LocalDate;

public class Client {

    private String name;
    private String email;
    private LocalDate birthDate;

    //---- CONSTRUCTORS ----//
    public Client() {

    }
    public Client(String name, String email, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }


    //---- GETTERS AND SETTERS ----//
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String toString() {
		return name + " (" + birthDate.toString() + ") - " + email;
 	}
    
}