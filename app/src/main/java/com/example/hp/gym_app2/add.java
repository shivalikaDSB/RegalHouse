package com.example.hp.gym_app2;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

@SuppressLint("NewApi")
public class add extends Fragment {

	public add()
	{
	}
	int sum=0;
	SQLiteDatabase sq;
	EditText idEditText, rateEditText, etotalEditText;
	TableLayout t;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.add, container, false);

		String id = getArguments().getString("id");
		String rate = getArguments().getString("rate");
		t=(TableLayout)rootView.findViewById(R.id.tb);
		//t is table layout and tb is id of table layout of add xml


		etotalEditText=(EditText)rootView.findViewById(R.id.etotal);
		//etotal is id of edittext n etotaledittext is the edittext that declared

		//Toast.makeText(getActivity(), "Text :"+id +rate , Toast.LENGTH_LONG).show();
		//used when display data as intent after select from the supplement's ADD Button

		sq = getActivity().openOrCreateDatabase("ad", android.content.Context.MODE_PRIVATE, null);
		// android.content.Context is used with MODE_PRIVATE and ad is database's name
		sq.execSQL("create table if not exists user1(id integer PRIMARY KEY AUTOINCREMENT,pid varchar,rate varchar)");

		//idEditText = (EditText) rootView.findViewById(R.id.ed2);
		//rateEditText = (EditText) rootView.findViewById(R.id.ed3);
		//ed2 & ed3 used when add data to db n in add xml file edittext was using

		sq.execSQL("insert into user1(pid,rate) values('" + id + "','" + rate + "')");
		Toast.makeText(getActivity(), "Form Filled", Toast.LENGTH_LONG).show();


		//cursor used to display data, on which data we clicked
		Cursor c=sq.rawQuery("select * from user1",null);
		c.moveToFirst();
		do{
			TableRow tr=new TableRow(getActivity());
			TextView tv1=new TextView(getActivity());
			tv1.setText(c.getString(0));
			TextView tv2=new TextView(getActivity());
			tv2.setText(c.getString(1));
			TextView tv3=new TextView(getActivity());
			int rate1=Integer.parseInt(c.getString(2));
			tv3.setText(String.valueOf(rate1));
			sum=sum+rate1;

			EditText etotal=new EditText(getActivity());
			//fetch value in etotal edittext and outer the loop get values.


			//TextView tv4=new TextView(getActivity());
			//tv4.setText(c.getString(3));


			tr.addView(tv1);
			tr.addView(tv2);
			tr.addView(tv3);

			//tr.addView(tv4);

			t.addView(tr);
		}
		while(c.moveToNext());

		etotalEditText.setText(String.valueOf(sum));
		//value get out of loop so it work one time total


		//submit button
		Button a=(Button)rootView.findViewById(R.id.submit);
		a.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Fragment f = new submit();
				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				fm.beginTransaction().replace(R.id.frame_container, f).commit();
			}
		});

	return rootView;
	}

}
