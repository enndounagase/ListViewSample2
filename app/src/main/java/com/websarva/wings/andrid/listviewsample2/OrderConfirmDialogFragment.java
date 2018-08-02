package com.websarva.wings.andrid.listviewsample2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.support.v4.app;
import android.widget.Toast;

import java.lang.reflect.GenericArrayType;

public class OrderConfirmDialogFragment implements app {
    private static final OrderConfirmDialogFragment ourInstance = new OrderConfirmDialogFragment();

    public static OrderConfirmDialogFragment getInstance() {
        return ourInstance;
    }

    private OrderConfirmDialogFragment extends DialogFragment{
        @Override
                public Dialog onCreateDialog(Bundle Savedinstancestate){
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle(R.string.dialog_title);
            builder.setMessage(R.string.dialog_msg);
            builder.setPositiveButton(R.string.dialog_btn_ok,new DialogButtonClickListener());
            builder.setNegativeButton(R.string.dialog_btn_ok,new DialogButtonClickListener());
            builder.setNeutralButton(R.string.dialog_btn_nu,new DialogButtonClickListener());
            AlertDialog dialog = builder.create();
        return dialog;
    }
}
        private class DialogButtonClickListener implements DialogInterface.OnClickListener{
        @Override
            public void onClick(DialogInterface dialog,int which){
            String msg = "";
            switch(which){
                case DialogInterface.BUTTON_POSITIVE:
                    msg = getString(R.string.dialog_ok_toast);
                    break;
                case DialogInterface.BUTTON_NEGATIVE:
                    msg = getString(R.string.dialog_ng_toast);
                    break;
            }
            Toast.makeText(getActivity(),msg, Toast.LENGTH_LONG).show();
        }
    }
}