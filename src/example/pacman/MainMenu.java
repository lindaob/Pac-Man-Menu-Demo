package example.pacman;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.graphics.drawable.AnimationDrawable;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class MainMenu extends Activity implements OnClickListener
{
	ImageView img;
	Button btn1;
	Button btn2;
	Button btn3;
	Button btn4;
	Button btn5;
	Button btn6;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);
		
		btn1 = (Button)findViewById(R.id.btn1);
		btn2 = (Button)findViewById(R.id.btn2);
		btn3 = (Button)findViewById(R.id.btn3);
		btn4 = (Button)findViewById(R.id.btn4);
		btn5 = (Button)findViewById(R.id.btn5);
		btn6 = (Button)findViewById(R.id.btn6);
		
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		btn3.setOnClickListener(this);
		btn4.setOnClickListener(this);
		btn5.setOnClickListener(this);
		btn6.setOnClickListener(this);
		
		img = (ImageView)findViewById(R.id.pacman);
		img.setBackgroundResource(R.drawable.pacman);

		 // Get the background, which has been compiled to an AnimationDrawable object.
		 AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();

		 // Start the animation (looped playback by default).
		 frameAnimation.start();
		
	}
	
	public void onClick(View v)
	{
		Button but = (Button)v;
		String pg = this.getString(R.string.btn1);
		String vo = this.getString(R.string.btn2);
		String fl = this.getString(R.string.btn3);
		String lb = this.getString(R.string.btn4);
		String po = this.getString(R.string.btn5);
		String ma = this.getString(R.string.btn6);
		
		if (but.getText().equals(pg)) 
		{
	    	Intent activity01 = new Intent("example.pacman.Play");
	    	startActivity(activity01);
		} 
		else if(but.getText().equals(vo)) 
		{
			Intent activity02 = new Intent("example.pacman.Offer");
			startActivity(activity02);
		}
		else if(but.getText().equals(fl))
		{
			Intent activity03 = new Intent("example.pacman.Location");
			startActivity(activity03);
		}
		else if(but.getText().equals(lb))
		{
			Intent activity04 = new Intent("example.pacman.Leader");
			startActivity(activity04);
		}
		else if(but.getText().equals(po))
		{
			Intent activity05 = new Intent("example.pacman.Offline");
			startActivity(activity05);
		}
		else if(but.getText().equals(ma))
		{
			Intent activity06 = new Intent("example.pacman.Account");
			startActivity(activity06);
		}

	}
}
