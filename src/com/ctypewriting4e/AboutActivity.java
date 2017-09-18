package com.ctypewriting4e;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class AboutActivity extends ActionBarActivity implements android.view.View.OnClickListener
{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
				
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
		switch (item.getItemId()){
		case R.id.action_main: 
			Intent intent = new Intent();
            intent.setClass(AboutActivity.this,MainActivity.class);
			startActivity(intent);
			AboutActivity.this.finish();	
			return true;
		case R.id.action_about:
			return true;
		}
		
		return super.onOptionsItemSelected(item);
	}


    @Override  
    public boolean onKeyDown(int keyCode, KeyEvent event){  
        // TODO Auto-generated method stub   
    	if((keyCode == KeyEvent.KEYCODE_BACK)&&(event.getAction() == KeyEvent.ACTION_DOWN))
    	{
    		Intent intent = new Intent();
            intent.setClass(AboutActivity.this,MainActivity.class);
    		startActivity(intent);
    		AboutActivity.this.finish();
 
    		return true;
    	}
    	return super.onKeyDown(keyCode, event);
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
	}  

}
