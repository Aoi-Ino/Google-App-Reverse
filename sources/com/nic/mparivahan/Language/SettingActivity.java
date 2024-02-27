package com.nic.mparivahan.Language;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.d;
import cm.l;
import com.nic.mparivahan.R;
import ld.g;
import ni.bd;
import v9.e;
import yb.m;
import yb.n;
import yb.o;
import yb.p;
import yb.q;

public final class SettingActivity extends d {
    private bd G;

    /* access modifiers changed from: private */
    public static final void l1(Dialog dialog, View view) {
        l.f(dialog, "$dialog");
        dialog.dismiss();
    }

    private final void m1() {
        g gVar = new g(this);
        bd bdVar = this.G;
        bd bdVar2 = null;
        if (bdVar == null) {
            l.v("binding");
            bdVar = null;
        }
        bdVar.f25572i.f28305f.setOnClickListener(new m(this));
        bd bdVar3 = this.G;
        if (bdVar3 == null) {
            l.v("binding");
            bdVar3 = null;
        }
        bdVar3.f25565b.setOnClickListener(new n(this));
        bd bdVar4 = this.G;
        if (bdVar4 == null) {
            l.v("binding");
        } else {
            bdVar2 = bdVar4;
        }
        bdVar2.f25567d.setOnClickListener(new o(gVar, this));
    }

    /* access modifiers changed from: private */
    public static final void n1(SettingActivity settingActivity, View view) {
        l.f(settingActivity, "this$0");
        settingActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void o1(SettingActivity settingActivity, View view) {
        l.f(settingActivity, "this$0");
        settingActivity.q1(settingActivity);
    }

    /* access modifiers changed from: private */
    public static final void p1(g gVar, SettingActivity settingActivity, View view) {
        l.f(gVar, "$session_manger");
        l.f(settingActivity, "this$0");
        if (p.o(gVar.m(), "null", true)) {
            settingActivity.k1(settingActivity, "You haven't set the MPIN yet, Please set MPIN.");
        } else {
            settingActivity.startActivity(new Intent(settingActivity, ChangeMpinActivity.class));
        }
    }

    /* access modifiers changed from: private */
    public static final void r1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final void k1(Context context, String str) {
        l.f(context, "context");
        l.f(str, "title");
        Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.mvvm_number_dialog);
        View findViewById = dialog.findViewById(R.id.txt_dialog);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        View findViewById2 = dialog.findViewById(R.id.f19013ok);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById2).setOnClickListener(new q(dialog));
        dialog.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.setting_activity);
        bd c10 = bd.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.G = c10;
        bd bdVar = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e.a aVar = e.f17509a;
        bd bdVar2 = this.G;
        if (bdVar2 == null) {
            l.v("binding");
        } else {
            bdVar = bdVar2;
        }
        aVar.L1(this, bdVar);
        m1();
    }

    public final void q1(Context context) {
        l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText("Available Soon\n(Under Development)");
        ((TextView) findViewById2).setOnClickListener(new p(dialog));
        dialog.show();
    }
}
