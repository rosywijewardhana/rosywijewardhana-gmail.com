package com.example.intentsproj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    private Button abstractt;
    private Button substract;
    private Button devide;
    private Button multiply;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String message = intent.getStringExtra(FirstActivity.EXTRA_MESSAGE);

        abstractt.setOnClickListner(new View.onClickListner()) {
            @Override
            public void onClick (View view){
                int number1 = Integer.parseInt(n1.getText().toString());
                int number2 = Integer.parseInt(n2.getText().toString());
                int ans = number1 + number2;
            }

            substract.setOnClickListner(new View.onClickListner()) {
                @Override
                public void onClick (View view){
                    int number1 = Integer.parseInt(n1.getText().toString());
                    int number2 = Integer.parseInt(n2.getText().toString());
                    int ans = number1 - number2;
                }
            }

            multiply.setOnClickListner(new View.onClickListner()) {
                @Override
                public void onClick (View view){
                    int number1 = Integer.parseInt(n1.getText().toString());
                    int number2 = Integer.parseInt(n2.getText().toString());
                    int ans = number1 * number2;
                }
            }

            devide.setOnClickListner(new View.onClickListner()) {
                @Override
                public void onClick (View view){
                    int number1 = Integer.parseInt(n1.getText().toString());
                    int number2 = Integer.parseInt(n2.getText().toString());
                    int ans = number1 / number2;
                    output.setText(String.valueOf(ans));
                }
            }


        TextView textView = findViewById(R.id.textView);
        textView.setText(ans);
    }
}
