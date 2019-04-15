package ma.gravenilvec.complet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        Controle_activitee.getCa().setActivity10(this);
    }

    public void next(View view) {
        Controle_activitee.getCa().terminerActivitees();
        Intent in=new Intent(Main10Activity.this,Main12Activity.class);
        startActivity(in);
        finish();
    }

    public void exit(View view) {
        Controle_activitee.getCa().terminerActivitees();
        Intent i=new Intent(Main10Activity.this,MainActivity.class);
        startActivity(i);
        finish();
    }
    public void onBackPressed(){
        finish();
        Controle_activitee.getCa().terminerActivitees();
        Intent i=new Intent(Main10Activity.this,Main2Activity.class);
        startActivity(i);
        //Intent i=new Intent(Main4Activity.this,MainActivity.class);
        //startActivity(i);
        super.onBackPressed();
    }

}
