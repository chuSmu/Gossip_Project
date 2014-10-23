package com.project.gossip;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void startNewGossip(View v) {
		setContentView(R.layout.new_gossip);
	}

	public void submitNewGossip(View v) {
		System.out.println("klappt");
		Emotion emotion = null;
		String text = null;
		TextView rec = (TextView) findViewById(R.id.editText1);
		//TextView emo = (TextView) findViewById(R.id.editText3);
		TextView tex = (TextView) findViewById(R.id.editText2);
		emotion = Emotion.GLUECKLICH;
		SQLStatement sql = new SQLStatement(
				"INSERT INTO `gossip`.`gossip`(`gossip_id`,`text`,`emotion`)VALUES (NULL , '"
						+ text + "', '" + emotion + "');");
		System.out.println("klappt");
		sql.run();
	}
}
