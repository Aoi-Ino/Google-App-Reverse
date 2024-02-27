package cj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.NewDlScreen.Modal.DrivingSchoolDetRequestModal;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.newlearner.AddLLDrivingSchoolActivity;
import com.nic.mparivahan.dlservices.utilities.d;
import java.util.ArrayList;
import ld.c;

public final class b extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final AddLLDrivingSchoolActivity f20107d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList f20108e;

    /* renamed from: f  reason: collision with root package name */
    private final c f20109f;

    public static final class a extends RecyclerView.d0 {
        private final TextView A;
        private final TextView B;
        private final TextView C;
        private final TextView D;
        private final ImageView E;
        private final TextView F;
        private final TextView G;
        private final TextView H;
        private final TextView I;
        private final TextView J;
        private final TextView K;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f20110y;

        /* renamed from: z  reason: collision with root package name */
        private final TextView f20111z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "itemView");
            View findViewById = view.findViewById(R.id.enrollmentNoValue);
            l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            this.f20110y = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.enrollmentDateValue);
            l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            this.f20111z = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.certificateNoValue);
            l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            this.A = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.certificateDateValue);
            l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
            this.B = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.trainedFromValue);
            l.d(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
            this.C = (TextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.trainedToValue);
            l.d(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
            this.D = (TextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.editIv);
            l.d(findViewById7, "null cannot be cast to non-null type android.widget.ImageView");
            this.E = (ImageView) findViewById7;
            View findViewById8 = view.findViewById(R.id.enrollmentNo);
            l.d(findViewById8, "null cannot be cast to non-null type android.widget.TextView");
            this.F = (TextView) findViewById8;
            View findViewById9 = view.findViewById(R.id.enrollmentDate);
            l.d(findViewById9, "null cannot be cast to non-null type android.widget.TextView");
            this.G = (TextView) findViewById9;
            View findViewById10 = view.findViewById(R.id.certificateNo);
            l.d(findViewById10, "null cannot be cast to non-null type android.widget.TextView");
            this.H = (TextView) findViewById10;
            View findViewById11 = view.findViewById(R.id.certificateDate);
            l.d(findViewById11, "null cannot be cast to non-null type android.widget.TextView");
            this.I = (TextView) findViewById11;
            View findViewById12 = view.findViewById(R.id.trainedFrom);
            l.d(findViewById12, "null cannot be cast to non-null type android.widget.TextView");
            this.J = (TextView) findViewById12;
            View findViewById13 = view.findViewById(R.id.trainedTo);
            l.d(findViewById13, "null cannot be cast to non-null type android.widget.TextView");
            this.K = (TextView) findViewById13;
        }

        public final TextView O() {
            return this.I;
        }

        public final TextView P() {
            return this.B;
        }

        public final TextView Q() {
            return this.H;
        }

        public final TextView R() {
            return this.A;
        }

        public final ImageView S() {
            return this.E;
        }

        public final TextView T() {
            return this.G;
        }

        public final TextView U() {
            return this.f20111z;
        }

        public final TextView V() {
            return this.F;
        }

        public final TextView W() {
            return this.f20110y;
        }

        public final TextView X() {
            return this.J;
        }

        public final TextView Y() {
            return this.C;
        }

        public final TextView Z() {
            return this.K;
        }

        public final TextView a0() {
            return this.D;
        }
    }

    public b(AddLLDrivingSchoolActivity addLLDrivingSchoolActivity, ArrayList arrayList, c cVar) {
        l.f(addLLDrivingSchoolActivity, "context");
        l.f(arrayList, "list");
        l.f(cVar, "langSession");
        this.f20107d = addLLDrivingSchoolActivity;
        this.f20108e = arrayList;
        this.f20109f = cVar;
    }

    /* access modifiers changed from: private */
    public static final void C(b bVar, int i10, View view) {
        l.f(bVar, "this$0");
        bVar.f20107d.A1(i10);
    }

    /* renamed from: B */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        Object obj = this.f20108e.get(i10);
        l.e(obj, "get(...)");
        DrivingSchoolDetRequestModal drivingSchoolDetRequestModal = (DrivingSchoolDetRequestModal) obj;
        aVar.V().setText(this.f20109f.b("enrollment_no", this.f20107d.getString(R.string.enrollment_no)));
        aVar.T().setText(this.f20109f.b("enrollement_date", this.f20107d.getString(R.string.enrollment_date)));
        aVar.Q().setText(this.f20109f.b("certificate_no", this.f20107d.getString(R.string.certificate_no)));
        aVar.O().setText(this.f20109f.b("certificate_date", this.f20107d.getString(R.string.certificate_date)));
        aVar.X().setText(this.f20109f.b("trained_from", this.f20107d.getString(R.string.trained_from)));
        aVar.Z().setText(this.f20109f.b("trained_to", this.f20107d.getString(R.string.trained_to)));
        if (d.d(drivingSchoolDetRequestModal.getCertNo())) {
            aVar.R().setText(drivingSchoolDetRequestModal.getCertNo());
        } else {
            aVar.R().setText("NA");
        }
        if (d.d(drivingSchoolDetRequestModal.getCertDate())) {
            aVar.P().setText(drivingSchoolDetRequestModal.getCertDate());
        } else {
            aVar.P().setText("NA");
        }
        if (d.d(drivingSchoolDetRequestModal.getEnrollDate())) {
            aVar.U().setText(drivingSchoolDetRequestModal.getEnrollDate());
        } else {
            aVar.U().setText("NA");
        }
        if (d.d(drivingSchoolDetRequestModal.getEnrollNo())) {
            aVar.W().setText(drivingSchoolDetRequestModal.getEnrollNo());
        } else {
            aVar.W().setText("NA");
        }
        if (d.d(drivingSchoolDetRequestModal.getTrainTo())) {
            aVar.a0().setText(drivingSchoolDetRequestModal.getTrainTo());
        } else {
            aVar.a0().setText("NA");
        }
        if (d.d(drivingSchoolDetRequestModal.getTrainFrom())) {
            aVar.Y().setText(drivingSchoolDetRequestModal.getTrainFrom());
        } else {
            aVar.Y().setText("NA");
        }
        aVar.S().setOnClickListener(new a(this, i10));
    }

    /* renamed from: D */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_added_d_school, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public int e() {
        return this.f20108e.size();
    }
}
