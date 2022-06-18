package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.User;
import services.AccountService;


public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);  
        
        String web_input = request.getParameter("logout");
//        if(web_input.equals("logout")){
//            session.invalidate();
//            session = request.getSession();
//        } 
       return;  
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        //HttpSession session = request.getSession();
        
        String username = request.getParameter("userN");
        String password = request.getParameter("passW");
        
        
        
        if(username == null || username.equals("") || password == null || password.equals("")){
            request.setAttribute("error",true);
            request.setAttribute("username", username);
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        return;
        }
        request.setAttribute("username", username);
        request.setAttribute("password", password);
        User newUser = new User(username,password);
        
        //if(User.newUser != null){
        getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
        //}
        
        
        return;
    }
}
