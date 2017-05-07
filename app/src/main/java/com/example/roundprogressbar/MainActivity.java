package com.example.roundprogressbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.circlepregress.R;

public class MainActivity extends Activity {
	private RoundProgressBar  mRoundProgressBar2 ;
	private int progress = 0;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cricle_progress);
		mRoundProgressBar2 = (RoundProgressBar) findViewById(R.id.roundProgressBar2);

		
		((Button)findViewById(R.id.button1)).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						while(progress <= 100){
							progress += 3;
							
							System.out.println(progress);
							mRoundProgressBar2.setProgress(progress);
							try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						
					}
				}).start();
			}
		});
		
	}


}
