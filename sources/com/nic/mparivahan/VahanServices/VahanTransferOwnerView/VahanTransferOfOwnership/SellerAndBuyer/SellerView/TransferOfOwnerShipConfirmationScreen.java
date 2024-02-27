package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
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
import com.nic.mparivahan.Dashboard.ui.VehicleServiceHomeNew;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.nic.mparivahan.dlservices.utilities.b;
import fh.h0;
import fh.i0;
import fh.j0;
import fh.k0;
import fh.l0;
import fh.m0;
import fh.n0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import ld.c;
import ni.jd;
import uc.a;
import v9.e;

public final class TransferOfOwnerShipConfirmationScreen extends d {
    public jd G;
    private String H = " ";
    private boolean I;
    public NrvDetails J;
    public c K;
    public String L;
    private ArrayList M = new ArrayList();

    /* access modifiers changed from: private */
    public static final void A1(TransferOfOwnerShipConfirmationScreen transferOfOwnerShipConfirmationScreen, View view) {
        l.f(transferOfOwnerShipConfirmationScreen, "this$0");
        transferOfOwnerShipConfirmationScreen.n1(transferOfOwnerShipConfirmationScreen, "Are you sure you want to leave?");
    }

    private final void B1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    private final void G1(File file) {
        Uri g10 = FileProvider.g(this, "com.nic.mparivahan.provider", file);
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(g10, "image/*");
            intent.setFlags(67108864);
            intent.addFlags(1);
            startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(this, r1().b("popup_pdf_error", getString(R.string.pdf_error)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void o1(Dialog dialog, TransferOfOwnerShipConfirmationScreen transferOfOwnerShipConfirmationScreen, View view) {
        l.f(dialog, "$d");
        l.f(transferOfOwnerShipConfirmationScreen, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(transferOfOwnerShipConfirmationScreen, VehicleServiceHomeNew.class);
        intent.putExtra("state_code", transferOfOwnerShipConfirmationScreen.u1().getState_cd());
        transferOfOwnerShipConfirmationScreen.startActivity(intent);
        transferOfOwnerShipConfirmationScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void p1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void v1(ConstraintLayout constraintLayout) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(constraintLayout.getWidth(), constraintLayout.getHeight(), Bitmap.Config.ARGB_8888);
            l.e(createBitmap, "createBitmap(...)");
            constraintLayout.draw(new Canvas(createBitmap));
            String str = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "//";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(str + "screenshot" + this.H + ".png");
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
    public static final void w1(TransferOfOwnerShipConfirmationScreen transferOfOwnerShipConfirmationScreen, View view) {
        l.f(transferOfOwnerShipConfirmationScreen, "this$0");
        Intent intent = new Intent(transferOfOwnerShipConfirmationScreen, VahanVehicleDetailsService.class);
        intent.putExtra("RC", transferOfOwnerShipConfirmationScreen.t1());
        intent.putExtra("RcDetails", transferOfOwnerShipConfirmationScreen.u1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, transferOfOwnerShipConfirmationScreen.I);
        intent.putExtra(VContant.NEXGEN_addahar_name, "NA");
        intent.putExtra(VContant.NEXGEN_addahar_address, "NA");
        transferOfOwnerShipConfirmationScreen.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void x1(TransferOfOwnerShipConfirmationScreen transferOfOwnerShipConfirmationScreen, View view) {
        l.f(transferOfOwnerShipConfirmationScreen, "this$0");
        transferOfOwnerShipConfirmationScreen.n1(transferOfOwnerShipConfirmationScreen, "Are you sure you want to leave?");
    }

    /* access modifiers changed from: private */
    public static final void y1(TransferOfOwnerShipConfirmationScreen transferOfOwnerShipConfirmationScreen, View view) {
        l.f(transferOfOwnerShipConfirmationScreen, "this$0");
        transferOfOwnerShipConfirmationScreen.B1();
    }

    /* access modifiers changed from: private */
    public static final void z1(TransferOfOwnerShipConfirmationScreen transferOfOwnerShipConfirmationScreen, View view) {
        l.f(transferOfOwnerShipConfirmationScreen, "this$0");
        if (transferOfOwnerShipConfirmationScreen.m1(transferOfOwnerShipConfirmationScreen)) {
            ConstraintLayout constraintLayout = transferOfOwnerShipConfirmationScreen.q1().f27031c;
            l.e(constraintLayout, "containerCl");
            transferOfOwnerShipConfirmationScreen.v1(constraintLayout);
        }
    }

    public final void C1(jd jdVar) {
        l.f(jdVar, "<set-?>");
        this.G = jdVar;
    }

    public final void D1(c cVar) {
        l.f(cVar, "<set-?>");
        this.K = cVar;
    }

    public final void E1(String str) {
        l.f(str, "<set-?>");
        this.L = str;
    }

    public final void F1(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.J = nrvDetails;
    }

    public final void H1(String str, String str2, Context context) {
        l.f(context, "context");
        a.f17255a.b(str, str2, context);
    }

    public final boolean m1(Activity activity) {
        l.f(activity, "activity");
        if (Build.VERSION.SDK_INT > 30) {
            return true;
        }
        b bVar = b.f22373a;
        if (!bVar.c() || bVar.d(activity)) {
            return true;
        }
        bVar.f(activity, 666);
        return false;
    }

    public final void n1(Context context, String str) {
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
        View findViewById3 = dialog.findViewById(R.id.cancle);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new m0(dialog, this));
        ((TextView) findViewById3).setOnClickListener(new n0(dialog));
        dialog.show();
    }

    public void onBackPressed() {
        n1(this, r1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.tranfer_of_owner_ship_confirmation_seller);
        jd c10 = jd.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        C1(c10);
        setContentView((View) q1().b());
        e.f17509a.v2(this, q1());
        D1(new c(this));
        Serializable serializableExtra = getIntent().getSerializableExtra(VContant.APP_NO);
        l.d(serializableExtra, "null cannot be cast to non-null type kotlin.String");
        this.H = (String) serializableExtra;
        Serializable serializableExtra2 = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        F1((NrvDetails) serializableExtra2);
        this.M = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        E1(String.valueOf(u1().getRc_regn_no()));
        q1().f27034f.f28308i.setText(String.valueOf(r1().b("toSellerHeader", "Transfer of Ownership \n(Seller)")));
        TextView textView = q1().f27030b;
        textView.setText("Application for " + s1(this.M) + "has been initiated with application No.\n" + this.H + " \n\n An SMS has been sent on buyer's mobile number entered by you. \n\n Please ask the buyer to process further on NextGen mParivahan app using the option 'Transfer of Ownership (Buyer)' with\n\npartially completed application No.");
        H1(q1().f27034f.f28308i.getText().toString(), q1().f27030b.getText().toString(), this);
        q1().f27034f.f28304e.setVisibility(0);
        q1().f27034f.f28304e.setText(t1());
        SpannableString spannableString = new SpannableString(t1());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        q1().f27034f.f28304e.setText(spannableString);
        q1().f27034f.f28304e.setOnClickListener(new h0(this));
        q1().f27034f.f28305f.setOnClickListener(new i0(this));
        q1().f27034f.f28306g.setOnClickListener(new j0(this));
        q1().f27033e.setOnClickListener(new k0(this));
        q1().f27032d.setOnClickListener(new l0(this));
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        VUtility.Companion.v(this, r1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }

    public final jd q1() {
        jd jdVar = this.G;
        if (jdVar != null) {
            return jdVar;
        }
        l.v("binding");
        return null;
    }

    public final c r1() {
        c cVar = this.K;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageKeySession");
        return null;
    }

    public final String s1(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        l.c(arrayList);
        if (arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = arrayList.get(i10);
                l.e(obj, "get(...)");
                arrayList2.add(VContant.Companion.A(this, (String) obj));
            }
        }
        return y.d0(arrayList2, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (bm.l) null, 62, (Object) null);
    }

    public final String t1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        l.v("rc_number");
        return null;
    }

    public final NrvDetails u1() {
        NrvDetails nrvDetails = this.J;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }
}
