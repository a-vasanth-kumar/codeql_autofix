import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;
import java.nio.charset.StandardCharsets;
    
public class CookieExample {

    public void addCookie(HttpServletResponse response) {
        Random r = new Random();
        byte[] bytes = new byte[16];
        r.nextBytes(bytes);  
        String encodedString = new String(bytes, StandardCharsets.UTF_8);        
        Cookie cookie = new Cookie("sessionId", encodedString);
        cookie.setHttpOnly(true); // GOOD: HttpOnly flag set
        cookie.setSecure(false); // BAD: Secure flag not set
        
        response.addCookie(cookie);
    }
}
