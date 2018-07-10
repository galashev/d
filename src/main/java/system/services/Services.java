package system.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Services implements IService {

    public String getName() {
        return "services";
    }

    public void handleRequest(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html;charset=UTF-8");


    }
}
