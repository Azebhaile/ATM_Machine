package ATMService;

import AtmReposotory.AtmReposotory;
import Model.ATM;
import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class AtmService extends AtmReposotory {
    AtmReposotory ar;


    Connection conn = ConnectionUtil.getConnection();
    public AtmService() throws  SQLException{
       ar = new AtmReposotory();

    }

    public AtmService(  AtmReposotory ar) throws SQLException {
        this.ar = ar;
    }

    public void getAllAtmUsers() {
        ar.getAllAtmUsers();
    }
    public List getAllAtmUsersByName(int id){
        return ar.getAllAtmUsersByName(id);
    }

    public void deleteAtmUsersById(int id ){

        ar.deleteAtmUsersById(id);
    }

//    public void UpdateAtmUsersById(ATM atm) {
//        ar.UpdateAtmUsersById(atm);
//    }
}
