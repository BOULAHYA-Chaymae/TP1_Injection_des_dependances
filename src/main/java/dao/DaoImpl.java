package dao;
import org.springframework.stereotype.Component;
@Component("dao")
public class DaoImpl implements IDao {
    public DaoImpl() {
    }

    public double getData() {
        double temp = Math.random() * 40.0;
        return temp;
    }
}