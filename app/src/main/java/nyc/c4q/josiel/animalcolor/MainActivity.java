package nyc.c4q.josiel.animalcolor;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {

            FragmentManager fm = getSupportFragmentManager();
            fm
                    .beginTransaction()
                    .add(R.id.activity_main, new AnimalFragment())
                    .commit();
        }
    }

    public void onClick(View v) {

    }


}
