package edu.moranrvcu.onecheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.reimaginebanking.api.java.NessieClient;

// TO-DO

// Create some class that accepts user_id then starts
// collecting data

//
public class LoginActivity extends AppCompatActivity {

    // api key necessary for Nessie to work
    public static final String DEVELOPER_KEY = "b11fff90d50638a7e9edddc6e286dfa5";
    // for now we only have one dummy customer
    public static final String USER_ID = "56241a12de4bf40b17111f8d";
    NessieClient nessieClient = NessieClient.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nessieClient.setAPIKey(DEVELOPER_KEY);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
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

    /**
     *
     * @param view
     */
    public void login(View view) {
        Intent intent = new Intent(this, ItemActivity.class);
        startActivity(intent);
    }
}
