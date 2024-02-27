package e9;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.Citizen.Activities.ViewAccidentDetails;
import com.nic.mparivahan.Citizen.Models.MparCitizenAccident;
import com.nic.mparivahan.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import ld.c;

public final class b extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f11102d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f11103e;

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
        private final TextView f11104y;

        /* renamed from: z  reason: collision with root package name */
        private final TextView f11105z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.tv_report_id);
            l.e(findViewById, "findViewById(...)");
            this.f11104y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.tv_report_vehicle_no);
            l.e(findViewById2, "findViewById(...)");
            this.f11105z = (TextView) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.tv_report_location);
            l.e(findViewById3, "findViewById(...)");
            this.A = (TextView) findViewById3;
            View findViewById4 = this.f3622e.findViewById(R.id.txt_comp_status);
            l.e(findViewById4, "findViewById(...)");
            this.B = (TextView) findViewById4;
            View findViewById5 = this.f3622e.findViewById(R.id.txt_comp_date);
            l.e(findViewById5, "findViewById(...)");
            this.C = (TextView) findViewById5;
            View findViewById6 = this.f3622e.findViewById(R.id.id_view_details);
            l.e(findViewById6, "findViewById(...)");
            this.D = (TextView) findViewById6;
            View findViewById7 = this.f3622e.findViewById(R.id.tv_date_value);
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
            return this.D;
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
            return this.E;
        }

        public final TextView U() {
            return this.C;
        }

        public final TextView V() {
            return this.f11104y;
        }

        public final TextView W() {
            return this.A;
        }

        public final TextView X() {
            return this.B;
        }

        public final TextView Y() {
            return this.f11105z;
        }
    }

    public b(ArrayList arrayList, Context context) {
        l.f(arrayList, "mList");
        l.f(context, "mContext");
        this.f11102d = arrayList;
        this.f11103e = context;
    }

    /* access modifiers changed from: private */
    public static final void D(b bVar, MparCitizenAccident mparCitizenAccident, View view) {
        l.f(bVar, "this$0");
        l.f(mparCitizenAccident, "$mModel");
        Intent intent = new Intent(bVar.f11103e, ViewAccidentDetails.class);
        intent.putExtra("vehicleNumber", mparCitizenAccident.getAccdRegnNo());
        intent.putExtra("status", String.valueOf(mparCitizenAccident.getAccdRecordId()));
        intent.putExtra("location", mparCitizenAccident.getAccdLocation().toString());
        intent.putExtra("accRecordId", String.valueOf(mparCitizenAccident.getAccdRecordId()));
        bVar.f11103e.startActivity(intent);
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

    /* renamed from: C */
    public void p(a aVar, int i10) {
        TextView X;
        String str;
        l.f(aVar, "holder");
        c cVar = new c(this.f11103e);
        aVar.R().setText(cVar.b("Document_type_Text", "Vehicle Number"));
        aVar.Q().setText(cVar.b("Document_Name_Text", "Status"));
        aVar.S().setText(cVar.b("label_view", "Date &amp; Time"));
        aVar.P().setText(cVar.b("label_view", "Location"));
        aVar.O().setText(cVar.b("label_view", "View Details"));
        Object obj = this.f11102d.get(i10);
        l.e(obj, "get(...)");
        MparCitizenAccident mparCitizenAccident = (MparCitizenAccident) obj;
        TextView V = aVar.V();
        V.setText("Accident ID: #" + mparCitizenAccident.getAccdRecordId());
        aVar.Y().setText(mparCitizenAccident.getAccdRegnNo());
        aVar.W().setText(mparCitizenAccident.getAccdLocation());
        aVar.T().setText(mparCitizenAccident.getAccdSubmittedAt());
        if (mparCitizenAccident.getAccdStatus() == 0) {
            X = aVar.X();
            str = "Pending";
        } else {
            X = aVar.X();
            str = "Active";
        }
        X.setText(str);
        if (mparCitizenAccident.getAccdSubmittedAt().length() != 0) {
            TextView U = aVar.U();
            String substring = mparCitizenAccident.getAccdSubmittedAt().substring(0, 10);
            l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            U.setText(B(substring));
        }
        aVar.O().setOnClickListener(new a(this, mparCitizenAccident));
    }

    /* renamed from: E */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.report_list_item, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public int e() {
        return this.f11102d.size();
    }
}
