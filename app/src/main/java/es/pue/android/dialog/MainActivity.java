package es.pue.android.dialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DialogFragment dialog = new DialogFragment();
        // This preserve status even configuration change (ex, rotate mobile).
        dialog.setRetainInstance(true);
        dialog.show(getFragmentManager(), "dialog");
    }
}
