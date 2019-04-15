package ma.gravenilvec.complet;
import android.widget.Button;


public class Bouton {
    protected Button but;
    protected int indic_click=0;
    protected int valeur=0;
    protected char op;


    public char getOp() {
        return op;
    }

    public void setOp(char op) {
        this.op = op;
    }

    public Bouton(Button but,int i) {
        indic_click=i;
        this.but=but;
    }
    public void setBut(Button but) {
        this.but = but;
    }
    public void setTextBouton(int a){
        this.but.setText(Integer.toString(a));
    }
    public void setIndice_click(int indice_click) {
        this.indic_click = indice_click;
    }
    public int getIndice_click() {

        return indic_click;
    }
    public Button getBut() {
        return but;
    }
    public int getValeur() {
        return valeur;
    }
    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
    public void setTexteRes(int a){
        but.setText(Integer.toString(a));
    }
}
