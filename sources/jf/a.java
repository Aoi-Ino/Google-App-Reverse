package jf;

import android.content.Context;
import android.support.v4.media.session.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import java.util.ArrayList;

public final class a extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final Context f24565d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList f24566e;

    /* renamed from: jf.a$a  reason: collision with other inner class name */
    public static final class C0312a extends RecyclerView.d0 {
        private final MyTextView A;
        private final MyTextView B;
        private final MyTextView C;
        private final MyTextView D;
        private final MyTextView E;
        private final MyTextView F;

        /* renamed from: y  reason: collision with root package name */
        private final MyTextView f24567y;

        /* renamed from: z  reason: collision with root package name */
        private final MyTextView f24568z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0312a(View view) {
            super(view);
            l.f(view, "itemView");
            View findViewById = view.findViewById(R.id.state);
            l.e(findViewById, "findViewById(...)");
            this.f24567y = (MyTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.rto);
            l.e(findViewById2, "findViewById(...)");
            this.f24568z = (MyTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.number_type);
            l.e(findViewById3, "findViewById(...)");
            this.A = (MyTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.reg_start);
            l.e(findViewById4, "findViewById(...)");
            this.B = (MyTextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.reg_close);
            l.e(findViewById5, "findViewById(...)");
            this.C = (MyTextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.auction_start);
            l.e(findViewById6, "findViewById(...)");
            this.D = (MyTextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.auction_close);
            l.e(findViewById7, "findViewById(...)");
            this.E = (MyTextView) findViewById7;
            View findViewById8 = view.findViewById(R.id.auction_status);
            l.e(findViewById8, "findViewById(...)");
            this.F = (MyTextView) findViewById8;
        }

        public final MyTextView O() {
            return this.f24567y;
        }
    }

    public a(Context context, ArrayList arrayList) {
        l.f(context, "context");
        l.f(arrayList, "searchList");
        this.f24565d = context;
        this.f24566e = arrayList;
    }

    /* renamed from: A */
    public void p(C0312a aVar, int i10) {
        l.f(aVar, "holder");
        Object obj = this.f24566e.get(i10);
        l.e(obj, "get(...)");
        b.a(obj);
        aVar.O();
        throw null;
    }

    /* renamed from: B */
    public C0312a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.running_auction_list_item, viewGroup, false);
        l.c(inflate);
        return new C0312a(inflate);
    }

    public int e() {
        return this.f24566e.size();
    }

    public long f(int i10) {
        return (long) i10;
    }

    public int g(int i10) {
        return i10;
    }
}
