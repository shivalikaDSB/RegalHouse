package com.example.hp.gym_app2;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

@SuppressLint("NewApi")
public class magazines extends Fragment {

	public magazines()
	{
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.magazines, container, false);

		Button a1=(Button)rootView.findViewById(R.id.jan);
		//here jan is id of button in magazine.xml file
		a1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Fragment f = new jan();
				// here jan is xml class
				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				fm.beginTransaction().replace(R.id.frame_container, f).commit();
			}
		});

		Button b1=(Button)rootView.findViewById(R.id.feb);
		b1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Fragment f = new feb();
				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				fm.beginTransaction().replace(R.id.frame_container, f).commit();
			}
		});

		Button c1=(Button)rootView.findViewById(R.id.march);
		c1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Fragment f = new march();
				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				fm.beginTransaction().replace(R.id.frame_container, f).commit();
			}
		});

		Button d1=(Button)rootView.findViewById(R.id.april);
		d1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Fragment f = new april();
				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				fm.beginTransaction().replace(R.id.frame_container, f).commit();
			}
		});

		Button e1=(Button)rootView.findViewById(R.id.may);
		e1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Fragment f = new may();
				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				fm.beginTransaction().replace(R.id.frame_container, f).commit();
			}
		});

		Button f1=(Button)rootView.findViewById(R.id.june);
		f1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Fragment f = new june();
				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				fm.beginTransaction().replace(R.id.frame_container, f).commit();
			}
		});


		return rootView;
	}
}