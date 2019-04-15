package ma.gravenilvec.complet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main5Activity extends AppCompatActivity {
    Boolean mContinue = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Controle_activitee.getCa().setActivity5(this);
    }

    public void next(View view) {
        Controle_activitee.getCa().terminerActivitees();
        Intent in = new Intent(Main5Activity.this, Main6Activity.class);
        startActivity(in);
        //Controle_activitee.getCa().getActivity5().finish();
        finish();
    }

    public void exit(View view) {
        Controle_activitee.getCa().terminerActivitees();
        // finish();
        Intent i = new Intent(Main5Activity.this, MainActivity.class);
        startActivity(i);
        //Controle_activitee.getCa().getActivity5().finish();
        finish();
    }

    public void onBackPressed() {
        Controle_activitee.getCa().terminerActivitees();
        finish();
        Intent i = new Intent(Main5Activity.this, Main2Activity.class);
        startActivity(i);
        //Intent i=new Intent(Main4Activity.this,MainActivity.class);
        //startActivity(i);
        super.onBackPressed();
    }
}