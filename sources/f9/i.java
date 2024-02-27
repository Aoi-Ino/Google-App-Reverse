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
import androidx.fragment.app.j;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.Citizen.Interfaces.OffenceInterface;
import com.nic.mparivahan.Citizen.Models.AccidentReportDetails;
import com.nic.mparivahan.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import ld.g;
import ni.wa;

public final class i extends androidx.fragment.app.i {

    /* renamed from: h0  reason: collision with root package name */
    private wa f11458h0;

    /* renamed from: i0  reason: collision with root package name */
    private Calendar f11459i0 = Calendar.getInstance();

    /* renamed from: j0  reason: collision with root package name */
    private Calendar f11460j0 = Calendar.getInstance();

    /* renamed from: k0  reason: collision with root package name */
    public Context f11461k0;

    /* renamed from: l0  reason: collision with root package name */
    public ProgressDialog f11462l0;

    /* renamed from: m0  reason: collision with root package name */
    public g f11463m0;

    /* renamed from: n0  reason: collision with root package name */
    public k9.b f11464n0;

    /* renamed from: o0  reason: collision with root package name */
    public OffenceInterface f11465o0;

    /* renamed from: p0  reason: collision with root package name */
    public ArrayList f11466p0;

    public static final class a implements View.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ i f11467e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d f11468f;

        a(i iVar, d dVar) {
            this.f11467e = iVar;
            this.f11468f = dVar;
        }

        public void onClick(View view) {
            l.f(view, "view");
            new DatePickerDialog(this.f11467e.c2(), this.f11468f, this.f11467e.a2().get(1), this.f11467e.a2().get(2), this.f11467e.a2().get(5)).show();
        }
    }

    public static final class b implements View.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ i f11469e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c f11470f;

        b(i iVar, c cVar) {
            this.f11469e = iVar;
            this.f11470f = cVar;
        }

        public void onClick(View view) {
            l.f(view, "view");
            new DatePickerDialog(this.f11469e.c2(), this.f11470f, this.f11469e.b2().get(1), this.f11469e.b2().get(2), this.f11469e.b2().get(5)).show();
        }
    }

    public static final class c implements DatePickerDialog.OnDateSetListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f11471a;

        c(i iVar) {
            this.f11471a = iVar;
        }

        public void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
            l.f(datePicker, "view");
            this.f11471a.a2().set(1, i10);
            this.f11471a.a2().set(2, i11);
            this.f11471a.a2().set(5, i12);
            this.f11471a.Z1().f29223b.setText(new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(this.f11471a.a2().getTime()));
        }
    }

    public static final class d implements DatePickerDialog.OnDateSetListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f11472a;

        d(i iVar) {
            this.f11472a = iVar;
        }

        public void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
            l.f(datePicker, "view");
            this.f11472a.a2().set(1, i10);
            this.f11472a.a2().set(2, i11);
            this.f11472a.a2().set(5, i12);
            this.f11472a.Z1().f29224c.setText(new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(this.f11472a.a2().getTime()));
        }
    }

    /* access modifiers changed from: private */
    public final wa Z1() {
        wa waVar = this.f11458h0;
        l.c(waVar);
        return waVar;
    }

    /* access modifiers changed from: private */
    public static final void i2(i iVar, View view) {
        j D1;
        String str;
        l.f(iVar, "this$0");
        CharSequence text = iVar.Z1().f29224c.getText();
        l.e(text, "getText(...)");
        if (text.length() == 0) {
            D1 = iVar.D1();
            l.e(D1, "requireActivity(...)");
            str = "Please enter start date";
        } else {
            CharSequence text2 = iVar.Z1().f29223b.getText();
            l.e(text2, "getText(...)");
            if (text2.length() == 0) {
                D1 = iVar.D1();
                l.e(D1, "requireActivity(...)");
                str = "Please enter end date";
            } else {
                iVar.q2(new ProgressDialog(iVar.D1()));
                iVar.g2().setMessage("Please wait...");
                iVar.g2().setCancelable(false);
                iVar.g2().setCanceledOnTouchOutside(false);
                iVar.f2().h(iVar.h2().k(), iVar.Z1().f29224c.getText().toString(), iVar.Z1().f29223b.getText().toString());
                return;
            }
        }
        iVar.k2(D1, str);
    }

    /* access modifiers changed from: private */
    public static final void j2(i iVar, AccidentReportDetails accidentReportDetails) {
        l.f(iVar, "this$0");
        try {
            iVar.g2().dismiss();
            if (l.a(accidentReportDetails.getStatusDesc(), "Success")) {
                iVar.Z1().f29226e.setLayoutManager(new LinearLayoutManager(iVar.D1()));
                iVar.Z1().f29226e.setAdapter((RecyclerView.h) null);
                iVar.n2(accidentReportDetails.getMparCitizenAccidents());
                x.N(iVar.d2());
                iVar.Z1().f29226e.setAdapter(new e9.b(iVar.d2(), iVar.c2()));
                return;
            }
            iVar.g2().dismiss();
            iVar.Z1().f29226e.setAdapter((RecyclerView.h) null);
            j D1 = iVar.D1();
            l.e(D1, "requireActivity(...)");
            iVar.k2(D1, accidentReportDetails.getStatusDesc());
        } catch (Exception unused) {
            iVar.g2().dismiss();
            j D12 = iVar.D1();
            l.e(D12, "requireActivity(...)");
            iVar.k2(D12, "Something went wrong\nPlease try after some time!");
        }
    }

    /* access modifiers changed from: private */
    public static final void l2(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    public void C0(Bundle bundle) {
        super.C0(bundle);
    }

    public View G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.f(layoutInflater, "inflater");
        this.f11458h0 = wa.c(layoutInflater, viewGroup, false);
        return Z1().b();
    }

    public final Calendar a2() {
        return this.f11460j0;
    }

    public void b1(View view, Bundle bundle) {
        l.f(view, "view");
        j D1 = D1();
        l.e(D1, "requireActivity(...)");
        m2(D1);
        r2(new g(D1()));
        o2(OffenceInterface.f7826a.b(c2()));
        Z1().f29224c.setOnClickListener(new a(this, new d(this)));
        Z1().f29223b.setOnClickListener(new b(this, new c(this)));
        p2((k9.b) new u0((x0) this, (u0.b) new k9.a(new i9.a(e2()))).a(k9.b.class));
        Z1().f29225d.setOnClickListener(new f(this));
        j q10 = q();
        if (q10 != null) {
            f2().E().g(q10, new g(this));
        }
        super.b1(view, bundle);
    }

    public final Calendar b2() {
        return this.f11459i0;
    }

    public final Context c2() {
        Context context = this.f11461k0;
        if (context != null) {
            return context;
        }
        l.v("mContext");
        return null;
    }

    public final ArrayList d2() {
        ArrayList arrayList = this.f11466p0;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("mListVal");
        return null;
    }

    public final OffenceInterface e2() {
        OffenceInterface offenceInterface = this.f11465o0;
        if (offenceInterface != null) {
            return offenceInterface;
        }
        l.v("mOffenceInterface");
        return null;
    }

    public final k9.b f2() {
        k9.b bVar = this.f11464n0;
        if (bVar != null) {
            return bVar;
        }
        l.v("mOffenceViewModel");
        return null;
    }

    public final ProgressDialog g2() {
        ProgressDialog progressDialog = this.f11462l0;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final g h2() {
        g gVar = this.f11463m0;
        if (gVar != null) {
            return gVar;
        }
        l.v("sessionManager");
        return null;
    }

    public final void k2(Context context, String str) {
        l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new h(dialog));
        dialog.show();
    }

    public final void m2(Context context) {
        l.f(context, "<set-?>");
        this.f11461k0 = context;
    }

    public final void n2(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.f11466p0 = arrayList;
    }

    public final void o2(OffenceInterface offenceInterface) {
        l.f(offenceInterface, "<set-?>");
        this.f11465o0 = offenceInterface;
    }

    public final void p2(k9.b bVar) {
        l.f(bVar, "<set-?>");
        this.f11464n0 = bVar;
    }

    public final void q2(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.f11462l0 = progressDialog;
    }

    public final void r2(g gVar) {
        l.f(gVar, "<set-?>");
        this.f11463m0 = gVar;
    }
}
