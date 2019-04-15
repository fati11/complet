package ma.gravenilvec.complet;

/**
 * Created by aaa on 25/03/2018.
 */

public class Resultat {
    private int resultat=0;
    private int a;
    private int b;
    private char operateur;
    public Resultat() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Resultat(int a, int b, char operateur) {
        super();
        this.a = a;
        this.b = b;
        this.operateur = operateur;
    }
    public int getResultat() {
        return resultat;
    }
    public void setResultat(int resultat) {
        this.resultat = resultat;
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public char getOperateur() {
        return operateur;
    }
    public void setOperateur(char operateur) {
        this.operateur = operateur;
    }
    public int calcul()
    {
        switch(operateur)
        {
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;
        }
        return 0;
    }
}
