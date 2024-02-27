package p3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.h;
import androidx.fragment.app.q;
import s3.o;

public class p extends h {

    /* renamed from: x0  reason: collision with root package name */
    private Dialog f14654x0;

    /* renamed from: y0  reason: collision with root package name */
    private DialogInterface.OnCancelListener f14655y0;

    /* renamed from: z0  reason: collision with root package name */
    private Dialog f14656z0;

    public static p l2(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        p pVar = new p();
        Dialog dialog2 = (Dialog) o.j(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        pVar.f14654x0 = dialog2;
        if (onCancelListener != null) {
            pVar.f14655y0 = onCancelListener;
        }
        return pVar;
    }

    public Dialog d2(Bundle bundle) {
        Dialog dialog = this.f14654x0;
        if (dialog != null) {
            return dialog;
        }
        i2(false);
        if (this.f14656z0 == null) {
            this.f14656z0 = new AlertDialog.Builder((Context) o.i(w())).create();
        }
        return this.f14656z0;
    }

    public void k2(q qVar, String str) {
        super.k2(qVar, str);
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f14655y0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
