package ma.gravenilvec.complet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main16Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);
        Controle_activitee.getCa().setActivity16(this);
    }

    public void next(View view) {
        Controle_activitee.getCa().terminerActivitees();
        Intent in = new Intent(Main16Activity.this, Main18Activity.class);
        startActivity(in);
        finish();
    }

    public void exit(View view) {
        Controle_activitee.getCa().terminerActivitees();
        Intent i = new Intent(Main16Activity.this, MainActivity.class);
        startActivity(i);
        finish();
    }

    public void onBackPressed() {
        Controle_activitee.getCa().terminerActivitees();
        finish();
        Intent i = new Intent(Main16Activity.this, Main2Activity.class);
        startActivity(i);
        //Intent i=new Intent(Main4Activity.this,MainActivity.class);
        //startActivity(i);
        super.onBackPressed();
    }
}