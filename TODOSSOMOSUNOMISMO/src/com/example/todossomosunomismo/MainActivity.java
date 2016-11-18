package com.example.todossomosunomismo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.content.Intent;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void sig(View view){
		Intent x=new Intent(this,Segunda.class);
	
		startActivity(x);
	}
    
    public void sigui(View view){
	
		Intent x1=new Intent(this,Tercera.class);
		startActivity(x1);
	}
    public void leyes(View view){
    	
		Intent x2=new Intent(this,Ley.class);
		startActivity(x2);
	}
    public void centros(View view){
    	
		Intent x3=new Intent(this,Centros.class);
		startActivity(x3);
	}
 public void contacto(View view){
    	
		Intent x4=new Intent(this,Contacto.class);
		startActivity(x4);
	}
	public void reg(View view){
		Intent x4=new Intent(this,MainActivity.class);
		startActivity(x4);
	}
}
