package com.ctypewriting4e;

import com.ctypewriting4e.R;

import android.support.v7.app.ActionBarActivity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;


public class MainActivity extends ActionBarActivity implements OnClickListener,android.view.View.OnClickListener
{

	int sft=0,i,len=0;
	long temptime=0;
	String ch[][]={{" ","a","b","c","d","e","f","g","h","i","j","k","l","m","n",
		"o","p","q","r","s","t","u","v","w","x","y","z","š","ž","õ","ä","ö","ü"}
      ,{" ","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q",
        "R","S","T","U","V","W","X","Y","Z","Š","Ž","Õ","Ä","Ö","Ü"}};
    String str="";
	TextView words;
	TextView word;
	Button btnch[]=new Button[33];

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		words = (TextView) findViewById(R.id.words);
	
		findViewById(R.id.btncpy).setOnClickListener(this);
		findViewById(R.id.btndel).setOnClickListener(this);
		findViewById(R.id.btnsft).setOnClickListener(this);
		findViewById(R.id.btnbs).setOnClickListener(this);
		findViewById(R.id.btnsp).setOnClickListener(this);
		(btnch[1]=(Button)findViewById(R.id.btna)).setOnClickListener(this);
		(btnch[2]=(Button)findViewById(R.id.btnb)).setOnClickListener(this);
		(btnch[3]=(Button)findViewById(R.id.btnc)).setOnClickListener(this);
		(btnch[4]=(Button)findViewById(R.id.btnd)).setOnClickListener(this);
		(btnch[5]=(Button)findViewById(R.id.btne)).setOnClickListener(this);
		(btnch[6]=(Button)findViewById(R.id.btnf)).setOnClickListener(this);
		(btnch[7]=(Button)findViewById(R.id.btng)).setOnClickListener(this);
		(btnch[8]=(Button)findViewById(R.id.btnh)).setOnClickListener(this);
		(btnch[9]=(Button)findViewById(R.id.btni)).setOnClickListener(this);
		(btnch[10]=(Button)findViewById(R.id.btnj)).setOnClickListener(this);
		(btnch[11]=(Button)findViewById(R.id.btnk)).setOnClickListener(this);
		(btnch[12]=(Button)findViewById(R.id.btnl)).setOnClickListener(this);
		(btnch[13]=(Button)findViewById(R.id.btnm)).setOnClickListener(this);
		(btnch[14]=(Button)findViewById(R.id.btnn)).setOnClickListener(this);
		(btnch[15]=(Button)findViewById(R.id.btno)).setOnClickListener(this);
		(btnch[16]=(Button)findViewById(R.id.btnp)).setOnClickListener(this);
		(btnch[17]=(Button)findViewById(R.id.btnq)).setOnClickListener(this);
		(btnch[18]=(Button)findViewById(R.id.btnr)).setOnClickListener(this);
		(btnch[19]=(Button)findViewById(R.id.btns)).setOnClickListener(this);
		(btnch[20]=(Button)findViewById(R.id.btnt)).setOnClickListener(this);
		(btnch[21]=(Button)findViewById(R.id.btnu)).setOnClickListener(this);
		(btnch[22]=(Button)findViewById(R.id.btnv)).setOnClickListener(this);
		(btnch[23]=(Button)findViewById(R.id.btnw)).setOnClickListener(this);
		(btnch[24]=(Button)findViewById(R.id.btnx)).setOnClickListener(this);
		(btnch[25]=(Button)findViewById(R.id.btny)).setOnClickListener(this);
		(btnch[26]=(Button)findViewById(R.id.btnz)).setOnClickListener(this);
		(btnch[27]=(Button)findViewById(R.id.btnsp1)).setOnClickListener(this);
		(btnch[28]=(Button)findViewById(R.id.btnsp2)).setOnClickListener(this);
		(btnch[29]=(Button)findViewById(R.id.btnsp3)).setOnClickListener(this);
		(btnch[30]=(Button)findViewById(R.id.btnsp4)).setOnClickListener(this);
		(btnch[31]=(Button)findViewById(R.id.btnsp5)).setOnClickListener(this);
		(btnch[32]=(Button)findViewById(R.id.btnsp6)).setOnClickListener(this);

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
//		case R.id.action_settings: return true;
		case R.id.action_main: 
			return true;
		case R.id.action_about:
			Intent intent = new Intent();
            intent.setClass(MainActivity.this,AboutActivity.class);
			startActivity(intent);
			MainActivity.this.finish();
	
			return true;
		}
		
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(DialogInterface dialog, int which) {
		// TODO Auto-generated method stub
			
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		
		case R.id.btncpy:
			ClipboardManager clipboard = (ClipboardManager)
		    getSystemService(Context.CLIPBOARD_SERVICE);
		    ClipData clip = ClipData.newPlainText(str,str);
		    clipboard.setPrimaryClip(clip);
		    
  			System.out.println(Toast.LENGTH_LONG);  
  			if (str.length()>0)
  				Toast.makeText(this, "Copy Succeed", Toast.LENGTH_LONG).show();
  			else
  				{
  				Toast.makeText(this, "Nothing Got", Toast.LENGTH_LONG).show();
  				return;
  				}

		    break;
		case R.id.btndel: 
			words.getPaint().setFlags(0); 
			words.setText(getString(R.string.hello_world).toString());              
			str="";              
			return;
		case R.id.btnsft:
			sft=1-sft;
		    for (i=1;i<33;i++)
		    	btnch[i].setText(ch[sft][i]);
		    if (sft==1)
		    	((Button)v).setTextColor(Color.rgb(255,0,0));
		    else ((Button)v).setTextColor(Color.rgb(0,0,0));
		    break;
		case R.id.btnbs:
			if (str.length()>0)
				str=str.substring(0,str.length()-1);
		    break;
		case R.id.btnsp:
			str=str+' '; 
			break;
	    default: str=str+((Button)v).getText();

		}
        
		words.getPaint().setFlags(Paint. UNDERLINE_TEXT_FLAG );
		words.setText(str);
		
	}
	

    @Override  
    public boolean onKeyDown(int keyCode, KeyEvent event){  
        // TODO Auto-generated method stub   
    	if((keyCode == KeyEvent.KEYCODE_BACK)&&(event.getAction() == KeyEvent.ACTION_DOWN))
    	{
    		if(System.currentTimeMillis() - temptime >2000)
    		{
    			System.out.println(Toast.LENGTH_LONG);  
                Toast.makeText(this, "Press again to exit", Toast.LENGTH_LONG).show();  
                temptime = System.currentTimeMillis();
            }
    		  else
    	      {
    		  	  finish();   
                  System.exit(0);
              }
    		return true;
    	}
    	return super.onKeyDown(keyCode, event);
    }  

}



