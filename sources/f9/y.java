package f9;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.fragment.app.i;
import androidx.fragment.app.j;
import androidx.fragment.app.q;
import androidx.fragment.app.x;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import cm.l;
import com.google.android.gms.maps.model.LatLng;
import com.nic.mparivahan.Citizen.Interfaces.OffenceInterface;
import com.nic.mparivahan.Citizen.Models.SubmitOffenceReport;
import com.nic.mparivahan.R;
import j4.c;
import j4.e;
import j9.a;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import k9.b;
import km.f;
import ld.g;
import ni.ya;

public final class y extends i implements e {

    /* renamed from: h0  reason: collision with root package name */
    private ya f11546h0;

    /* renamed from: i0  reason: collision with root package name */
    private final int f11547i0 = 200;

    /* renamed from: j0  reason: collision with root package name */
    private final int f11548j0 = 1;

    /* renamed from: k0  reason: collision with root package name */
    public b f11549k0;

    /* renamed from: l0  reason: collision with root package name */
    public OffenceInterface f11550l0;

    /* renamed from: m0  reason: collision with root package name */
    public g f11551m0;

    /* renamed from: n0  reason: collision with root package name */
    public String f11552n0;

    /* renamed from: o0  reason: collision with root package name */
    private Calendar f11553o0 = Calendar.getInstance();

    /* renamed from: p0  reason: collision with root package name */
    public Context f11554p0;

    /* renamed from: q0  reason: collision with root package name */
    public ProgressDialog f11555q0;

    /* access modifiers changed from: private */
    public static final void A2(y yVar, Dialog dialog, View view) {
        l.f(yVar, "this$0");
        l.f(dialog, "$d");
        yVar.R1(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        dialog.dismiss();
    }

    private final ya g2() {
        ya yaVar = this.f11546h0;
        l.c(yaVar);
        return yaVar;
    }

    /* access modifiers changed from: private */
    public static final void o2(Calendar calendar, y yVar, TimePicker timePicker, int i10, int i11) {
        l.f(yVar, "this$0");
        calendar.set(11, i10);
        calendar.set(12, i11);
        yVar.g2().f29558g.setText(new SimpleDateFormat("HH:mm", Locale.US).format(calendar.getTime()));
    }

    /* access modifiers changed from: private */
    public static final void p2(y yVar, TimePickerDialog.OnTimeSetListener onTimeSetListener, Calendar calendar, View view) {
        l.f(yVar, "this$0");
        l.f(onTimeSetListener, "$timeSetListener");
        new TimePickerDialog(yVar.E1(), onTimeSetListener, calendar.get(11), calendar.get(12), true).show();
        yVar.g2().f29558g.setText(calendar.getTime().toString());
    }

    /* access modifiers changed from: private */
    public static final void q2(y yVar, View view) {
        q F0;
        x n10;
        x o10;
        l.f(yVar, "this$0");
        i iVar = new i();
        j q10 = yVar.q();
        if (q10 != null && (F0 = q10.F0()) != null && (n10 = F0.n()) != null && (o10 = n10.o(R.id.main_activity_fragmentContainer, iVar)) != null) {
            o10.h();
        }
    }

    /* access modifiers changed from: private */
    public static final void r2(y yVar, View view) {
        q F0;
        x n10;
        x o10;
        x g10;
        l.f(yVar, "this$0");
        e eVar = new e();
        j q10 = yVar.q();
        if (q10 != null && (F0 = q10.F0()) != null && (n10 = F0.n()) != null && (o10 = n10.o(R.id.main_activity_fragmentContainer, eVar)) != null && (g10 = o10.g((String) null)) != null) {
            g10.h();
        }
    }

    /* access modifiers changed from: private */
    public static final void s2(y yVar, View view) {
        l.f(yVar, "this$0");
        Calendar instance = Calendar.getInstance();
        int i10 = instance.get(1);
        int i11 = instance.get(2);
        instance.add(6, 1);
        DatePickerDialog datePickerDialog = new DatePickerDialog(yVar.h2(), new u(yVar), instance.get(5), i11, i10);
        datePickerDialog.getDatePicker().setMinDate(instance.getTimeInMillis());
        datePickerDialog.show();
    }

    /* access modifiers changed from: private */
    public static final void t2(y yVar, DatePicker datePicker, int i10, int i11, int i12) {
        l.f(yVar, "this$0");
        TextView textView = yVar.g2().f29556e;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i12);
        sb2.append('-');
        sb2.append(i11 + 1);
        sb2.append('-');
        sb2.append(i10);
        textView.setText(sb2.toString());
    }

    /* access modifiers changed from: private */
    public static final void u2(y yVar, View view) {
        String str;
        y yVar2 = yVar;
        l.f(yVar2, "this$0");
        Editable text = yVar.g2().f29559h.getText();
        l.e(text, "getText(...)");
        int length = text.length();
        int i10 = R.string.rc_text;
        if (length != 0 && yVar.g2().f29559h.getText().length() >= 4) {
            if (new f("[a-zA-Z0-9]*").a(yVar.g2().f29559h.getText().toString())) {
                Editable text2 = yVar.g2().f29557f.getText();
                l.e(text2, "getText(...)");
                if (text2.length() == 0) {
                    yVar.g2().f29557f.requestFocus();
                    str = "Please enter location";
                } else {
                    Editable text3 = yVar.g2().f29555d.getText();
                    l.e(text3, "getText(...)");
                    if (text3.length() == 0) {
                        str = "Please enter comments";
                    } else {
                        yVar2.D2(new ProgressDialog(yVar.D1()));
                        yVar.l2().setMessage("Please wait...");
                        yVar.l2().setCancelable(false);
                        yVar.l2().setCanceledOnTouchOutside(false);
                        Object systemService = yVar.D1().getSystemService("location");
                        l.d(systemService, "null cannot be cast to non-null type android.location.LocationManager");
                        if (((LocationManager) systemService).isProviderEnabled("gps")) {
                            a aVar = new a(yVar.D1());
                            String k22 = yVar.k2();
                            i10 = R.string.location_not_find;
                            if (k22 != null && !l.a(yVar.k2(), yVar.D1().getResources().getString(R.string.location_not_find))) {
                                String string = Settings.Secure.getString(yVar.h2().getContentResolver(), "android_id");
                                b j22 = yVar.j2();
                                String k10 = yVar.m2().k();
                                String k23 = yVar.k2();
                                String valueOf = String.valueOf(aVar.f12765j);
                                String obj = yVar.g2().f29557f.getText().toString();
                                String valueOf2 = String.valueOf(aVar.f12766k);
                                String obj2 = yVar.g2().f29559h.getText().toString();
                                String obj3 = yVar.g2().f29555d.getText().toString();
                                String q10 = yVar.m2().q();
                                String n10 = yVar.m2().n();
                                l.c(string);
                                j22.Y(k10, "1", k23, valueOf, obj, valueOf2, obj2, obj3, q10, n10, "", "", "", "", false, string, yVar.m2().l(), yVar.m2().e());
                                return;
                            }
                            str = yVar.D1().getResources().getString(i10);
                        } else {
                            yVar2.z2("Your location is off\nPlease turn on your location");
                            return;
                        }
                    }
                }
                yVar2.x2(str);
            }
        }
        yVar.g2().f29559h.requestFocus();
        str = yVar.D1().getResources().getString(i10);
        yVar2.x2(str);
    }

    /* access modifiers changed from: private */
    public static final void v2(y yVar, SubmitOffenceReport submitOffenceReport) {
        q F0;
        x n10;
        x o10;
        l.f(yVar, "this$0");
        yVar.l2().dismiss();
        if (l.a(submitOffenceReport.getStatusCode(), "ACCD001")) {
            yVar.x2("Report submitted successfully");
            i iVar = new i();
            j q10 = yVar.q();
            if (q10 != null && (F0 = q10.F0()) != null && (n10 = F0.n()) != null && (o10 = n10.o(R.id.main_activity_fragmentContainer, iVar)) != null) {
                o10.h();
                return;
            }
            return;
        }
        yVar.x2(submitOffenceReport.getStatusDesc());
    }

    /* access modifiers changed from: private */
    public static final void w2(y yVar, String str) {
        l.f(yVar, "this$0");
        yVar.l2().dismiss();
        yVar.x2("Something went wrong\nPlease try after some time!");
    }

    private final void x2(String str) {
        Dialog dialog = new Dialog(D1());
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new w(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void y2(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void z2(String str) {
        Dialog dialog = new Dialog(D1());
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new v(this, dialog));
        dialog.show();
    }

    public final void B2(OffenceInterface offenceInterface) {
        l.f(offenceInterface, "<set-?>");
        this.f11550l0 = offenceInterface;
    }

    public void C0(Bundle bundle) {
        super.C0(bundle);
    }

    public final void C2(b bVar) {
        l.f(bVar, "<set-?>");
        this.f11549k0 = bVar;
    }

    public final void D2(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.f11555q0 = progressDialog;
    }

    public final void E2(g gVar) {
        l.f(gVar, "<set-?>");
        this.f11551m0 = gVar;
    }

    public View G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.f(layoutInflater, "inflater");
        this.f11546h0 = ya.c(layoutInflater, viewGroup, false);
        return g2().b();
    }

    public void X0() {
        super.X0();
        new a(D1());
    }

    public void b1(View view, Bundle bundle) {
        l.f(view, "view");
        super.b1(view, bundle);
        g2().f29565n.a(bundle);
        E2(new g(D1()));
        OffenceInterface.a aVar = OffenceInterface.f7826a;
        j D1 = D1();
        l.e(D1, "requireActivity(...)");
        B2(aVar.b(D1));
        g2().f29556e.setText(new SimpleDateFormat("dd-MM-yyyy").format(Long.valueOf(System.currentTimeMillis())));
        g2().f29558g.setText(new SimpleDateFormat("HH:mm").format(Long.valueOf(System.currentTimeMillis())));
        TextView textView = g2().f29558g;
        l.e(textView, "evTimePicker");
        Context E1 = E1();
        l.e(E1, "requireContext(...)");
        n2(textView, E1);
        C2((b) new u0((x0) this, (u0.b) new k9.a(new i9.a(i2()))).a(b.class));
        g2().f29562k.setOnClickListener(new n(this));
        g2().f29563l.setOnClickListener(new p(this));
        g2().f29556e.setOnClickListener(new q(this));
        g2().f29566o.setOnClickListener(new r(this));
        j2().K().g(i0(), new s(this));
        j2().J().g(i0(), new t(this));
    }

    public final Context h2() {
        Context context = this.f11554p0;
        if (context != null) {
            return context;
        }
        l.v("mContext");
        return null;
    }

    public final OffenceInterface i2() {
        OffenceInterface offenceInterface = this.f11550l0;
        if (offenceInterface != null) {
            return offenceInterface;
        }
        l.v("mOffenceInterface");
        return null;
    }

    public final b j2() {
        b bVar = this.f11549k0;
        if (bVar != null) {
            return bVar;
        }
        l.v("mOffenceViewModel");
        return null;
    }

    public final String k2() {
        String str = this.f11552n0;
        if (str != null) {
            return str;
        }
        l.v("myLocation");
        return null;
    }

    public final ProgressDialog l2() {
        ProgressDialog progressDialog = this.f11555q0;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public void m(c cVar) {
        l.f(cVar, "googleMap");
        a aVar = new a(D1());
        cVar.a(new l4.e().p(new LatLng(aVar.f12765j, aVar.f12766k)).q("location"));
        cVar.b(j4.b.a(new LatLng(aVar.f12765j, aVar.f12766k), 15.0f));
    }

    public final g m2() {
        g gVar = this.f11551m0;
        if (gVar != null) {
            return gVar;
        }
        l.v("sessionManager");
        return null;
    }

    public final void n2(TextView textView, Context context) {
        l.f(textView, "textView");
        l.f(context, "context");
        Calendar instance = Calendar.getInstance();
        g2().f29558g.setOnClickListener(new o(this, new x(instance, this), instance));
    }

    public void x0(int i10, int i11, Intent intent) {
        super.x0(i10, i11, intent);
        if (i10 == this.f11548j0 && i11 == -1 && intent != null) {
            intent.getData();
        }
    }
}
