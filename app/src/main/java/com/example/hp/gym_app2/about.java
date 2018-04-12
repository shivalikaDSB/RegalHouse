package com.example.hp.gym_app2;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uncopt.android.widget.text.justify.JustifiedTextView;

@SuppressLint("NewApi")
public class about extends Fragment {

	public about()
	//about is constructor
	{
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.about, container, false);

		JustifiedTextView myMsg = (JustifiedTextView)rootView.findViewById(R.id.t2);
		myMsg.setText("The Gym, established in 2008, is the first exclusive and supplement company providing you with the latest and best supplements from around the world to enable you to build a healthy and fit body.");
		//rootview is obj name


		return rootView;
	}
}