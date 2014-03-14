package com.theplatform.adk.app;

import java.net.URI;
import java.net.URISyntaxException;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.ViewGroup;

import com.theplatform.adk.Player;

public class LoadActivity extends Activity {
    
	public static final String EXTRA_DESTINATION="com.theplatform.adk.app.destination";
    private String mDestination;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_play);
		
        final Player player = new Player((ViewGroup)this.findViewById(R.id.tpPlayer));
        
        final Activity activity = this;
        

        mDestination=getIntent().getStringExtra(EXTRA_DESTINATION);

		try 
		{
			URI uri = new URI(mDestination);
			player.loadReleaseUrl(uri);
		} 
		
		catch (URISyntaxException e) 
		{
            AlertDialog alertDialog = new AlertDialog.Builder(activity).create();
            alertDialog.setTitle("Invalid URL");
            alertDialog.setMessage("You've entered an invalid URL");
            alertDialog.setCancelable(true);
            alertDialog.show();
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.play, menu);
		return true;
	}

}

