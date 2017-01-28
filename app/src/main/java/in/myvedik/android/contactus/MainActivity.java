package in.myvedik.android.contactus;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        ContactFragment contactFragment;

        if (savedInstanceState == null) {

            contactFragment = ContactFragment.getInstance();
            FragmentManager fm = getSupportFragmentManager();
            fm.beginTransaction()
                    .add(R.id.fragment_container,contactFragment)
                    .commit();
        } else {
            contactFragment = (ContactFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_container);
        }
    }
}
