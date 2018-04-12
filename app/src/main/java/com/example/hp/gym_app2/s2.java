package com.example.hp.gym_app2;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uncopt.android.widget.text.justify.JustifiedTextView;

@SuppressLint("NewApi")
public class s2 extends Fragment {

	public s2()
    {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.s2, container, false);


		JustifiedTextView myMsg = (JustifiedTextView)rootView.findViewById(R.id.t2);
		myMsg.setText("Cranking up the levels of testosterone within the body, XPI's Testosyn is formulated with 100% natural and powerful ingredients to build lean muscle, boost sex drive, and increase energy levels. Using a high-performance testosterone complex that contains D-Aspartic Acid, Fenusterols, and Tribulus Terrestris, this potent supplement will aid in the enhancement of each workout and promote free testosterone. Testosyn's ingredients have the ability to increase testosterone levels nearly twice as much as other products for more strength, mass, and sexual vigor.");


		return rootView;
	}
}