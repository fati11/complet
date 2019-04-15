package ma.gravenilvec.complet;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private Button button1,button2,button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Controle_activitee.getCa().setActivity2(this);
        button1=(Button)findViewById(R.id.button5);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Controle_activitee.getCa().terminerActivitees();
                Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(i);
            }
        });
        button2=(Button)findViewById(R.id.button6);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Controle_activitee.getCa().terminerActivitees();
                Intent i=new Intent(Main2Activity.this,Main9Activity.class);
                startActivity(i);
            }
        });
        button3=(Button)findViewById(R.id.button7);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Controle_activitee.getCa().terminerActivitees();
                Intent i=new Intent(Main2Activity.this,Main15Activity.class);
                startActivity(i);
            }
        });
    }
    public void onBackPressed(){
        finish();
        Controle_activitee.getCa().terminerActivitees();
        super.onBackPressed();
    }
}
