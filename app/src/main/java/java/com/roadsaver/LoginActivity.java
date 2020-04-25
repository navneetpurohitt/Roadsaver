package java.com.roadsaver;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.zip.Inflater;

public class LoginActivity extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmentlogin);
        Button button = findViewById(R.id.ButtonLogin);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText userName = (EditText) findViewById(R.id.Email);
                EditText Password = (EditText) findViewById(R.id.Password);

                if( TextUtils.isEmpty(userName.getText())){
                    /**
                     *   You can Toast a message here that the Username is Empty
                     **/

                    userName.setError( "First name is required!" );

                }

                else if (TextUtils.isEmpty(Password.getText())){
                        /**
                         *   You can Toast a message here that the Username is Empty
                         **/

                        Password.setError( "You Must Enter Password");

                    }

                else{
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
                }
            }

        });


    }
}
