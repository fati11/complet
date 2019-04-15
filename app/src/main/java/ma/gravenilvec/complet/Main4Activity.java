package ma.gravenilvec.complet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Controle_activitee.getCa().setActivity4(this);
    }

    public void next(View view) {
        Controle_activitee.getCa().terminerActivitees();
        Intent in = new Intent(Main4Activity.this, Main6Activity.class);
        startActivity(in);
        finish();
    }

    public void exit(View view) {
        Controle_activitee.getCa().terminerActivitees();
        Intent i = new Intent(Main4Activity.this, MainActivity.class);
        startActivity(i);
        finish();
    }

    public void onBackPressed() {
        Controle_activitee.getCa().terminerActivitees();
        finish();
        Intent i = new Intent(Main4Activity.this, Main2Activity.class);
        startActivity(i);
        //Intent i=new Intent(Main4Activity.this,MainActivity.class);
        //startActivity(i);
        super.onBackPressed();
    }
}