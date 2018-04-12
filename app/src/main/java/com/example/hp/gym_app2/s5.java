package com.example.hp.gym_app2;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uncopt.android.widget.text.justify.JustifiedTextView;

@SuppressLint("NewApi")
public class s5 extends Fragment {

	public s5()
    {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.s5, container, false);

		JustifiedTextView myMsg = (JustifiedTextView)rootView.findViewById(R.id.t2);
		myMsg.setText("Providing a clinically tested and highly concentrated training formula, GAT Nitraflex makes for potent bodybuilding supplement that boosts testosterone and provides your workout with energy. Designed to supply three times the strength of a regular bodybuilding supplement, this creatine free compound contains 325 mg of caffeine in each scoop to boost energy levels. Nitraflex also contains muscle building and testosterone enhancing ingredients for the insane pumps and strength you want during your workout.");

		return rootView;
	}
}