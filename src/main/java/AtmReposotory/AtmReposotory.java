package AtmReposotory;

import Model.ATM;
import Util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AtmReposotory extends  ATM{
    Connection conn;
    public  AtmReposotory() throws SQLException {
        super(34,"name",343);
        conn = ConnectionUtil.getConnection();
    }
    public String getAccountHolderName(){
        List AccountHolderName = new ArrayList<ATM>();
        try {
            Statement statement = conn.createStatement();
            ResultSet ar = statement.executeQuery("Select * From ATM");
            while(ar.next()){
                ATM loadedATM = new ATM((ar.getInt("id")),(ar.getString("name")),Integer.parseInt(ar.getString("accNo")));
                AccountHolderName.add(loadedATM);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return AccountHolderName.toString();
    }


    public String getAccountHolderName(int id) {
        ATM loadedATM = null;
        try{
            PreparedStatement statement = conn.prepareStatement("Select * from ATM where id = " + id);
            statement.setInt(1, id);
            ResultSet ar = statement.executeQuery();
            loadedATM = new ATM((ar.getInt("id")),(ar.getString("name")),Integer.parseInt(ar.getString("accNo")));
            return loadedATM.getAtmUserName();
        }catch(SQLException e){
            e.printStackTrace();

        }
        return "";
    }

    public void getAllAtmUsers(){
        try{
            PreparedStatement statement = conn.prepareStatement("Select * from ATM ");

            ResultSet ar = statement.executeQuery();
            System.out.println(ar);
        }catch(SQLException e){
            e.printStackTrace();

        }
    }

    public void removeATMById(int id ){
        try{
            PreparedStatement statement = conn.prepareStatement("Delete from ATM where id = "+id);
            statement.setInt(1, id);
            ResultSet ar = statement.executeQuery();
        }catch(SQLException e){
            e.printStackTrace();
        }}
    public void addATM(ATM atm){

        try{
            PreparedStatement statement = conn.prepareStatement("insert into ATM(id, name, accNO) " +
                    "values ("+ atm.AtmUserId +"," + atm.AtmUserName + ", "+ atm.AccoutNumber+ ")");
            statement.setLong(1,atm.getId());
            statement.setString(2,atm.getName());
            statement.setLong(3,atm.getAccountNumber());

            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public  ATM updateATMById(ATM atm ){
        ATM returnval  = null;
        try{
            PreparedStatement statement = conn.prepareStatement("Update ATM set name= "+atm.AtmUserName+",accNo = "+atm.AccoutNumber+" where id = " +atm.AtmUserId);
            statement.setString(2, atm.getName());
            statement.setLong(3, atm.getAccountNumber());
            ResultSet ar = statement.executeQuery();
            returnval = new ATM((ar.getInt("id")),(ar.getString("name")),Integer.parseInt(ar.getString("accNo")));
        }catch(SQLException e){
            e.printStackTrace();
        }
        return returnval;
    }

    public List getAllAtmUsersByName(int id) {
        List users = null;
        try{
            Statement st = conn.createStatement();
            ResultSet rs  = st.executeQuery("Select * from ATM where id = " + id);
            while(rs.next()){
                users.add(rs.getString("name"));
            }
        }
        catch(SQLException e){
            e.printStackTrace();;
        }
        return users;
    }

    public void deleteAtmUsersById(int id) {
        try{
            Statement st = conn.createStatement();
            st.executeQuery("delete from ATM where id = " + id);
        }
        catch(SQLException e){
            e.printStackTrace();;
        }
    }

    public void UpdateAtmUsersById(ATM atm) {
        try{
            Statement st = conn.createStatement();
            st.executeQuery("UPDATE ATM" + "SET " +"id = " +atm.AtmUserId + "accNo = " +atm.AccoutNumber + "name = " +atm.AtmUserName + "WHERE" +
                    "id =" + atm.getAtmUserId());
            System.out.println("Updated atm users by id!");
        }
        catch(SQLException e){
            e.printStackTrace();;
        }

    }


}
//