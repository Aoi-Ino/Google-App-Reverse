package va;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import cm.u;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dl.DLVirtualAlertScreen;
import com.nic.mparivahan.Dl.Model.DLDocument;
import com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.c;
import j$.util.Base64;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import km.d;
import m8.k;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public final class e extends RecyclerView.h {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Context f17597d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList f17598e;

    public static final class a extends RecyclerView.d0 {
        private ProgressBar A;
        private TextView B;
        private TextView C;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f17599y;

        /* renamed from: z  reason: collision with root package name */
        private final TextView f17600z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.doc_number);
            l.e(findViewById, "findViewById(...)");
            this.f17599y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.doc_expiry_date);
            l.e(findViewById2, "findViewById(...)");
            this.f17600z = (TextView) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.progress_bar);
            l.e(findViewById3, "findViewById(...)");
            this.A = (ProgressBar) findViewById3;
            View findViewById4 = this.f3622e.findViewById(R.id.service_name);
            l.e(findViewById4, "findViewById(...)");
            this.B = (TextView) findViewById4;
            View findViewById5 = this.f3622e.findViewById(R.id.viewmore);
            l.e(findViewById5, "findViewById(...)");
            this.C = (TextView) findViewById5;
        }

        public final TextView O() {
            return this.f17600z;
        }

        public final TextView P() {
            return this.f17599y;
        }

        public final ProgressBar Q() {
            return this.A;
        }

        public final TextView R() {
            return this.B;
        }

        public final TextView S() {
            return this.C;
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f17601a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f17602b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ u f17603c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f17604d;

        b(e eVar, a aVar, u uVar, int i10) {
            this.f17601a = eVar;
            this.f17602b = aVar;
            this.f17603c = uVar;
            this.f17604d = i10;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f17602b.Q().setVisibility(8);
        }

        public void onResponse(Call call, Response response) {
            String a10;
            try {
                DatabaseHelper A0 = DatabaseHelper.A0(this.f17601a.f17597d);
                this.f17602b.Q().setVisibility(8);
                String str = null;
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = c.f12675a;
                    String str2 = (String) this.f17603c.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, d.f24740b));
                } else {
                    k.a aVar2 = k.f13877a;
                    String str3 = (String) this.f17603c.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), DLServiceResponseModleV1.class);
                l.e(j10, "fromJson(...)");
                DLServiceResponseModleV1 dLServiceResponseModleV1 = (DLServiceResponseModleV1) j10;
                A0.M0(q.B0(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlLicno()).toString(), dLServiceResponseModleV1.getDldetobj().get(0));
                this.f17601a.k(this.f17604d);
            } catch (Exception unused) {
                this.f17602b.Q().setVisibility(8);
            }
        }
    }

    public e(Context context, ArrayList arrayList) {
        l.f(context, "context");
        l.f(arrayList, "mList");
        this.f17597d = context;
        this.f17598e = arrayList;
    }

    /* access modifiers changed from: private */
    public static final void G(DLDocument dLDocument, e eVar, View view) {
        l.f(eVar, "this$0");
        if (dLDocument.getDldetails() != null) {
            Intent intent = new Intent(eVar.f17597d, DLVirtualAlertScreen.class);
            intent.putExtra("Flag", true);
            eVar.f17597d.startActivity(intent);
        }
    }

    public final void C(String str, TextView textView) {
        int i10;
        Context context;
        l.f(str, "change_color");
        l.f(textView, "textView");
        if (q.D(str, "Expired", true)) {
            context = this.f17597d;
            i10 = R.color.danger;
        } else {
            boolean D = q.D(str, "Expiring", true);
            i10 = R.color.vehicle_fit;
            context = this.f17597d;
        }
        textView.setTextColor(androidx.core.content.a.c(context, i10));
    }

    public final String D(String str) {
        try {
            Date date = new Date();
            Date parse = new SimpleDateFormat("dd-MMM-yyyy").parse(str);
            if (parse.before(date)) {
                return "Expired on " + str;
            } else if (!parse.after(date)) {
                return "Expired on " + str;
            } else if (E(str) > 30) {
                return str + ' ';
            } else if (E(str) <= 7) {
                return "Expiring on " + str;
            } else {
                return "Expiring on " + str;
            }
        } catch (ParseException e10) {
            e10.printStackTrace();
            return "Expiring on" + str;
        } catch (Exception e11) {
            e11.printStackTrace();
            return String.valueOf(str);
        }
    }

    public final int E(String str) {
        try {
            Date date = new Date();
            long time = new SimpleDateFormat("dd-MMM-yyyy").parse(str).getTime();
            long time2 = date.getTime();
            return (int) ((time > time2 ? time - time2 : time2 - time) / ((long) 86400000));
        } catch (ParseException e10) {
            e10.printStackTrace();
            return 0;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00c7, code lost:
        r1 = r1.getDlobj();
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p(va.e.a r13, int r14) {
        /*
            r12 = this;
            java.lang.String r0 = "holder"
            cm.l.f(r13, r0)
            android.content.Context r0 = r12.f17597d     // Catch:{ Exception -> 0x00b0 }
            com.nic.mparivahan.DB.DatabaseHelper r0 = com.nic.mparivahan.DB.DatabaseHelper.A0(r0)     // Catch:{ Exception -> 0x00b0 }
            java.util.ArrayList r0 = r0.c0()     // Catch:{ Exception -> 0x00b0 }
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x00b0 }
            com.nic.mparivahan.Dl.Model.DLDocument r0 = (com.nic.mparivahan.Dl.Model.DLDocument) r0     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r2 = r0.getDocnumber()     // Catch:{ Exception -> 0x00b0 }
            if (r2 == 0) goto L_0x00b3
            int r2 = r2.length()     // Catch:{ Exception -> 0x00b0 }
            if (r2 != 0) goto L_0x0024
            goto L_0x00b3
        L_0x0024:
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r0.getDldetails()     // Catch:{ Exception -> 0x00b0 }
            if (r2 != 0) goto L_0x00b3
            android.content.Context r2 = r12.f17597d     // Catch:{ Exception -> 0x00b0 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r3 = "android_id"
            java.lang.String r8 = android.provider.Settings.Secure.getString(r2, r3)     // Catch:{ Exception -> 0x00b0 }
            ld.g r2 = new ld.g     // Catch:{ Exception -> 0x00b0 }
            android.content.Context r3 = r12.f17597d     // Catch:{ Exception -> 0x00b0 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x00b0 }
            cm.u r3 = new cm.u     // Catch:{ Exception -> 0x00b0 }
            r3.<init>()     // Catch:{ Exception -> 0x00b0 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x00b0 }
            r3.f20234e = r4     // Catch:{ Exception -> 0x00b0 }
            android.widget.ProgressBar r4 = r13.Q()     // Catch:{ Exception -> 0x00b0 }
            r4.setVisibility(r1)     // Catch:{ Exception -> 0x00b0 }
            android.widget.TextView r1 = r13.P()     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r4 = r0.getDocnumber()     // Catch:{ Exception -> 0x00b0 }
            r1.setText(r4)     // Catch:{ Exception -> 0x00b0 }
            com.nic.mparivahan.Dl.DlInterface.DlService$a r1 = com.nic.mparivahan.Dl.DlInterface.DlService.f8615a     // Catch:{ Exception -> 0x00b0 }
            android.content.Context r4 = r12.f17597d     // Catch:{ Exception -> 0x00b0 }
            com.nic.mparivahan.Dl.DlInterface.DlService r1 = r1.c(r4)     // Catch:{ Exception -> 0x00b0 }
            z9.a$a r4 = z9.a.f18947a     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r5 = r0.getDob()     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r6 = r4.b(r5)     // Catch:{ Exception -> 0x00b0 }
            um.c0$a r10 = um.c0.Companion     // Catch:{ Exception -> 0x00b0 }
            um.x$a r4 = um.x.f32156g     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r5 = "application/json"
            um.x r11 = r4.b(r5)     // Catch:{ Exception -> 0x00b0 }
            xa.a$a r4 = xa.a.f18250a     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r5 = r0.getDocnumber()     // Catch:{ Exception -> 0x00b0 }
            android.content.Context r7 = r12.f17597d     // Catch:{ Exception -> 0x00b0 }
            cm.l.c(r8)     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r9 = r2.l()     // Catch:{ Exception -> 0x00b0 }
            org.json.JSONObject r2 = r4.c(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r4 = "toString(...)"
            cm.l.e(r2, r4)     // Catch:{ Exception -> 0x00b0 }
            um.c0 r2 = r10.f(r11, r2)     // Catch:{ Exception -> 0x00b0 }
            java.lang.Object r4 = r3.f20234e     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00b0 }
            retrofit2.Call r1 = r1.getDlDetails_new(r2, r4)     // Catch:{ Exception -> 0x00b0 }
            va.e$b r2 = new va.e$b     // Catch:{ Exception -> 0x00b0 }
            r2.<init>(r12, r13, r3, r14)     // Catch:{ Exception -> 0x00b0 }
            r1.enqueue(r2)     // Catch:{ Exception -> 0x00b0 }
            goto L_0x0171
        L_0x00b0:
            r13 = move-exception
            goto L_0x017e
        L_0x00b3:
            android.widget.TextView r14 = r13.P()     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r1 = r0.getDocnumber()     // Catch:{ Exception -> 0x00b0 }
            r14.setText(r1)     // Catch:{ Exception -> 0x00b0 }
            ka.c$a r14 = ka.c.f13158a     // Catch:{ Exception -> 0x00b0 }
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r0.getDldetails()     // Catch:{ Exception -> 0x00b0 }
            r2 = 0
            if (r1 == 0) goto L_0x00d2
            com.nic.mparivahan.Dl.Model.DlobjX r1 = r1.getDlobj()     // Catch:{ Exception -> 0x00b0 }
            if (r1 == 0) goto L_0x00d2
            java.lang.String r1 = r1.getDlNtValdtoDt()     // Catch:{ Exception -> 0x00b0 }
            goto L_0x00d3
        L_0x00d2:
            r1 = r2
        L_0x00d3:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00b0 }
            boolean r1 = r14.n(r1)     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r3 = "Validity (NT)"
            if (r1 == 0) goto L_0x0146
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r0.getDldetails()     // Catch:{ Exception -> 0x00b0 }
            if (r1 == 0) goto L_0x00f0
            com.nic.mparivahan.Dl.Model.DlobjX r1 = r1.getDlobj()     // Catch:{ Exception -> 0x00b0 }
            if (r1 == 0) goto L_0x00f0
            java.lang.String r1 = r1.getDlNtValdtoDt()     // Catch:{ Exception -> 0x00b0 }
            goto L_0x00f1
        L_0x00f0:
            r1 = r2
        L_0x00f1:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00b0 }
            boolean r14 = r14.f(r1)     // Catch:{ Exception -> 0x00b0 }
            if (r14 == 0) goto L_0x0146
            android.widget.TextView r14 = r13.O()     // Catch:{ Exception -> 0x00b0 }
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r0.getDldetails()     // Catch:{ Exception -> 0x00b0 }
            if (r1 == 0) goto L_0x0110
            com.nic.mparivahan.Dl.Model.DlobjX r1 = r1.getDlobj()     // Catch:{ Exception -> 0x00b0 }
            if (r1 == 0) goto L_0x0110
            java.lang.String r1 = r1.getDlNtValdtoDt()     // Catch:{ Exception -> 0x00b0 }
            goto L_0x0111
        L_0x0110:
            r1 = r2
        L_0x0111:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00b0 }
            r14.setText(r1)     // Catch:{ Exception -> 0x00b0 }
            android.widget.TextView r14 = r13.R()     // Catch:{ Exception -> 0x00b0 }
            r14.setText(r3)     // Catch:{ Exception -> 0x00b0 }
            com.nic.mparivahan.Dl.Model.DldetobjX r14 = r0.getDldetails()     // Catch:{ Exception -> 0x00b0 }
            if (r14 == 0) goto L_0x012f
            com.nic.mparivahan.Dl.Model.DlobjX r14 = r14.getDlobj()     // Catch:{ Exception -> 0x00b0 }
            if (r14 == 0) goto L_0x012f
            java.lang.String r2 = r14.getDlNtValdtoDt()     // Catch:{ Exception -> 0x00b0 }
        L_0x012f:
            java.lang.String r14 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r14 = r12.D(r14)     // Catch:{ Exception -> 0x00b0 }
            android.widget.TextView r1 = r13.O()     // Catch:{ Exception -> 0x00b0 }
            r1.setText(r14)     // Catch:{ Exception -> 0x00b0 }
            android.widget.TextView r1 = r13.O()     // Catch:{ Exception -> 0x00b0 }
        L_0x0142:
            r12.C(r14, r1)     // Catch:{ Exception -> 0x00b0 }
            goto L_0x0171
        L_0x0146:
            android.widget.TextView r14 = r13.R()     // Catch:{ Exception -> 0x00b0 }
            r14.setText(r3)     // Catch:{ Exception -> 0x00b0 }
            com.nic.mparivahan.Dl.Model.DldetobjX r14 = r0.getDldetails()     // Catch:{ Exception -> 0x00b0 }
            if (r14 == 0) goto L_0x015d
            com.nic.mparivahan.Dl.Model.DlobjX r14 = r14.getDlobj()     // Catch:{ Exception -> 0x00b0 }
            if (r14 == 0) goto L_0x015d
            java.lang.String r2 = r14.getDlNtValdtoDt()     // Catch:{ Exception -> 0x00b0 }
        L_0x015d:
            java.lang.String r14 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r14 = r12.D(r14)     // Catch:{ Exception -> 0x00b0 }
            android.widget.TextView r1 = r13.O()     // Catch:{ Exception -> 0x00b0 }
            r1.setText(r14)     // Catch:{ Exception -> 0x00b0 }
            android.widget.TextView r1 = r13.O()     // Catch:{ Exception -> 0x00b0 }
            goto L_0x0142
        L_0x0171:
            android.widget.TextView r13 = r13.S()     // Catch:{ Exception -> 0x00b0 }
            va.d r14 = new va.d     // Catch:{ Exception -> 0x00b0 }
            r14.<init>(r0, r12)     // Catch:{ Exception -> 0x00b0 }
            r13.setOnClickListener(r14)     // Catch:{ Exception -> 0x00b0 }
            goto L_0x0181
        L_0x017e:
            r13.printStackTrace()
        L_0x0181:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: va.e.p(va.e$a, int):void");
    }

    /* renamed from: H */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        DatabaseHelper A0 = DatabaseHelper.A0(this.f17597d);
        if (A0.o() == null) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.dl_expiry_adapter, viewGroup, false);
            l.c(inflate);
            return new a(inflate);
        } else if (A0.o().size() > 0) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.dl_expiry_adapter, viewGroup, false);
            l.c(inflate2);
            return new a(inflate2);
        } else {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.dl_expiry_adapter, viewGroup, false);
            l.c(inflate3);
            return new a(inflate3);
        }
    }

    public int e() {
        return this.f17598e.size();
    }
}
