package com.example.intentsproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.view.Window.FEATURE_INDETERMINATE_PROGRESS;

class FirstActivity extends AppCompatActivity {

      private EditText n1 ;
      private EditText n2 ;
      private Button OK ;

    public static final String EXTRA_MESSAGE = "com.example.intentsproj.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(FEATURE_INDETERMINATE_PROGRESS);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        n1 = (EditText)findViewByTd(R.id.etnum1);
        n2 = (EditText)findViewByTd(R.id.etnum2);
        OK = (Button) findViewById(R.id.btnSubmit);

        OK.setOnClick(View view);


            Intent myIntent = new Intent(FirstActivity.this, SecondActivity.class);
        FirstActivity.this.startActivity(myIntent);

        Button btn=(Button)findViewById(R.id.ok);
        btn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                WindowManager.LayoutParams params = getWindow().getAttributes();
                getWindow().setAttributes(params);
                Toast.makeText(v.getContext(),"Button Clicked",Toast.LENGTH_LONG).show();
            }
        });
    }
}
