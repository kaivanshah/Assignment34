package com.kaivanshah.assignment34;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public final String Dummy_Username = "Kaivan";
    public final String Dummy_Password = "Kaivan";

    Button btn_Login;
    EditText EditText_Username, EditText_Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_Login = (Button) (this.findViewById(R.id.btn_Login));
        EditText_Username = (EditText) (this.findViewById(R.id.EditText_Username));
        EditText_Password = (EditText) (this.findViewById(R.id.EditText_Password));
        btn_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(EditText_Username.getText().toString().equals(Dummy_Username) && EditText_Password.getText().toString().equals(Dummy_Password))
                {
                    Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                    intent.putExtra("username", EditText_Username.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }
}
