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
public class media extends Fragment {

	public media()
	{}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.media, container, false);
		//rootview is obj name


		Button a=(Button)rootView.findViewById(R.id.shows);
		a.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Fragment f = new shows();
				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				fm.beginTransaction().replace(R.id.frame_container, f).commit();
			}
		});

		Button b=(Button)rootView.findViewById(R.id.compe);
		b.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Fragment f = new competition();
				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				fm.beginTransaction().replace(R.id.frame_container, f).commit();
			}
		});

		Button c=(Button)rootView.findViewById(R.id.newsvideos);
		c.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Fragment f = new newsvideos();
				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				fm.beginTransaction().replace(R.id.frame_container, f).commit();
			}
		});

		Button d=(Button)rootView.findViewById(R.id.guest);
		d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Fragment f = new guestowner();
				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				fm.beginTransaction().replace(R.id.frame_container, f).commit();
			}
		});



		return rootView;
	}
}