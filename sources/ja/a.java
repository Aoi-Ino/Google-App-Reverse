package ja;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.Account.Model.StateX;
import com.nic.mparivahan.R;
import java.util.ArrayList;

public final class a extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private ArrayList f12770d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f12771e;

    /* renamed from: ja.a$a  reason: collision with other inner class name */
    public static final class C0165a extends RecyclerView.d0 {

        /* renamed from: y  reason: collision with root package name */
        private final TextView f12772y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0165a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.state_name);
            l.e(findViewById, "findViewById(...)");
            this.f12772y = (TextView) findViewById;
        }

        public final TextView O() {
            return this.f12772y;
        }
    }

    public a(ArrayList arrayList, Context context) {
        l.f(arrayList, "list");
        l.f(context, "context");
        this.f12770d = arrayList;
        this.f12771e = context;
    }

    /* renamed from: A */
    public void p(C0165a aVar, int i10) {
        l.f(aVar, "holder");
        try {
            aVar.O().setText(((StateX) this.f12770d.get(i10)).getName());
        } catch (Exception e10) {
            e10.printStackTrace();
            Log.e("AdapterEoor", e10.toString());
        }
    }

    /* renamed from: B */
    public C0165a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.eligable_state, viewGroup, false);
        l.c(inflate);
        return new C0165a(inflate);
    }

    public int e() {
        return this.f12770d.size();
    }
}
