import java.io.Serializable;

/**
 * Created by pierr on 12/08/2016.
 */
public class Notice {
    private String langue;
    public Notice(){
        this.langue = "Français";
    }
    public Notice(String lang){
        this.langue = lang;
    }

    public String toString(){
        return "\nLangue de la notice : " + this.langue + "\n";
}
}
