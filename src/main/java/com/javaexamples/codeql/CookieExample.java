import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

public class CookieExample {

    public void addCookie(HttpServletResponse response) {
        Cookie cookie = new Cookie("sessionId", "123456");
        cookie.setHttpOnly(true); // GOOD: HttpOnly flag set
        cookie.setSecure(false); // BAD: Secure flag not set
        response.addCookie(cookie);
    }
}
