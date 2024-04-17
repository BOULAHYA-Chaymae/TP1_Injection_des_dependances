package ext;
import dao.IDao;
import org.springframework.stereotype.Component;
@Component("dao2")
public class DaoImpl2 implements IDao {
    public DaoImpl2() {
    }

    public double getData() {
        System.out.println("La version capteurs est ");
        double temp = 6000.0;
        return temp;
    }
}