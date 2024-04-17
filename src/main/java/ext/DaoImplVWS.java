package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

public class DaoImplVWS implements IDao {
    public DaoImplVWS() {
    }

    public double getData() {
        System.out.println("Version web service ");
        return 0.0;
    }
}
