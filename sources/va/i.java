package va;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
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
import de.hdodenhof.circleimageview.CircleImageView;
import java.util.ArrayList;
import wa.c;

public final class i extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final Context f17610d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList f17611e;

    /* renamed from: f  reason: collision with root package name */
    private final c f17612f;

    /* renamed from: g  reason: collision with root package name */
    public ld.c f17613g;

    public static final class a extends RecyclerView.d0 {
        private final TextView A;
        private final LinearLayout B;
        private final ImageView C;

        /* renamed from: y  reason: collision with root package name */
        private final CircleImageView f17614y;

        /* renamed from: z  reason: collision with root package name */
        private final TextView f17615z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.owner_image);
            l.e(findViewById, "findViewById(...)");
            this.f17614y = (CircleImageView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.txt_rc_number);
            l.e(findViewById2, "findViewById(...)");
            this.f17615z = (TextView) findViewById2;
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

        public final CircleImageView O() {
            return this.f17614y;
        }

        public final ImageView P() {
            return this.C;
        }

        public final TextView Q() {
            return this.A;
        }

        public final TextView R() {
            return this.f17615z;
        }
    }

    public i(Context context, ArrayList arrayList, c cVar) {
        l.f(context, "context");
        l.f(arrayList, "mList");
        l.f(cVar, "mRecentSearchInterface");
        this.f17610d = context;
        this.f17611e = arrayList;
        this.f17612f = cVar;
    }

    /* access modifiers changed from: private */
    public static final void G(View view) {
    }

    /* access modifiers changed from: private */
    public static final void H(i iVar, a aVar, RecentSearch recentSearch, View view) {
        l.f(iVar, "this$0");
        l.f(aVar, "$holder");
        l.f(recentSearch, "$ItemsViewModel");
        PopupMenu popupMenu = new PopupMenu(iVar.f17610d, aVar.P());
        popupMenu.inflate(R.menu.recent_dl_menu);
        MenuItem findItem = popupMenu.getMenu().findItem(R.id.menu1);
        l.e(findItem, "findItem(...)");
        MenuItem findItem2 = popupMenu.getMenu().findItem(R.id.menu2);
        l.e(findItem2, "findItem(...)");
        iVar.K(new ld.c(iVar.f17610d));
        findItem.setTitle(iVar.E().b("label_view", "View"));
        findItem2.setTitle(iVar.E().b("delete", "Delete"));
        popupMenu.setGravity(8388613);
        popupMenu.setOnMenuItemClickListener(new h(iVar, recentSearch));
        popupMenu.show();
    }

    /* access modifiers changed from: private */
    public static final boolean I(i iVar, RecentSearch recentSearch, MenuItem menuItem) {
        l.f(iVar, "this$0");
        l.f(recentSearch, "$ItemsViewModel");
        switch (menuItem.getItemId()) {
            case R.id.menu1 /*2131363612*/:
                iVar.f17612f.s(recentSearch.getSearchNumber());
                return false;
            case R.id.menu2 /*2131363613*/:
                iVar.f17612f.G(recentSearch.getSearchNumber());
                return false;
            default:
                return false;
        }
    }

    public final Bitmap D(String str) {
        try {
            byte[] decode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final ld.c E() {
        ld.c cVar = this.f17613g;
        if (cVar != null) {
            return cVar;
        }
        l.v("session");
        return null;
    }

    /* renamed from: F */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        Object obj = this.f17611e.get(i10);
        l.e(obj, "get(...)");
        RecentSearch recentSearch = (RecentSearch) obj;
        aVar.R().setText(recentSearch.getSearchNumber());
        aVar.Q().setText(xa.a.f18250a.b(recentSearch.getSearchUserName()));
        String driverImage = recentSearch.getDriverImage();
        if (driverImage == null || driverImage.length() == 0) {
            aVar.O().setImageResource(R.drawable.calendar);
        } else {
            aVar.O().setImageBitmap(D(recentSearch.getDriverImage()));
        }
        aVar.f3622e.setOnClickListener(new f());
        aVar.P().setOnClickListener(new g(this, aVar, recentSearch));
    }

    /* renamed from: J */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recent_dl_search_item, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public final void K(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.f17613g = cVar;
    }

    public int e() {
        if (this.f17611e.size() < 5) {
            return this.f17611e.size();
        }
        return 5;
    }
}
