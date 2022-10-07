
import Util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AtmReposotory{
    Connection conn;
    public  AtmReposotory() throws SQLException {
        conn = ConnectionUtil.getConnection();
    }
    public List<ATM> getAccountHolderName(){
        List<ATM> AccountHolderName = new ArrayList<>();
        try {
            Statement statement = conn.createStatement();
            ResultSet ar = statement.executeQuery("Select * From ATM");
            while(ar.next()){
                ATM loadedATM = new ATM(ar.getInt("id")),(ar.getString("name")),(ar.getString("description")));
                AccountHolderName.add(loadedATM);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return AccountHolderName;
    }

    public ATM getAccountHolderName(int id) {
        ATM loadedATM = null;
        try{
            PreparedStatement statement = conn.prepareStatement("Select * from ATM where id = ?");
            statement.setInt(1, id);
            ResultSet ar = statement.executeQuery();
            loadedATM = new ATM((ar.getInt("id")),(ar.getString("name")),(ar.getString("description")));
        }catch(SQLException e){
            e.printStackTrace();

        }
        return loadedATM;
    }

    public void removeATMById(int id ){
        try{
            PreparedStatement statement = conn.prepareStatement("Delete from ATM where id = ?");
            statement.setInt(1, id);
            ResultSet ar = statement.executeQuery();
        }catch(SQLException e){
            e.printStackTrace();
        }}
    public void addATM(ATM atm){

        try{
            PreparedStatement statement = conn.prepareStatement("insert into ATM(id, name, description) " +
                    "values (?, ?, ?)");
            statement.setInt(1,atm.getId());
            statement.setString(2,atm.getName());
            statement.setString(3,atm.getDescription());

            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public  ATM updateATMById(ATM atm ){
        ATM returnval  = null;
        try{
            PreparedStatement statement = conn.prepareStatement("Update ATM set name= ?,description = ? where id = ?");
            statement.setString(2, atm.getName());
            statement.setString(3, atm.getDescription());
            ResultSet ar = statement.executeQuery();
            returnval = new ATM((ar.getInt("id")),(ar.getString("name")),(ar.getString("description")));
        }catch(SQLException e){
            e.printStackTrace();
        }
        return returnval;
    }}
//