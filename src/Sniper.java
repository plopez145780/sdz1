import com.sdz.comportement.*;

/**
 * Created by pierr on 02/08/2016.
 */
public class Sniper extends Personnage{
    public Sniper(){
        this.espritCombatif = new CombatPistolet();
    }

    public Sniper(EspritCombatif esprit, Soin soin, Deplacement dep){
        super(esprit, soin, dep);
    }
}
