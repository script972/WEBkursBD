package tayetLed.manipulate;

import tayetLed.bens.Category;
import tayetLed.db.Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by script972 on 01.06.2017.
 */
public class CategoryM {
    ArrayList<Category> categories=new ArrayList<Category>();



    public ArrayList<Category> getCategories() {
        if(!categories.isEmpty())
            return categories;
        else
            return getCategory();
    }

    public CategoryM() {
        getCategories();
    }

    private ArrayList<Category> getCategory(){
        Statement stmt=null;
        ResultSet rs=null;
        Connection conn=null;
        try {
            conn= Database.getConncetion();
            stmt=conn.createStatement();
            rs=stmt.executeQuery("SELECT id,title, category_parent FROM category;");
            while (rs.next()){
                Category category=new Category();
                category.setId((long) rs.getInt("id"));
                category.setTitle(rs.getString("title"));
               // category.setCategory_parent(Long.valueOf(rs.getString("category_parent")));
                categories.add(category);
            }

        } catch (SQLException e) {
            Logger.getLogger(CustomerM.class.getName()).log(Level.SEVERE, null, e);
        }
        finally {
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

        return categories;
    }

    public void addCategory(Category category){
        Statement stmt=null;
        ResultSet rs=null;
        Connection conn=null;
        System.out.println(category);
        try {
            conn= Database.getConncetion();
            PreparedStatement preparedStatement=conn.prepareStatement("INSERT INTO category(title,category_parent) VALUES (?,?)");
            preparedStatement.setString(1,category.getTitle());
            preparedStatement.setInt(2, Integer.parseInt(String.valueOf(category.getCategory_parent())));
            categories.add(category);
            preparedStatement.execute();
            preparedStatement.close();
           /* conn.close();*/

        } catch (SQLException e) {
            Logger.getLogger(CustomerM.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
