package og;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanModel.PendingTransRegNoDataModel;
import java.util.ArrayList;

public final class d extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final Context f30023d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList f30024e;

    /* renamed from: f  reason: collision with root package name */
    private final b f30025f;

    public static final class a extends RecyclerView.d0 {

        /* renamed from: y  reason: collision with root package name */
        private final MyTextView f30026y;

        /* renamed from: z  reason: collision with root package name */
        private final AppCompatTextView f30027z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "itemView");
            View findViewById = view.findViewById(R.id.transactionNo);
            l.e(findViewById, "findViewById(...)");
            this.f30026y = (MyTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.viewDetailsTv);
            l.e(findViewById2, "findViewById(...)");
            this.f30027z = (AppCompatTextView) findViewById2;
        }

        public final MyTextView O() {
            return this.f30026y;
        }

        public final AppCompatTextView P() {
            return this.f30027z;
        }
    }

    public interface b {
        void f0(int i10);
    }

    public d(Context context, ArrayList arrayList, b bVar) {
        l.f(context, "context");
        l.f(arrayList, "pendingList");
        l.f(bVar, "onItemListener");
        this.f30023d = context;
        this.f30024e = arrayList;
        this.f30025f = bVar;
    }

    /* access modifiers changed from: private */
    public static final void C(d dVar, int i10, View view) {
        l.f(dVar, "this$0");
        dVar.f30025f.f0(i10);
    }

    /* renamed from: B */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        Object obj = this.f30024e.get(i10);
        l.e(obj, "get(...)");
        PendingTransRegNoDataModel pendingTransRegNoDataModel = (PendingTransRegNoDataModel) obj;
        if (pendingTransRegNoDataModel.getTransactionID().length() > 0) {
            aVar.O().setText(pendingTransRegNoDataModel.getTransactionID());
        }
        aVar.P().setOnClickListener(new c(this, i10));
    }

    /* renamed from: D */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.raw_pending_transaction, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public int e() {
        return this.f30024e.size();
    }
}
