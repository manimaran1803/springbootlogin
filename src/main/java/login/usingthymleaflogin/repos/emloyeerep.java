package login.usingthymleaflogin.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import login.usingthymleaflogin.Model.employee;

public interface emloyeerep extends JpaRepository<employee,Long> {
    
    employee findByUsername(String username);
}
