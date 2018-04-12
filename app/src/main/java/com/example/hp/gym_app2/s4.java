package com.example.hp.gym_app2;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uncopt.android.widget.text.justify.JustifiedTextView;

@SuppressLint("NewApi")
public class s4 extends Fragment {

	public s4()
    {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.s4, container, false);

		JustifiedTextView myMsg = (JustifiedTextView)rootView.findViewById(R.id.t2);
		myMsg.setText("Dymatize Nutrition maximizes the benefits of protein in ISO-100 through its use of hydrolyzed 100% whey protein isolate. Designed to increase the absorption of protein, this fast-acting protein provides the body with 25 grams of protein and 5.5 grams of BCAAs per serving with no gluten or lactose. With a formula that aids in the instantaneous delivery of effective and advanced protein forms straight to the muscle, ISO-100 is able to repair and build muscle faster resulting in the ability to reach fitness goals sooner rather than later.");

		return rootView;
	}
}