package com.example.hp.gym_app2;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uncopt.android.widget.text.justify.JustifiedTextView;

@SuppressLint("NewApi")
public class s7 extends Fragment {

	public s7()
    {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.s7, container, false);


		JustifiedTextView myMsg = (JustifiedTextView)rootView.findViewById(R.id.t2);
		myMsg.setText("Specifically targeted to be used by natural bodybuilders and powerlifters, Universal Nutrition Animal M-Stak is the ideal supplement for hardgainers. Containing ingredients that help promote anabolism and prevent catabolism, Animal M-Stak is designed to naturally maximize the muscle mass building process. Optimize your performance and strength with Animal M-Stak.");

		return rootView;
	}
}