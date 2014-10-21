package com.project.gossip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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

	}
}
