package com.modul2.auliaravi.auliaravi_1202150037_modul2;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.widget.DatePicker;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Calendar;

public class DatePickerFragment extends DialogFragment
implements DatePickerDialog.OnDateSetListener {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            //digunakan untuk mengambil tanggal, bulan dan tahun
            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            // Create a new instance of DatePickerDialog and return it.
            return new DatePickerDialog(getActivity(), this, year, month, day);
        }

        @Override
        public void onDateSet(DatePicker view, int year, int month, int day){
                //untuk melakukan set tanggal bulan tahun yang dipilih
            TakeAway activity = (TakeAway) getActivity();
            // Invoke Main Activity's processDatePickerResult() method.
            activity.processDatePickerResult(year,month, day);
        }
    }
