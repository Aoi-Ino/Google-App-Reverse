package kd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import cm.u;
import com.nic.mparivahan.R;
import com.nic.mparivahan.ServiceWithdrawnScreen.Activity.SelectedWithdrawnList;
import com.nic.mparivahan.ServiceWithdrawnScreen.Modal.AppliedServiceResultModal;
import com.nic.mparivahan.dlservices.utilities.d;
import java.util.ArrayList;

public final class a extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final Context f13180d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList f13181e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList f13182f;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList f13183g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final SelectedWithdrawnList f13184h;

    /* renamed from: kd.a$a  reason: collision with other inner class name */
    public static final class C0175a extends RecyclerView.d0 {
        private final TextView A;
        private final TextView B;

        /* renamed from: y  reason: collision with root package name */
        private final Spinner f13185y;

        /* renamed from: z  reason: collision with root package name */
        private final Spinner f13186z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0175a(View view) {
            super(view);
            l.f(view, "itemView");
            View findViewById = view.findViewById(R.id.confirmationSpn);
            l.e(findViewById, "findViewById(...)");
            this.f13185y = (Spinner) findViewById;
            View findViewById2 = view.findViewById(R.id.reasonRemarkSpn);
            l.e(findViewById2, "findViewById(...)");
            this.f13186z = (Spinner) findViewById2;
            View findViewById3 = view.findViewById(R.id.transactionAppliedValue);
            l.e(findViewById3, "findViewById(...)");
            this.A = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.appliedCov);
            l.e(findViewById4, "findViewById(...)");
            this.B = (TextView) findViewById4;
        }

        public final TextView O() {
            return this.B;
        }

        public final Spinner P() {
            return this.f13185y;
        }

        public final Spinner Q() {
            return this.f13186z;
        }

        public final TextView R() {
            return this.A;
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ u f13187e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a f13188f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ u f13189g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ AppliedServiceResultModal f13190h;

        b(u uVar, a aVar, u uVar2, AppliedServiceResultModal appliedServiceResultModal) {
            this.f13187e = uVar;
            this.f13188f = aVar;
            this.f13189g = uVar2;
            this.f13190h = appliedServiceResultModal;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            String str;
            String str2;
            l.c(adapterView);
            Object tag = adapterView.getTag();
            l.d(tag, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) tag).intValue();
            String obj = adapterView.getItemAtPosition(i10).toString();
            this.f13187e.f20234e = obj;
            if (!l.a(obj, "Select")) {
                String str3 = (String) this.f13187e.f20234e;
                if (l.a(str3, "Yes")) {
                    str2 = "Y";
                } else if (l.a(str3, "No")) {
                    str2 = "N";
                } else {
                    str = "Select";
                    this.f13188f.f13184h.V1(intValue, str, (String) this.f13189g.f20234e, this.f13190h.getAppliedService(), this.f13190h.getAppliedCov(), this.f13190h.getStatus());
                }
                str = str2;
                this.f13188f.f13184h.V1(intValue, str, (String) this.f13189g.f20234e, this.f13190h.getAppliedService(), this.f13190h.getAppliedCov(), this.f13190h.getStatus());
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class c implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ u f13191e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ u f13192f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f13193g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ AppliedServiceResultModal f13194h;

        c(u uVar, u uVar2, a aVar, AppliedServiceResultModal appliedServiceResultModal) {
            this.f13191e = uVar;
            this.f13192f = uVar2;
            this.f13193g = aVar;
            this.f13194h = appliedServiceResultModal;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            String str;
            String str2;
            l.c(adapterView);
            Object tag = adapterView.getTag();
            l.d(tag, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) tag).intValue();
            String obj = adapterView.getItemAtPosition(i10).toString();
            this.f13191e.f20234e = obj;
            if (!l.a(obj, "Select")) {
                String str3 = (String) this.f13192f.f20234e;
                if (l.a(str3, "Yes")) {
                    str2 = "Y";
                } else if (l.a(str3, "No")) {
                    str2 = "N";
                } else {
                    str = "Select";
                    this.f13193g.f13184h.V1(intValue, str, (String) this.f13191e.f20234e, this.f13194h.getAppliedService(), this.f13194h.getAppliedCov(), this.f13194h.getStatus());
                }
                str = str2;
                this.f13193g.f13184h.V1(intValue, str, (String) this.f13191e.f20234e, this.f13194h.getAppliedService(), this.f13194h.getAppliedCov(), this.f13194h.getStatus());
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public a(Context context, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SelectedWithdrawnList selectedWithdrawnList) {
        l.f(context, "context");
        l.f(arrayList, "list");
        l.f(arrayList2, "reasonList");
        l.f(arrayList3, "confirmationArray");
        l.f(selectedWithdrawnList, "activity");
        this.f13180d = context;
        this.f13181e = arrayList;
        this.f13182f = arrayList2;
        this.f13183g = arrayList3;
        this.f13184h = selectedWithdrawnList;
    }

    /* renamed from: B */
    public void p(C0175a aVar, int i10) {
        l.f(aVar, "holder");
        u uVar = new u();
        uVar.f20234e = "";
        u uVar2 = new u();
        uVar2.f20234e = "";
        Object obj = this.f13181e.get(i10);
        l.e(obj, "get(...)");
        AppliedServiceResultModal appliedServiceResultModal = (AppliedServiceResultModal) obj;
        aVar.R().setText(appliedServiceResultModal.getAppliedService());
        if (!d.d(appliedServiceResultModal.getAppliedCov()) || appliedServiceResultModal.getAppliedCov() == "NA") {
            aVar.O().setVisibility(8);
        } else {
            aVar.O().setVisibility(0);
            TextView O = aVar.O();
            O.setText(this.f13180d.getString(R.string.applied_cov) + ' ' + appliedServiceResultModal.getAppliedCov());
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.f13180d, R.layout.service_withdrawn_spinner_item, this.f13182f);
        arrayAdapter.setDropDownViewResource(R.layout.service_withdrawn_spinner_item);
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this.f13180d, R.layout.service_withdrawn_spinner_item, this.f13183g);
        arrayAdapter2.setDropDownViewResource(R.layout.service_withdrawn_spinner_item);
        aVar.Q().setTag(Integer.valueOf(i10));
        aVar.P().setTag(Integer.valueOf(i10));
        aVar.Q().setAdapter(arrayAdapter);
        aVar.P().setAdapter(arrayAdapter2);
        aVar.P().setOnItemSelectedListener(new b(uVar2, this, uVar, appliedServiceResultModal));
        aVar.Q().setOnItemSelectedListener(new c(uVar, uVar2, this, appliedServiceResultModal));
    }

    /* renamed from: C */
    public C0175a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_item_applied_withdrawn_list, viewGroup, false);
        l.c(inflate);
        return new C0175a(inflate);
    }

    public final void D(ArrayList arrayList) {
        l.f(arrayList, "updatedList");
        ArrayList arrayList2 = this.f13181e;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        j();
    }

    public int e() {
        return this.f13181e.size();
    }
}
