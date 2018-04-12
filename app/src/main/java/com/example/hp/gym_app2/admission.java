package com.example.hp.gym_app2;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


@SuppressLint("NewApi")
public class admission extends Fragment  {

	public admission() {}

	SQLiteDatabase sq;
	EditText NameEditText, LastNameEditText, EmailEditText, QueryEditText;
	Button SaveButton;


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.admission, container, false);
		sq = getActivity().openOrCreateDatabase("ad", android.content.Context.MODE_PRIVATE, null);
		// android.content.Context is used with MODE_PRIVATE and ad is database's name
		sq.execSQL("create table if not exists user(id integer PRIMARY KEY AUTOINCREMENT,name varchar,lastname varchar,email varchar,queryfor varchar)");

		NameEditText = (EditText) rootView.findViewById(R.id.e1);
		LastNameEditText = (EditText) rootView.findViewById(R.id.e2);
		EmailEditText = (EditText) rootView.findViewById(R.id.e3);
		QueryEditText = (EditText) rootView.findViewById(R.id.e4);
		SaveButton = (Button) rootView.findViewById(R.id.b1);


		SaveButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				String Name = NameEditText.getText().toString(); //a's value is shown in the e1....
				String LastName = LastNameEditText.getText().toString();
				String Email = EmailEditText.getText().toString();
				String Query = QueryEditText.getText().toString();


				if (Name.length() == 0) {
					NameEditText.requestFocus();
					NameEditText.setError("field can't be empty");
				} else if (!Name.matches("[a-z A-Z]+")) {
					NameEditText.requestFocus();
					NameEditText.setError("enter only alphabetical characters");
				}


				if (LastName.length() == 0) {
					LastNameEditText.requestFocus();
					LastNameEditText.setError("field can't be empty");
				} else if (!Name.matches("[a-z A-Z]+")) {
					LastNameEditText.requestFocus();
					LastNameEditText.setError("enter only alphabetical characters");
				}

				if (Email.length() == 0) {
					EmailEditText.requestFocus();
					EmailEditText.setError("field can't be empty");
				}


				if (Query.length() == 0) {
					QueryEditText.requestFocus();
					QueryEditText.setError("field can't be empty");
				} else if (!Name.matches("[a-z A-Z]+")) {
					QueryEditText.requestFocus();
					QueryEditText.setError("enter only alphabetical characters");

				} else {

					sq.execSQL("insert into user(name,lastname,email,queryfor) values('" + Name + "','" + LastName + "','" + Email + "','" + Query + "')");
					Toast.makeText(getActivity(), "Form Filled", Toast.LENGTH_LONG).show();
				}
			}

		});
     return rootView;
	}
}