package com.example.testingsp.Entite;


import jakarta.persistence.*;

@Table(name = "utulisateurs")
@Entity
public class UsersAuth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public  int user_id ;
        public String username ;
        public String email ;
        public String password ;

    public UsersAuth(int user_id, String username, String email, String password) {
        this.user_id = user_id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public UsersAuth(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public UsersAuth() {
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UsersAuth{" +
                "user_id=" + user_id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
