package ma.gravenilvec.complet;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Controle_activitee.getCa().setActivity1(this);
        //instanciation de l objet
        button=(Button)findViewById(R.id.button2);
        //on crée le listner sur ce boutton
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //on crée un nouveau builder
                new AlertDialog.Builder(MainActivity.this)
                        //titre
                        .setTitle("لعبة الأرقام و الحروف:")
                        //message
                        .setMessage(getString(R.string.but))
                        //un boutton
                        .setNeutralButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "boutton de dialogue appuyé", Toast.LENGTH_LONG).show();
                            }
                        })
                        //on peut detecter une pression sur la touche back pour annuler
                        .setOnCancelListener(new DialogInterface.OnCancelListener() {
                            @Override
                            public void onCancel(DialogInterface dialogInterface) {
                                Toast.makeText(MainActivity.this, getString(R.string.cancel), Toast.LENGTH_LONG).show();
                            }
                        })
                        //ou un dismiss du dialogue
                        .setOnDismissListener(new DialogInterface.OnDismissListener() {
                            @Override
                            public void onDismiss(DialogInterface dialogInterface) {
                                Toast.makeText(MainActivity.this, getString(R.string.cancel), Toast.LENGTH_LONG).show();
                            }
                        })
                        //une icone
                        .setIcon(android.R.drawable.ic_dialog_info)
                        //et on l'affiche
                        .show();


            }
        });
        btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Controle_activitee.getCa().terminerActivitees();
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
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
