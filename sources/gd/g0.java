package gd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.R;
import java.util.ArrayList;

public final class g0 extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f11871d;

    public static final class a extends RecyclerView.d0 {

        /* renamed from: y  reason: collision with root package name */
        private final TextView f11872y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.app_status_name);
            l.e(findViewById, "findViewById(...)");
            this.f11872y = (TextView) findViewById;
        }

        public final TextView O() {
            return this.f11872y;
        }
    }

    public g0(ArrayList arrayList) {
        l.f(arrayList, "mList");
        this.f11871d = arrayList;
    }

    /* renamed from: A */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        Object obj = this.f11871d.get(i10);
        l.e(obj, "get(...)");
        aVar.O().setText((String) obj);
    }

    /* renamed from: B */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pending_status_adapter, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public int e() {
        return this.f11871d.size();
    }
}
