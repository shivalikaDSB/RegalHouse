package com.example.hp.gym_app2;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uncopt.android.widget.text.justify.JustifiedTextView;

@SuppressLint("NewApi")
public class s1 extends Fragment {

	public s1()
    {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.s1, container, false);


		JustifiedTextView myMsg = (JustifiedTextView)rootView.findViewById(R.id.t2);
		myMsg.setText("As Optimum Nutrition's top-selling protein powder, Gold Standard 100% Whey provides the body with Whey Protein Isolate as it's primary ingredient along with the ultra-filtered Whey Protein Concentrate. Packing 24 grams of protein into each serving, this powerful formula is able to give the muscles the support they need to encourage growth and strength. Gold Standard 100% Whey also provides over 5 grams of BCAAs as well as more than 4 grams of Glutamine and Glutamic Acid for every serving since they are building block for proteins and aid in the building of muscle.");


        return rootView;
	}
}