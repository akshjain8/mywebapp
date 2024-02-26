package mywebapp.mywebapp.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity@AllArgsConstructor
public class Customer {

@Getter@Setter
    @Id@Column(name = "customer_id",nullable = false)
    private Long id;
    @Getter@Setter
    @Column(name="PhoneNumber")
    private Long PhoneNumber;
    @Getter@Setter
    @Column(name="Name")
    private String Name;
    @Getter@Setter
    @Column(name="Email")
    private String Email;

    public Customer() {
    }

//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void setPhoneNumber(Long phoneNumber) {
//        PhoneNumber = phoneNumber;
//    }
//
//    public void setName(String name) {
//        this.Name = name;
//    }
//
//    public Long getPhoneNumber() {
//        return PhoneNumber;
//    }
//
//    public String getName() {
//        return Name;
//    }
//
//    public String getEmail() {
//        return Email;
//    }
//
//    public void setEmail(String email) {
//        this.Email = email;
//    }
}

