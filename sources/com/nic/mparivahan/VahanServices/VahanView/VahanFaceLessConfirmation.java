package com.nic.mparivahan.VahanServices.VahanView;

import ai.o2;
import ai.p2;
import ai.q2;
import ai.r2;
import ai.s2;
import ai.t2;
import ai.u2;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.FileProvider;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanApplication;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.utilities.e;
import java.io.File;
import java.io.FileOutputStream;
import ld.c;
import ni.ld;

public final class VahanFaceLessConfirmation extends d {
    public ld G;
    public String H;
    public String I;
    public String J;
    public String K;
    public c L;

    private final void G1(File file) {
        Uri g10 = FileProvider.g(this, "com.nic.mparivahan.provider", file);
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(g10, "image/*");
            intent.setFlags(67108864);
            intent.addFlags(1);
            startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(this, "No Application available to view pdf", 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void n1(Dialog dialog, VahanFaceLessConfirmation vahanFaceLessConfirmation, View view) {
        l.f(dialog, "$d");
        l.f(vahanFaceLessConfirmation, "this$0");
        dialog.dismiss();
        vahanFaceLessConfirmation.finish();
    }

    /* access modifiers changed from: private */
    public static final void o1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void t1(ConstraintLayout constraintLayout) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(constraintLayout.getWidth(), constraintLayout.getHeight(), Bitmap.Config.ARGB_8888);
            l.e(createBitmap, "createBitmap(...)");
            constraintLayout.draw(new Canvas(createBitmap));
            String str = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "//";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(str + "screenshot" + p1() + ".png");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            createBitmap.compress(Bitmap.CompressFormat.PNG, 70, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            G1(file2);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void u1(VahanFaceLessConfirmation vahanFaceLessConfirmation, View view) {
        l.f(vahanFaceLessConfirmation, "this$0");
        vahanFaceLessConfirmation.startActivity(new Intent(vahanFaceLessConfirmation, VahanApplication.class));
        vahanFaceLessConfirmation.finish();
    }

    /* access modifiers changed from: private */
    public static final void v1(VahanFaceLessConfirmation vahanFaceLessConfirmation, View view) {
        l.f(vahanFaceLessConfirmation, "this$0");
        vahanFaceLessConfirmation.m1(vahanFaceLessConfirmation, vahanFaceLessConfirmation.r1().b("are_you_sure_you_want_to_leave", vahanFaceLessConfirmation.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void w1(VahanFaceLessConfirmation vahanFaceLessConfirmation, View view) {
        l.f(vahanFaceLessConfirmation, "this$0");
        vahanFaceLessConfirmation.z1();
    }

    /* access modifiers changed from: private */
    public static final void x1(VahanFaceLessConfirmation vahanFaceLessConfirmation, View view) {
        l.f(vahanFaceLessConfirmation, "this$0");
        Intent intent = new Intent(vahanFaceLessConfirmation, DashBoard.class);
        intent.addFlags(67108864);
        vahanFaceLessConfirmation.startActivity(intent);
        vahanFaceLessConfirmation.finish();
    }

    /* access modifiers changed from: private */
    public static final void y1(VahanFaceLessConfirmation vahanFaceLessConfirmation, View view) {
        l.f(vahanFaceLessConfirmation, "this$0");
        if (e.e(vahanFaceLessConfirmation)) {
            ConstraintLayout constraintLayout = vahanFaceLessConfirmation.q1().f27369d;
            l.e(constraintLayout, "containerCl");
            vahanFaceLessConfirmation.t1(constraintLayout);
        }
    }

    private final void z1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void A1(String str) {
        l.f(str, "<set-?>");
        this.H = str;
    }

    public final void B1(ld ldVar) {
        l.f(ldVar, "<set-?>");
        this.G = ldVar;
    }

    public final void C1(c cVar) {
        l.f(cVar, "<set-?>");
        this.L = cVar;
    }

    public final void D1(String str) {
        l.f(str, "<set-?>");
        this.K = str;
    }

    public final void E1(String str) {
        l.f(str, "<set-?>");
        this.J = str;
    }

    public final void F1(String str) {
        l.f(str, "<set-?>");
        this.I = str;
    }

    public final void m1(Context context, String str) {
        l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.cancle);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        c cVar = new c(context);
        ((TextView) findViewById4).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(cVar.b("btn_ok", context.getString(R.string.ok_txt)));
        textView2.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new t2(dialog, this));
        textView2.setOnClickListener(new u2(dialog));
        dialog.show();
    }

    public void onBackPressed() {
        m1(this, r1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.vahan_confirmation_faceless);
        ld c10 = ld.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        B1(c10);
        setContentView((View) q1().b());
        v9.e.f17509a.E2(this, q1());
        C1(new c(this));
        F1(String.valueOf(getIntent().getStringExtra("state_code")));
        E1(String.valueOf(getIntent().getStringExtra("rc_number")));
        A1(String.valueOf(getIntent().getStringExtra(VContant.APP_NO)));
        D1(String.valueOf(getIntent().getStringExtra(VContant.PURPOSE_CODE)));
        String I2 = VContant.Companion.I(this, s1());
        q1().f27372g.f28308i.setText(I2);
        TextView textView = q1().f27368c;
        textView.setText("Your application has been successfully submitted  " + I2 + " with application no. " + p1() + " for further process. ");
        q1().f27367b.setOnClickListener(new o2(this));
        q1().f27372g.f28305f.setOnClickListener(new p2(this));
        q1().f27372g.f28306g.setOnClickListener(new q2(this));
        q1().f27370e.setOnClickListener(new r2(this));
        q1().f27371f.setOnClickListener(new s2(this));
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        m1(this, r1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    public final String p1() {
        String str = this.H;
        if (str != null) {
            return str;
        }
        l.v("application");
        return null;
    }

    public final ld q1() {
        ld ldVar = this.G;
        if (ldVar != null) {
            return ldVar;
        }
        l.v("binding");
        return null;
    }

    public final c r1() {
        c cVar = this.L;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageKeySession");
        return null;
    }

    public final String s1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        l.v(VContant.PURPOSE_CODE);
        return null;
    }
}
