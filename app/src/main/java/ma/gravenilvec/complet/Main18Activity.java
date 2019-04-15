package ma.gravenilvec.complet;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.*;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Main18Activity extends Activity {
    //private int score=0;
    MediaPlayer p=new MediaPlayer(),P2=new MediaPlayer();
    private Button b1, b2, b3, b4, b5, b6, b7, b8,bb8=null,bb7=null,bb6=null,bb5=null,bb4=null,bb3=null,bb2=null,bb1=null,br1,br2,br3,br4,br5,br6,br7,br8;
    private Boutonlettre  B1 = new Boutonlettre(b1, 0,1), B2 = new Boutonlettre(b2, 0,2), B3 = new Boutonlettre(b3, 0,3), B4 = new Boutonlettre(b4, 0,4), B5 = new Boutonlettre(b5, 0,5), B6 = new Boutonlettre(b6, 0,6), B7 = new Boutonlettre(b7, 0,7), B8 = new Boutonlettre(b8, 0,8), B,br_1 = new Boutonlettre(br1, 0,0), br_2 = new Boutonlettre(br2, 0,0), br_3 = new Boutonlettre(br3, 0,0), br_4 = new Boutonlettre(br4, 0,0), br_5 = new Boutonlettre(br5, 0,5), br_6 = new Boutonlettre(br6, 0,6), br_7 = new Boutonlettre(br7, 0,7), br_8 = new Boutonlettre(br8, 0,8),br_;
    char c;
    ArrayAdapter<String> adapter;
    TableRow r;
    TextView TextViewScore,tv;
    String sbs,kilemet;
    private char reponseLettre[]={'\0','\0','\0','\0','\0','\0','\0','\0','\0','\0'};
    private char reponse[]={'\0','\0','\0','\0','\0','\0','\0','\0','\0','\0'};
    int h,counter1 = 40,s;
    ArrayList<Boutonlettre> blist = new ArrayList<Boutonlettre>();
    List<Character> listesreponse = new ArrayList<Character>();
    counter ct = new counter(41000, 1000);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18);
        Controle_activitee.getCa().setActivity18(this);
        /********/
        /*Intent ii=getIntent();
        if(ii.hasExtra("scorestring")){
            s=ii.getIntExtra("scorestring",0);
        }
        score=s;
*/
        ct.start();
        p=MediaPlayer.create(this,R.raw.son);
        P2=MediaPlayer.create(this,R.raw.son2);
        P2.start();
        r = findViewById(R.id.r33);
        bb8 = new Button(this);
        bb7 = new Button(this);
        bb6 = new Button(this);
        bb5 = new Button(this);
        bb4 = new Button(this);
        bb3 = new Button(this);
        bb2 = new Button(this);
        bb1 = new Button(this);
        bb1.setTextSize(23);
        bb2.setTextSize(23);
        bb3.setTextSize(23);
        bb4.setTextSize(23);
        bb5.setTextSize(23);
        bb6.setTextSize(23);
        bb7.setTextSize(23);
        bb8.setTextSize(23);
        B1.setOrdre(111);
        B2.setOrdre(222);
        B3.setOrdre(333);
        B4.setOrdre(444);
        B5.setOrdre(555);
        B6.setOrdre(666);
        B7.setOrdre(777);
        B8.setOrdre(888);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        tv=findViewById(R.id.tV);
        TextViewScore=findViewById(R.id.textView);
        TextViewScore.setText(Integer.toString(Score.getScore()));
        B1.setBut(b1);
        B2.setBut(b2);
        B3.setBut(b3);
        B4.setBut(b4);
        B5.setBut(b5);
        B6.setBut(b6);
        B7.setBut(b7);
        B8.setBut(b8);
        blist.add(B1);
        blist.add(B2);
        blist.add(B3);
        blist.add(B4);
        blist.add(B5);
        blist.add(B6);
        blist.add(B7);
        blist.add(B8);
      DatabaseAccess databaseAccess = DatabaseAccess.getInstance(this);
        databaseAccess.open();
        List<String> quotes = databaseAccess.getQuotes();
        databaseAccess.close();
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, quotes);
       /** h = new Random().nextInt(10);
        sbs = adapter.getItem(0);**/
        char mot[] = {'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
        for (int i = 0; i < 8; i++)
            mot[i] = ajouterChar();
        sbs = new String(mot);
        kilemet = sbs;
        int n = sbs.length(), i, j;
        sbs = brouiller(sbs);
        char tableauChar[] = sbs.toCharArray();
        for (int r = 0; r < sbs.length(); r++) {
            reponse[r] = tableauChar[r];
        }
        int g;
        for (g = sbs.length(); g < 10; g++) {
            reponse[g] = '\0';
        }
        //B = null;
        for (i = 0; i < n; i++) {
            for (j = 0; j < 8; j++) {
                int x = new Random().nextInt(8);
                B = blist.get(x);
                if (B.getIndice() == 0) {
                    break;
                }
            }

            if (i > 0 && B == null) break;
            c = sbs.charAt(i);
            B.getBut().setText(String.valueOf(c));
            B.setIndice(1);
            B.setLettre(c);
            int b = i + 1;
            B.setOrdre(b);
        }
        B = null;
        for (i = 0; i < 8 - n + 1; i++) {
            for (j = 0; j < 8; j++) {
                int x = new Random().nextInt(8);
                B = blist.get(x);
                if (B.getIndice() == 0) {
                    break;
                }
            }
            if (B == null) break;
            if (B.getIndice() == 0) {
                c = ajouterChar();
                B.getBut().setText(String.valueOf(c));
                B.setIndice(1);
                B.setOrdre(i + 1);
                B.setOrdre(n + i + 1);
                B.setLettre(c);
            }
        }
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int y = r.getChildCount();
                if (y == 1) {
                    r.removeViewAt(0);
                    listesreponse.remove(0);
                    Boutonlettre B_e, br_e;
                    br_e = BoutonActiver(bb1);
                    B_e = BouttonActiver(br_e);
                    br_e.setIndice_click(0);
                    B_e.setIndice_click(0);
                }
                else if(y==2){
                    r.removeView(bb2);
                    br_2.setIndice_click(0);
                    listesreponse.remove(1);
                    fonctionEffacer(br1, br2, br_1, br_2,bb1);
                }
                else if(y==3){
                    r.removeView(bb3);
                    br_3.setIndice_click(0);
                    listesreponse.remove(2);
                    fonctionEffacer(br1, br2, br_1, br_2,bb1);
                    fonctionEffacer(br2, br3, br_2, br_3,bb2);
                }
                else if(y==4){
                    r.removeView(bb4);
                    br_4.setIndice_click(0);
                    listesreponse.remove(3);
                    fonctionEffacer(br1, br2, br_1, br_2,bb1);
                    fonctionEffacer(br2, br3, br_2, br_3,bb2);
                    fonctionEffacer(br3, br4, br_3, br_4,bb3);
                }
                else if(y==5){
                    r.removeView(bb5);
                    br_5.setIndice_click(0);
                    listesreponse.remove(4);
                    fonctionEffacer(br1, br2, br_1, br_2,bb1);
                    fonctionEffacer(br2, br3, br_2, br_3,bb2);
                    fonctionEffacer(br3, br4, br_3, br_4,bb3);
                    fonctionEffacer(br4, br5, br_4, br_5,bb4);
                }
                else if(y==6){
                    r.removeView(bb6);
                    br_6.setIndice_click(0);
                    listesreponse.remove(5);
                    fonctionEffacer(br1, br2, br_1, br_2,bb1);
                    fonctionEffacer(br2, br3, br_2, br_3,bb2);
                    fonctionEffacer(br3, br4, br_3, br_4,bb3);
                    fonctionEffacer(br4, br5, br_4, br_5,bb4);
                    fonctionEffacer(br5, br6, br_5, br_6,bb5);
                }
                else if(y==7){
                    r.removeView(bb7);
                    br_7.setIndice_click(0);
                    listesreponse.remove(6);
                    fonctionEffacer(br1, br2, br_1, br_2,bb1);
                    fonctionEffacer(br2, br3, br_2, br_3,bb2);
                    fonctionEffacer(br3, br4, br_3, br_4,bb3);
                    fonctionEffacer(br4, br5, br_4, br_5,bb4);
                    fonctionEffacer(br5, br6, br_5, br_6,bb5);
                    fonctionEffacer(br6, br7, br_6, br_7,bb6);
                }
                else{
                    r.removeView(bb8);
                    br_8.setIndice_click(0);
                    listesreponse.remove(7);
                    fonctionEffacer(br1, br2, br_1, br_2,bb1);
                    fonctionEffacer(br2, br3, br_2, br_3,bb2);
                    fonctionEffacer(br3, br4, br_3, br_4,bb3);
                    fonctionEffacer(br4, br5, br_4, br_5,bb4);
                    fonctionEffacer(br5, br6, br_5, br_6,bb5);
                    fonctionEffacer(br6, br7, br_6, br_7,bb6);
                    fonctionEffacer(br7, br8, br_7, br_8,bb7);
                }
            }
        });
    }
    public void valider(View view) {
        char c[]= kilemet.toCharArray();
        int b=0;
        int i;
        String reponse=listesreponse.toString();
        for(i=0;i<adapter.getCount();i++)
        {
          if(reponse.equals(adapter.getItem(i)))
          {
              b=1;
              break;
          }
        }
        if(b==1)
        {
            //***
            Score.setScore(Score.getScore()+reponse.length());
            P2.stop();
            p.stop();
            finish();
            Controle_activitee.getCa().terminerActivitees();
            Intent  i1= new Intent(Main18Activity.this, Main19Activity.class);
            startActivity(i1);
            counter1=-1;
        }
        else{
            P2.stop();
            p.stop();
            finish();
            counter1=-1;
            Controle_activitee.getCa().terminerActivitees();
            Intent  i3= new Intent(Main18Activity.this, Main20Activity.class);
            startActivity(i3);
        }
        /**
        if(reponse.equals(adapter.getItem(i)))
        {
            Score.setScore(Score.getScore()+10);
            P2.stop();
            p.stop();
            finish();
            Controle_activitee.getCa().terminerActivitees();
            Intent  i1= new Intent(Main18Activity.this, Main19Activity.class);
            startActivity(i1);
            counter1=-1;
        }
        else{
            P2.stop();
            p.stop();
            finish();
            counter1=-1;
            Controle_activitee.getCa().terminerActivitees();
            Intent  i3= new Intent(Main18Activity.this, Main20Activity.class);
            startActivity(i3);
        }**/
        /**
        for(i=0;i<listesreponse.size();i++){
            if(c[i]==listesreponse.get(i)) ;
            else break;
        }
        if(i==c.length && counter1>0) {
            Score.setScore(Score.getScore()+10);
            P2.stop();
            p.stop();
            finish();
            Controle_activitee.getCa().terminerActivitees();
            Intent  i1= new Intent(Main18Activity.this, Main19Activity.class);
            startActivity(i1);
            counter1=-1;
        }
        else
        {
            P2.stop();
            p.stop();
            finish();
            counter1=-1;
            Controle_activitee.getCa().terminerActivitees();
            Intent  i3= new Intent(Main18Activity.this, Main20Activity.class);
            startActivity(i3);
        }**/
    }
    class counter extends CountDownTimer {
        public counter(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }
        @Override
        public void onTick(long millisUntilFinished){
            tv.setText(String.valueOf(counter1));
            counter1--;
            if(counter1==11)
                P2.pause();
            if(counter1==10)
                p.start();
            if(counter1==0){
                // ct.onFinish();
                P2.stop();
                p.stop();
                finish();
                Controle_activitee.getCa().terminerActivitees();
                Intent  i3= new Intent(Main18Activity.this, Main20Activity.class);
                startActivity(i3);
            }
        }
        @Override
        public void onFinish(){
            tv.setText("done");
        }
    }
    public char ajouterChar() {
        char c = '\0';
        char[] tabChar = {'ي','م','ب','ب', 'ؤ', 'ئ','ب', 'ى', 'ص', 'ي', 'ط','م', 'ظ', 'ع', 'غ','ب', 'ف','م','ي', 'ق', 'ك', 'ل','ي','ن','ا', 'ه', 'و','ب','ر', 'ي', 'ء', 'ا', 'أ', 'إ', 'ر', 'ة', 'ض','ي', 'ث', 'ا', 'ج','ر','ح', 'خ', 'د', 'ذ', 'ز','ب', 'ر','م', 'ت', 'ا'};
        int x = new Random().nextInt(52);
        c = tabChar[x];
        return c;
    }
    public static String brouiller(String texte) {
        final int nbrMots = texte.split(" ").length;
        String nouveau = "";
        for (int mot = 0; mot < nbrMots; mot++) {
            char[] car = texte.split(" ")[mot].toCharArray();
            for (int i = 1; i < car.length * 2; i++) {
                int id1 = (int) (Math.random() * (car.length - 1));
                int id2 = (int) (Math.random() * (car.length - 1));
                char tmp = car[id1];
                car[id1] = car[id2];
                car[id2] = tmp;
            }
            for (char c : car) nouveau += c;
            if (mot < nbrMots - 1) nouveau += " ";
        }
        return nouveau;
    }
    public void bouton1(View view) {
        int v=r.getChildCount();
        if(v==0) {
            click(b1, B1, bb1);
        }
        else if(v==1)
            click(b1, B1, bb2);
        else if(v==2) {
            click(b1, B1, bb3);
        }
        else if(v==3) {
            click(b1, B1, bb4);
        }
        else if(v==4) {
            click(b1, B1, bb5);
        }
        else if(v==5) {
            click(b1, B1, bb6);
        }
        else  if(v==6) {
            click(b1, B1, bb7);
        }
        else  if(v==7) {
            click(b1, B1, bb8);
        }
    }
    public void bouton2(View view) {
        int v=r.getChildCount();
        if(v==0) {
            click(b2, B2, bb1);}
        else if(v==1) {
            click(b2, B2, bb2);}
        else if(v==2)
            click(b2,B2,bb3);
        else if(v==3)
            click(b2,B2,bb4);
        else if(v==4)
            click(b2,B2,bb5);
        else if(v==5)
            click(b2,B2,bb6);
        else  if(v==6)
            click(b2,B2,bb7);
        else  if(v==7)
            click(b2,B2,bb8);
    }
    public void bouton3(View view) {
        int v=r.getChildCount();
        if(v==0)
            click(b3,B3,bb1);
        else if(v==1)
            click(b3,B3,bb2);
        else if(v==2)
            click(b3,B3,bb3);
        else if(v==3)
            click(b3,B3,bb4);
        else if(v==4)
            click(b3,B3,bb5);
        else if(v==5)
            click(b3,B3,bb6);
        else  if(v==6)
            click(b3,B3,bb7);
        else  if(v==7)
            click(b3,B3,bb8);
    }
    public void bouton4(View view) {
        int v=r.getChildCount();
        if(v==0)
            click(b4,B4,bb1);
        else if(v==1)
            click(b4,B4,bb2);
        else if(v==2)
            click(b4,B4,bb3);
        else if(v==3)
            click(b4,B4,bb4);
        else if(v==4)
            click(b4,B4,bb5);
        else if(v==5)
            click(b4,B4,bb6);
        else  if(v==6)
            click(b4,B4,bb7);
        else  if(v==7)
            click(b4,B4,bb8);
    }
    public void bouton5(View view) {
        int v=r.getChildCount();
        if(v==0)
            click(b5,B5,bb1);
        else if(v==1)
            click(b5,B5,bb2);
        else if(v==2)
            click(b5,B5,bb3);
        else if(v==3)
            click(b5,B5,bb4);
        else if(v==4)
            click(b5,B5,bb5);
        else if(v==5)
            click(b5,B5,bb6);
        else  if(v==6)
            click(b5,B5,bb7);
        else  if(v==7)
            click(b5,B5,bb8);
    }
    public void bouton6(View view) {
        int v=r.getChildCount();
        if(v==0)
            click(b6,B6,bb1);
        else if(v==1)
            click(b6,B6,bb2);
        else if(v==2)
            click(b6,B6,bb3);
        else if(v==3)
            click(b6,B6,bb4);
        else if(v==4)
            click(b6,B6,bb5);
        else if(v==5)
            click(b6,B6,bb6);
        else  if(v==6)
            click(b6,B6,bb7);
        else  if(v==7)
            click(b6,B6,bb8);
    }
    public void bouton7(View view) {
        int v=r.getChildCount();
        if(v==0)
            click(b7,B7,bb1);
        else if(v==1)
            click(b7,B7,bb2);
        else if(v==2)
            click(b7,B7,bb3);
        else if(v==3)
            click(b7,B7,bb4);
        else if(v==4)
            click(b7,B7,bb5);
        else if(v==5)
            click(b7,B7,bb6);
        else  if(v==6)
            click(b7,B7,bb7);
        else  if(v==7)
            click(b7,B7,bb8);
    }
    public void bouton8(View view) {
        int v=r.getChildCount();
        if(v==0)
            click(b8,B8,bb1);
        else if(v==1)
            click(b8,B8,bb2);
        else if(v==2)
            click(b8,B8,bb3);
        else if(v==3)
            click(b8,B8,bb4);
        else if(v==4)
            click(b8,B8,bb5);
        else if(v==5)
            click(b8,B8,bb6);
        else  if(v==6)
            click(b8,B8,bb7);
        else  if(v==7)
            click(b8,B8,bb8);
    }
    public void click(Button b,Boutonlettre B,Button baff)
    {
        if(B.getIndice_click()==0) {
            listesreponse.add(B.getLettre());
            r.addView(baff);
            TableRow.LayoutParams p=(TableRow.LayoutParams)baff.getLayoutParams();
            p.width=(getResources().getDisplayMetrics().widthPixels)/9;
            if (br_1.getIndice_click() == 0) {
                br1=baff;
                baff=br1;
                br_1.setBut(br1);
                br1.setText(b.getText());
                br_1.setLettre(B.getLettre());
                br_1.setIndice_click(1);
                B.setIndice_click(1);
                br_1.setButtonReponse(baff);
                br_1.setBoutonCliquee(B);
                reponseLettre[0]=B.getLettre();

            } else if (br_2.getIndice_click() == 0 && br_1.getIndice_click() == 1) {
                br2=baff;
                fonction(br1,br2,br_1,br_2,baff,B,b);
            } else if (br_3.getIndice_click() == 0 && br_2.getIndice_click() == 1) {
                br3=baff;
                fonction(br2,br3,br_2,br_3,baff,B,b);
                fonction(br1,br2,br_1,br_2,baff,B,b);

            } else if (br_4.getIndice_click() == 0 && br_3.getIndice_click() == 1) {
                br4=baff;
                fonction(br3,br4,br_3,br_4,baff,B,b);
                fonction(br2,br3,br_2,br_3,baff,B,b);
                fonction(br1,br2,br_1,br_2,baff,B,b);
            } else if (br_5.getIndice_click() == 0 && br_4.getIndice_click() == 1) {
                br5=baff;
                fonction(br4,br5,br_4,br_5,baff,B,b);
                fonction(br3,br4,br_3,br_4,baff,B,b);
                fonction(br2,br3,br_2,br_3,baff,B,b);
                fonction(br1,br2,br_1,br_2,baff,B,b);
            } else if (br_6.getIndice_click() == 0 && br_5.getIndice_click() == 1) {
                br6=baff;
                fonction(br5,br6,br_5,br_6,baff,B,b);
                fonction(br4,br5,br_4,br_5,baff,B,b);
                fonction(br3,br4,br_3,br_4,baff,B,b);
                fonction(br2,br3,br_2,br_3,baff,B,b);
                fonction(br1,br2,br_1,br_2,baff,B,b);
            } else if (br_7.getIndice_click() == 0 && br_6.getIndice_click() == 1) {
                br7=baff;
                fonction(br6,br7,br_6,br_7,baff,B,b);
                fonction(br5,br6,br_5,br_6,baff,B,b);
                fonction(br4,br5,br_4,br_5,baff,B,b);
                fonction(br3,br4,br_3,br_4,baff,B,b);
                fonction(br2,br3,br_2,br_3,baff,B,b);
                fonction(br1,br2,br_1,br_2,baff,B,b);
            } else if (br_8.getIndice_click() == 0 && br_7.getIndice_click() == 1) {
                br8=baff;
                fonction(br7,br8,br_7,br_8,baff,B,b);
                fonction(br6,br7,br_6,br_7,baff,B,b);
                fonction(br5,br6,br_5,br_6,baff,B,b);
                fonction(br4,br5,br_4,br_5,baff,B,b);
                fonction(br3,br4,br_3,br_4,baff,B,b);
                fonction(br2,br3,br_2,br_3,baff,B,b);
                fonction(br1,br2,br_1,br_2,baff,B,b);
            }
        }
    }
    public void fonction(Button anc,Button nv,Boutonlettre anci,Boutonlettre nov,Button baff,Boutonlettre B,Button b){
        nov.setBut(nv);
        nv.setText(anc.getText());
        nov.setLettre(anci.getLettre());
        anci.setLettre(B.getLettre());
        anc.setText(b.getText());
        nov.setIndice_click(1);
        B.setIndice_click(1);
        nov.setButtonReponse(baff);
        nov.setBoutonCliquee(anci.getBoutonCliquee());
        anci.setBoutonCliquee(B);
    }
    public void fonctionEffacer(Button anc,Button nv,Boutonlettre anci,Boutonlettre nov,Button baff){
        anc.setText(nv.getText());
        anci.setLettre(nov.getLettre());
        //nov.setIndice_click(0);
        B=BouttonActiver(nov);
        B.setIndice_click(0);
        Boutonlettre B_8=BouttonActiver(anci);
        B_8.setIndice_click(0);
        anci.setButtonReponse(baff);
        anci.setBoutonCliquee(nov.getBoutonCliquee());
        anci.setBoutonCliquee(B);
    }
    public Boutonlettre BoutonActiver(Button baff){
        if(br_1.getButtonReponse()==baff)
            return br_1;
        else if(br_2.getButtonReponse()==baff)
            return br_2;
        else if(br_3.getButtonReponse()==baff)
            return br_3;
        else if(br_4.getButtonReponse()==baff)
            return br_4;
        else if(br_5.getButtonReponse()==baff)
            return br_5;
        else if(br_6.getButtonReponse()==baff)
            return br_6;
        else if(br_7.getButtonReponse()==baff)
            return br_7;
        else if(br_8.getButtonReponse()==baff)
            return br_8;
        else return null;
    }
    public Boutonlettre BouttonActiver(Boutonlettre br_){
        if(br_.getBoutonCliquee()==B1)
            return B1;
        else if(br_.getBoutonCliquee()==B2)
            return B2;
        else if(br_.getBoutonCliquee()==B3)
            return B3;
        else if(br_.getBoutonCliquee()==B4)
            return B4;
        else if(br_.getBoutonCliquee()==B5)
            return B5;
        else if(br_.getBoutonCliquee()==B6)
            return B6;
        else if(br_.getBoutonCliquee()==B7)
            return B7;
        else if(br_.getBoutonCliquee()==B8)
            return B8;
        else return null;
    }
    public void onBackPressed(){
        ct.cancel();
        Controle_activitee.getCa().terminerActivitees();
        finish();
        Intent i=new Intent(Main18Activity.this,Main2Activity.class);
        startActivity(i);
        P2.stop();
        p.stop();
        super.onBackPressed();
    }
}