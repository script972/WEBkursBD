package tayetLed;

import tayetLed.bens.Customer;
import tayetLed.manipulate.CustomerM;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Emma on 14.05.2017.
 */
@WebServlet(name = "Registration", value = "/registration")
public class Registration extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String second_name=request.getParameter("second_name");
        String last_name=request.getParameter("last_name");
        String login=request.getParameter("login");
        String password=request.getParameter("pass");
        String email=request.getParameter("email");
        String phone=request.getParameter("phone");

        CustomerM customerM=new CustomerM();
        customerM.addCustomersList(new Customer(email, phone, name, second_name, last_name, (long) 1, password));
        response.getWriter().write("registration ok <a href='index.jsp'>Registration</a>");
        request.getRequestDispatcher("/index.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
