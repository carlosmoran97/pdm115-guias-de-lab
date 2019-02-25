package sv.ues.fia.eisi.mc16006;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import sv.ues.fia.eisi.mc16006.Metodos;

public class MainActivity extends AppCompatActivity {

    Button btnEjecutarMetodo1;
    Button btnEjecutarMetodo2;
    Button btnEjecutarMetodo3;
    TextView lblEtiqueta;
    EditText edtParametro1;
    EditText edtParametro2;
    EditText edtParametro3;
    String sumastr, restastr, multstr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        btnEjecutarMetodo1 = (Button) findViewById(R.id.button);
        btnEjecutarMetodo1.setOnClickListener(onclick);
        btnEjecutarMetodo2 = (Button) findViewById(R.id.button2);
        btnEjecutarMetodo2.setOnClickListener(onclick);
        btnEjecutarMetodo3 = (Button) findViewById(R.id.button3);
        btnEjecutarMetodo3.setOnClickListener(onclick);

        lblEtiqueta = (TextView) findViewById(R.id.textView);

        edtParametro1 = (EditText) findViewById(R.id.editText);
        edtParametro2 = (EditText) findViewById(R.id.editText2);
        edtParametro3 = (EditText) findViewById(R.id.editText3);
    }

    View.OnClickListener onclick = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            int numint1, numint2, numint3;
            float numfloat1, numfloat2;
            switch (v.getId()){
                case R.id.button:
                    numfloat1 = (float) Float.valueOf(edtParametro1.getText().toString());
                    numfloat2 = (float) Float.valueOf(edtParametro2.getText().toString());
                    sumastr = Metodos.suma(numfloat1, numfloat2);
                    lblEtiqueta.setText(sumastr);
                    break;
                case R.id.button2:
                    numfloat1 = (float) Float.valueOf(edtParametro1.getText().toString());
                    numfloat2 = (float) Float.valueOf(edtParametro2.getText().toString());
                    restastr = Metodos.resta(numfloat1, numfloat2);
                    lblEtiqueta.setText(restastr);
                    break;
                case R.id.button3:
                    numfloat1 = (int) Integer.valueOf(edtParametro1.getText().toString());
                    numfloat2 = (int) Integer.valueOf(edtParametro2.getText().toString());
                    multstr = Metodos.mult(numfloat1, numfloat2);
                    lblEtiqueta.setText(multstr);
                    break;
            }
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
