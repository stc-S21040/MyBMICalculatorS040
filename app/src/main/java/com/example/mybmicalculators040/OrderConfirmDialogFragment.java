package com.example.mybmicalculators040;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;

public class OrderConfirmDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.tv_k1);
        builder.setMessage("適切な肥満度を求めるためには、６歳未満の場合はカウブ指数が、６歳から１５歳まではローレル指数が使われます。本アプリはBMIのみに対応しています。");
        builder.setPositiveButton(R.string.tv_k2, (DialogInterface.OnClickListener) new DialogButtonClickListener());
        AlertDialog dialog = builder.create();
        return dialog;
    }
    private class DialogButtonClickListener implements DialogInterface.OnCancelListener {

        @Override
        public void onCancel(DialogInterface dialogInterface) {

        }
    }
}
