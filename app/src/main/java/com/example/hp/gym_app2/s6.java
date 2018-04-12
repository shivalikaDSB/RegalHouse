package com.example.hp.gym_app2;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uncopt.android.widget.text.justify.JustifiedTextView;

@SuppressLint("NewApi")
public class s6 extends Fragment {

	public s6()
    {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.s6, container, false);


		JustifiedTextView myMsg = (JustifiedTextView)rootView.findViewById(R.id.t2);
		myMsg.setText("Boosting your workouts with an intra-workout catalyst, Scivation's XTEND holds a revolutionary formula that is both free of sugar and carbohydrates in a powerful BCAA drink mix. Using the 2:1:1 BCAA ratio with 7 grams in each serving, the advanced design of this supplement aids in the building of muscle, incinerating of fat, and shortening of recovery as well as hydrating of the body with a proprietary blend of electrolytes. XTEND encourages the optimal synthesizing of protein and fuels the body with energy for a power-filled workout.");

		return rootView;
	}
}