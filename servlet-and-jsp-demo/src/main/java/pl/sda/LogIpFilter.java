package pl.sda;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpFilter;
import java.io.IOException;

public class LogIpFilter extends HttpFilter {

    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void init() throws ServletException {
        LOGGER.debug("init() LogIpFilter");
        super.init();
    }

    // Przykładowe użycia filtrów to: walidacja, kompresja, weryfikacja, audytowanie
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
    //getRemoteAddr() returns the Internet Protocol (IP) address of the client or last proxy that sent the request.
        LOGGER.debug("Adress ip: " + req.getRemoteAddr());
        // przekazanie sterowania do kolejnego filtra lub servletu
        super.doFilter(req, res, chain);
    }

    public void destroy( ){
        LOGGER.debug("destroy() LogIpFilter");
    }
}
