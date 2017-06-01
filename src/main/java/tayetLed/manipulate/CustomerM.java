package tayetLed.manipulate;

import tayetLed.bens.Customer;
import tayetLed.db.Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by script972 on 14.05.2017.
 */
public class CustomerM {
    private ArrayList<Customer> customersList=new ArrayList<Customer>();


    public CustomerM() {
        getCustomersList();
    }

    private ArrayList<Customer> getCustomersList() {
        if(!customersList.isEmpty())
            return customersList;
        else
            return getCustomer();
    }



    public ArrayList<Customer> getCustomer(){
        Statement stmt=null;
        ResultSet rs=null;
        Connection conn=null;
        try {
            conn= Database.getConncetion();
            stmt=conn.createStatement();
            rs=stmt.executeQuery("SELECT customer.id, customer.last_name, customer.name, customer.second_name, customer.phone, customer.email, customer.pass, customer.discount FROM customer WHERE customer.active=1 ORDER BY  customer.id");
            while (rs.next()){
                Customer customer=new Customer();
                customer.setId((long) rs.getInt("id"));
                customer.setEmail(rs.getString("email"));
                customer.setPhone(rs.getString("phone"));
                customer.setName(rs.getString("name"));
                customer.setSecond_name(rs.getString("second_name"));
                customer.setLast_name(rs.getString("last_name"));
                customer.setDiscount(Long.valueOf(rs.getString("discount")));
                customer.setPass(rs.getString("pass"));
                customersList.add(customer);
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

        return customersList;
    }


    public Customer getCustomerById(int id){
        for (Customer cu : customersList) {
            if(cu.getId()==id)
                return cu;
        }
        return null;
    }

/*
    public Customer getCustomerById(int id){
        Statement stmt=null;
        ResultSet rs=null;
        Connection conn=null;
        try {
            conn= Database.getConncetion();
            PreparedStatement preparedStatement = conn.prepareStatement("SELECT customer.id, customer.password, customer.last_name, customer.name, customer.phone, customer.email, customer.second_name, size_discount FROM customer, discount WHERE\n" +
                    "  customer.discount=discount.id AND custoMER.id=? ORDER BY  customer.id");
            preparedStatement.setInt(1, id);
            rs=preparedStatement.executeQuery();
            while (rs.next()){
                Customer customer=new Customer();
                customer.setId(rs.getLong("id"));
                customer.setName(rs.getString("name"));
                customer.setLast_name(rs.getString("last_name"));
                customer.setSecond_name(rs.getString("second_name"));
                customer.setEmail(rs.getString("email"));
                customer.setPhone(rs.getString("phone"));
                customer.setDiscount(Long.valueOf(rs.getString("size_discount")));
                customer.setPassword(rs.getString("password"));
                return customer;
            }

        } catch (SQLException e) {
            Logger.getLogger(CustomerM.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }
*/

    public void addCustomersList(Customer customer){
        Statement stmt=null;
        ResultSet rs=null;
        Connection conn=null;
        System.out.println(customer);
        try {
            conn= Database.getConncetion();
            PreparedStatement preparedStatement=conn.prepareStatement("INSERT INTO customer(name, last_name, second_name, email, pass, date_register) VALUES (?,?,?,?,?, NOW())");
            preparedStatement.setString(1,customer.getName());
            preparedStatement.setString(2,customer.getLast_name());
            preparedStatement.setString(3,customer.getSecond_name());
            preparedStatement.setString(4,customer.getEmail());
            preparedStatement.setString(5,customer.getPass());
            customersList.add(customer);
            preparedStatement.execute();
            preparedStatement.close();
           /* conn.close();*/

        } catch (SQLException e) {
            Logger.getLogger(CustomerM.class.getName()).log(Level.SEVERE, null, e);
        }

    }
}
