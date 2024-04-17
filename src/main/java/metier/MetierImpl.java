package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    //Couplage faible
    @Autowired
    @Qualifier("dao")
    private IDao dao;


    @Override
    public double calcul() {
        double tmp = this.dao.getData();
        double res = tmp * 540.0 / Math.cos(tmp * Math.PI);
        return res;
    }
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
