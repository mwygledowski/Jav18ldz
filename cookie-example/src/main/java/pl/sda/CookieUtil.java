package pl.sda;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class CookieUtil {

    public static Cookie getCookie(String name, HttpServletRequest req){
        Cookie[] cookies = req.getCookies();
        if (cookies == null){
            return null;
        }

        for (Cookie cookie: cookies) {
            if(cookie.getName().equals(name)){
                return cookie;
            }
        }
        return null;
    }
}
