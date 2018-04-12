package com.example.hp.gym_app2;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uncopt.android.widget.text.justify.JustifiedTextView;

@SuppressLint("NewApi")
public class services extends Fragment {

	public services()
	{}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.services, container, false);

		JustifiedTextView myMsg = (JustifiedTextView)rootView.findViewById(R.id.t2);
		myMsg.setText(" Swimming Lessons.");

		JustifiedTextView myMsg1 = (JustifiedTextView)rootView.findViewById(R.id.t3);
		myMsg1.setText(" Squash and Tennis.");

		JustifiedTextView myMsg2 = (JustifiedTextView)rootView.findViewById(R.id.t4);
		myMsg2.setText(" Abseiling and Rock Climbing Walls.");

		JustifiedTextView myMsg3 = (JustifiedTextView)rootView.findViewById(R.id.t5);
		myMsg3.setText(" Volleyball, Badminton and Indoor Soccer.");

		JustifiedTextView myMsg4 = (JustifiedTextView)rootView.findViewById(R.id.t6);
		myMsg4.setText(" Cardio Classes, Yoga Classes, Dance Classes.");


		return rootView;
	}
}