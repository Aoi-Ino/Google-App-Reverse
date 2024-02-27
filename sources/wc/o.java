package wc;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.NrvDetails;
import com.nic.mparivahan.RC.SharedRcScreen;
import com.nic.mparivahan.RC.VirtualRcScreen;
import java.util.ArrayList;
import zc.b;

public final class o extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f18105d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f18106e;

    /* renamed from: f  reason: collision with root package name */
    private final b f18107f;

    public static final class a extends RecyclerView.d0 {
        private final ImageView A;
        private final TextView B;
        private final TextView C;
        private final TextView D;
        private final TextView E;
        private final TextView F;
        private final LinearLayout G;
        private final ImageView H;
        private final ImageView I;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f18108y;

        /* renamed from: z  reason: collision with root package name */
        private final ImageView f18109z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.shared_rc);
            l.e(findViewById, "findViewById(...)");
            this.f18108y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.update);
            l.e(findViewById2, "findViewById(...)");
            this.f18109z = (ImageView) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.delet);
            l.e(findViewById3, "findViewById(...)");
            this.A = (ImageView) findViewById3;
            View findViewById4 = this.f3622e.findViewById(R.id.rc_number);
            l.e(findViewById4, "findViewById(...)");
            this.B = (TextView) findViewById4;
            View findViewById5 = this.f3622e.findViewById(R.id.owner_name);
            l.e(findViewById5, "findViewById(...)");
            this.C = (TextView) findViewById5;
            View findViewById6 = this.f3622e.findViewById(R.id.address);
            l.e(findViewById6, "findViewById(...)");
            this.D = (TextView) findViewById6;
            View findViewById7 = this.f3622e.findViewById(R.id.issue_date);
            l.e(findViewById7, "findViewById(...)");
            this.E = (TextView) findViewById7;
            View findViewById8 = this.f3622e.findViewById(R.id.valid_upto);
            l.e(findViewById8, "findViewById(...)");
            this.F = (TextView) findViewById8;
            View findViewById9 = this.f3622e.findViewById(R.id.linear_parent);
            l.e(findViewById9, "findViewById(...)");
            this.G = (LinearLayout) findViewById9;
            View findViewById10 = this.f3622e.findViewById(R.id.share_doc);
            l.e(findViewById10, "findViewById(...)");
            this.H = (ImageView) findViewById10;
            View findViewById11 = this.f3622e.findViewById(R.id.option_menu);
            l.e(findViewById11, "findViewById(...)");
            this.I = (ImageView) findViewById11;
        }

        public final TextView O() {
            return this.D;
        }

        public final ImageView P() {
            return this.A;
        }

        public final TextView Q() {
            return this.E;
        }

        public final LinearLayout R() {
            return this.G;
        }

        public final ImageView S() {
            return this.I;
        }

        public final TextView T() {
            return this.C;
        }

        public final TextView U() {
            return this.B;
        }

        public final ImageView V() {
            return this.H;
        }

        public final ImageView W() {
            return this.f18109z;
        }

        public final TextView X() {
            return this.F;
        }
    }

    public o(ArrayList arrayList, Context context, b bVar) {
        l.f(arrayList, "rc_details");
        l.f(context, "context");
        l.f(bVar, "deletMyRcRcDeletListner");
        this.f18105d = arrayList;
        this.f18106e = context;
        this.f18107f = bVar;
    }

    /* access modifiers changed from: private */
    public static final void H(o oVar, String str, View view) {
        l.f(oVar, "this$0");
        Intent intent = new Intent(oVar.f18106e, SharedRcScreen.class);
        intent.putExtra("RcNumber", str);
        oVar.f18106e.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void I(o oVar, String str, View view) {
        l.f(oVar, "this$0");
        Intent intent = new Intent(oVar.f18106e, VirtualRcScreen.class);
        intent.putExtra("RcNumber", str);
        oVar.f18106e.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void J(o oVar, String str, int i10, View view) {
        l.f(oVar, "this$0");
        oVar.f18107f.n(str, i10);
    }

    /* access modifiers changed from: private */
    public static final void K(o oVar, String str, int i10, View view) {
        l.f(oVar, "this$0");
        oVar.f18107f.P(str, i10);
    }

    /* access modifiers changed from: private */
    public static final void L(o oVar, a aVar, String str, int i10, View view) {
        l.f(oVar, "this$0");
        l.f(aVar, "$holder");
        PopupMenu popupMenu = new PopupMenu(oVar.f18106e, aVar.S());
        popupMenu.inflate(R.menu.menu_item_option);
        l.e(popupMenu.getMenu().findItem(R.id.menu1), "findItem(...)");
        l.e(popupMenu.getMenu().findItem(R.id.menu2), "findItem(...)");
        l.e(popupMenu.getMenu().findItem(R.id.menu3), "findItem(...)");
        l.e(popupMenu.getMenu().findItem(R.id.menu4), "findItem(...)");
        popupMenu.setGravity(8388613);
        popupMenu.setOnMenuItemClickListener(new n(oVar, str, i10));
        popupMenu.show();
    }

    /* access modifiers changed from: private */
    public static final boolean M(o oVar, String str, int i10, MenuItem menuItem) {
        Intent intent;
        l.f(oVar, "this$0");
        switch (menuItem.getItemId()) {
            case R.id.menu1 /*2131363612*/:
                intent = new Intent(oVar.f18106e, VirtualRcScreen.class);
                break;
            case R.id.menu2 /*2131363613*/:
                intent = new Intent(oVar.f18106e, SharedRcScreen.class);
                break;
            case R.id.menu3 /*2131363614*/:
                oVar.f18107f.P(str, i10);
                return false;
            case R.id.menu4 /*2131363615*/:
                oVar.f18107f.n(str, i10);
                return false;
            default:
                return false;
        }
        intent.putExtra("RcNumber", str);
        oVar.f18106e.startActivity(intent);
        return false;
    }

    /* renamed from: G */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        try {
            String rc_regn_no = ((NrvDetails) this.f18105d.get(i10)).getRc_regn_no();
            String rc_owner_name = ((NrvDetails) this.f18105d.get(i10)).getRc_owner_name();
            String rc_present_address = ((NrvDetails) this.f18105d.get(i10)).getRc_present_address();
            String rc_regn_dt = ((NrvDetails) this.f18105d.get(i10)).getRc_regn_dt();
            String rc_fit_upto = ((NrvDetails) this.f18105d.get(i10)).getRc_fit_upto();
            aVar.U().setText(rc_regn_no);
            aVar.T().setText(rc_owner_name);
            aVar.O().setText(rc_present_address);
            TextView Q = aVar.Q();
            Q.setText("Issue Date : " + rc_regn_dt);
            TextView X = aVar.X();
            X.setText("Valid Upto : " + rc_fit_upto);
            aVar.V().setOnClickListener(new i(this, rc_regn_no));
            aVar.R().setOnClickListener(new j(this, rc_regn_no));
            aVar.P().setOnClickListener(new k(this, rc_regn_no, i10));
            aVar.W().setOnClickListener(new l(this, rc_regn_no, i10));
            aVar.S().setOnClickListener(new m(this, aVar, rc_regn_no, i10));
        } catch (Exception unused) {
        }
    }

    /* renamed from: N */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.myrc_item, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public final void O(int i10) {
        this.f18105d.remove(i10);
        n(i10);
        m(i10, this.f18105d.size());
    }

    public int e() {
        return this.f18105d.size();
    }
}
