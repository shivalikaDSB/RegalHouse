package com.example.hp.gym_app2;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uncopt.android.widget.text.justify.JustifiedTextView;

@SuppressLint("NewApi")
public class s8 extends Fragment {

	public s8()
    {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.s8, container, false);


		JustifiedTextView myMsg = (JustifiedTextView)rootView.findViewById(R.id.t2);
		myMsg.setText("Transparent Labs' PreSeries Bulk is a top quality bodybuilding supplement that can provide optimal effects for serious athletes and bodybuilders who are ready to see real results. With a100% transparent label and an impressive combination of potent ingredients such as beta-alanine, caffeine, testosterone-supporting complex, and more, PreSeries Bulk delivers explosive power for more focus, strength, endurance, and muscle growth.");

		return rootView;
	}
}