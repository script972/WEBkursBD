package tayetLed.manipulate;

import tayetLed.bens.Goods;
import tayetLed.db.Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by script972 on 21.05.2017.
 */
public class GoodsM {
    ArrayList<Goods> goodsList = new ArrayList<Goods>();


    public ArrayList<Goods> getGoods() {
        if (!goodsList.isEmpty())
            return goodsList;
        else
            return getGood();
    }

    public GoodsM() {
        getGoods();
    }

    private ArrayList<Goods> getGood() {
        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;
        try {
            conn = Database.getConncetion();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT goods.id, goods.title, goods.description, category.title AS category, supplier.title AS supplier, goods.factory, + goods.price, goods.supplier_price, goods.number_in_stock FROM goods, supplier, category WHERE goods.category=category.id AND goods.supplier=supplier.id AND goods.visible=1;");
            while (rs.next()) {
                Goods goods = new Goods();
                goods.setId((long) rs.getInt("id"));
                goods.setTitle(rs.getString("title"));
                goods.setDescription(rs.getString("description"));
                goods.setCategory(rs.getString("category"));
                goods.setSupplier(rs.getString("supplier"));
                goods.setFactory(rs.getString("factory"));
                goods.setPrice(Long.valueOf(rs.getString("price")));
                goods.setSupplier_price(Long.valueOf(rs.getString("supplier_price")));
                goods.setNumber_in_stock(Long.valueOf(rs.getString("number_in_stock")));
                System.out.println(">>>>>>>>>>><"+goods);

                goodsList.add(goods);
            }

        } catch (SQLException e) {
            Logger.getLogger(CustomerM.class.getName()).log(Level.SEVERE, null, e);
        } finally {
           /* try {
                if(stmt!=null)
                    stmt.close();
                if(conn!=null)
                    conn.close();
                if(rs!=null)
                    rs.close();
            } catch (SQLException e) {
                Logger.getLogger(CustomerM.class.getName()).log(Level.SEVERE, null, e);
            }*/
        }

        return goodsList;
    }

    public void addGood(Goods goods) {
        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;
        System.out.println(goods);
        try {
            conn = Database.getConncetion();
            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO goods(title,description, category, supplier, factory, price, supplier_price, number_in_stock ) VALUES (?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, goods.getTitle());
            preparedStatement.setString(2, goods.getDescription());
            preparedStatement.setString(3, goods.getCategory());
            preparedStatement.setString(4, goods.getSupplier());
            preparedStatement.setString(5, goods.getFactory());
            preparedStatement.setString(6, String.valueOf(goods.getPrice()));
            preparedStatement.setString(7, goods.getSupplier());
            preparedStatement.setLong(8, goods.getNumber_in_stock());
            goodsList.add(goods);
            preparedStatement.execute();
            preparedStatement.close();

           /* conn.close();*/

        } catch (SQLException e) {
            Logger.getLogger(CustomerM.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void delGoodByID(int id){
        Connection conn=null;
        conn = Database.getConncetion();
        Statement statement= null;
        try {
            statement = conn.createStatement();
            statement.execute("DELETE FROM goods WHERE id="+id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}