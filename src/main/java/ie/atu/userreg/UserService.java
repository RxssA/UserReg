package ie.atu.userreg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


    @Service
    public class UserService {

        private final EmailService emailService;

        @Autowired
        public UserService(EmailService emailService){
            this.emailService = emailService;
        }
        public String registerUser(String username, String email){




            return emailService.sendEmail(email, "Welcome to Our platform!");
        }

    }
