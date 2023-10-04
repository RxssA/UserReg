package ie.atu.userreg;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService us;
    @Autowired
    public void UserService(UserService userService){
        this.us = userService;
    }

    @GetMapping("newUser1/{name}/{email}")
    public String getUser(@PathVariable String name, @PathVariable String email){

        return us.registerUser(name, email);
    }
}
