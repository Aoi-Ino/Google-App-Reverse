package wc;

import android.content.Context;
import android.util.Log;
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
import com.nic.mparivahan.RC.Model.RecentSearch;
import java.util.ArrayList;
import ld.c;

public final class p0 extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final Context f18112d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList f18113e;

    /* renamed from: f  reason: collision with root package name */
    private final zc.a f18114f;

    /* renamed from: g  reason: collision with root package name */
    public c f18115g;

    public static final class a extends RecyclerView.d0 {
        private final TextView A;
        private final LinearLayout B;
        private final ImageView C;

        /* renamed from: y  reason: collision with root package name */
        private final ImageView f18116y;

        /* renamed from: z  reason: collision with root package name */
        private final TextView f18117z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.owner_image);
            l.e(findViewById, "findViewById(...)");
            this.f18116y = (ImageView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.txt_rc_number);
            l.e(findViewById2, "findViewById(...)");
            this.f18117z = (TextView) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.txt_rc_name);
            l.e(findViewById3, "findViewById(...)");
            this.A = (TextView) findViewById3;
            View findViewById4 = this.f3622e.findViewById(R.id.recent_rc_layout);
            l.e(findViewById4, "findViewById(...)");
            this.B = (LinearLayout) findViewById4;
            View findViewById5 = this.f3622e.findViewById(R.id.option_menu);
            l.e(findViewById5, "findViewById(...)");
            this.C = (ImageView) findViewById5;
        }

        public final ImageView O() {
            return this.f18116y;
        }

        public final ImageView P() {
            return this.C;
        }

        public final TextView Q() {
            return this.A;
        }

        public final TextView R() {
            return this.f18117z;
        }
    }

    public p0(Context context, ArrayList arrayList, zc.a aVar) {
        l.f(context, "context");
        l.f(arrayList, "mList");
        l.f(aVar, "cellClickListener");
        this.f18112d = context;
        this.f18113e = arrayList;
        this.f18114f = aVar;
    }

    /* access modifiers changed from: private */
    public static final void G(p0 p0Var, RecentSearch recentSearch, View view) {
        l.f(p0Var, "this$0");
        l.f(recentSearch, "$ItemsViewModel");
        p0Var.f18114f.K(recentSearch.getSearchNumber());
    }

    /* access modifiers changed from: private */
    public static final void H(p0 p0Var, a aVar, RecentSearch recentSearch, View view) {
        l.f(p0Var, "this$0");
        l.f(aVar, "$holder");
        l.f(recentSearch, "$ItemsViewModel");
        PopupMenu popupMenu = new PopupMenu(p0Var.f18112d, aVar.P());
        popupMenu.inflate(R.menu.recent_rc_menu);
        MenuItem findItem = popupMenu.getMenu().findItem(R.id.menu1);
        l.e(findItem, "findItem(...)");
        MenuItem findItem2 = popupMenu.getMenu().findItem(R.id.menu2);
        l.e(findItem2, "findItem(...)");
        p0Var.K(new c(p0Var.f18112d));
        findItem.setTitle(p0Var.D().b("label_view", "View"));
        findItem2.setTitle(p0Var.D().b("delete", "Delete"));
        popupMenu.setGravity(8388613);
        popupMenu.setOnMenuItemClickListener(new o0(p0Var, recentSearch));
        popupMenu.show();
    }

    /* access modifiers changed from: private */
    public static final boolean I(p0 p0Var, RecentSearch recentSearch, MenuItem menuItem) {
        l.f(p0Var, "this$0");
        l.f(recentSearch, "$ItemsViewModel");
        switch (menuItem.getItemId()) {
            case R.id.menu1 /*2131363612*/:
                p0Var.f18114f.K(recentSearch.getSearchNumber());
                return false;
            case R.id.menu2 /*2131363613*/:
                zc.a aVar = p0Var.f18114f;
                String searchNumber = recentSearch.getSearchNumber();
                aVar.w(searchNumber != null ? q.B0(searchNumber).toString() : null);
                return false;
            default:
                return false;
        }
    }

    public final c D() {
        c cVar = this.f18115g;
        if (cVar != null) {
            return cVar;
        }
        l.v("session");
        return null;
    }

    public final void E(String str, ImageView imageView) {
        int i10;
        l.f(str, "vehicleClass");
        l.f(imageView, "imageView");
        Log.e("Test", str);
        if (q.D(str, "MCYL", true) || q.D(str, "MOTOR CYCLE", true) || q.D(str, "M-CYCLE", true) || q.D(str, "SCOOTER", true) || q.D(str, "MOPED", true)) {
            i10 = R.drawable.scooter;
        } else if (q.D(str, "THREE WHEELER", true) || q.D(str, "Three Wheeler", true) || q.D(str, "e-Rickshaw", true)) {
            i10 = R.drawable.auto;
        } else {
            if (!q.D(str, "LMV", true) && !q.D(str, "MOTOR CAR", true) && !q.D(str, "MOTOR CAB", true)) {
                if (q.D(str, "BUS", true)) {
                    i10 = R.drawable.bus;
                } else if (q.D(str, "GOODS CARRIER", true) || q.D(str, "HEAVY GOODS VEHICLE", true)) {
                    i10 = R.drawable.truck;
                }
            }
            imageView.setImageResource(R.drawable.roundcar);
            return;
        }
        imageView.setImageResource(i10);
    }

    /* renamed from: F */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        Object obj = this.f18113e.get(i10);
        l.e(obj, "get(...)");
        RecentSearch recentSearch = (RecentSearch) obj;
        aVar.R().setText(recentSearch.getSearchNumber());
        aVar.Q().setText(xa.a.f18250a.b(recentSearch.getSearchUserName()));
        try {
            E(String.valueOf(recentSearch.getDriverImage()), aVar.O());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        aVar.f3622e.setOnClickListener(new m0(this, recentSearch));
        aVar.P().setOnClickListener(new n0(this, aVar, recentSearch));
    }

    /* renamed from: J */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rc_recent_search, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public final void K(c cVar) {
        l.f(cVar, "<set-?>");
        this.f18115g = cVar;
    }

    public int e() {
        if (this.f18113e.size() < 5) {
            return this.f18113e.size();
        }
        return 5;
    }
}
