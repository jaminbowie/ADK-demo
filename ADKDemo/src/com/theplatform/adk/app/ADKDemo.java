package com.theplatform.adk.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Started 4/23/13 by Curtis Lee Fulton
 */
public class ADKDemo extends Activity
{
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final EditText enterUrl = (EditText) findViewById(R.id.edit_message);
        enterUrl.setSingleLine();

        //final Player player = new Player((ViewGroup)this.findViewById(R.id.tpPlayer));

        //final Activity activity = this;

        Button buttonSet = (Button) findViewById(R.id.button_set);
        buttonSet.setOnClickListener(
                new View.OnClickListener()
                {

                	@Override
                    public void onClick(View v)
                    {
                        /*try
                        {

                            URI uri = new URI(enterUrl.getText().toString());
                            player.playReleaseUrl(uri);
                            /*AlertDialog alertDialog = new AlertDialog.Builder(activity).create();
                            alertDialog.setTitle("THIS IS THE PLAY BUTTON!!!!");
                            alertDialog.setMessage("THIS IS THE PLAY BUTTON, IT MAKES IT PLAY. MUST MAKE THIS A NEW ACTIVITY TOO. THE SAME " +
                            		"AS THE OTHER ONE. THE LOAD ONE. THEY MUST BE THE SAME ACTIVITY. A NEW ONE.");
                            alertDialog.setCancelable(true);
                            alertDialog.show();
                        }
                        catch (URISyntaxException e)
                        {
                            AlertDialog alertDialog = new AlertDialog.Builder(activity).create();
                            alertDialog.setTitle("Invalid URL");
                            alertDialog.setMessage("You've entered an invalid URL");
                            alertDialog.setCancelable(true);
                            alertDialog.show();
                        }*/
                    	Intent i=new Intent(ADKDemo.this, PlayActivity.class);
                    	String destination=new String(enterUrl.getText().toString());
                    	i.putExtra(PlayActivity.EXTRA_DESTINATION, destination);
                    	startActivityForResult(i, 0);
                    }
                });


        Button buttonLoad = (Button) findViewById(R.id.button_load);
        buttonLoad.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        /*try
                        {
                            AlertDialog alertDialog = new AlertDialog.Builder(activity).create();
                            alertDialog.setTitle("THIS IS THE LOAD BUTON!!!!");
                            alertDialog.setMessage("THIS IS THE LOAD BUTTON, IT MAKES IT LOAD. MUST MAKE THIS A NEW ACTIVITY.");
                            alertDialog.setCancelable(true);
                            alertDialog.show();
                            URI uri = new URI(enterUrl.getText().toString());
                            player.loadReleaseUrl(uri);

                        }
                        catch (URISyntaxException e)
                        {
                            AlertDialog alertDialog = new AlertDialog.Builder(activity).create();
                            alertDialog.setTitle("Invalid URL");
                            alertDialog.setMessage("You've entered an invalid URL");
                            alertDialog.setCancelable(true);
                            alertDialog.show();
                        }*/
                    	Intent i=new Intent(ADKDemo.this, LoadActivity.class);
                    	String destination=new String(enterUrl.getText().toString());
                    	i.putExtra(LoadActivity.EXTRA_DESTINATION, destination);
                    	startActivityForResult(i,0);
                    }
                }
        );
    }
}
