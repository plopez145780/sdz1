import com.sdz.comportement.*;

/**
 * Created by pierr on 02/08/2016.
 */
public abstract class Personnage {
    protected EspritCombatif espritCombatif = new Pacifiste();
    protected Soin soin = new AucunSoin();
    protected  Deplacement deplacement = new Marcher();

    public Personnage(){

    }

    public Personnage(EspritCombatif espritCombatif, Soin soin, Deplacement deplacement){
        this.espritCombatif = espritCombatif;
        this.soin = soin;
        this.deplacement = deplacement;
    }

    public void seDeplacer(){
        deplacement.deplacer();
    }
    public void combattre(){
        espritCombatif.combat();
    }
    public void soigner(){
        soin.soigne();
    }

    //Redéfinit le comportement au combat
    public void setEspritCombatif(EspritCombatif espritCombatif) {
        this.espritCombatif = espritCombatif;
    }

    //Redéfinit le comportement de Soin
    public void setSoin(Soin soin) {
        this.soin = soin;
    }

    //Redéfinit le comportement de déplacement
    public void setDeplacement(Deplacement deplacement) {
        this.deplacement = deplacement;
    }
}
