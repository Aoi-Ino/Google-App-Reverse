package dc;

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
import cm.u;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.NrvDetails;
import com.nic.mparivahan.RC.SharedRcScreen;
import com.nic.mparivahan.RC.VirtualRcScreen;
import java.util.ArrayList;
import ld.c;
import v9.f;
import zc.b;

public final class d extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f9959d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f9960e;

    /* renamed from: f  reason: collision with root package name */
    private final b f9961f;

    public static final class a extends RecyclerView.d0 {
        private final TextView A;
        private final TextView B;
        private final TextView C;
        private final TextView D;
        private final LinearLayout E;
        private final ImageView F;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f9962y;

        /* renamed from: z  reason: collision with root package name */
        private final TextView f9963z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.shared_rc);
            l.e(findViewById, "findViewById(...)");
            this.f9962y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.rc_number);
            l.e(findViewById2, "findViewById(...)");
            this.f9963z = (TextView) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.owner_name);
            l.e(findViewById3, "findViewById(...)");
            this.A = (TextView) findViewById3;
            View findViewById4 = this.f3622e.findViewById(R.id.address);
            l.e(findViewById4, "findViewById(...)");
            this.B = (TextView) findViewById4;
            View findViewById5 = this.f3622e.findViewById(R.id.issue_date);
            l.e(findViewById5, "findViewById(...)");
            this.C = (TextView) findViewById5;
            View findViewById6 = this.f3622e.findViewById(R.id.valid_upto);
            l.e(findViewById6, "findViewById(...)");
            this.D = (TextView) findViewById6;
            View findViewById7 = this.f3622e.findViewById(R.id.linear_parent);
            l.e(findViewById7, "findViewById(...)");
            this.E = (LinearLayout) findViewById7;
            View findViewById8 = this.f3622e.findViewById(R.id.option_menu);
            l.e(findViewById8, "findViewById(...)");
            this.F = (ImageView) findViewById8;
        }

        public final TextView O() {
            return this.B;
        }

        public final TextView P() {
            return this.C;
        }

        public final LinearLayout Q() {
            return this.E;
        }

        public final ImageView R() {
            return this.F;
        }

        public final TextView S() {
            return this.A;
        }

        public final TextView T() {
            return this.f9963z;
        }

        public final TextView U() {
            return this.D;
        }
    }

    public d(ArrayList arrayList, Context context, b bVar) {
        l.f(arrayList, "rc_details");
        l.f(context, "context");
        l.f(bVar, "deletMyRcRcDeletListner");
        this.f9959d = arrayList;
        this.f9960e = context;
        this.f9961f = bVar;
    }

    /* access modifiers changed from: private */
    public static final void E(View view) {
    }

    /* access modifiers changed from: private */
    public static final void F(d dVar, a aVar, u uVar, String str, int i10, View view) {
        l.f(dVar, "this$0");
        l.f(aVar, "$holder");
        l.f(uVar, "$session");
        PopupMenu popupMenu = new PopupMenu(dVar.f9960e, aVar.R());
        popupMenu.setGravity(8388613);
        popupMenu.inflate(R.menu.menu_item_option);
        MenuItem findItem = popupMenu.getMenu().findItem(R.id.menu1);
        l.e(findItem, "findItem(...)");
        MenuItem findItem2 = popupMenu.getMenu().findItem(R.id.menu2);
        l.e(findItem2, "findItem(...)");
        MenuItem findItem3 = popupMenu.getMenu().findItem(R.id.menu3);
        l.e(findItem3, "findItem(...)");
        MenuItem findItem4 = popupMenu.getMenu().findItem(R.id.menu4);
        l.e(findItem4, "findItem(...)");
        findItem.setTitle(((c) uVar.f20234e).b("label_view", "View"));
        findItem2.setTitle(((c) uVar.f20234e).b("label_share", "Share"));
        findItem3.setTitle(((c) uVar.f20234e).b(f.f17510a.j0(), "Refresh"));
        findItem4.setTitle(((c) uVar.f20234e).b("delete", "Delete"));
        popupMenu.setOnMenuItemClickListener(new c(dVar, str, i10));
        popupMenu.show();
    }

    /* access modifiers changed from: private */
    public static final boolean G(d dVar, String str, int i10, MenuItem menuItem) {
        Intent intent;
        l.f(dVar, "this$0");
        switch (menuItem.getItemId()) {
            case R.id.menu1 /*2131363612*/:
                intent = new Intent(dVar.f9960e, VirtualRcScreen.class);
                break;
            case R.id.menu2 /*2131363613*/:
                intent = new Intent(dVar.f9960e, SharedRcScreen.class);
                break;
            case R.id.menu3 /*2131363614*/:
                dVar.f9961f.P(str, i10);
                return false;
            case R.id.menu4 /*2131363615*/:
                dVar.f9961f.n(str, i10);
                return false;
            default:
                return false;
        }
        intent.putExtra("RcNumber", str);
        dVar.f9960e.startActivity(intent);
        return false;
    }

    /* renamed from: D */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        try {
            u uVar = new u();
            uVar.f20234e = new c(this.f9960e);
            String rc_regn_no = ((NrvDetails) this.f9959d.get(i10)).getRc_regn_no();
            String rc_owner_name = ((NrvDetails) this.f9959d.get(i10)).getRc_owner_name();
            String rc_present_address = ((NrvDetails) this.f9959d.get(i10)).getRc_present_address();
            String rc_regn_dt = ((NrvDetails) this.f9959d.get(i10)).getRc_regn_dt();
            String rc_fit_upto = ((NrvDetails) this.f9959d.get(i10)).getRc_fit_upto();
            aVar.T().setText(rc_regn_no);
            aVar.S().setText(rc_owner_name);
            aVar.O().setText(rc_present_address);
            TextView P = aVar.P();
            P.setText(((c) uVar.f20234e).b("issue_date", "Issue Date") + " - " + rc_regn_dt);
            TextView U = aVar.U();
            U.setText(((c) uVar.f20234e).b("label_dl_serv_valid_upto", "Valid Upto") + " - " + rc_fit_upto);
            aVar.Q().setOnClickListener(new a());
            aVar.R().setOnClickListener(new b(this, aVar, uVar, rc_regn_no, i10));
        } catch (Exception unused) {
        }
    }

    /* renamed from: H */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.my_virtual_rc_item, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public final void I(int i10) {
        this.f9959d.remove(i10);
        n(i10);
        m(i10, this.f9959d.size());
    }

    public int e() {
        return this.f9959d.size();
    }
}
