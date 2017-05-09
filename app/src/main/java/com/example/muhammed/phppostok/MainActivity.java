package com.example.muhammed.phppostok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView tv_method,tv_login,tv_role;
    EditText et_username,et_password;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_method = (TextView) findViewById(R.id.textView);
        tv_login = (TextView) findViewById(R.id.textView1);
        tv_role = (TextView) findViewById(R.id.textView2);

        btn = (Button) findViewById(R.id.button2);
        et_username = (EditText) findViewById(R.id.editText);
        et_password = (EditText) findViewById(R.id.editText2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = et_username.getText().toString();
                String password = et_password.getText().toString();
                tv_method.setText("Post Method");
                new SigninActivity(MainActivity.this,tv_login,tv_role).execute(username,password);
            }
        });

    }
}
