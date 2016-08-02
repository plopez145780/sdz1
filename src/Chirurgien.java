import com.sdz.comportement.*;

/**
 * Created by pierr on 02/08/2016.
 */
public class Chirurgien extends Personnage{
    public Chirurgien() {
        this.soin = new Operation();
    }
    public Chirurgien(EspritCombatif esprit, Soin soin, Deplacement dep) {
        super(esprit, soin, dep);
    }
}
