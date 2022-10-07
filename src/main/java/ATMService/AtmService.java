
import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class AtmService {
    AtmReposotory ar;


    Connection conn = ConnectionUtil.getConnection();
    public AtmService() throws  SQLException{
       ar = new AtmReposotory();

    }

    public AtmService(  AtmReposotory ar) throws SQLException {
        this.ar = ar;
    }

    //
    public List<ATM> getAllAtmUsers() {

        return ar.getAllAtmUsers();
    }
    public ATM getAllAtmUsersByName(int id){
        return ar.getAllAtmUsersByName (id);
    }

    public void deleteAtmUsersById(int id ){
       ar.deleteAtmUsersById(id);
    }
    public ATM UpdateAtmUsersById(ATM atm){
        return ar.UpdateAtmUsersById(atm);
    }
    public void addAtmUsers(ATM atm) {
        ar.addAtmUsers(ATM);
    }
}



//