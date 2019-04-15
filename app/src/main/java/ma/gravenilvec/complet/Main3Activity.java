package ma.gravenilvec.complet;
import java.lang.Math;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.*;
import android.widget.Button;
import android.view.View;
import android.widget.TableRow;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    MediaPlayer p=new MediaPlayer(),P2=new MediaPlayer();
    TextView text, text2, textOperation;
    public int counter1=100;
    TableRow rreponse;
    Button ButtonReponse1,ButtonReponse2,ButtonReponse3,ButtonReponse4,ButtonReponse5;
    int score=Score.getScore(),test=0;
    int tab[] = {1, 2, 3, 4, 5, 6, 7, 8,25, 9,10,50,75,100},nbalea10=1,nbalea, a, b, c, d, e, f;
    Button b1, b2, b3, b4, b5, b6, b16,b20,b_20, b_1, b_2, b_3, b_4, b_5, b_6, b_16, br__1, br2, br__3, br5;
    Bouton B_1 = new Bouton(b_1, 0);
    Bouton B_2 = new Bouton(b_2, 0);
    Bouton B_3 = new Bouton(b_3, 0);
    Bouton B_4 = new Bouton(b_4, 0);
    Bouton B_5 = new Bouton(b_5, 0);
    Bouton B_6 = new Bouton(b_6, 0);
    Bouton br_2 = new Bouton(br2, 0);
    Bouton br_5 = new Bouton(br5, 0);
    Bouton br_1 = new Bouton(br__1, 0);
    Bouton br_3 = new Bouton(br__3, 0);
    Bouton B_20 = new Bouton(b_20, 0);
    LigneOperation L = new LigneOperation(),L1 = new LigneOperation(),L2 = new LigneOperation(),L3 = new LigneOperation(),L4 = new LigneOperation(),
            L5 = new LigneOperation(),L6=new LigneOperation();
    counter ct = new counter(101000, 1000);
    List<Resultat> listes = new ArrayList<Resultat>();
    List<LigneOperation> listeOperation=new ArrayList<LigneOperation>();
    char op1,op6,op2,op3,op4,op5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Controle_activitee.getCa().setActivity9(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ct.start();
        p=MediaPlayer.create(this,R.raw.son);
        P2=MediaPlayer.create(this,R.raw.son2);
        P2.start();
        textOperation=findViewById(R.id.editText);
        L1.remplie=false;L2.remplie=false;L3.remplie=false;L4.remplie=false;L5.remplie=false;L6.remplie=false;
        while (nbalea10<100 || nbalea10>999)
            nbalea10 = (int) (Math.random() * 1000);
        nbalea=nbalea10;
        while(nbalea!=0) {
            int nbalea1 = (int) (Math.random() * tab.length);
            e = tab[nbalea1];
            op1 = gtchar();
            if(op1=='/')
            {
                while(nbalea%e!=0)
                    op1=gtchar();
            }
            Resultat r1 = new Resultat(nbalea, e, op1);
            listes.add(r1);
            nbalea=r1.calcul();
            r1.setResultat(nbalea);
            int nbalea2 = (int) (Math.random() * tab.length);
            a = tab[nbalea2];
            op2 = gtchar();
            if(op2=='/')
            {
                while(nbalea%a!=0)
                    op2=gtchar();
            }
            Resultat r2 = new Resultat(nbalea, a, op2);
            listes.add(r2);
            nbalea=r2.calcul();
            r2.setResultat(nbalea);
            int nbalea3 = (int) (Math.random() * tab.length);
            c = tab[nbalea3];
            op3 = gtchar();
            if(op3=='/')
            {
                while(nbalea%c!=0)
                    op3=gtchar();
            }
            Resultat r3 = new Resultat(nbalea, c, op3);
            listes.add(r3);
            nbalea=r3.calcul();
            r3.setResultat(nbalea);
            int nbalea4 = (int) (Math.random() * tab.length);
            f = tab[nbalea4];
            op4 = gtchar();
            if(op4=='/')
            {
                while(nbalea%f!=0)
                    op4=gtchar();
            }
            Resultat r4 = new Resultat(nbalea, f, op4);
            listes.add(r4);
            nbalea=r4.calcul();
            r4.setResultat(nbalea);
            int nbalea5 = (int) (Math.random() * tab.length);
            b = tab[nbalea5];
            op5 = gtchar();
            if(op5=='/')
            {
                while(nbalea%b!=0)
                    op5=gtchar();
            }
            Resultat r5 = new Resultat(nbalea, b, op5);
            listes.add(r5);
            nbalea=r5.calcul();
            r5.setResultat(nbalea);
            int nbalea6 = (int) (Math.random() * tab.length);
            d = tab[nbalea6];
            op6 = gtchar();
            if(op6=='/')
            {
                while(nbalea%d!=0)
                    op6=gtchar();
            }
            Resultat r6 = new Resultat(nbalea, d, op6);
            listes.add(r6);
            nbalea=r6.calcul();
            r6.setResultat(nbalea);
            b1 = findViewById(R.id.button1);
            b2 = findViewById(R.id.button2);
            b3 = findViewById(R.id.button3);
            b4 = findViewById(R.id.button4);
            b5 = findViewById(R.id.button5);
            b6 = findViewById(R.id.button6);
            b16 = findViewById(R.id.button26);
            b20 = findViewById(R.id.button20);
            rreponse=findViewById(R.id.rowreponse);
            text = findViewById(R.id.txt);
            text2 = findViewById(R.id.txt2);
            b1.setText(Integer.toString(a));
            b2.setText(Integer.toString(b));
            b3.setText(Integer.toString(c));
            b4.setText(Integer.toString(d));
            b5.setText(Integer.toString(e));
            b6.setText(Integer.toString(f));
            b16.setText(Integer.toString(nbalea10));
            text2.setText(Integer.toString(score));
        }

    }
    public void onBackPressed(){
        ct.cancel();
        Controle_activitee.getCa().terminerActivitees();
        finish();
        Intent i=new Intent(Main3Activity.this,Main2Activity.class);
        startActivity(i);
        P2.stop();
        p.stop();
        super.onBackPressed();
    }
    public static char gtchar() {
        char c;
        char ch[] = {'*', '+', '-', '/'};
        int n = (int) Math.random() * ch.length;
        c = ch[n];
        return c;
    }
    public void b1Click(View view) {
        if(counter1>0) //remplirTableRowReponse();
            fonctionBottonChiffre(B_1,b_1,a); L.setButtonOperand1(b_1);
    }
    public void b15Click(View view) {
        if(counter1>0)
            fonctionBottonChiffre(B_5,b_5,e); L.setButtonOperand1(b_5);
    }
    public void b16Click(View view) {
        if(counter1>0)
            fonctionBottonChiffre(B_6,b_6,f); L.setButtonOperand1(b_6);
    }
    public void b14Click(View view) {
        if(counter1>0)
            fonctionBottonChiffre(B_4,b_4,d); L.setButtonOperand1(b_4);
    }
    public void b13Click(View view) {
        if(counter1>0)
            fonctionBottonChiffre(B_3,b_3,c); L.setButtonOperand1(b_3);
    }
    public void b12_Click(View view) {
        if(counter1>0)
            fonctionBottonChiffre(B_2,b_2,b); L.setButtonOperand1(b_2);
    }
    public void divClick(View view) {
        fonctionBottonOperation("/",'/');
    }
    public void sommeClick(View view) {
        fonctionBottonOperation("+",'+');
    }
    public void multiClick(View view) {
        fonctionBottonOperation("*",'*');
    }
    public void soustraClick(View view) {
        fonctionBottonOperation("-",'-');
    }
    public void multi1Click(View view) {
        if(counter1>0) {
            setView();
            fonctionBottonOperation("*", '*');
        }
    }
    public void somme1Click(View view) {
        if(counter1>0) {
            setView();
            fonctionBottonOperation("+", '+');
        }
    }
    public void soustra1Click(View view) {
        if(counter1>0) {
            setView();
            fonctionBottonOperation("-", '-');
        }
    }
    public void div1Click(View view) {
        if(counter1>0) {
            setView();
            fonctionBottonOperation("/", '/');
        }
    }

    public void effacerLast(View view) {
        /**
        b_1=findViewById(R.id.buton1);
        b_2=findViewById(R.id.button2);
        b_3=findViewById(R.id.button3);
        b_4=findViewById(R.id.button4);
        b_5=findViewById(R.id.button5);
        b_6=findViewById(R.id.button6);**/
        if(L.getButtonOperand1()==null || L.getButtonOperand2()==null || L.getOperand1()==null || L.getOperand2()==null){
        }
        else if(B_1.getIndice_click()==0 && B_2.getIndice_click()==0
                && B_3.getIndice_click()==0 && B_4.getIndice_click()==0
                && B_5.getIndice_click()==0 && B_6.getIndice_click()==0
                ){}

        else {
            if (counter1 > 0) {
                br__1.setText(null);
                br2.setText(null);
                br__3.setText(null);
                br5.setText(null);
                textOperation.setText(null);
                L.setVal1(L.getVal1());
                L.setVal2(L.getVal2());
                L.setButtonOperand1(L.getButtonOperand1());
                L.setButtonOperand2(L.getButtonOperand2());
                L.setOperand1(L.getOperand1());
                L.setOperand2(L.getOperand2());
                int valeur1 = L.getVal1();
                int valeur2 = L.getVal2();
                L.getButtonOperand1().setText(Integer.toString(valeur1));
                L.getButtonOperand2().setText(Integer.toString(valeur2));
                L.getOperand1().setValeur(valeur1);
                L.getOperand2().setValeur(valeur2);
                L.getOperand1().setIndice_click(0);
                L.getOperand2().setIndice_click(0);
            }
        }
    }
    public void bEffacer(View view) {
        textOperation.setText(null);
        if(L.getButtonOperand1()!=null && L.getButtonOperand2()==null );

        else if(L.getButtonOperand1()==null || L.getButtonOperand2()==null || L.getOperand1()==null || L.getOperand2()==null)
        {
            br__1.setText(null);
            br2.setText(null);
            br__3.setText(null);
            br5.setText(null);
        }
        else {
            if(counter1>0) {
                if (B_20.getIndice_click() == 0) {
                    br__1.setText(null);
                    br2.setText(null);
                    br__3.setText(null);
                    br5.setText(null);
                    b_1 = findViewById(R.id.buton1);
                    b_2 = findViewById(R.id.button2);
                    b_3 = findViewById(R.id.button3);
                    b_4 = findViewById(R.id.button4);
                    b_5 = findViewById(R.id.button5);
                    b_6 = findViewById(R.id.button6);
                    b_16 = findViewById(R.id.button26);
                    text = findViewById(R.id.txt);
                    b_1.setText(Integer.toString(a));
                    b_2.setText(Integer.toString(b));
                    b_3.setText(Integer.toString(c));
                    b_4.setText(Integer.toString(d));
                    b_5.setText(Integer.toString(e));
                    b_6.setText(Integer.toString(f));
                    b_16.setText(Integer.toString(nbalea10));
                    b_1.setText(Integer.toString(a));
                    b_2.setText(Integer.toString(b));
                    b_3.setText(Integer.toString(c));
                    b_4.setText(Integer.toString(d));
                    b_5.setText(Integer.toString(e));
                    b_6.setText(Integer.toString(f));
                    B_1.setIndice_click(0);
                    B_2.setIndice_click(0);
                    B_3.setIndice_click(0);
                    B_4.setIndice_click(0);
                    B_5.setIndice_click(0);
                    B_6.setIndice_click(0);
                    br_1.setIndice_click(0);
                    br_2.setIndice_click(0);
                    br_3.setIndice_click(0);
                    br_5.setIndice_click(0);
                    B_1.setValeur(a);
                    B_2.setValeur(b);
                    B_3.setValeur(c);
                    B_4.setValeur(d);
                    B_5.setValeur(e);
                    B_6.setValeur(f);
                }
            }
        }
    }

    class counter extends CountDownTimer {
        public counter(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }
        @Override
        public void onTick(long millisUntilFinished){
            text.setText(String.valueOf(counter1));
            counter1--;
            if(counter1==11)
                P2.pause();
            if(counter1==10)
                p.start();
            if(counter1==0) {
                p.pause();
                Controle_activitee.getCa().terminerActivitees();
                Intent i = new Intent(Main3Activity.this, Main5Activity.class);
                startActivity(i);
                ///      Controle_activitee.getCa().getActivity3().finish();
                finish();
            }
        }
        @Override
        public void onFinish(){
        }
        public void LeCompteEstBon(){
            cancel();
            text.setText("le compte est bon");
        }
    }
    public void click_(Button id_button ) {
        br5=findViewById(R.id.br4);
        br_5.setBut(br5);
        int j = 1;
        if (br_1.getValeur() == 0) {
            br__1 = findViewById(R.id.br1);
            br_1.setBut(br__1);
        }
        br__3 = findViewById(R.id.br3);
        br_3.setBut(br__3);
        while (j == 1) {
            if (id_button == b_1 && B_1.getIndice_click() == 0) {
                j = fonction_clic1(B_1, b_1, j, B_1.getValeur());
            }
            if (id_button == b_2 && B_2.getIndice_click() == 0) {
                j = fonction_clic1(B_2, b_2, j, B_2.getValeur());
            }
            if (id_button == b_3 && B_3.getIndice_click() == 0) {
                j = fonction_clic1(B_3, b_3, j, B_3.getValeur());
            }
            if (id_button == b_4 && B_4.getIndice_click() == 0) {
                j = fonction_clic1(B_4, b_4, j, B_4.getValeur());
            }
            if (id_button == b_5 && B_5.getIndice_click() == 0) {
                j = fonction_clic1(B_5, b_5, j, B_5.getValeur());
            }
            if (id_button == b_6 && B_6.getIndice_click() == 0) {
                j = fonction_clic1(B_6, b_6, j, B_6.getValeur());
            }
            j=1;
            char c = br_2.getOp();
            if (br_1.getIndice_click() == 1 && br_3.getIndice_click() == 1 && c!='\0') {
                test++;
                br_2.setOp('\0');
                if (c == '*') {
                    br5.setText(Integer.toString(br_1.getValeur() * br_3.getValeur()));
                    br_5.setValeur(br_1.getValeur() * br_3.getValeur());
                }
                if (c == '-') {
                    br5.setText(Integer.toString(br_1.getValeur() - br_3.getValeur()));
                    br_5.setValeur(br_1.getValeur() - br_3.getValeur());
                }
                if (c == '+') {
                    br5.setText(Integer.toString(br_1.getValeur() + br_3.getValeur()));
                    br_5.setValeur(br_1.getValeur() + br_3.getValeur());
                }

                if (c == '/') {
                    br5.setText(Integer.toString(br_1.getValeur() / br_3.getValeur()));
                    br_5.setValeur(br_1.getValeur() / br_3.getValeur());
                }
                L.setResultat(br_5);
                textOperation.setText("  "+Integer.toString(br_1.getValeur())+" "+c+"  "+Integer.toString(br_3.getValeur())+"="+"  "+Integer.toString(br_5.getValeur()));
                br_1.setIndice_click(0);
                br_2.setIndice_click(0);
                br_3.setIndice_click(0);
                br_5.setIndice_click(0);
                int res = br_5.getValeur();
                L.setTexteOperand1(res);
                if (L.getOperand1() == B_1) {
                    B_1.setIndice_click(0);
                    B_1.setValeur(res);
                }
                if (L.getOperand1() == B_2) {
                    B_2.setIndice_click(0);
                    B_2.setValeur(res);
                }
                if (L.getOperand1() == B_3) {
                    B_3.setIndice_click(0);
                    B_3.setValeur(res);
                }
                if (L.getOperand1() == B_4) {
                    B_4.setIndice_click(0);
                    B_4.setValeur(res);
                }
                if (L.getOperand1() == B_5) {
                    B_5.setIndice_click(0);
                    B_5.setValeur(res);
                }
                if (L.getOperand1() == B_6) {
                    B_6.setIndice_click(0);
                    B_6.setValeur(res);
                }
                L.getButtonOperand2().setText(null);
                if (counter1 > 0 && L.getResultat().getValeur() == nbalea10) {
                    Score.setScore(Score.getScore()+10);
                    text2.setText(Integer.toString(score));
                    p.stop();
                    P2.stop();
                    Controle_activitee.getCa().terminerActivitees();
                    Intent i = new Intent(Main3Activity.this, Main4Activity.class);
                    // i.putExtra("scorestring",score);
                    //Controle_activitee.getCa().getActivity9().finish();
                    startActivity(i);
                    counter1=-1;
                }
            }
            break;
        }
    }
    public void b1_Click(View view) {
        click_(b_1);
    }
    public void b2Click(View view) {
        click_(b_2);
    }
    public void b3Click(View view) {
        click_(b_3);
    }
    public void b4Click(View view) {
        click_(b_4);
    }
    public void b5Click(View view) {
        click_(b_5);
    }
    public void b6Click(View view) {
        click_(b_6);
    }
    public void setView(){
        setContentView(R.layout.bclick);
        b_1 = findViewById(R.id.buton1);
        b_2 = findViewById(R.id.button2);
        b_3 = findViewById(R.id.button3);
        b_4 = findViewById(R.id.button4);
        b_5 = findViewById(R.id.button5);
        b_6 = findViewById(R.id.button6);
        b_16 = findViewById(R.id.button26);
        b_20 = findViewById(R.id.button20);
        text = findViewById(R.id.txt);
        text2 = findViewById(R.id.txt2);
        textOperation= findViewById(R.id.editText);
        text2.setText(Integer.toString(score));
        b_1.setText(Integer.toString(a));
        b_2.setText(Integer.toString(b));
        b_3.setText(Integer.toString(c));
        b_4.setText(Integer.toString(d));
        b_5.setText(Integer.toString(e));
        b_6.setText(Integer.toString(f));
        b_16.setText(Integer.toString(nbalea10));
        B_1.setValeur(a);
        B_2.setValeur(b);
        B_3.setValeur(c);
        B_4.setValeur(d);
        B_5.setValeur(e);
        B_6.setValeur(f);
    }
    public void fonctionBottonOperation(String s,char c) {
        br2 = findViewById(R.id.br2);
        br_2.setBut(br2);
        br2.setText(s);
        br_2.setOp(c);
        L.setOperateur(br_2);
        char ic = c;
        click_(br2);
    }
    public void fonctionBottonChiffre(Bouton B,Button b_,int b){
        setView();
        B.setBut(b_);
        br__1 = findViewById(R.id.br1);

        if(B.getIndice_click()==0 ) {
            B.setIndice_click(1);
            br_1.setBut(br__1);
            br_1.setValeur(b);
            br_1.setTextBouton(b);
            br_1.setIndice_click(1);
            L.setOperand1(B);
            L.setVal1(br_1.getValeur());
            L.setButtonOperand1(b_);
            //L.remplie=true;
        }
    }
    public int fonction_clic1(Bouton B,Button b_,int j,int a){
        if (br_1.getIndice_click() == 0) {
            br5.setText(null);
            br__3.setText(null);
            br2.setText(null);
            br__1.setText((Integer.toString(a)));
            br_1.setIndice_click(1);
            B.setIndice_click(1);
            br_1.setValeur(a);
            L.setOperand1(B);
            L.setVal1(br_1.getValeur());
            L.setButtonOperand1(b_);
            //L.remplie=true;
            j=0;
        }
        if (br_3.getIndice_click() == 0 && j==1 ) {
            br__3.setText((Integer.toString(a)));
            br_3.setIndice_click(1);
            B.setIndice_click(1);
            br_3.setValeur(a);
            L.setOperand2(B);
            L.setVal2(br_3.getValeur());
            L.setButtonOperand2(b_);
            //L1.remplie=true;
            j=0;
        }
        return j;
    }

}