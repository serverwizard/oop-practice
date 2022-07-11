import org.example.PasswordGeneratePolicy;

public class WrongPasswordGenerator implements PasswordGeneratePolicy {
    @Override
    public String generatePassword() {
        return "bb";
    }
}
