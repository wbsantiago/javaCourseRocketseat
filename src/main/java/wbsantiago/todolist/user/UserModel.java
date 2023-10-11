package wbsantiago.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

//projectlombok.org
@Data
@Entity(name = "tb_users")
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;

    // ABAIXO O MODO PADRAO DE SE CHAMAR GETTER OU SETTER

    // public void setUsername(String username) {
    //     this.username = username;
    // }

    // public String getUsername() {
    //     return username;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public String getName() {
    //     return name;
    // }

    // public void setPassword(String password) {
    //     this.password = password;
    // }

    // public String getPassword() {
    //     return password;
    // }

    // getters setters

}
