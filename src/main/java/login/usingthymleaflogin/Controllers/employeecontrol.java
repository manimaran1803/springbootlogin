package login.usingthymleaflogin.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import login.usingthymleaflogin.Model.employee;
import login.usingthymleaflogin.repos.emloyeerep;

@Controller
public class employeecontrol {
    


    @Autowired
    private emloyeerep emloyeerep;

   @GetMapping("/")
    public String login(Model model){
        employee employee=new employee();
        model.addAttribute("employee", employee);
        return "login";
           
    }


    @PostMapping("/loginpage")

    public String logpage(@ModelAttribute("employee") employee employee){
       
        String employeename=employee.getUsername();
        employee employeedata=emloyeerep.findByUsername(employeename);
        if(employee.getPassword().equals(employeedata.getPassword())){
            return "hello";
        }
        else{
            return "error" ;
        }

    }
}
