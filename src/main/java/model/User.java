package model;

import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_user")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "age")
    private int age;
    @OneToOne(cascade = CascadeType.ALL)
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "id_adress_user")
    private Adress adress;

    public User(String firstName, String lastName, int age, Adress adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.adress = adress;
    }
}
