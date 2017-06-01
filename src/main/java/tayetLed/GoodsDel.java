package tayetLed;

import tayetLed.manipulate.GoodsM;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by script972 on 01.06.2017.
 */
@WebServlet(name = "GoodsDel", value = "/goodsdel")
public class GoodsDel extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id= Integer.parseInt(req.getParameter("id"));
        GoodsM goodsM=new GoodsM();
        goodsM.delGoodByID(id);
        req.getRequestDispatcher("goods.jsp").forward(req, resp);
    }
}
