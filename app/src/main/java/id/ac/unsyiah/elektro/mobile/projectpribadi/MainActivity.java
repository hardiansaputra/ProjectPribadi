package id.ac.unsyiah.elektro.mobile.projectpribadi;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;

import static android.support.v4.app.ActivityCompat.startActivity;

public class MainActivity extends ActionBarActivity {
    //Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


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
/*
    public void sendMessage(View view) {
        btnNext = (Button)findViewById(R.id.btnNext);
        btnNext.setOnClickListener (new View.OnClickListener(){
            Intent intentSend = new Intent(this, ActiDua.class);
            // EditText editText = (EditText) findViewById(R.id.txtText);
            //String pesanStr = editText.getText().toString();
            //intent.putExtra(EXTRA_MESSAGE, pesanStr);

            startActivity(intent);
        });

    }
    */

    public void onButtonClicked(View view){


        //String hasilStr = Integer.toString(hasil);

        Intent intent = new Intent(this, HalamanDua.class);
        startActivity(intent);

    }

}