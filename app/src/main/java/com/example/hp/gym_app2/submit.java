package com.example.hp.gym_app2;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


@SuppressLint("NewApi")
public class submit extends Fragment {

	public submit() {}

	SQLiteDatabase sq;
	EditText NameEditText, AddressEditText, EmailEditText, MobileEditText;
	Button SaveButton;
	//the name which given to edittext n buttons that names should be given during findViewBy  (EditText,Button)


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		 View rootView = inflater.inflate(R.layout.submit, container, false);
		//rootview is obj name

		sq = getActivity().openOrCreateDatabase("ad", android.content.Context.MODE_PRIVATE, null);
		// android.content.Context is used with MODE_PRIVATE and ad is database's name
		sq.execSQL("create table if not exists user2(id integer PRIMARY KEY AUTOINCREMENT,name varchar,address varchar,email varchar,mobile varchar)");

		NameEditText = (EditText) rootView.findViewById(R.id.e1);
		AddressEditText=(EditText)rootView.findViewById(R.id.e2);
		EmailEditText = (EditText) rootView.findViewById(R.id.e3);
		MobileEditText = (EditText) rootView.findViewById(R.id.e4);
		SaveButton = (Button) rootView.findViewById(R.id.save);

		SaveButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				String Name = NameEditText.getText().toString(); //a's value is shown in the e1....
				String Address = AddressEditText.getText().toString();
				String Email = EmailEditText.getText().toString();
				String Mobile = MobileEditText.getText().toString();


				if (Name.length() == 0) {
					NameEditText.requestFocus();
					NameEditText.setError("field can't be empty");
				} else if (!Name.matches("[a-z A-Z]+")) {
					NameEditText.requestFocus();
					NameEditText.setError("enter only alphabetical characters");
				}


				if (Address.length() == 0) {
					AddressEditText.requestFocus();
					AddressEditText.setError("field can't be empty");
				} else if (!Name.matches("[a-z A-Z]+")) {
					AddressEditText.requestFocus();
					AddressEditText.setError("enter only alphabetical characters");
				}

				if (Email.length() == 0) {
					EmailEditText.requestFocus();
					EmailEditText.setError("field can't be empty");
				}

				if (Mobile.length() == 0) {
					MobileEditText.requestFocus();
					MobileEditText.setError("field can't be empty");
				}
				else {

					sq.execSQL("insert into user2(name,address,email,mobile) values('" + Name + "','" + Address + "','" + Email + "','" + Mobile + "')");
					Toast.makeText(getActivity(), "Form Filled", Toast.LENGTH_LONG).show();
				}
			}

		});

		Button a=(Button)rootView.findViewById(R.id.checkouts);
		a.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Fragment f = new checkouts();
				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				fm.beginTransaction().replace(R.id.frame_container, f).commit();
			}
		});


		return rootView;
	}
}