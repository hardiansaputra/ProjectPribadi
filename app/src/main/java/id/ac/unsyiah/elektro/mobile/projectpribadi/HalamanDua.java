package id.ac.unsyiah.elektro.mobile.projectpribadi;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;


public class HalamanDua extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_dua);


/*
        Intent intent = getIntent();
        String pesan = intetHasil.getStringExtra("hasilStr");

        TextView Hasil = (TextView) findViewById(R.id.txtHasilHitung);
        Hasil.setText(hasilStr);
        */
    }
    public void onButtonClicked(View view){


        //String hasilStr = Integer.toString(hasil);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_halaman_dua, menu);
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
