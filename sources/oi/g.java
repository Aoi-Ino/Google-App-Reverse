package oi;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.d;
import bm.l;
import com.google.android.material.snackbar.Snackbar;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;
import ld.c;

public abstract class g extends d {
    public static final a I = new a((cm.g) null);
    private Context G;
    private c H;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(cm.g gVar) {
            this();
        }
    }

    public static /* synthetic */ void n1(g gVar, String str, String str2, int i10, String str3, String str4, l lVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 8) != 0) {
                c cVar = gVar.H;
                cm.l.c(cVar);
                str3 = cVar.b("button_proceed", "Proceed");
                cm.l.c(str3);
            }
            String str5 = str3;
            if ((i11 & 16) != 0) {
                c cVar2 = gVar.H;
                cm.l.c(cVar2);
                str4 = cVar2.b("button_cancel", "Cancel");
                cm.l.c(str4);
            }
            gVar.m1(str, str2, i10, str5, str4, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sarathiCustomDailog");
    }

    /* access modifiers changed from: private */
    public static final void o1(l lVar, g gVar, Dialog dialog, View view) {
        cm.l.f(lVar, "$onProceed");
        cm.l.f(gVar, "this$0");
        cm.l.f(dialog, "$dialog");
        lVar.invoke("Yes");
        gVar.k1(gVar);
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void p1(l lVar, Dialog dialog, View view) {
        cm.l.f(lVar, "$onProceed");
        cm.l.f(dialog, "$dialog");
        lVar.invoke("No");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void q1(Dialog dialog, View view) {
        cm.l.f(dialog, "$dialog");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void s1(Snackbar snackbar, View view) {
        cm.l.f(snackbar, "$snack");
        snackbar.x();
    }

    /* access modifiers changed from: private */
    public static final void u1(Snackbar snackbar, View view) {
        cm.l.f(snackbar, "$snackbar");
        snackbar.x();
    }

    public boolean Z0() {
        onBackPressed();
        return true;
    }

    public final void k1(Context context) {
        cm.l.f(context, "context");
        Object systemService = context.getSystemService("vibrator");
        cm.l.d(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        ((Vibrator) systemService).vibrate(50);
    }

    public final void l1() {
        Object systemService = getSystemService("input_method");
        cm.l.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        View currentFocus = getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(this);
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    public final void m1(String str, String str2, int i10, String str3, String str4, l lVar) {
        cm.l.f(str, "title");
        cm.l.f(str2, "message");
        cm.l.f(str3, "yesMsg");
        cm.l.f(str4, "cancelMsg");
        cm.l.f(lVar, "onProceed");
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.setContentView(R.layout.sarathi_confirm_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Window window2 = dialog.getWindow();
        WindowManager.LayoutParams attributes = window2 != null ? window2.getAttributes() : null;
        if (attributes != null) {
            attributes.windowAnimations = R.style.PauseDialogAnimation;
        }
        TextView textView = (TextView) dialog.findViewById(R.id.sarathi_pop_up_proceed);
        TextView textView2 = (TextView) dialog.findViewById(R.id.sarathi_pop_up_cancel);
        LinearLayout linearLayout = (LinearLayout) dialog.findViewById(R.id.cancel);
        textView.setText(str3);
        textView2.setText(str4);
        ((MyTextView) dialog.findViewById(R.id.sarathi_popup_title)).setText(str);
        ((MyTextView) dialog.findViewById(R.id.sarathi_popup_message)).setText(str2);
        if (i10 == 1) {
            textView2.setVisibility(8);
        } else if (i10 == 2) {
            textView.setVisibility(8);
        } else if (i10 == 10) {
            linearLayout.setVisibility(0);
            textView2.setText("Add");
            textView2.setBackground(getResources().getDrawable(R.drawable.background_shape_blue));
        }
        textView.setOnClickListener(new b(lVar, this, dialog));
        textView2.setOnClickListener(new c(lVar, dialog));
        linearLayout.setOnClickListener(new d(dialog));
        dialog.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.G = this;
        this.H = new c(this);
    }

    public final void r1(String str, View view) {
        if (view != null) {
            cm.l.c(str);
            Snackbar l02 = Snackbar.l0(view, str, 6000);
            cm.l.e(l02, "make(...)");
            l02.n0("Close", new f(l02));
            View G2 = l02.G();
            Context context = this.G;
            cm.l.c(context);
            G2.setBackgroundColor(androidx.core.content.a.c(context, R.color.never_mix));
            l02.o0(-1);
            View G3 = l02.G();
            cm.l.e(G3, "getView(...)");
            TextView textView = (TextView) G3.findViewById(R.id.snackbar_text);
            Context context2 = this.G;
            cm.l.c(context2);
            textView.setTextColor(androidx.core.content.a.c(context2, R.color.white));
            textView.setMaxLines(5);
            l02.W();
        }
    }

    public final void t1(String str, View view) {
        if (view != null) {
            cm.l.c(str);
            Snackbar l02 = Snackbar.l0(view, str, 3000);
            cm.l.e(l02, "make(...)");
            l02.n0("", new e(l02));
            View G2 = l02.G();
            Context context = this.G;
            cm.l.c(context);
            G2.setBackgroundColor(androidx.core.content.a.c(context, R.color.never_mix));
            l02.o0(-1);
            l02.W();
        }
    }
}
