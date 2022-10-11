package AtmReposotory;

import Model.ATM;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AtmReposotory extends  ATM{
    List users = new ArrayList<ATM>();
    List atms = new ArrayList<ATM>();
    public  AtmReposotory()  {
        super(34,"name",343);
    }


    public Object getAccountHolderName(int id) {
        Object holderName = "none";
        for(int i=0; i<users.size(); i++){
            if(users.get(i).toString() == String.valueOf(id)){
                holderName = users.get(i);
            }
        }
        return holderName;
    }

    public void getAllAtmUsers(){
        List user = new ArrayList<ATM>();

        for(int i=0; i<users.size(); i++) {
            user.add(users.get(i));
        }
        System.out.println(user);
    }

    public void removeATMById(int id ) {
        for(int i=0; i<users.size(); i++){
            if(users.get(i).toString() == String.valueOf(id)){
                users.remove(i);
                System.out.println("Removed " + users.get(i) + " gently!");
            }
        }

    }
    public void addATM(ATM atm){
        List atms2 = new ArrayList<ATM>();
        for(int i=0; i<users.size(); i++){
            atms2.add(i);
        }
    }

    public  void updateATMById(ATM atm ){
       for(int i=0; i<users.size(); i++){
           if(atms.get(i).toString() == atm.toString()){
               atms.remove(i);
               atms.add(i);
               System.out.println("JUpdate the atm with id");
           }
       }
    }

    public List getAllAtmUsersByName(int id) {
        List names = new ArrayList<ATM>();

        for(int i=0; i<users.size(); i++){
            names.add(users.get(i));
        }

        return names;
    }

    public void deleteAtmUsersById(int id) {
        for(int i=0; i<users.size(); i++){
            if(users.get(i).toString() == String.valueOf(id)){
                users.remove(i);
            }
        }
    }


}
//