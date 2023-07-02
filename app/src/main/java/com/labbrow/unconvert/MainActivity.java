package com.labbrow.unconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText EditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        EditText = findViewById(R.id.EditText);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
//               Toast.makeText(MainActivity.this, "Hi Click Listener worked!", Toast.LENGTH_SHORT).show();
                String s = EditText.getText().toString();
                int kg = Integer.parseInt(s);
                double pount = 2.205 * kg;
                textView.setText("The constranting value in pounds is " + pount );


           }
       });


    }
}