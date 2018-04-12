package com.example.hp.gym_app2;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uncopt.android.widget.text.justify.JustifiedTextView;

@SuppressLint("NewApi")
public class s3 extends Fragment {

	public s3()
    {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.s3, container, false);


		JustifiedTextView myMsg = (JustifiedTextView)rootView.findViewById(R.id.t2);
		myMsg.setText("Designed to intensify each workout with its explosive formula, Cellucor's C4 uses the most advanced NO3 technology in combination with premium ingredients to create a revolutionary preworkout supplement. With a new compound that fuses NO3 into Creatine Nitrate, this powerfully effective product will promote bigger muscle pumps, amplify energy levels, increase focus, and boost strength as well as endurance for the optimum workout every time. C4 is incredibly soluble allowing for better absorption and less side effects.");

		return rootView;
	}
}