package ie.atu.userreg;
import org.springframework.stereotype.Service;
@Service
public class EmailService {
    public String sendEmail(String to, String message){
        return " email "+ to;
    }
}
