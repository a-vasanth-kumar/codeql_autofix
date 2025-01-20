import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;
import static com.google.crypto.tink.subtle.Hex.encode;
    
public class CookieExample {

    public void addCookie(HttpServletResponse response) {
        Random r = new Random();
        byte[] bytes = new byte[16];
        r.nextBytes(bytes);
        String cookieValue = encode(bytes);
        
        Cookie cookie = new Cookie("sessionId", cookieValue);
        cookie.setHttpOnly(true); // GOOD: HttpOnly flag set
        cookie.setSecure(false); // BAD: Secure flag not set
        
        response.addCookie(cookie);
    }
}
