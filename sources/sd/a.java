package sd;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Tax.Model.TaxCalModleItem;
import com.nic.mparivahan.Tax.Model.TaxModes;
import java.util.ArrayList;
import java.util.List;
import v9.f;

public final class a extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private ArrayList f31188d;

    /* renamed from: e  reason: collision with root package name */
    private final C0347a f31189e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f31190f;

    /* renamed from: sd.a$a  reason: collision with other inner class name */
    public interface C0347a {
        void r(int i10, String str);
    }

    public static final class b extends RecyclerView.d0 {
        private final TextView A;
        private final TextView B;
        private final TextView C;
        private final TextView D;
        private final TextView E;
        private final TextView F;
        private final TextView G;
        private final TextView H;
        private final TextView I;
        private final TextView J;
        private final TextView K;
        private final TextView L;
        private final TextView M;
        private final TextView N;
        private final LinearLayout O;
        private Spinner P;
        private final Spinner Q;
        private final TextView R;
        private final TextView S;
        private final TextView T;
        private final TextView U;
        private final TextView V;
        private final TextView W;
        private final TextView X;
        private final TextView Y;
        private final TextView Z;

        /* renamed from: a0  reason: collision with root package name */
        private final TextView f31191a0;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f31192y;

        /* renamed from: z  reason: collision with root package name */
        private final TextView f31193z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.total_amount);
            l.e(findViewById, "findViewById(...)");
            this.f31192y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.total_amount_txt);
            l.e(findViewById2, "findViewById(...)");
            this.f31193z = (TextView) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.additionalamount);
            l.e(findViewById3, "findViewById(...)");
            this.A = (TextView) findViewById3;
            View findViewById4 = this.f3622e.findViewById(R.id.additionalamount_txt);
            l.e(findViewById4, "findViewById(...)");
            this.B = (TextView) findViewById4;
            View findViewById5 = this.f3622e.findViewById(R.id.interest);
            l.e(findViewById5, "findViewById(...)");
            this.C = (TextView) findViewById5;
            View findViewById6 = this.f3622e.findViewById(R.id.interest_txt);
            l.e(findViewById6, "findViewById(...)");
            this.D = (TextView) findViewById6;
            View findViewById7 = this.f3622e.findViewById(R.id.rebate);
            l.e(findViewById7, "findViewById(...)");
            this.E = (TextView) findViewById7;
            View findViewById8 = this.f3622e.findViewById(R.id.rebate_txt);
            l.e(findViewById8, "findViewById(...)");
            this.F = (TextView) findViewById8;
            View findViewById9 = this.f3622e.findViewById(R.id.surcharge);
            l.e(findViewById9, "findViewById(...)");
            this.G = (TextView) findViewById9;
            View findViewById10 = this.f3622e.findViewById(R.id.surcharge_txt);
            l.e(findViewById10, "findViewById(...)");
            this.H = (TextView) findViewById10;
            View findViewById11 = this.f3622e.findViewById(R.id.penality_txt);
            l.e(findViewById11, "findViewById(...)");
            this.I = (TextView) findViewById11;
            View findViewById12 = this.f3622e.findViewById(R.id.tax_amount_txt);
            l.e(findViewById12, "findViewById(...)");
            this.J = (TextView) findViewById12;
            View findViewById13 = this.f3622e.findViewById(R.id.selectcalcultaxupto);
            l.e(findViewById13, "findViewById(...)");
            this.K = (TextView) findViewById13;
            View findViewById14 = this.f3622e.findViewById(R.id.tax_upto_txt);
            l.e(findViewById14, "findViewById(...)");
            this.L = (TextView) findViewById14;
            View findViewById15 = this.f3622e.findViewById(R.id.taxhead);
            l.e(findViewById15, "findViewById(...)");
            this.M = (TextView) findViewById15;
            View findViewById16 = this.f3622e.findViewById(R.id.taxmode);
            l.e(findViewById16, "findViewById(...)");
            this.N = (TextView) findViewById16;
            View findViewById17 = this.f3622e.findViewById(R.id.linear_account);
            l.e(findViewById17, "findViewById(...)");
            this.O = (LinearLayout) findViewById17;
            View findViewById18 = this.f3622e.findViewById(R.id.tax_mode_spinner);
            l.e(findViewById18, "findViewById(...)");
            this.P = (Spinner) findViewById18;
            View findViewById19 = this.f3622e.findViewById(R.id.purposeSpinner);
            l.e(findViewById19, "findViewById(...)");
            this.Q = (Spinner) findViewById19;
            View findViewById20 = this.f3622e.findViewById(R.id.selecttaxfrom);
            l.e(findViewById20, "findViewById(...)");
            this.R = (TextView) findViewById20;
            View findViewById21 = this.f3622e.findViewById(R.id.taxfrom);
            l.e(findViewById21, "findViewById(...)");
            this.S = (TextView) findViewById21;
            View findViewById22 = this.f3622e.findViewById(R.id.selectcalcultaxupto);
            l.e(findViewById22, "findViewById(...)");
            this.T = (TextView) findViewById22;
            View findViewById23 = this.f3622e.findViewById(R.id.taxamount);
            l.e(findViewById23, "findViewById(...)");
            this.U = (TextView) findViewById23;
            View findViewById24 = this.f3622e.findViewById(R.id.penality);
            l.e(findViewById24, "findViewById(...)");
            this.V = (TextView) findViewById24;
            View findViewById25 = this.f3622e.findViewById(R.id.surcharge);
            l.e(findViewById25, "findViewById(...)");
            this.W = (TextView) findViewById25;
            View findViewById26 = this.f3622e.findViewById(R.id.rebate);
            l.e(findViewById26, "findViewById(...)");
            this.X = (TextView) findViewById26;
            View findViewById27 = this.f3622e.findViewById(R.id.interest);
            l.e(findViewById27, "findViewById(...)");
            this.Y = (TextView) findViewById27;
            View findViewById28 = this.f3622e.findViewById(R.id.additionalamount);
            l.e(findViewById28, "findViewById(...)");
            this.Z = (TextView) findViewById28;
            View findViewById29 = this.f3622e.findViewById(R.id.total_amount);
            l.e(findViewById29, "findViewById(...)");
            this.f31191a0 = (TextView) findViewById29;
        }

        public final TextView O() {
            return this.A;
        }

        public final TextView P() {
            return this.Z;
        }

        public final TextView Q() {
            return this.B;
        }

        public final TextView R() {
            return this.C;
        }

        public final TextView S() {
            return this.Y;
        }

        public final TextView T() {
            return this.D;
        }

        public final LinearLayout U() {
            return this.O;
        }

        public final TextView V() {
            return this.V;
        }

        public final TextView W() {
            return this.I;
        }

        public final TextView X() {
            return this.E;
        }

        public final TextView Y() {
            return this.X;
        }

        public final TextView Z() {
            return this.F;
        }

        public final TextView a0() {
            return this.K;
        }

        public final TextView b0() {
            return this.G;
        }

        public final TextView c0() {
            return this.W;
        }

        public final TextView d0() {
            return this.H;
        }

        public final TextView e0() {
            return this.J;
        }

        public final TextView f0() {
            return this.T;
        }

        public final TextView g0() {
            return this.L;
        }

        public final Spinner h0() {
            return this.P;
        }

        public final TextView i0() {
            return this.U;
        }

        public final TextView j0() {
            return this.R;
        }

        public final TextView k0() {
            return this.S;
        }

        public final TextView l0() {
            return this.M;
        }

        public final TextView m0() {
            return this.N;
        }

        public final TextView n0() {
            return this.f31192y;
        }

        public final TextView o0() {
            return this.f31193z;
        }

        public final TextView p0() {
            return this.f31191a0;
        }
    }

    public static final class c implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f31194e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f31195f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f31196g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f31197h;

        c(b bVar, String str, a aVar, int i10) {
            this.f31194e = bVar;
            this.f31195f = str;
            this.f31196g = aVar;
            this.f31197h = i10;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            Log.e("Postion --", String.valueOf(this.f31194e.h0().getSelectedItemPosition()));
            if (this.f31194e.h0().getSelectedItemPosition() == 0) {
                Object selectedItem = this.f31194e.h0().getSelectedItem();
                l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.Tax.Model.TaxModes");
                if (!p.o(((TaxModes) selectedItem).getTax_mode(), this.f31195f, true)) {
                    this.f31196g.B().r(this.f31197h, "Select Tax Mode");
                    return;
                }
                return;
            }
            Object selectedItem2 = this.f31194e.h0().getSelectedItem();
            l.d(selectedItem2, "null cannot be cast to non-null type com.nic.mparivahan.Tax.Model.TaxModes");
            TaxModes taxModes = (TaxModes) selectedItem2;
            if (!p.o(taxModes.getTax_mode(), this.f31195f, true)) {
                this.f31196g.B().r(this.f31197h, String.valueOf(taxModes.getTax_mode()));
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public a(ArrayList arrayList, C0347a aVar, Context context) {
        l.f(arrayList, "list");
        l.f(aVar, "listener");
        l.f(context, "context");
        this.f31188d = arrayList;
        this.f31189e = aVar;
        this.f31190f = context;
    }

    public final int A(String str, List list) {
        l.f(str, "mode");
        hm.c j10 = list != null ? q.j(list) : null;
        l.c(j10);
        int l10 = j10.l();
        int n10 = j10.n();
        if (l10 <= n10) {
            while (!p.p(((TaxModes) list.get(l10)).getTax_mode(), q.B0(str).toString(), false, 2, (Object) null)) {
                if (l10 != n10) {
                    l10++;
                }
            }
            return l10;
        }
        return 0;
    }

    public final C0347a B() {
        return this.f31189e;
    }

    /* renamed from: C */
    public void p(b bVar, int i10) {
        l.f(bVar, "holder");
        ld.c cVar = new ld.c(this.f31190f);
        bVar.l0().setText(cVar.b(f.f17510a.K(), this.f31190f.getString(R.string.mv_tax)));
        bVar.m0().setText(cVar.b("tax_mode", this.f31190f.getString(R.string.tax_mode)));
        bVar.j0().setText(cVar.b("lbl_tax_from", this.f31190f.getString(R.string.tax_from_date)));
        bVar.g0().setText(cVar.b("tax_upto", this.f31190f.getString(R.string.tax_upto)));
        bVar.a0().setText(cVar.b("tax_upto", this.f31190f.getString(R.string.tax_upto)));
        bVar.e0().setText(cVar.b("lbl_tax_amount", this.f31190f.getString(R.string.tax_amount)));
        bVar.i0().setText(cVar.b("vahan_amount", this.f31190f.getString(R.string.amount)));
        bVar.W().setText(cVar.b("lbl_penality", this.f31190f.getString(R.string.penalty)));
        bVar.V().setText(cVar.b("vahan_amount", this.f31190f.getString(R.string.amount)));
        bVar.d0().setText(cVar.b("lbl_surcharge", this.f31190f.getString(R.string.surcharge)));
        bVar.b0().setText(cVar.b("vahan_amount", this.f31190f.getString(R.string.amount)));
        bVar.Z().setText(cVar.b("lbl_rebate", this.f31190f.getString(R.string.rebate)));
        bVar.X().setText(cVar.b("vahan_amount", this.f31190f.getString(R.string.amount)));
        bVar.T().setText(cVar.b("lbl_interest", this.f31190f.getString(R.string.interest)));
        bVar.R().setText(cVar.b("vahan_amount", this.f31190f.getString(R.string.amount)));
        bVar.Q().setText(cVar.b("additional_amount1", this.f31190f.getString(R.string.additional_amount1)));
        bVar.O().setText(cVar.b("vahan_amount", this.f31190f.getString(R.string.amount)));
        bVar.o0().setText(cVar.b("total_amount", this.f31190f.getString(R.string.total_amount)));
        bVar.n0().setText(cVar.b("vahan_amount", this.f31190f.getString(R.string.amount)));
        bVar.k0().setText(cVar.b("lbl_tax_from", this.f31190f.getString(R.string.tax_from_date)));
        try {
            String valueOf = String.valueOf(((TaxCalModleItem) this.f31188d.get(i10)).getTax_HEAD());
            boolean status = ((TaxCalModleItem) this.f31188d.get(i10)).getStatus();
            bVar.l0().setText(valueOf);
            String valueOf2 = String.valueOf(((TaxCalModleItem) this.f31188d.get(i10)).getTax_MODE());
            ArrayList<TaxModes> listTaxModes = ((TaxCalModleItem) this.f31188d.get(i10)).getListTaxModes();
            l.c(listTaxModes);
            TaxModes taxModes = new TaxModes("Select Tax Mode", "Select Tax Mode");
            if (!p.p(listTaxModes.get(0).getTax_mode(), "Select Tax Mode", false, 2, (Object) null)) {
                listTaxModes.add(0, taxModes);
            }
            bVar.h0().setAdapter(new c(this.f31190f, listTaxModes));
            bVar.h0().setSelection(A(String.valueOf(((TaxCalModleItem) this.f31188d.get(i10)).getTax_MODE()), listTaxModes));
            if (status) {
                bVar.U().setVisibility(0);
                try {
                    bVar.h0().setEnabled(false);
                    Object obj = this.f31188d.get(i10);
                    l.e(obj, "get(...)");
                    E(bVar, (TaxCalModleItem) obj);
                } catch (Exception unused) {
                }
            } else {
                bVar.U().setVisibility(8);
            }
            Spinner h02 = bVar.h0();
            if (h02 != null) {
                h02.setOnItemSelectedListener(new c(bVar, valueOf2, this, i10));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: D */
    public b r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tax_calculate_item, viewGroup, false);
        l.c(inflate);
        return new b(inflate);
    }

    public final void E(b bVar, TaxCalModleItem taxCalModleItem) {
        l.f(bVar, "holder");
        l.f(taxCalModleItem, "item");
        bVar.f0().setText(taxCalModleItem.getTax_UPTO());
        bVar.j0().setText(taxCalModleItem.getTax_FROM());
        bVar.i0().setText(String.valueOf(taxCalModleItem.getAmount()));
        bVar.V().setText(String.valueOf(taxCalModleItem.getPenalty()));
        bVar.c0().setText(String.valueOf(taxCalModleItem.getSurcharge()));
        bVar.Y().setText(String.valueOf(taxCalModleItem.getRebate()));
        bVar.S().setText(String.valueOf(taxCalModleItem.getInterest()));
        bVar.P().setText(String.valueOf(taxCalModleItem.getAmount1()));
        bVar.p0().setText(String.valueOf(taxCalModleItem.getGamount()));
    }

    public int e() {
        return this.f31188d.size();
    }
}
