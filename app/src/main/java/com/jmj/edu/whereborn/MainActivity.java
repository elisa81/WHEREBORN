package com.jmj.edu.whereborn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);

    }

    public void outputPlace(View view) {
        int id = view.getId();
        String text = ((Button) view).getText().toString();
        TextView textView2 = (TextView) findViewById(R.id.textView2);


        switch (id) {
            case R.id.button1:
                text = text;
                break;
            case R.id.button2:
                text = text;
                break;
            case R.id.button3:
                text = text;
                break;
            case R.id.button4:
                text = text;
                break;
            case R.id.button5:
                text = text;
                break;
            default:
                text = "nothing";
        }
        textView2.setText(text.toString());

    }
}