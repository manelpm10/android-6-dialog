package es.pue.android.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class DialogFragment extends android.app.DialogFragment {

    public DialogFragment() {
        // Required empty public constructor
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Lorem ipsum!");
        builder.setMessage("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");

        return builder.create();
    }
}
