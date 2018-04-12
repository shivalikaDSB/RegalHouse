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
import android.widget.ImageView;

@SuppressLint("NewApi")
public class supple extends Fragment {

	public supple()
	{}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.supple, container, false);

		((MainActivity) getActivity()).setTitleBar("Supplements");


		Button a1=(Button)rootView.findViewById(R.id.add1);
		a1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				Bundle bundle = new Bundle();
				bundle.putString("id", "1");
				bundle.putString("rate", "2500");
				//bundle used and in put string that text which we want to put in that new xml and
				//write this msg of put in new xml in getString method.

				Fragment f = new add();

				f.setArguments(bundle);
				//argunent pass in fragment

				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				fm.beginTransaction().replace(R.id.frame_container, f).commit();

			}
		});

		Button b1=(Button)rootView.findViewById(R.id.add2);
		b1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Bundle bundle = new Bundle();
				bundle.putString("id", "2");
				bundle.putString("rate", "5200");
				Fragment f = new add();
				f.setArguments(bundle);
				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				fm.beginTransaction().replace(R.id.frame_container, f).commit();
			}
		});
		Button c1=(Button)rootView.findViewById(R.id.add3);
		c1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Bundle bundle = new Bundle();
				bundle.putString("id", "3");
				bundle.putString("rate", "4500");
				Fragment f = new add();
				f.setArguments(bundle);
				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				fm.beginTransaction().replace(R.id.frame_container, f).commit();
			}
		});
		Button d1=(Button)rootView.findViewById(R.id.add4);
		d1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Bundle bundle = new Bundle();
				bundle.putString("id", "4");
				bundle.putString("rate", "3000");
				Fragment f = new add();
				f.setArguments(bundle);
				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				fm.beginTransaction().replace(R.id.frame_container, f).commit();
			}
		});
		Button e1=(Button)rootView.findViewById(R.id.add5);
		e1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Bundle bundle = new Bundle();
				bundle.putString("id", "5");
				bundle.putString("rate", "6000");
				Fragment f = new add();
				f.setArguments(bundle);
				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				fm.beginTransaction().replace(R.id.frame_container, f).commit();
			}
		});
		Button f1=(Button)rootView.findViewById(R.id.add6);
		f1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Bundle bundle = new Bundle();
				bundle.putString("id", "6");
				bundle.putString("rate", "5500");
				Fragment f = new add();
				f.setArguments(bundle);
				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				fm.beginTransaction().replace(R.id.frame_container, f).commit();
			}
		});
		Button g1=(Button)rootView.findViewById(R.id.add7);
		g1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Bundle bundle = new Bundle();
				bundle.putString("id", "7");
				bundle.putString("rate", "4700");
				Fragment f = new add();
				f.setArguments(bundle);
				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				fm.beginTransaction().replace(R.id.frame_container, f).commit();
			}
		});
		Button h1=(Button)rootView.findViewById(R.id.add8);
		h1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Bundle bundle = new Bundle();
				bundle.putString("id", "8");
				bundle.putString("rate", "3500");
				Fragment f = new add();
				f.setArguments(bundle);
				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				fm.beginTransaction().replace(R.id.frame_container, f).commit();
			}
		});
		Button i1=(Button)rootView.findViewById(R.id.add9);
		i1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Bundle bundle = new Bundle();
				bundle.putString("id", "9");
				bundle.putString("rate", "2500");
				Fragment f = new add();
				f.setArguments(bundle);
				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				fm.beginTransaction().replace(R.id.frame_container, f).commit();
			}
		});


		ImageView a=(ImageView)rootView.findViewById(R.id.image1);
		// ROOTVIEW should use instead view
		a.setOnClickListener(new View.OnClickListener() {
			//Fragment fragment = null;

			@Override
			public void onClick(View v) {
				Fragment f = new s1();
				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				fm.beginTransaction().replace(R.id.frame_container, f).commit();
			}
		});
		ImageView b=(ImageView)rootView.findViewById(R.id.image2);
		b.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Fragment f = new s2();
				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				fm.beginTransaction().replace(R.id.frame_container, f).commit();
			}
		});
		ImageView c=(ImageView)rootView.findViewById(R.id.image3);
		c.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Fragment f = new s3();
				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				fm.beginTransaction().replace(R.id.frame_container, f).commit();
			}
		});
		ImageView d=(ImageView)rootView.findViewById(R.id.image4);
		d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Fragment f = new s4();
				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				fm.beginTransaction().replace(R.id.frame_container, f).commit();
			}
		});
		ImageView e=(ImageView)rootView.findViewById(R.id.image5);
		e.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Fragment f = new s5();
				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				fm.beginTransaction().replace(R.id.frame_container, f).commit();
			}

		});
		ImageView f=(ImageView)rootView.findViewById(R.id.image6);
		f.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Fragment f = new s6();
				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				fm.beginTransaction().replace(R.id.frame_container, f).commit();
			}
		});
		ImageView g=(ImageView)rootView.findViewById(R.id.image7);
		g.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Fragment f = new s7();
				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				fm.beginTransaction().replace(R.id.frame_container, f).commit();
			}
		});
		ImageView h=(ImageView)rootView.findViewById(R.id.image8);
		h.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Fragment f = new s8();
				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				fm.beginTransaction().replace(R.id.frame_container, f).commit();
			}
		});
		ImageView i=(ImageView)rootView.findViewById(R.id.image9);
		i.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Fragment f = new s9();
				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				fm.beginTransaction().replace(R.id.frame_container, f).commit();
			}
		});

		//after error
		return rootView;
	}
}