package login.usingthymleaflogin.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Studentid;
    private String username;
    private String password;

    public employee(){

    }
    










    public employee(String username, String password) {
        this.username = username;
        this.password = password;
    }











    public Long getStudentid() {
        return Studentid;
    }
    public void setStudentid(Long studentid) {
        Studentid = studentid;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
}
