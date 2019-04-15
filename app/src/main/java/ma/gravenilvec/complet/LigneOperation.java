package ma.gravenilvec.complet;
import java.lang.Math;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.*;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
public class LigneOperation{

    protected Bouton Operand1=null;
    protected Button ButtonOperand1=null;
    protected Button ButtonOperand2=null;
    protected int    val1=0;
    protected int    val2=0;
    protected Bouton Operand2=null;
    protected Bouton Resultat=null;
    protected Bouton operateur=null;
    public    Boolean remplie=false;

    public int getVal1() {
        return val1;
    }

    public void setVal1(int val1) {
        if(remplie==false)
            this.val1 = val1;
    }

    public int getVal2() {
        return val2;
    }

    public void setVal2(int val2) {
        if(remplie==false)
            this.val2 = val2;
    }

    public LigneOperation(Bouton operand1, Bouton operand2, Bouton resultat, Bouton operateur) {
        Operand1 = operand1;
        Operand2 = operand2;
        Resultat = resultat;
        this.operateur = operateur;
    }

    public Bouton getOperand1() {
        return Operand1;
    }

    public void setOperand1(Bouton operand1) {
        if(remplie==false)
        {
            Operand1 = operand1;
            int v;
            v=operand1.getValeur();
            Operand1.setValeur(v);}
    }

    public LigneOperation() {
    }

    public Bouton getOperand2() {
        return Operand2;
    }

    public void setOperand2(Bouton operand2) {
        if (remplie == false) {
            Operand2 = operand2;
            Operand2.setValeur(operand2.valeur);
        }
    }
    public Bouton getResultat() {
        return Resultat;
    }

    public void setResultat(Bouton resultat) {
        if(remplie==false) Resultat = resultat;
    }


    public Bouton getOperateur() {

        return operateur;
    }

    public void setOperateur(Bouton operateur) {
        if(remplie==false) this.operateur = operateur;
    }
    public Button getButtonOperand1() {
        return ButtonOperand1;
    }

    public void setButtonOperand1(Button buttonOperand1) {
        if(remplie==false) ButtonOperand1 = buttonOperand1;
    }

    public Button getButtonOperand2() {
        return ButtonOperand2;
    }

    public void setButtonOperand2(Button buttonOperand2){
        if(remplie==false)
            ButtonOperand2 = buttonOperand2;
    }


    public void setTexteOperand1(int a)
    {
        if(remplie==false)
            ButtonOperand1.setText(Integer.toString(a));
    }

}