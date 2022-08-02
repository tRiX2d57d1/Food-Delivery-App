MainActivity.java:
package com.example.delish2go;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PaymentPage extends Activity {
	Button b;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_payment_page);
		b = (Button) findViewById(R.id.button1);
		
	b.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "THANK YOU FOR ORDERING!", Toast.LENGTH_LONG).show();	
		}
	});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.payment_page, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}

ActivityMain.XML:

<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingBottom="@dimen/activity_vertical_margin"
    android:paddingLeft="@dimen/activity_horizontal_margin"
    android:paddingRight="@dimen/activity_horizontal_margin"
    android:paddingTop="@dimen/activity_vertical_margin"
    tools:context="com.example.delish2go.PaymentPage" >

    <TextView
        android:id="@+id/textView1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentTop="true"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="20dp"
        android:text="Choose Your Payment Method"
        android:textAppearance="?android:attr/textAppearanceLarge" />

    <RadioButton
        android:id="@+id/radioButton1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignBottom="@+id/imageView1"
        android:layout_alignRight="@+id/textView1"
        android:layout_marginBottom="23dp"
        android:layout_marginRight="21dp"
        android:text="Credit/Debit" 
        android:textStyle="italic"
                    android:fontFamily="sans-serif-light"
                    />

    <ImageView
        android:id="@+id/imageView2"
        android:layout_width="100dp"
        android:layout_height="100dp"
        android:layout_alignLeft="@+id/imageView1"
        android:layout_below="@+id/imageView1"
        android:src="@drawable/paypal" />

    <RadioButton
        android:id="@+id/radioButton2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignBottom="@+id/imageView2"
        android:layout_alignLeft="@+id/radioButton1"
        android:layout_marginBottom="30dp"
        android:text="Paypal"
        android:textStyle="italic"
                    android:fontFamily="sans-serif-light"
                     />

    <ImageView
        android:id="@+id/imageView3"
        android:layout_width="100dp"
        android:layout_height="100dp"
        android:layout_alignParentLeft="true"
        android:layout_below="@+id/imageView2"
        android:layout_marginTop="14dp"
        android:src="@drawable/cash" />

    <RadioButton
        android:id="@+id/radioButton3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignLeft="@+id/radioButton2"
        android:layout_alignTop="@+id/imageView3"
        android:layout_marginTop="30dp"
        android:text="Cash On Delivery"
        android:textStyle="italic"
                    android:fontFamily="sans-serif-light"
                     />

    <ImageView
        android:id="@+id/imageView1"
        android:layout_width="100dp"
        android:layout_height="100dp"
        android:layout_alignLeft="@+id/textView1"
        android:layout_below="@+id/textView1"
        android:src="@drawable/credit" />

    <Button
        android:id="@+id/button1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@+id/imageView3"
        android:layout_centerHorizontal="true"
        android:text="MAKE PAYMENT" 
        android:textStyle="italic"
                    android:fontFamily="sans-serif-light"
                    />

</RelativeLayout>
