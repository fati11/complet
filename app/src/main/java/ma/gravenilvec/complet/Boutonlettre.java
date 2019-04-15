package ma.gravenilvec.complet;

import android.widget.Button;
public class Boutonlettre {
    protected Button but;
    protected int indic_click=0;
    protected int valeur=0;
    protected char op;
    private int indice=0;
    private char lettre='\0';
    private int ordre=0;
    private Boutonlettre BoutonCliquee=null;

    public Boutonlettre getBoutonCliquee() {
        return BoutonCliquee;
    }

    public void setBoutonCliquee(Boutonlettre boutonCliquee) {
        BoutonCliquee = boutonCliquee;
    }

    public Button getButtonReponse() {
        return ButtonReponse;
    }

    public void setButtonReponse(Button buttonReponse) {
        ButtonReponse = buttonReponse;
    }

    private Button ButtonReponse=null;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id=0;

    public char getLettre() {
        return lettre;
    }
    public void setLettre(char lettre) {
        this.lettre = lettre;
    }
    public int getOrdre() {
        return ordre;
    }

    public void setOrdre(int ordre) {
        this.ordre = ordre;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public char getOp() {
        return op;
    }

    public void setOp(char op) {
        this.op = op;
    }

    public Boutonlettre(Button but,int i,int z) {
        indic_click=i;
        id=z;
        this.but=but;
    }
    public void setBut(Button but) {
        this.but = but;
    }
    public void setTextBouton(String a){
        this.but.setText(a);
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