package java.com.roadsaver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrameButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_button);

    }
}
    /*public void loadFragmentOne(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();

        Fragment fragmentA = fragmentManager.findFragmentByTag("frag1");

        if (fragmentA == null) {
            fragmentA = new LoginActivity();
        }

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.mainFrame, fragmentA, "frag1");
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN); //setting animation for fragment transaction
        transaction.addToBackStack(null);
        transaction.commit();



    }



    public void loadFragmentTwo(View v) {

        // Replace whatever is in the fragment_container view with this fragment,
        // and add the transaction to the back stack so the user can navigate back

        FragmentManager fragmentManager = getSupportFragmentManager();

        Fragment fragmentB = fragmentManager.findFragmentByTag("frag2");

        if (fragmentB == null) {
            fragmentB = new SignUpActivity();
        }

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.mainFrame, fragmentB, "frag2");
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN); //setting animation for fragment transaction
        transaction.addToBackStack(null);
        transaction.commit();





    }
    public void moveToNewActivity (View v) {
        Intent i = new Intent(FrameButton.this, CardActivity.class);
        startActivity(i);




    }

}
*/