package tayetLed;

import tayetLed.bens.Customer;
import tayetLed.manipulate.CustomerM;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Emma on 14.05.2017.
 */
@WebServlet(name = "Login", value = "/login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String login=request.getParameter("login");
        String password=request.getParameter("password");
        response.getWriter().print(login+" "+password);
        CustomerM customerM=new CustomerM();
        Customer customer = null;
        HttpSession session=request.getSession(true);
        try {
            customer=customerM.getCustomerById(Integer.parseInt(login));
            System.out.println(customer);
            if(customer.getPass().equals(password)) {
                session.setAttribute("key", "userOK");
                request.getRequestDispatcher("/goods.jsp").forward(request, response);
            }
            else {
                response.getWriter().print("Не правельный пароль");
            }

            response.getWriter().print(customer);
        } catch (NumberFormatException ex){
            response.getWriter().print("Не правельный формат данных в логин");
        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
