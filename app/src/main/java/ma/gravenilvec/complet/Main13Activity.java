package ma.gravenilvec.complet;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main13Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        Controle_activitee.getCa().setActivity13(this);
    }

    public void next(View view) {
        Controle_activitee.getCa().terminerActivitees();
        Intent in=new Intent(Main13Activity.this,Main9Activity.class);
        startActivity(in);
        //Controle_activitee.getCa().getActivity7().finish();
        finish();
    }

    public void exit(View view) {
        Controle_activitee.getCa().terminerActivitees();
        finish();
        Intent i=new Intent(Main13Activity.this,MainActivity.class);
        startActivity(i);
        //Controle_activitee.getCa().getActivity7().finish();
    }
    public void onBackPressed(){
        Controle_activitee.getCa().terminerActivitees();
        finish();
        Intent i=new Intent(Main13Activity.this,Main2Activity.class);
        startActivity(i);
        super.onBackPressed();
    }
}
