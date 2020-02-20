package com.example.guitartuner;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.ToggleButton;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

	
	ToggleButton tbtnE6;
	ToggleButton tbtnA;
	ToggleButton tbtnD;
	ToggleButton tbtnG;
	ToggleButton tbtnB;
	ToggleButton tbtnE1;
	
	ImageButton ibtnLoop;
	boolean loopIndicator;
	MediaPlayer mpGuitar;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = (TabHost)findViewById(R.id.tabhost);
        tabHost.setup();
        
        TabSpec spec1 = tabHost.newTabSpec("tab1");
        spec1.setIndicator("Accoustic");
        spec1.setContent(R.id.tab1);
        tabHost.addTab(spec1);
        
        TabSpec spec2 = tabHost.newTabSpec("tab2");
        spec2.setIndicator("Electric");
        spec2.setContent(R.id.tab2);
        tabHost.addTab(spec2);
        
        TabSpec spec3 = tabHost.newTabSpec("tab3");
        spec3.setIndicator("Bass");
        spec3.setContent(R.id.tab3);
        tabHost.addTab(spec3);
        
        tbtnE6=(ToggleButton)findViewById(R.id.toggleButtonE6);
        tbtnA=(ToggleButton)findViewById(R.id.toggleButtonA);
        tbtnD=(ToggleButton)findViewById(R.id.toggleButtonD);
        tbtnG=(ToggleButton)findViewById(R.id.toggleButtonG);
        tbtnB=(ToggleButton)findViewById(R.id.toggleButtonB);
        tbtnE1=(ToggleButton)findViewById(R.id.toggleButtonE1);
        
        ibtnLoop = (ImageButton)findViewById(R.id.imageButtonLoop);
        
        mpGuitar = new MediaPlayer();
        mpGuitar = MediaPlayer.create(this, R.raw.stringe6);
        
        loopIndicator=false;

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if(id == R.id.action_exit)
        {
        	super.finish();
        	return true;
        }
        
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

    public void onToggleE6Click(View v)
    {
    	mpGuitar.stop();
    	mpGuitar = MediaPlayer.create(this, R.raw.stringe6);
    	mpGuitar.setLooping(loopIndicator);
    	mpGuitar.start();
    	
    	tbtnE6.setChecked(true);
    	tbtnA.setChecked(false);
    	tbtnD.setChecked(false);
    	tbtnG.setChecked(false);
    	tbtnB.setChecked(false);
    	tbtnE1.setChecked(false);
    }
    
    public void onToggleAClick(View v)
    {
    	mpGuitar.stop();
    	mpGuitar = MediaPlayer.create(this, R.raw.stringa);
    	mpGuitar.setLooping(loopIndicator);
    	mpGuitar.start();
    	
    	tbtnE6.setChecked(false);
    	tbtnA.setChecked(true);
    	tbtnD.setChecked(false);
    	tbtnG.setChecked(false);
    	tbtnB.setChecked(false);
    	tbtnE1.setChecked(false);
    }
    
    public void onToggleDClick(View v)
    {
    	mpGuitar.stop();
    	mpGuitar = MediaPlayer.create(this, R.raw.stringd);
    	mpGuitar.setLooping(loopIndicator);
    	mpGuitar.start();
    	
    	tbtnE6.setChecked(false);
    	tbtnA.setChecked(false);
    	tbtnD.setChecked(true);
    	tbtnG.setChecked(false);
    	tbtnB.setChecked(false);
    	tbtnE1.setChecked(false);
    }
    
    public void onToggleGClick(View v)
    {
    	mpGuitar.stop();
    	mpGuitar = MediaPlayer.create(this, R.raw.stringg);
    	mpGuitar.setLooping(loopIndicator);
    	mpGuitar.start();
    	
    	tbtnE6.setChecked(false);
    	tbtnA.setChecked(false);
    	tbtnD.setChecked(false);
    	tbtnG.setChecked(true);
    	tbtnB.setChecked(false);
    	tbtnE1.setChecked(false);
    }
    
    public void onToggleBClick(View v)
    {
    	mpGuitar.stop();
    	mpGuitar = MediaPlayer.create(this, R.raw.stringb);
    	mpGuitar.setLooping(loopIndicator);
    	mpGuitar.start();
    	
    	tbtnE6.setChecked(false);
    	tbtnA.setChecked(false);
    	tbtnD.setChecked(false);
    	tbtnG.setChecked(false);
    	tbtnB.setChecked(true);
    	tbtnE1.setChecked(false);
    }
    
    public void onToggleE1Click(View v)
    {
    	mpGuitar.stop();
    	mpGuitar = MediaPlayer.create(this, R.raw.stringe1);
    	mpGuitar.setLooping(loopIndicator);
    	mpGuitar.start();
    	
    	tbtnE6.setChecked(false);
    	tbtnA.setChecked(false);
    	tbtnD.setChecked(false);
    	tbtnG.setChecked(false);
    	tbtnB.setChecked(false);
    	tbtnE1.setChecked(true);
    }
    
    public void onButtonLoopClick(View v)
    {
    	if(loopIndicator==true)
    	{
    		loopIndicator=false;
    		mpGuitar.stop();
    		ibtnLoop.setImageResource(R.drawable.ic_loop2);
    	}
    	else
    	{
    		loopIndicator=true;
    		ibtnLoop.setImageResource(R.drawable.ic_stop);
    	}
    }
    
}
