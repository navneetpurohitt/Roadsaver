package java.com.roadsaver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class SignUpActivity extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmentsignup);
        Button button = findViewById(R.id.buttonRegister);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText userName = (EditText) findViewById(R.id.ETName);
                EditText Password = (EditText) findViewById(R.id.ETPassword);
                EditText PhoneNo = (EditText) findViewById(R.id.EtNumber);
                EditText Email = (EditText) findViewById(R.id.ETEmail);


                if (TextUtils.isEmpty(userName.getText())) {
                    userName.setError("Name is required!");
                } else if (TextUtils.isEmpty(Password.getText())) {
                    Password.setError("You Must Enter Password");
                } else if (TextUtils.isEmpty(PhoneNo.getText())) {
                    PhoneNo.setError("Enter Phone No");
                } else if (TextUtils.isEmpty(Email.getText())) {
                    Email.setError("Enter a valid email");
                } else {
                    Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}




//public class SignUpActivity extends Fragment {
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.activity_fragmentsignup,container,false);
//    }
//
//    @Override
//    public void onSaveInstanceState(Bundle outState) {
//        //Saving data while orientation changes
//        super.onSaveInstanceState(outState);
//    }
//}