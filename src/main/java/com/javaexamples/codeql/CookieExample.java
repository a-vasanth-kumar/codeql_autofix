import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;

public class CookieExample {

    public void addCookie(HttpServletResponse response) {
        Cookie cookie = new Cookie("sessionId", "123456");
        cookie.setHttpOnly(true); // GOOD: HttpOnly flag set
        cookie.setSecure(false); // BAD: Secure flag not set

        Random r = new Random();

        byte[] bytes = new byte[16];
        r.nextBytes(bytes);
        
        String cookieValue = encode(bytes);
        
        Cookie cookie = new Cookie("name", cookieValue);
        response.addCookie(cookie);
        response.addCookie(cookie);
    }
}
