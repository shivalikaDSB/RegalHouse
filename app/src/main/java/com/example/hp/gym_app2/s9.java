package com.example.hp.gym_app2;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uncopt.android.widget.text.justify.JustifiedTextView;

@SuppressLint("NewApi")
public class s9 extends Fragment {

	public s9()
    {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.s9, container, false);


		JustifiedTextView myMsg = (JustifiedTextView)rootView.findViewById(R.id.t2);
		myMsg.setText("Formulated to be a preworkout accelerator, Purus Labs' NOXygen amplifies the flow of blood and oxygen without stimulant properties, creatine, or dye making it a perfect supplement to add to your daily routine. This complimentary supplement increases Nitric Oxide production resulting in a prolonged boost in the blood and continuous oxygen delivery which increases cell volume as water is transported throughout the body to the muscle for enhanced growth. Hydrate, strengthen, and lengthen endurance with NOXygen.");

		return rootView;
	}
}