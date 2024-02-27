package com.nic.mparivahan.Citizen.Activities;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.core.app.b;
import androidx.core.content.a;
import androidx.fragment.app.i;
import androidx.fragment.app.q;
import androidx.fragment.app.x;
import cm.l;
import com.nic.mparivahan.R;
import d9.n0;
import d9.o0;
import d9.p0;
import f9.e;
import f9.u0;
import f9.y;
import ni.c6;

public final class MainActivity extends d {
    private c6 G;
    public i H;
    private final int I = 23;
    public ImageView J;

    private final boolean k1() {
        return a.a(this, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    private final void l1() {
        b.u(this, "android.permission.ACCESS_FINE_LOCATION");
        b.s(this, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, this.I);
    }

    /* access modifiers changed from: private */
    public static final void m1(MainActivity mainActivity, View view) {
        l.f(mainActivity, "this$0");
        mainActivity.finish();
    }

    private final void n1(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.location_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_allow);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById3 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById4;
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById3).setOnClickListener(new n0(dialog, this));
        ((TextView) findViewById2).setOnClickListener(new o0(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void o1(Dialog dialog, MainActivity mainActivity, View view) {
        l.f(dialog, "$d");
        l.f(mainActivity, "this$0");
        dialog.dismiss();
        mainActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void p1(Dialog dialog, MainActivity mainActivity, View view) {
        l.f(dialog, "$d");
        l.f(mainActivity, "this$0");
        dialog.dismiss();
        if (mainActivity.k1()) {
            mainActivity.q1(new y());
            q F0 = mainActivity.F0();
            l.e(F0, "getSupportFragmentManager(...)");
            x n10 = F0.n();
            l.e(n10, "beginTransaction(...)");
            n10.b(R.id.main_activity_fragmentContainer, mainActivity.i1());
            n10.h();
            return;
        }
        mainActivity.l1();
    }

    public final i i1() {
        i iVar = this.H;
        if (iVar != null) {
            return iVar;
        }
        l.v("frag");
        return null;
    }

    public final ImageView j1() {
        ImageView imageView = this.J;
        if (imageView != null) {
            return imageView;
        }
        l.v("mvvm_back");
        return null;
    }

    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c6 c10 = c6.c(LayoutInflater.from(this));
        l.e(c10, "inflate(...)");
        this.G = c10;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        View findViewById = findViewById(R.id.mvvm_back);
        l.e(findViewById, "findViewById(...)");
        r1((ImageView) findViewById);
        j1().setOnClickListener(new p0(this));
        if (k1()) {
            int intExtra = getIntent().getIntExtra("Callflag", 0);
            if (intExtra == 0) {
                q1(new u0());
            }
            if (intExtra == 1) {
                q1(new e());
            }
            q F0 = F0();
            l.e(F0, "getSupportFragmentManager(...)");
            x n10 = F0.n();
            l.e(n10, "beginTransaction(...)");
            n10.b(R.id.main_activity_fragmentContainer, i1());
            n10.h();
            return;
        }
        l1();
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        l.f(strArr, "permissions");
        l.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 != this.I) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            n1("Location permission Required,Allow mParivahan App to detect your location");
            return;
        }
        int intExtra = getIntent().getIntExtra("Callflag", 0);
        if (intExtra == 0) {
            q1(new f9.p0());
        }
        if (intExtra == 1) {
            q1(new y());
        }
        q F0 = F0();
        l.e(F0, "getSupportFragmentManager(...)");
        x n10 = F0.n();
        l.e(n10, "beginTransaction(...)");
        n10.b(R.id.main_activity_fragmentContainer, i1());
        n10.h();
    }

    public final void q1(i iVar) {
        l.f(iVar, "<set-?>");
        this.H = iVar;
    }

    public final void r1(ImageView imageView) {
        l.f(imageView, "<set-?>");
        this.J = imageView;
    }
}
