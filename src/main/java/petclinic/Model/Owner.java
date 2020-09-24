package petclinic.Model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Owner {
    private Long id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Set<Pet> pets = new HashSet<>();
    public Owner(){

    }
    public Owner(String firstName, String lastName, Long id){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}