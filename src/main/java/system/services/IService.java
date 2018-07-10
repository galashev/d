package system.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IService {
    /*уникальное имя сервиса*/
    String getName();
    /*обработка запроса*/
    void handleRequest(HttpServletRequest request, HttpServletResponse response);
}
