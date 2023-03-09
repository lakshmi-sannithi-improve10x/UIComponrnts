package com.improve10x.uicomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.TimePicker;

public class MultipleWidgetsActivity extends AppCompatActivity {
    Button seekBtn;
    SeekBar seekbarSb;
    Button submitBtn;
    TextView resultTxt;
    Button ratingBtn;
    RatingBar ratingbarRb;
    Button dateBtn;
    DatePicker datePickerDp;
    Button timeBtn;
    TimePicker timePickerTp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_widgets);
        handleInitViews();
        hideAllComponents();
        handleSeekbarBtn();
        handleRatingbarBtn();
        handleDatePickerBtn();
        handleTimePickerBtn();
        handleSubmitBtn();

    }

    private void handleSeekbarBtn() {
        seekBtn.setOnClickListener(view -> {
            seekbarSb.setVisibility(View.VISIBLE);
            submitBtn.setVisibility(View.VISIBLE);
            resultTxt.setText("");
            resultTxt.setVisibility(View.VISIBLE);
            ratingbarRb.setVisibility(View.GONE);
            datePickerDp.setVisibility(View.GONE);
            timePickerTp.setVisibility(View.GONE);

        });
    }

    public  void  handleRatingbarBtn(){
        ratingBtn.setOnClickListener(view -> {
            ratingbarRb.setVisibility(View.VISIBLE);
            submitBtn.setVisibility(View.VISIBLE);
            resultTxt.setVisibility(View.VISIBLE);
            resultTxt.setText("");
            seekbarSb.setVisibility(View.GONE);
            datePickerDp.setVisibility(View.GONE);
            timePickerTp.setVisibility(View.GONE);

        });

    }

    public  void  handleDatePickerBtn(){
        dateBtn.setOnClickListener(view -> {
            datePickerDp.setVisibility(View.VISIBLE);
            submitBtn.setVisibility(View.VISIBLE);
            resultTxt.setText("");
            resultTxt.setVisibility(View.VISIBLE);
            seekbarSb.setVisibility(View.GONE);
            ratingbarRb.setVisibility(View.GONE);
            timePickerTp.setVisibility(View.GONE);

        });

    }

    public void  handleTimePickerBtn(){
        timeBtn.setOnClickListener(view -> {
            timePickerTp.setVisibility(View.VISIBLE);
            submitBtn.setVisibility(View.VISIBLE);
            resultTxt.setText("");
            resultTxt.setVisibility(View.VISIBLE);
            seekbarSb.setVisibility(View.GONE);
            ratingbarRb.setVisibility(View.GONE);
            datePickerDp.setVisibility(View.GONE);

        });

    }

    public void handleInitViews() {
        seekBtn = findViewById(R.id.seek_btn);
        seekbarSb = findViewById(R.id.seekbar_sb);
        submitBtn = findViewById(R.id.submit_btn);
        resultTxt = findViewById(R.id.result_txt);
        ratingBtn = findViewById(R.id.rating_btn);
        ratingbarRb = findViewById(R.id.ratingbar_rb);
        dateBtn = findViewById(R.id.date_btn);
        datePickerDp = findViewById(R.id.datepicker_dp);
        timeBtn = findViewById(R.id.time_btn);
        timePickerTp = findViewById(R.id.timepicker_tp);
    }

    public void handleSubmitBtn(){
        submitBtn.setOnClickListener(view -> {
            if (seekbarSb.getVisibility() == View.VISIBLE) {
                int progress = seekbarSb.getProgress();
                resultTxt.setText(progress + "");
            }
        });
        if (ratingbarRb.getVisibility() == View.VISIBLE){
            String rating = String.valueOf(ratingbarRb.getRating());
            resultTxt.setText(rating);
        }
        if (datePickerDp.isShown() == true){
            String date = String.valueOf(datePickerDp.getDayOfMonth());
            String month = String.valueOf(datePickerDp.getDayOfMonth());
            String year = String.valueOf(datePickerDp.getYear());
            resultTxt.setText(date + "/" + month + "/" + year);
        }
        if (timePickerTp.isShown() == true){
            String hour = String.valueOf(timePickerTp.getHour());
            String minute = String.valueOf(timePickerTp.getMinute());
            resultTxt.setText(hour + ":" + minute);
        }

    }
    public  void hideAllComponents(){
        seekbarSb.setVisibility(View.GONE);
        ratingbarRb.setVisibility(View.GONE);
        datePickerDp.setVisibility(View.GONE);
        timePickerTp.setVisibility(View.GONE);
        submitBtn.setVisibility(View.GONE);
        resultTxt.setVisibility(View.GONE);
    }

    }



