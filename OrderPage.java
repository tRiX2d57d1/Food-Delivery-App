MainActivity.java:
package com.example.delish2go;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class OrderPage extends Activity {
	Button b,b1,b2;
	int counter=0;
	TextView showvalue;
	
	
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_order_page);
		b = (Button) findViewById(R.id.button1);
		b1 = (Button) findViewById(R.id.button2);
		b2 = (Button) findViewById(R.id.button3);
		showvalue = (TextView) findViewById(R.id.textView1);
		b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(OrderPage.this,PaymentPage.class);
				startActivity(i);
			}
		});
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter++;
				showvalue.setText(Integer.toString(counter));
			}
		});
		b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			counter--;
			showvalue.setText(Integer.toString(counter));
			}
		});
		
	}
	

}

ActivityMain.XML:

<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingBottom="@dimen/activity_vertical_margin"
    android:paddingLeft="@dimen/activity_horizontal_margin"
    android:background="#FFF0F5"
    android:paddingRight="@dimen/activity_horizontal_margin"
    android:paddingTop="@dimen/activity_vertical_margin"
    tools:context="com.example.app.MainActivity" >

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical" >

        <ScrollView
            android:id="@+id/scrollView1"
            android:layout_width="match_parent"
            android:layout_height="wrap_content" >

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:orientation="vertical" >

                <ImageView
                    android:id="@+id/imageView1"
                    android:layout_width="fill_parent"
                    android:layout_height="200dp"
                    android:src="@drawable/bir1" />

                <CheckBox
                    android:id="@+id/checkBox2"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="Chicken Biriyani        -Rs.220/-" 
                    android:textColor="#CD5C5C"
                    android:textStyle="italic"
                    android:fontFamily="sans-serif-light"/>

                <ImageView
                    android:id="@+id/imageView2"
                    android:layout_width="fill_parent"
                    android:layout_height="200dp"
                    android:src="@drawable/bir2" />

                <CheckBox
                    android:id="@+id/checkBox3"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="Mutton Biriyani          -Rs.240/-" 
                    android:textColor="#CD5C5C"
                    android:textStyle="italic"
                    android:fontFamily="sans-serif-light"/>

                <ImageView
                    android:id="@+id/imageView3"
                    android:layout_width="fill_parent"
                    android:layout_height="200dp"
                    android:src="@drawable/cheese" />

                <CheckBox
                    android:id="@+id/checkBox4"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="Cheesy Chicken Burger     -Rs.145/-" 
                    android:textColor="#CD5C5C"
                    android:textStyle="italic"
                    android:fontFamily="sans-serif-light"/>

                <ImageView
                    android:id="@+id/imageView4"
                    android:layout_width="fill_parent"
                    android:layout_height="200dp"
                    android:src="@drawable/pic5" />

                <CheckBox
                    android:id="@+id/checkBox5"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="Cheese Burst Pizza        -Rs.550/-" 
                    android:textColor="#CD5C5C"
                    android:textStyle="italic"
                    android:fontFamily="sans-serif-light"/>

                <ImageView
                    android:id="@+id/imageView5"
                    android:layout_width="fill_parent"
                    android:layout_height="200dp"
                    android:src="@drawable/chococupcake" />

                <CheckBox
                    android:id="@+id/checkBox6"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="Chocolate Cupcake         -Rs.120/-"
                    android:textColor="#CD5C5C"
                    android:textStyle="italic"
                    android:fontFamily="sans-serif-light" />

                <HorizontalScrollView
                    android:id="@+id/horizontalScrollView1"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content" >

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="match_parent"
                        android:orientation="horizontal" >

                        <ImageView
                            android:id="@+id/imageView12"
                            android:layout_width="fill_parent"
                            android:layout_height="200dp"
                            android:src="@drawable/churros" />

                        <ImageView
                            android:id="@+id/imageView11"
                            android:layout_width="fill_parent"
                            android:layout_height="200dp"
                            android:src="@drawable/combo4" />

                        <ImageView
                            android:id="@+id/imageView10"
                            android:layout_width="fill_parent"
                            android:layout_height="200dp"
                            android:src="@drawable/combo3" />

                        <ImageView
                            android:id="@+id/imageView9"
                            android:layout_width="fill_parent"
                            android:layout_height="200dp"
                            android:src="@drawable/combo2" />

                        <ImageView
                            android:id="@+id/imageView8"
                            android:layout_width="fill_parent"
                            android:layout_height="200dp"
                            android:src="@drawable/combo1" />

                    </LinearLayout>
                </HorizontalScrollView>

                <TableRow
                    android:id="@+id/tableRow1"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content" >

                    <Button
                        android:id="@+id/button2"
                        style="?android:attr/buttonStyleSmall"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="+" />

                    <Button
                        android:id="@+id/button3"
                        style="?android:attr/buttonStyleSmall"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="-" />

                    <TextView
                        android:id="@+id/textView1"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="" />

                </TableRow>

                <Button
                    android:id="@+id/button1"
                    android:text="ORDER NOW"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center"
                    android:textStyle="italic"
                    android:fontFamily="sans-serif-light"
                    android:textColor="#CD5C5C"/>

            </LinearLayout>
        </ScrollView>

    </LinearLayout>

</ScrollView>
