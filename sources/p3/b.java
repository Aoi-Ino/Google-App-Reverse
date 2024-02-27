package p3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import s3.o;

public class b extends DialogFragment {

    /* renamed from: e  reason: collision with root package name */
    private Dialog f14629e;

    /* renamed from: f  reason: collision with root package name */
    private DialogInterface.OnCancelListener f14630f;

    /* renamed from: g  reason: collision with root package name */
    private Dialog f14631g;

    public static b a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        b bVar = new b();
        Dialog dialog2 = (Dialog) o.j(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        bVar.f14629e = dialog2;
        if (onCancelListener != null) {
            bVar.f14630f = onCancelListener;
        }
        return bVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f14630f;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f14629e;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f14631g == null) {
            this.f14631g = new AlertDialog.Builder((Context) o.i(getActivity())).create();
        }
        return this.f14631g;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
