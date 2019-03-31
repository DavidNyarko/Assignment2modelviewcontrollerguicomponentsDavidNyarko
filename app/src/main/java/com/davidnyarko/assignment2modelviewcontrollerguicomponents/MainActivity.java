package com.davidnyarko.assignment2modelviewcontrollerguicomponents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText password1;
    private EditText password2;
    private TextView labelView;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        password1 = findViewById(R.id.editText1);
        password2 = findViewById(R.id.editText2);
        labelView = findViewById(R.id.textViewlbl);
        submit = findViewById(R.id.btnsubmit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pssd1 = password1.getText().toString();
                String pssd2 = password2.getText().toString();

                if(pssd1.matches(pssd2)){
                    labelView.setText("THANK YOU");
                }
                else{
                    labelView.setText("PASSWORD MUST MATCH");

                }
            }
        });



    }
}
