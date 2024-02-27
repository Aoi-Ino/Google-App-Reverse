package com.nic.mparivahan.Account.View;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.a;
import ld.c;
import ni.gc;
import u8.h0;
import u8.i0;
import u8.j0;
import u8.k0;
import v9.d;
import v9.e;
import v9.i;

public final class SignInDashBoard extends d {
    public LinearLayout G;
    public TextView H;
    private gc I;
    public c J;

    private final void j1() {
        String str = Build.MODEL;
        Log.d("MODEL", "model=" + str);
        String str2 = Build.PRODUCT;
        Log.d("PRODUCT", "product=" + str2);
        boolean z10 = str2 != null && (l.a(str2, "sdk") || q.F(str2, "_sdk", false, 2, (Object) null) || q.F(str2, "sdk_", false, 2, (Object) null));
        Log.d("ISEMULATOR", "isEmulator=" + z10);
        if (z10) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("It seems device is virtual, Please proceed with real device.").setCancelable(false).setPositiveButton("Okay", new j0(this));
            AlertDialog create = builder.create();
            create.setTitle("Information");
            create.show();
        }
    }

    /* access modifiers changed from: private */
    public static final void k1(SignInDashBoard signInDashBoard, DialogInterface dialogInterface, int i10) {
        l.f(signInDashBoard, "this$0");
        signInDashBoard.finish();
    }

    private final void l1() {
        i.a aVar = i.f17578a;
        Context baseContext = getBaseContext();
        l.e(baseContext, "getBaseContext(...)");
        if (aVar.a(baseContext)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("It seems device don't pass basic integrity & uncertified by Google").setCancelable(false).setPositiveButton("Okay", new k0(this));
            AlertDialog create = builder.create();
            create.setTitle("Information");
            create.show();
        }
    }

    /* access modifiers changed from: private */
    public static final void m1(SignInDashBoard signInDashBoard, DialogInterface dialogInterface, int i10) {
        l.f(signInDashBoard, "this$0");
        signInDashBoard.finish();
    }

    /* access modifiers changed from: private */
    public static final void q1(SignInDashBoard signInDashBoard, View view) {
        l.f(signInDashBoard, "this$0");
        if (a.f9624a.a(signInDashBoard)) {
            signInDashBoard.startActivity(new Intent(signInDashBoard, CreateAccountScreen.class));
        } else {
            Toast.makeText(signInDashBoard, signInDashBoard.p1().b("label_log_check_internet", "Please check you internet connection"), 0).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void r1(SignInDashBoard signInDashBoard, View view) {
        l.f(signInDashBoard, "this$0");
        Intent intent = new Intent(signInDashBoard, SignInScreen.class);
        d.a aVar = v9.d.f17494a;
        intent.putExtra(aVar.o(), aVar.p());
        signInDashBoard.startActivity(intent);
    }

    public final TextView n1() {
        TextView textView = this.H;
        if (textView != null) {
            return textView;
        }
        l.v("create_textview");
        return null;
    }

    public final LinearLayout o1() {
        LinearLayout linearLayout = this.G;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("redirectToSignInScreen");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        gc c10 = gc.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.I = c10;
        gc gcVar = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e.a aVar = e.f17509a;
        gc gcVar2 = this.I;
        if (gcVar2 == null) {
            l.v("binding");
        } else {
            gcVar = gcVar2;
        }
        aVar.N1(this, gcVar);
        u1(new c(this));
        j1();
        l1();
        androidx.appcompat.app.a R0 = R0();
        if (R0 != null) {
            R0.s(true);
        }
        View findViewById = findViewById(R.id.sign_in);
        l.e(findViewById, "findViewById(...)");
        t1((LinearLayout) findViewById);
        View findViewById2 = findViewById(R.id.create_account);
        l.e(findViewById2, "findViewById(...)");
        s1((TextView) findViewById2);
        n1().setOnClickListener(new h0(this));
        o1().setOnClickListener(new i0(this));
    }

    public final c p1() {
        c cVar = this.J;
        if (cVar != null) {
            return cVar;
        }
        l.v("session");
        return null;
    }

    public final void s1(TextView textView) {
        l.f(textView, "<set-?>");
        this.H = textView;
    }

    public final void t1(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.G = linearLayout;
    }

    public final void u1(c cVar) {
        l.f(cVar, "<set-?>");
        this.J = cVar;
    }
}
