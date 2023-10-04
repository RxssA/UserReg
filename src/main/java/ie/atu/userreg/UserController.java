package ie.atu.userreg;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private UserService us;
    private UserStorage userStorage;

    @Autowired
    public void UserService(UserService userService){
        this.us = userService;
    }

    @GetMapping("newUser1/{name}/{email}")
    public String getUser(@PathVariable String name, @PathVariable String email){

        return us.registerUser(name, email);
    }
    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public UserStorage registerUserCredential(@RequestBody UserStorage userStorage){
        System.out.println("User ID: "+ userStorage.getUserName());
        System.out.println("User ID: "+ userStorage.getPassword());
        return userStorage;
    }

}
