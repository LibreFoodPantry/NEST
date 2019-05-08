package edu.ncc.nest.nestapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Inventory extends AppCompatActivity {

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

    /**
     * Richard Yam- My search result
     * 5.1.19
     * I had attempted to find example codes for scanners, as stated in my 5-15.
     *
     * I found this link about building a scanner app in five minutes.  However, it wasn't done in
     * Android Studios so I'm not sure I can get any ideas from this
     *
     * https://www.youtube.com/watch?v=QT7heo272ug
     *
     * Besides this, I currently haven't found any other ideas yet
     */
}
