package fe;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.Checkpost.CheckpostTaxReceipt.CheckpostTaxReceiptModel.CheckpostTaxReceiptDownloadItem;
import java.util.ArrayList;
import java.util.List;
import ld.c;

public final class b extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final Context f23447d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList f23448e;

    /* renamed from: f  reason: collision with root package name */
    public c f23449f;

    public static final class a extends RecyclerView.d0 {

        /* renamed from: y  reason: collision with root package name */
        private final MyTextView f23450y;

        /* renamed from: z  reason: collision with root package name */
        private final MyTextView f23451z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "itemView");
            View findViewById = view.findViewById(R.id.tax_rcpt2);
            l.e(findViewById, "findViewById(...)");
            this.f23450y = (MyTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.searchTv);
            l.e(findViewById2, "findViewById(...)");
            this.f23451z = (MyTextView) findViewById2;
        }

        public final MyTextView O() {
            return this.f23451z;
        }

        public final MyTextView P() {
            return this.f23450y;
        }
    }

    public b(Context context, ArrayList arrayList) {
        l.f(context, "context");
        l.f(arrayList, "searchList");
        this.f23447d = context;
        this.f23448e = arrayList;
    }

    /* access modifiers changed from: private */
    public static final void E(b bVar, CheckpostTaxReceiptDownloadItem checkpostTaxReceiptDownloadItem, View view) {
        l.f(bVar, "this$0");
        l.f(checkpostTaxReceiptDownloadItem, "$model");
    }

    public final void B(List list) {
        l.f(list, "searchList");
        this.f23448e.addAll(list);
        j();
    }

    public final c C() {
        c cVar = this.f23449f;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    /* renamed from: D */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        Object obj = this.f23448e.get(i10);
        l.e(obj, "get(...)");
        CheckpostTaxReceiptDownloadItem checkpostTaxReceiptDownloadItem = (CheckpostTaxReceiptDownloadItem) obj;
        G(new c(this.f23447d));
        aVar.P().setText(checkpostTaxReceiptDownloadItem.getRcptNo().toString());
        aVar.O().setText(C().b("download", this.f23447d.getString(R.string.download)));
        aVar.O().setOnClickListener(new a(this, checkpostTaxReceiptDownloadItem));
    }

    /* renamed from: F */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.avilable_checkpost_tax_receipt, viewGroup, false);
        Log.e("chekTax", "test2");
        l.c(inflate);
        return new a(inflate);
    }

    public final void G(c cVar) {
        l.f(cVar, "<set-?>");
        this.f23449f = cVar;
    }

    public int e() {
        return this.f23448e.size();
    }

    public long f(int i10) {
        return (long) i10;
    }

    public int g(int i10) {
        return i10;
    }
}
