package ma.gravenilvec.complet;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
public class Nombre {
    List<Resultat>listes=new ArrayList<Resultat>();
    int tab[]={1,2,3,4,5,6,7,8,9,10,25,50,75,100};
    int a = tab[0];
    int res4=0;
    public int calculnbalea(){
        while( res4<100 || res4>999) {

            int nbalea1 = (int) (Math.random() * tab.length);

            int nbalea2 = (int) (Math.random() * tab.length);
            int b = tab[nbalea2];

            int nbalea3 = (int) (Math.random() * tab.length);
            int c = tab[nbalea3];

            int nbalea4 = (int) (Math.random() * tab.length);
            int d = tab[nbalea4];

            int nbalea5 = (int) (Math.random() * tab.length);
            int e = tab[nbalea5];

            int nbalea6 = (int) (Math.random() * tab.length);
            int f = tab[nbalea6];
            char op1 = gtchar();
            Resultat r1 = new Resultat(a, b, op1);
            listes.add(r1);
            int res1 = r1.calcul();
            r1.setResultat(res1);

            char op2 = gtchar();
            Resultat r2 = new Resultat(f, res1, op2);
            listes.add(r2);
            int res2 = r2.calcul();
            r2.setResultat(res2);

            char op3 = gtchar();
            Resultat r3 = new Resultat(e, c, op3);
            listes.add(r3);

            char op4 = gtchar();
            int res3 = r3.calcul();
            r3.setResultat(res3);
            Resultat r4 = new Resultat(res3, res2, '+');
            listes.add(r4);

            res4 = r4.calcul();
            r4.setResultat(res4);
        }   return a;
    }

    public static char gtchar(){
        char c;
        char ch[]={'+','-','*','/'};
        int n=(int) Math.random()*ch.length;
        c=ch[n];
        return c;
    }

}

