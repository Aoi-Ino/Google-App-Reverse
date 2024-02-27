package f9;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.TextView;
import androidx.fragment.app.i;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bm.l;
import cm.h;
import com.nic.mparivahan.Citizen.Interfaces.OffenceInterface;
import com.nic.mparivahan.Citizen.Models.ComplaintList;
import com.nic.mparivahan.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Locale;
import ld.g;
import m8.j;
import ni.xa;
import pl.x;

public final class m extends i {

    /* renamed from: h0  reason: collision with root package name */
    private xa f11480h0;

    /* renamed from: i0  reason: collision with root package name */
    public k9.b f11481i0;

    /* renamed from: j0  reason: collision with root package name */
    public OffenceInterface f11482j0;

    /* renamed from: k0  reason: collision with root package name */
    public g f11483k0;

    /* renamed from: l0  reason: collision with root package name */
    private Calendar f11484l0 = Calendar.getInstance();

    /* renamed from: m0  reason: collision with root package name */
    private Calendar f11485m0 = Calendar.getInstance();

    /* renamed from: n0  reason: collision with root package name */
    public Context f11486n0;

    /* renamed from: o0  reason: collision with root package name */
    public ProgressDialog f11487o0;

    /* renamed from: p0  reason: collision with root package name */
    public ArrayList f11488p0;

    static final class a extends cm.m implements l {

        /* renamed from: e  reason: collision with root package name */
        public static final a f11489e = new a();

        a() {
            super(1);
        }

        public final void b(String str) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    public static final class b implements View.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m f11490e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e f11491f;

        b(m mVar, e eVar) {
            this.f11490e = mVar;
            this.f11491f = eVar;
        }

        public void onClick(View view) {
            cm.l.f(view, "view");
            new DatePickerDialog(this.f11490e.c2(), this.f11491f, this.f11490e.a2().get(1), this.f11490e.a2().get(2), this.f11490e.a2().get(5)).show();
        }
    }

    public static final class c implements View.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m f11492e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d f11493f;

        c(m mVar, d dVar) {
            this.f11492e = mVar;
            this.f11493f = dVar;
        }

        public void onClick(View view) {
            cm.l.f(view, "view");
            new DatePickerDialog(this.f11492e.c2(), this.f11493f, this.f11492e.b2().get(1), this.f11492e.b2().get(2), this.f11492e.b2().get(5)).show();
        }
    }

    public static final class d implements DatePickerDialog.OnDateSetListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f11494a;

        d(m mVar) {
            this.f11494a = mVar;
        }

        public void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
            cm.l.f(datePicker, "view");
            this.f11494a.a2().set(1, i10);
            this.f11494a.a2().set(2, i11);
            this.f11494a.a2().set(5, i12);
            this.f11494a.Z1().f29396b.setText(new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(this.f11494a.a2().getTime()));
        }
    }

    public static final class e implements DatePickerDialog.OnDateSetListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f11495a;

        e(m mVar) {
            this.f11495a = mVar;
        }

        public void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
            cm.l.f(datePicker, "view");
            this.f11495a.a2().set(1, i10);
            this.f11495a.a2().set(2, i11);
            this.f11495a.a2().set(5, i12);
            this.f11495a.Z1().f29397c.setText(new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(this.f11495a.a2().getTime()));
        }
    }

    static final class f implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f11496a;

        f(l lVar) {
            cm.l.f(lVar, "function");
            this.f11496a = lVar;
        }

        public final pl.c a() {
            return this.f11496a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f11496a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof h)) {
                return false;
            }
            return cm.l.a(a(), ((h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* access modifiers changed from: private */
    public final xa Z1() {
        xa xaVar = this.f11480h0;
        cm.l.c(xaVar);
        return xaVar;
    }

    /* access modifiers changed from: private */
    public static final void i2(m mVar, ComplaintList complaintList) {
        cm.l.f(mVar, "this$0");
        try {
            mVar.g2().dismiss();
            if (cm.l.a(complaintList.getStatusDesc(), "Success")) {
                mVar.Z1().f29399e.setLayoutManager(new LinearLayoutManager(mVar.D1()));
                mVar.Z1().f29399e.setAdapter((RecyclerView.h) null);
                mVar.n2(complaintList.getCitizenViolations());
                Collections.reverse(mVar.d2());
                mVar.Z1().f29399e.setAdapter(new j(mVar.d2(), mVar.c2()));
            } else if (cm.l.a(complaintList.getStatusCode(), "ACCD099")) {
                androidx.fragment.app.j D1 = mVar.D1();
                cm.l.e(D1, "requireActivity(...)");
                mVar.k2(D1, mVar.D1().getResources().getString(R.string.traffic_state));
                mVar.g2().dismiss();
            } else {
                mVar.g2().dismiss();
                mVar.Z1().f29399e.setAdapter((RecyclerView.h) null);
                androidx.fragment.app.j D12 = mVar.D1();
                cm.l.e(D12, "requireActivity(...)");
                mVar.k2(D12, complaintList.getStatusDesc());
            }
        } catch (Exception unused) {
            mVar.g2().dismiss();
            androidx.fragment.app.j D13 = mVar.D1();
            cm.l.e(D13, "requireActivity(...)");
            mVar.k2(D13, "Something went wrong\nPlease try after some time!");
        }
    }

    /* access modifiers changed from: private */
    public static final void j2(m mVar, View view) {
        androidx.fragment.app.j D1;
        String str;
        cm.l.f(mVar, "this$0");
        CharSequence text = mVar.Z1().f29397c.getText();
        cm.l.e(text, "getText(...)");
        if (text.length() == 0) {
            D1 = mVar.D1();
            cm.l.e(D1, "requireActivity(...)");
            str = "Please enter start date";
        } else {
            CharSequence text2 = mVar.Z1().f29396b.getText();
            cm.l.e(text2, "getText(...)");
            if (text2.length() == 0) {
                D1 = mVar.D1();
                cm.l.e(D1, "requireActivity(...)");
                str = "Please enter end date";
            } else {
                mVar.q2(new ProgressDialog(mVar.D1()));
                mVar.g2().setMessage("Please wait...");
                mVar.g2().setCancelable(false);
                mVar.g2().setCanceledOnTouchOutside(false);
                mVar.f2().V(mVar.h2().k(), mVar.Z1().f29397c.getText().toString(), mVar.Z1().f29396b.getText().toString());
                return;
            }
        }
        mVar.k2(D1, str);
    }

    /* access modifiers changed from: private */
    public static final void l2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    public void C0(Bundle bundle) {
        super.C0(bundle);
    }

    public View G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        cm.l.f(layoutInflater, "inflater");
        this.f11480h0 = xa.c(layoutInflater, viewGroup, false);
        return Z1().b();
    }

    public final Calendar a2() {
        return this.f11484l0;
    }

    public void b1(View view, Bundle bundle) {
        cm.l.f(view, "view");
        r2(new g(D1()));
        androidx.fragment.app.j D1 = D1();
        cm.l.e(D1, "requireActivity(...)");
        m2(D1);
        o2(OffenceInterface.f7826a.b(c2()));
        p2((k9.b) new u0((x0) this, (u0.b) new k9.a(new i9.a(e2()))).a(k9.b.class));
        androidx.fragment.app.j q10 = q();
        if (q10 != null) {
            f2().G().g(q10, new j(this));
        }
        androidx.fragment.app.j q11 = q();
        if (q11 != null) {
            f2().H().g(q11, new f(a.f11489e));
        }
        Z1().f29397c.setOnClickListener(new b(this, new e(this)));
        Z1().f29396b.setOnClickListener(new c(this, new d(this)));
        Z1().f29398d.setOnClickListener(new k(this));
        super.b1(view, bundle);
    }

    public final Calendar b2() {
        return this.f11485m0;
    }

    public final Context c2() {
        Context context = this.f11486n0;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final ArrayList d2() {
        ArrayList arrayList = this.f11488p0;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("mListVal");
        return null;
    }

    public final OffenceInterface e2() {
        OffenceInterface offenceInterface = this.f11482j0;
        if (offenceInterface != null) {
            return offenceInterface;
        }
        cm.l.v("mOffenceInterface");
        return null;
    }

    public final k9.b f2() {
        k9.b bVar = this.f11481i0;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("mOffenceViewModel");
        return null;
    }

    public final ProgressDialog g2() {
        ProgressDialog progressDialog = this.f11487o0;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final g h2() {
        g gVar = this.f11483k0;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("sessionManager");
        return null;
    }

    public final void k2(Context context, String str) {
        cm.l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new l(dialog));
        dialog.show();
    }

    public final void m2(Context context) {
        cm.l.f(context, "<set-?>");
        this.f11486n0 = context;
    }

    public final void n2(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.f11488p0 = arrayList;
    }

    public final void o2(OffenceInterface offenceInterface) {
        cm.l.f(offenceInterface, "<set-?>");
        this.f11482j0 = offenceInterface;
    }

    public final void p2(k9.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.f11481i0 = bVar;
    }

    public final void q2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.f11487o0 = progressDialog;
    }

    public final void r2(g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.f11483k0 = gVar;
    }
}
