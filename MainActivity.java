package com.example.alala;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {
    Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void onBtnClicked(View v)
        {
            Button kmtometre = (Button) findViewById(R.id.buttonkm);

            kmtometre.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    EditText boxkm = (EditText) findViewById(R.id.editTextkm);
                    EditText boxm = (EditText) findViewById(R.id.editTextm);

                    double km = Double.parseDouble(boxkm.getText().toString());
                    double met = km * 0.62137;
                    DecimalFormat formatval = new DecimalFormat("##.##");
                    boxm.setText(formatval.format(met));
                }
            });
        }

        public void onBtnClickedd(View v)
        {
        Button metretokm = (Button) findViewById(R.id.buttonm);

        metretokm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText boxkm = (EditText) findViewById(R.id.editTextkm);
                EditText boxm = (EditText) findViewById(R.id.editTextm);

                double met = Double.parseDouble(boxm.getText().toString());
                double km = met / 0.62137;
                DecimalFormat formatval = new DecimalFormat("##.##");
                boxkm.setText(formatval.format(km));


            }
        });
        }
        }
