package com.example.alertdialogbox;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txtName,txtAcc,txtBal;
Button btnName,btnAcc,btnBal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName=findViewById(R.id.txt1);
        txtAcc=findViewById(R.id.txt2);
        txtBal=findViewById(R.id.txt3);
        btnName=findViewById(R.id.btntxt1);
        btnAcc=findViewById(R.id.btntxt2);
        btnBal=findViewById(R.id.btntxt3);

        btnName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtName.setText("Diksha");
            }
        });
        btnAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtAcc.setText("44444");
            }
        });
         btnBal.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                 builder.setMessage("Are you sure")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            txtBal.setText("50000");
                        }
                    });
                      builder.setNegativeButton("Cancel",null);
                      AlertDialog alert=builder.create();
                      alert.show();
             }
         });

    }
}
