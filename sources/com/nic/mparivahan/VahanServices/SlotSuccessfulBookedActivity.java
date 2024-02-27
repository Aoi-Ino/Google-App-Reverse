package com.nic.mparivahan.VahanServices;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.d;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.PdfViewer.PdfViewActivity;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ld.c;
import ni.yd;
import v9.e;
import wd.a1;
import wd.b1;
import wd.c1;
import wd.d1;

public final class SlotSuccessfulBookedActivity extends d {
    private final int G = 10210;
    public yd H;
    private String I = "";
    private String J = "";
    private String K = "";
    private String L = "";
    private final ExecutorService M = Executors.newSingleThreadExecutor();
    private final Handler N = new Handler(Looper.getMainLooper());
    private String O = "";
    public c P;

    private final void l1() {
        j1().f29615g.f28305f.setOnClickListener(new a1(this));
        j1().f29615g.f28306g.setOnClickListener(new b1(this));
        j1().f29611c.setOnClickListener(new c1(this));
        TextView textView = j1().f29610b;
        textView.setText(k1().b("label_slot_appointment_booked", "Your appointment has been Booked with Appointment ID is") + " : " + this.I + ' ' + k1().b("label_slot_booked_appointment_no", " for Application No.") + " : " + this.J);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("https://delhigw.napix.gov.in/nic/parivahan/vahancapi/bookappointment/service/getappointmentreceipt/");
        sb2.append(this.I);
        sb2.append('/');
        sb2.append(this.K);
        sb2.append('/');
        sb2.append(this.L);
        this.O = sb2.toString();
        j1().f29614f.setOnClickListener(new d1(this));
    }

    /* access modifiers changed from: private */
    public static final void m1(SlotSuccessfulBookedActivity slotSuccessfulBookedActivity, View view) {
        l.f(slotSuccessfulBookedActivity, "this$0");
        slotSuccessfulBookedActivity.onBackPressed();
        VUtility.Companion.v(slotSuccessfulBookedActivity, slotSuccessfulBookedActivity.k1().b("are_you_sure_you_want_to_leave", slotSuccessfulBookedActivity.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void n1(SlotSuccessfulBookedActivity slotSuccessfulBookedActivity, View view) {
        l.f(slotSuccessfulBookedActivity, "this$0");
        slotSuccessfulBookedActivity.q1();
    }

    /* access modifiers changed from: private */
    public static final void o1(SlotSuccessfulBookedActivity slotSuccessfulBookedActivity, View view) {
        l.f(slotSuccessfulBookedActivity, "this$0");
        slotSuccessfulBookedActivity.q1();
    }

    /* access modifiers changed from: private */
    public static final void p1(SlotSuccessfulBookedActivity slotSuccessfulBookedActivity, View view) {
        l.f(slotSuccessfulBookedActivity, "this$0");
        Intent intent = new Intent(slotSuccessfulBookedActivity, PdfViewActivity.class);
        intent.putExtra("url", slotSuccessfulBookedActivity.O);
        intent.putExtra("formType", "Appointment Receipt");
        intent.putExtra("applNo", slotSuccessfulBookedActivity.I);
        slotSuccessfulBookedActivity.startActivity(intent);
    }

    private final void q1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final yd j1() {
        yd ydVar = this.H;
        if (ydVar != null) {
            return ydVar;
        }
        l.v("binding");
        return null;
    }

    public final c k1() {
        c cVar = this.P;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageKeySession");
        return null;
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, k1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.vahan_slot_success_booked);
        yd c10 = yd.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        r1(c10);
        setContentView((View) j1().b());
        e.f17509a.S1(this, j1());
        s1(new c(this));
        if (getIntent() != null) {
            if (getIntent().hasExtra("appNo")) {
                String stringExtra = getIntent().getStringExtra("appNo");
                l.c(stringExtra);
                this.J = stringExtra;
            }
            if (getIntent().hasExtra("apptId")) {
                String stringExtra2 = getIntent().getStringExtra("apptId");
                l.c(stringExtra2);
                this.I = stringExtra2;
            }
            if (getIntent().hasExtra("stateCd")) {
                String stringExtra3 = getIntent().getStringExtra("stateCd");
                l.c(stringExtra3);
                this.K = stringExtra3;
            }
            if (getIntent().hasExtra("offCd")) {
                String stringExtra4 = getIntent().getStringExtra("offCd");
                l.c(stringExtra4);
                this.L = stringExtra4;
            }
        }
        l1();
    }

    public final void r1(yd ydVar) {
        l.f(ydVar, "<set-?>");
        this.H = ydVar;
    }

    public final void s1(c cVar) {
        l.f(cVar, "<set-?>");
        this.P = cVar;
    }
}
