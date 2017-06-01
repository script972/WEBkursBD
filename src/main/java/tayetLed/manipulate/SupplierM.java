package tayetLed.manipulate;

import tayetLed.bens.Supplier;
import tayetLed.db.Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by script972 on 01.06.2017.
 */
public class SupplierM {
    ArrayList<Supplier> suppliers=new ArrayList<Supplier>();



    public ArrayList<Supplier> getSuppliers() {
        if(!suppliers.isEmpty())
            return suppliers;
        else
            return getSupplier();
    }

    public SupplierM() {
        getSuppliers();
    }

    private ArrayList<Supplier> getSupplier(){
        Statement stmt=null;
        ResultSet rs=null;
        Connection conn=null;
        try {
            conn= Database.getConncetion();
            stmt=conn.createStatement();
            rs=stmt.executeQuery("SELECT id,title, description, phone, head_name, address_office FROM supplier;");
            while (rs.next()){
                Supplier supplier=new Supplier();
                supplier.setId((long) rs.getInt("id"));
                supplier.setTitle(rs.getString("title"));
                supplier.setDescription(rs.getString("description"));
                supplier.setPhone(rs.getString("phone"));
                supplier.setHead_name(rs.getString("head_name"));
                supplier.setAddress_office(rs.getString("address_office"));
                suppliers.add(supplier);
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

        return suppliers;
    }

    public void addSupplier(Supplier supplier){
        Statement stmt=null;
        ResultSet rs=null;
        Connection conn=null;
        System.out.println(supplier);
        try {
            conn= Database.getConncetion();
            PreparedStatement preparedStatement=conn.prepareStatement("INSERT INTO supplier(title,description, phone, head_name, address_office) VALUES (?,?,?,?,?)");
            preparedStatement.setString(1,supplier.getTitle());
            preparedStatement.setString(2,supplier.getDescription());
            preparedStatement.setString(3, supplier.getPhone());
            preparedStatement.setString(4, supplier.getHead_name());
            preparedStatement.setString(5, supplier.getAddress_office());
            preparedStatement.execute();
            preparedStatement.close();
           /* conn.close();*/

        } catch (SQLException e) {
            Logger.getLogger(CustomerM.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
