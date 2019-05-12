package edu.ncc.nest.nestapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Inventory extends AppCompatActivity {

    private Button scanButton;

    @Override
    /**
     * onCreate method -
     * loads the 'activity_inventory layout' which has only a TextView as a placeholder for now
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        scanButton = findViewById(R.id.scanBtn);
        scanButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openScanner();
            }
        });
    }

    public void openScanner() {
        Intent intent = new Intent(this, Scan.class);
        startActivity(intent);
    }

    //implements the menu options for the toolbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId() == R.id.homeBtn){
            home();
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * home method - goes to the home screen
     */
    public void home(){
        Intent intent = new Intent(this, Choose.class);
        startActivity(intent);
    }
}
