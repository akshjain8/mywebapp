package mywebapp.mywebapp.Entity;

import jakarta.persistence.*;

@Entity
public class Orders {
    @Id
    private Long id;
    @Column
    private String title;
    @Column
    private String description;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
