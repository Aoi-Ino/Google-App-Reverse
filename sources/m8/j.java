package m8;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.Citizen.Activities.ViewComplaintDetails;
import com.nic.mparivahan.Citizen.Models.MparCitizenViolationX;
import com.nic.mparivahan.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public final class j extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f13873d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f13874e;

    public static final class a extends RecyclerView.d0 {
        private final TextView A;
        private final TextView B;
        private final TextView C;
        private final TextView D;
        private final TextView E;
        private final TextView F;
        private final TextView G;
        private final TextView H;
        private final TextView I;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f13875y;

        /* renamed from: z  reason: collision with root package name */
        private final TextView f13876z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.tv_report_id);
            l.e(findViewById, "findViewById(...)");
            this.f13875y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.tv_report_vehicle_no);
            l.e(findViewById2, "findViewById(...)");
            this.f13876z = (TextView) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.tv_report_location);
            l.e(findViewById3, "findViewById(...)");
            this.A = (TextView) findViewById3;
            View findViewById4 = this.f3622e.findViewById(R.id.txt_comp_status);
            l.e(findViewById4, "findViewById(...)");
            this.B = (TextView) findViewById4;
            View findViewById5 = this.f3622e.findViewById(R.id.txt_comp_date);
            l.e(findViewById5, "findViewById(...)");
            this.C = (TextView) findViewById5;
            View findViewById6 = this.f3622e.findViewById(R.id.tv_date_value);
            l.e(findViewById6, "findViewById(...)");
            this.D = (TextView) findViewById6;
            View findViewById7 = this.f3622e.findViewById(R.id.id_view_details);
            l.e(findViewById7, "findViewById(...)");
            this.E = (TextView) findViewById7;
            View findViewById8 = this.f3622e.findViewById(R.id.tv_vehicle_no);
            l.e(findViewById8, "findViewById(...)");
            this.F = (TextView) findViewById8;
            View findViewById9 = this.f3622e.findViewById(R.id.tv_status);
            l.e(findViewById9, "findViewById(...)");
            this.G = (TextView) findViewById9;
            View findViewById10 = this.f3622e.findViewById(R.id.tv_location);
            l.e(findViewById10, "findViewById(...)");
            this.H = (TextView) findViewById10;
            View findViewById11 = this.f3622e.findViewById(R.id.tv_date);
            l.e(findViewById11, "findViewById(...)");
            this.I = (TextView) findViewById11;
        }

        public final TextView O() {
            return this.E;
        }

        public final TextView P() {
            return this.H;
        }

        public final TextView Q() {
            return this.G;
        }

        public final TextView R() {
            return this.F;
        }

        public final TextView S() {
            return this.I;
        }

        public final TextView T() {
            return this.D;
        }

        public final TextView U() {
            return this.C;
        }

        public final TextView V() {
            return this.f13875y;
        }

        public final TextView W() {
            return this.A;
        }

        public final TextView X() {
            return this.B;
        }

        public final TextView Y() {
            return this.f13876z;
        }
    }

    public j(ArrayList arrayList, Context context) {
        l.f(arrayList, "mList");
        l.f(context, "mContext");
        this.f13873d = arrayList;
        this.f13874e = context;
    }

    /* access modifiers changed from: private */
    public static final void D(j jVar, MparCitizenViolationX mparCitizenViolationX, View view) {
        l.f(jVar, "this$0");
        l.f(mparCitizenViolationX, "$mModel");
        Intent intent = new Intent(jVar.f13874e, ViewComplaintDetails.class);
        intent.putExtra("vehicleNumber", mparCitizenViolationX.getViolRegnNo());
        intent.putExtra("status", String.valueOf(mparCitizenViolationX.getViolStatus()));
        intent.putExtra("location", mparCitizenViolationX.getViolLocation().toString());
        intent.putExtra("violOffenceId", String.valueOf(mparCitizenViolationX.getViolRecordId()));
        jVar.f13874e.startActivity(intent);
    }

    public final String B(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date parse = simpleDateFormat.parse(str);
            l.e(parse, "parse(...)");
            return simpleDateFormat2.format(parse);
        } catch (ParseException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ff  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p(m8.j.a r6, int r7) {
        /*
            r5 = this;
            java.lang.String r0 = "holder"
            cm.l.f(r6, r0)
            ld.c r0 = new ld.c
            android.content.Context r1 = r5.f13874e
            r0.<init>(r1)
            android.widget.TextView r1 = r6.R()
            java.lang.String r2 = "radio_btn_vehicle_no"
            java.lang.String r3 = "Vehicle Number"
            java.lang.String r2 = r0.b(r2, r3)
            r1.setText(r2)
            android.widget.TextView r1 = r6.Q()
            java.lang.String r2 = "btn_challan_status"
            java.lang.String r3 = "Status"
            java.lang.String r2 = r0.b(r2, r3)
            r1.setText(r2)
            android.widget.TextView r1 = r6.S()
            java.lang.String r2 = "cs_DateTime"
            java.lang.String r3 = "Date & Time"
            java.lang.String r2 = r0.b(r2, r3)
            r1.setText(r2)
            android.widget.TextView r1 = r6.P()
            java.lang.String r2 = "cs_Location"
            java.lang.String r3 = "Location"
            java.lang.String r2 = r0.b(r2, r3)
            r1.setText(r2)
            android.widget.TextView r1 = r6.O()
            java.lang.String r2 = "label_view"
            java.lang.String r3 = "View Details"
            java.lang.String r2 = r0.b(r2, r3)
            r1.setText(r2)
            java.util.ArrayList r1 = r5.f13873d
            java.lang.Object r7 = r1.get(r7)
            java.lang.String r1 = "get(...)"
            cm.l.e(r7, r1)
            com.nic.mparivahan.Citizen.Models.MparCitizenViolationX r7 = (com.nic.mparivahan.Citizen.Models.MparCitizenViolationX) r7
            android.widget.TextView r1 = r6.V()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "cs_trafficReport_ViolationID"
            java.lang.String r4 = "Violation ID"
            java.lang.String r0 = r0.b(r3, r4)
            r2.append(r0)
            java.lang.String r0 = " : # "
            r2.append(r0)
            int r0 = r7.getViolRecordId()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.setText(r0)
            android.widget.TextView r0 = r6.Y()
            java.lang.String r1 = r7.getViolRegnNo()
            r0.setText(r1)
            android.widget.TextView r0 = r6.W()
            java.lang.String r1 = r7.getViolLocation()
            r0.setText(r1)
            android.widget.TextView r0 = r6.T()
            java.lang.String r1 = r7.getViolSubmittedAt()
            r0.setText(r1)
            int r0 = r7.getViolStatus()
            if (r0 != 0) goto L_0x00bc
            android.widget.TextView r0 = r6.X()
            java.lang.String r1 = "Pending"
        L_0x00b8:
            r0.setText(r1)
            goto L_0x00f4
        L_0x00bc:
            int r0 = r7.getViolStatus()
            r1 = 1
            if (r0 != r1) goto L_0x00ca
            android.widget.TextView r0 = r6.X()
            java.lang.String r1 = "Active"
            goto L_0x00b8
        L_0x00ca:
            int r0 = r7.getViolStatus()
            r1 = 2
            if (r0 != r1) goto L_0x00d8
            android.widget.TextView r0 = r6.X()
            java.lang.String r1 = "Action Taken"
            goto L_0x00b8
        L_0x00d8:
            int r0 = r7.getViolStatus()
            r1 = 3
            if (r0 != r1) goto L_0x00e6
            android.widget.TextView r0 = r6.X()
            java.lang.String r1 = "Closed"
            goto L_0x00b8
        L_0x00e6:
            int r0 = r7.getViolStatus()
            r1 = 4
            if (r0 != r1) goto L_0x00f4
            android.widget.TextView r0 = r6.X()
            java.lang.String r1 = "Rejected"
            goto L_0x00b8
        L_0x00f4:
            java.lang.String r0 = r7.getViolSubmittedAt()
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00ff
            goto L_0x011a
        L_0x00ff:
            android.widget.TextView r0 = r6.U()
            java.lang.String r1 = r7.getViolSubmittedAt()
            r2 = 0
            r3 = 10
            java.lang.String r1 = r1.substring(r2, r3)
            java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
            cm.l.e(r1, r2)
            java.lang.String r1 = r5.B(r1)
            r0.setText(r1)
        L_0x011a:
            android.view.View r6 = r6.f3622e
            m8.i r0 = new m8.i
            r0.<init>(r5, r7)
            r6.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.j.p(m8.j$a, int):void");
    }

    /* renamed from: E */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.report_list_item, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public int e() {
        return this.f13873d.size();
    }
}
