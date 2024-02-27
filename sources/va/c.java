package va;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
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

public final class c extends RecyclerView.h {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Context f17586d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList f17587e;

    /* renamed from: f  reason: collision with root package name */
    private final ra.b f17588f;

    public static final class a extends RecyclerView.d0 {
        private ProgressBar A;
        private TextView B;
        private AppCompatImageView C;
        private AppCompatImageView D;
        private TextView E;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f17589y;

        /* renamed from: z  reason: collision with root package name */
        private final TextView f17590z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.doc_number);
            l.e(findViewById, "findViewById(...)");
            this.f17589y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.doc_expiry_date);
            l.e(findViewById2, "findViewById(...)");
            this.f17590z = (TextView) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.progress_bar);
            l.e(findViewById3, "findViewById(...)");
            this.A = (ProgressBar) findViewById3;
            View findViewById4 = this.f3622e.findViewById(R.id.service_name);
            l.e(findViewById4, "findViewById(...)");
            this.B = (TextView) findViewById4;
            View findViewById5 = this.f3622e.findViewById(R.id.viewmore);
            l.e(findViewById5, "findViewById(...)");
            this.C = (AppCompatImageView) findViewById5;
            View findViewById6 = this.f3622e.findViewById(R.id.refresh);
            l.e(findViewById6, "findViewById(...)");
            this.D = (AppCompatImageView) findViewById6;
            View findViewById7 = this.f3622e.findViewById(R.id.notify);
            l.e(findViewById7, "findViewById(...)");
            this.E = (TextView) findViewById7;
        }

        public final TextView O() {
            return this.f17590z;
        }

        public final TextView P() {
            return this.f17589y;
        }

        public final TextView Q() {
            return this.E;
        }

        public final ProgressBar R() {
            return this.A;
        }

        public final AppCompatImageView S() {
            return this.D;
        }

        public final TextView T() {
            return this.B;
        }

        public final AppCompatImageView U() {
            return this.C;
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f17591a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f17592b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ u f17593c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f17594d;

        b(c cVar, a aVar, u uVar, int i10) {
            this.f17591a = cVar;
            this.f17592b = aVar;
            this.f17593c = uVar;
            this.f17594d = i10;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f17592b.R().setVisibility(8);
        }

        public void onResponse(Call call, Response response) {
            String a10;
            try {
                DatabaseHelper A0 = DatabaseHelper.A0(this.f17591a.f17586d);
                this.f17592b.R().setVisibility(8);
                String str = null;
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = (String) this.f17593c.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, d.f24740b));
                } else {
                    k.a aVar2 = k.f13877a;
                    String str3 = (String) this.f17593c.f20234e;
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
                this.f17591a.k(this.f17594d);
            } catch (Exception unused) {
                this.f17592b.R().setVisibility(8);
            }
        }
    }

    public c(Context context, ArrayList arrayList, ra.b bVar) {
        l.f(context, "context");
        l.f(arrayList, "mList");
        l.f(bVar, "updatedl");
        this.f17586d = context;
        this.f17587e = arrayList;
        this.f17588f = bVar;
    }

    /* access modifiers changed from: private */
    public static final void H(DLDocument dLDocument, c cVar, View view) {
        l.f(cVar, "this$0");
        if (dLDocument.getDldetails() != null) {
            Intent intent = new Intent(cVar.f17586d, DLVirtualAlertScreen.class);
            intent.putExtra("Flag", true);
            cVar.f17586d.startActivity(intent);
        }
    }

    /* access modifiers changed from: private */
    public static final void I(a aVar, c cVar, int i10, View view) {
        l.f(aVar, "$holder");
        l.f(cVar, "this$0");
        aVar.R().setVisibility(0);
        cVar.f17588f.a("", Integer.valueOf(i10));
    }

    public final void D(String str, TextView textView) {
        int i10;
        Context context;
        l.f(str, "change_color");
        l.f(textView, "textView");
        if (q.D(str, "Expired", true)) {
            context = this.f17586d;
            i10 = R.color.danger;
        } else {
            boolean D = q.D(str, "Expiring", true);
            i10 = R.color.vehicle_fit;
            context = this.f17586d;
        }
        textView.setTextColor(androidx.core.content.a.c(context, i10));
    }

    public final String E(String str) {
        try {
            Date date = new Date();
            Date parse = new SimpleDateFormat("dd-MMM-yyyy").parse(str);
            if (parse.before(date)) {
                return "Expired on " + str;
            } else if (!parse.after(date)) {
                return "Expired on " + str;
            } else if (F(str) > 30) {
                return str + ' ';
            } else if (F(str) <= 7) {
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

    public final int F(String str) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0125, code lost:
        r4 = r4.getDlobj();
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p(va.c.a r14, int r15) {
        /*
            r13 = this;
            java.lang.String r0 = "DL"
            java.lang.String r1 = "tap_notify"
            java.lang.String r2 = "holder"
            cm.l.f(r14, r2)
            android.widget.ProgressBar r2 = r14.R()     // Catch:{ Exception -> 0x0041 }
            r3 = 8
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x0041 }
            android.content.Context r2 = r13.f17586d     // Catch:{ Exception -> 0x0041 }
            com.nic.mparivahan.DB.DatabaseHelper r2 = com.nic.mparivahan.DB.DatabaseHelper.A0(r2)     // Catch:{ Exception -> 0x0041 }
            ld.c r3 = new ld.c     // Catch:{ Exception -> 0x0041 }
            android.content.Context r4 = r13.f17586d     // Catch:{ Exception -> 0x0041 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0041 }
            java.util.ArrayList r2 = r2.c0()     // Catch:{ Exception -> 0x0041 }
            r4 = 0
            java.lang.Object r2 = r2.get(r4)     // Catch:{ Exception -> 0x0041 }
            com.nic.mparivahan.Dl.Model.DLDocument r2 = (com.nic.mparivahan.Dl.Model.DLDocument) r2     // Catch:{ Exception -> 0x0041 }
            java.lang.String r5 = r3.d()     // Catch:{ Exception -> 0x0041 }
            java.lang.String r6 = "english"
            r7 = 1
            boolean r5 = km.p.o(r5, r6, r7)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r6 = "We will notify you 30 days before the any validity expiry.          "
            if (r5 == 0) goto L_0x0044
            android.widget.TextView r1 = r14.Q()     // Catch:{ Exception -> 0x0041 }
            r1.setText(r6)     // Catch:{ Exception -> 0x0041 }
            goto L_0x0077
        L_0x0041:
            r14 = move-exception
            goto L_0x01f7
        L_0x0044:
            java.lang.String r5 = r3.b(r1, r6)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0041 }
            int r5 = r5.length()     // Catch:{ Exception -> 0x0041 }
            r7 = 70
            if (r5 < r7) goto L_0x006c
            java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x0041 }
            java.lang.String r1 = r3.b(r1, r6)     // Catch:{ Exception -> 0x0041 }
            r5.<init>(r1)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r1 = "  \n  "
            r6 = 48
            r5.insert(r6, r1)     // Catch:{ Exception -> 0x0041 }
            android.widget.TextView r1 = r14.Q()     // Catch:{ Exception -> 0x0041 }
            r1.setText(r5)     // Catch:{ Exception -> 0x0041 }
            goto L_0x0077
        L_0x006c:
            android.widget.TextView r5 = r14.Q()     // Catch:{ Exception -> 0x0041 }
            java.lang.String r1 = r3.b(r1, r6)     // Catch:{ Exception -> 0x0041 }
            r5.setText(r1)     // Catch:{ Exception -> 0x0041 }
        L_0x0077:
            java.lang.String r1 = r2.getDocnumber()     // Catch:{ Exception -> 0x0041 }
            if (r1 == 0) goto L_0x0111
            int r1 = r1.length()     // Catch:{ Exception -> 0x0041 }
            if (r1 != 0) goto L_0x0085
            goto L_0x0111
        L_0x0085:
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r2.getDldetails()     // Catch:{ Exception -> 0x0041 }
            if (r1 != 0) goto L_0x0111
            android.content.Context r1 = r13.f17586d     // Catch:{ Exception -> 0x0041 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ Exception -> 0x0041 }
            java.lang.String r3 = "android_id"
            java.lang.String r9 = android.provider.Settings.Secure.getString(r1, r3)     // Catch:{ Exception -> 0x0041 }
            ld.g r1 = new ld.g     // Catch:{ Exception -> 0x0041 }
            android.content.Context r3 = r13.f17586d     // Catch:{ Exception -> 0x0041 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x0041 }
            cm.u r3 = new cm.u     // Catch:{ Exception -> 0x0041 }
            r3.<init>()     // Catch:{ Exception -> 0x0041 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0041 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0041 }
            r3.f20234e = r5     // Catch:{ Exception -> 0x0041 }
            android.widget.ProgressBar r5 = r14.R()     // Catch:{ Exception -> 0x0041 }
            r5.setVisibility(r4)     // Catch:{ Exception -> 0x0041 }
            android.widget.TextView r4 = r14.P()     // Catch:{ Exception -> 0x0041 }
            java.lang.String r5 = r2.getDocnumber()     // Catch:{ Exception -> 0x0041 }
            r4.setText(r5)     // Catch:{ Exception -> 0x0041 }
            com.nic.mparivahan.Dl.DlInterface.DlService$a r4 = com.nic.mparivahan.Dl.DlInterface.DlService.f8615a     // Catch:{ Exception -> 0x0041 }
            android.content.Context r5 = r13.f17586d     // Catch:{ Exception -> 0x0041 }
            com.nic.mparivahan.Dl.DlInterface.DlService r4 = r4.c(r5)     // Catch:{ Exception -> 0x0041 }
            z9.a$a r5 = z9.a.f18947a     // Catch:{ Exception -> 0x0041 }
            java.lang.String r6 = r2.getDob()     // Catch:{ Exception -> 0x0041 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r7 = r5.b(r6)     // Catch:{ Exception -> 0x0041 }
            um.c0$a r11 = um.c0.Companion     // Catch:{ Exception -> 0x0041 }
            um.x$a r5 = um.x.f32156g     // Catch:{ Exception -> 0x0041 }
            java.lang.String r6 = "application/json"
            um.x r12 = r5.b(r6)     // Catch:{ Exception -> 0x0041 }
            xa.a$a r5 = xa.a.f18250a     // Catch:{ Exception -> 0x0041 }
            java.lang.String r6 = r2.getDocnumber()     // Catch:{ Exception -> 0x0041 }
            android.content.Context r8 = r13.f17586d     // Catch:{ Exception -> 0x0041 }
            cm.l.c(r9)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r10 = r1.l()     // Catch:{ Exception -> 0x0041 }
            org.json.JSONObject r1 = r5.c(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0041 }
            java.lang.String r5 = "toString(...)"
            cm.l.e(r1, r5)     // Catch:{ Exception -> 0x0041 }
            um.c0 r1 = r11.f(r12, r1)     // Catch:{ Exception -> 0x0041 }
            java.lang.Object r5 = r3.f20234e     // Catch:{ Exception -> 0x0041 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0041 }
            retrofit2.Call r1 = r4.getDlDetails_new(r1, r5)     // Catch:{ Exception -> 0x0041 }
            va.c$b r4 = new va.c$b     // Catch:{ Exception -> 0x0041 }
            r4.<init>(r13, r14, r3, r15)     // Catch:{ Exception -> 0x0041 }
            r1.enqueue(r4)     // Catch:{ Exception -> 0x0041 }
            goto L_0x01de
        L_0x0111:
            android.widget.TextView r1 = r14.P()     // Catch:{ Exception -> 0x0041 }
            java.lang.String r4 = r2.getDocnumber()     // Catch:{ Exception -> 0x0041 }
            r1.setText(r4)     // Catch:{ Exception -> 0x0041 }
            ka.c$a r1 = ka.c.f13158a     // Catch:{ Exception -> 0x0041 }
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r2.getDldetails()     // Catch:{ Exception -> 0x0041 }
            r5 = 0
            if (r4 == 0) goto L_0x0130
            com.nic.mparivahan.Dl.Model.DlobjX r4 = r4.getDlobj()     // Catch:{ Exception -> 0x0041 }
            if (r4 == 0) goto L_0x0130
            java.lang.String r4 = r4.getDlNtValdtoDt()     // Catch:{ Exception -> 0x0041 }
            goto L_0x0131
        L_0x0130:
            r4 = r5
        L_0x0131:
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0041 }
            boolean r4 = r1.n(r4)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r6 = "Validity (NT)"
            java.lang.String r7 = "validity_nt"
            if (r4 == 0) goto L_0x01aa
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r2.getDldetails()     // Catch:{ Exception -> 0x0041 }
            if (r4 == 0) goto L_0x0150
            com.nic.mparivahan.Dl.Model.DlobjX r4 = r4.getDlobj()     // Catch:{ Exception -> 0x0041 }
            if (r4 == 0) goto L_0x0150
            java.lang.String r4 = r4.getDlNtValdtoDt()     // Catch:{ Exception -> 0x0041 }
            goto L_0x0151
        L_0x0150:
            r4 = r5
        L_0x0151:
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0041 }
            boolean r1 = r1.f(r4)     // Catch:{ Exception -> 0x0041 }
            if (r1 == 0) goto L_0x01aa
            android.widget.TextView r1 = r14.O()     // Catch:{ Exception -> 0x0041 }
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r2.getDldetails()     // Catch:{ Exception -> 0x0041 }
            if (r4 == 0) goto L_0x0170
            com.nic.mparivahan.Dl.Model.DlobjX r4 = r4.getDlobj()     // Catch:{ Exception -> 0x0041 }
            if (r4 == 0) goto L_0x0170
            java.lang.String r4 = r4.getDlNtValdtoDt()     // Catch:{ Exception -> 0x0041 }
            goto L_0x0171
        L_0x0170:
            r4 = r5
        L_0x0171:
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0041 }
            r1.setText(r4)     // Catch:{ Exception -> 0x0041 }
            android.widget.TextView r1 = r14.T()     // Catch:{ Exception -> 0x0041 }
            java.lang.String r3 = r3.b(r7, r6)     // Catch:{ Exception -> 0x0041 }
            r1.setText(r3)     // Catch:{ Exception -> 0x0041 }
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r2.getDldetails()     // Catch:{ Exception -> 0x0041 }
            if (r1 == 0) goto L_0x0193
            com.nic.mparivahan.Dl.Model.DlobjX r1 = r1.getDlobj()     // Catch:{ Exception -> 0x0041 }
            if (r1 == 0) goto L_0x0193
            java.lang.String r5 = r1.getDlNtValdtoDt()     // Catch:{ Exception -> 0x0041 }
        L_0x0193:
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r1 = r13.E(r1)     // Catch:{ Exception -> 0x0041 }
            android.widget.TextView r3 = r14.O()     // Catch:{ Exception -> 0x0041 }
            r3.setText(r1)     // Catch:{ Exception -> 0x0041 }
            android.widget.TextView r3 = r14.O()     // Catch:{ Exception -> 0x0041 }
        L_0x01a6:
            r13.D(r1, r3)     // Catch:{ Exception -> 0x0041 }
            goto L_0x01de
        L_0x01aa:
            java.lang.String r1 = "calling-3"
            android.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x0041 }
            android.widget.TextView r1 = r14.T()     // Catch:{ Exception -> 0x0041 }
            java.lang.String r3 = r3.b(r7, r6)     // Catch:{ Exception -> 0x0041 }
            r1.setText(r3)     // Catch:{ Exception -> 0x0041 }
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r2.getDldetails()     // Catch:{ Exception -> 0x0041 }
            if (r1 == 0) goto L_0x01ca
            com.nic.mparivahan.Dl.Model.DlobjX r1 = r1.getDlobj()     // Catch:{ Exception -> 0x0041 }
            if (r1 == 0) goto L_0x01ca
            java.lang.String r5 = r1.getDlNtValdtoDt()     // Catch:{ Exception -> 0x0041 }
        L_0x01ca:
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r1 = r13.E(r1)     // Catch:{ Exception -> 0x0041 }
            android.widget.TextView r3 = r14.O()     // Catch:{ Exception -> 0x0041 }
            r3.setText(r1)     // Catch:{ Exception -> 0x0041 }
            android.widget.TextView r3 = r14.O()     // Catch:{ Exception -> 0x0041 }
            goto L_0x01a6
        L_0x01de:
            androidx.appcompat.widget.AppCompatImageView r1 = r14.U()     // Catch:{ Exception -> 0x0041 }
            va.a r3 = new va.a     // Catch:{ Exception -> 0x0041 }
            r3.<init>(r2, r13)     // Catch:{ Exception -> 0x0041 }
            r1.setOnClickListener(r3)     // Catch:{ Exception -> 0x0041 }
            androidx.appcompat.widget.AppCompatImageView r1 = r14.S()     // Catch:{ Exception -> 0x0041 }
            va.b r2 = new va.b     // Catch:{ Exception -> 0x0041 }
            r2.<init>(r14, r13, r15)     // Catch:{ Exception -> 0x0041 }
            r1.setOnClickListener(r2)     // Catch:{ Exception -> 0x0041 }
            goto L_0x01ff
        L_0x01f7:
            r14.printStackTrace()
            java.lang.String r14 = "calling-2"
            android.util.Log.e(r0, r14)
        L_0x01ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: va.c.p(va.c$a, int):void");
    }

    /* renamed from: J */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        DatabaseHelper A0 = DatabaseHelper.A0(this.f17586d);
        if (A0.o() != null) {
            try {
                if (A0.o().size() > 0) {
                    View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.dlexpire1, viewGroup, false);
                    l.c(inflate);
                    return new a(inflate);
                }
                Log.e("Alerts - else -1", "Alerts--23");
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.dl_expiry_adapter, viewGroup, false);
                l.c(inflate2);
                return new a(inflate2);
            } catch (Exception unused) {
                View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.dl_expiry_adapter, viewGroup, false);
                l.c(inflate3);
                return new a(inflate3);
            }
        } else {
            Log.e("Alerts - else", "Alerts--23");
            View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.dl_expiry_adapter, viewGroup, false);
            l.c(inflate4);
            return new a(inflate4);
        }
    }

    public int e() {
        return this.f17587e.size();
    }
}
