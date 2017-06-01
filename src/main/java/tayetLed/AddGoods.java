package tayetLed;

import tayetLed.bens.Goods;
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
@WebServlet(name="AddGoods", value = "/addGoods")
public class AddGoods extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String title=req.getParameter("title");
        String description=req.getParameter("description");
        String category=req.getParameter("category");
        String supplier=req.getParameter("supplier");
        String factory=req.getParameter("factory");
        String price=req.getParameter("price");
        String price_supplier=req.getParameter("price_supplier");
        String numbers=req.getParameter("numbers");


        Goods goods=new Goods();
        goods.setTitle(title);
        goods.setDescription(description);
        goods.setCategory(category);
        goods.setSupplier(supplier);
        goods.setFactory(factory);
        goods.setPrice(Long.valueOf(price));
        goods.setSupplier_price(Long.valueOf(price_supplier));
        goods.setNumber_in_stock(Long.valueOf(numbers));
        System.out.println(goods);

        GoodsM goodsM=new GoodsM();
        goodsM.addGood(goods);
        req.getRequestDispatcher("goods.jsp").forward(req, resp);

    }
}
