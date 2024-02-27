package a9;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.Checkpost.CheckPostModel.CheckPostReceiptDetailNewItem;
import com.nic.mparivahan.Checkpost.CheckPostReceiptDetails;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import java.util.ArrayList;
import java.util.List;
import ld.c;

public final class b extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final Context f381d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList f382e;

    /* renamed from: f  reason: collision with root package name */
    private final String f383f;

    /* renamed from: g  reason: collision with root package name */
    private c f384g;

    public static final class a extends RecyclerView.d0 {

        /* renamed from: y  reason: collision with root package name */
        private final MyTextView f385y;

        /* renamed from: z  reason: collision with root package name */
        private final AppCompatTextView f386z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "itemView");
            View findViewById = view.findViewById(R.id.challanNoTv);
            l.e(findViewById, "findViewById(...)");
            this.f385y = (MyTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.viewTv);
            l.e(findViewById2, "findViewById(...)");
            this.f386z = (AppCompatTextView) findViewById2;
        }

        public final MyTextView O() {
            return this.f385y;
        }

        public final AppCompatTextView P() {
            return this.f386z;
        }
    }

    public b(Context context, ArrayList arrayList, String str, c cVar) {
        l.f(context, "context");
        l.f(arrayList, "checkPostList");
        l.f(str, "inputType");
        l.f(cVar, "langSession");
        this.f381d = context;
        this.f382e = arrayList;
        this.f383f = str;
        this.f384g = cVar;
    }

    /* access modifiers changed from: private */
    public static final void D(b bVar, int i10, View view) {
        l.f(bVar, "this$0");
        Intent intent = new Intent(bVar.f381d, CheckPostReceiptDetails.class);
        intent.putExtra("selectedData", (Parcelable) bVar.f382e.get(i10));
        intent.putExtra("inputType", bVar.f383f);
        bVar.f381d.startActivity(intent);
    }

    public final void B(List list) {
        l.f(list, "searchList");
        ArrayList arrayList = this.f382e;
        arrayList.clear();
        arrayList.addAll(list);
        j();
    }

    /* renamed from: C */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        Object obj = this.f382e.get(i10);
        l.e(obj, "get(...)");
        this.f384g = new c(this.f381d);
        aVar.O().setText(((CheckPostReceiptDetailNewItem) obj).getRcptNo());
        aVar.P().setText(this.f384g.b("label_challan_view_details", this.f381d.getString(R.string.view_Details)));
        aVar.P().setOnClickListener(new a(this, i10));
    }

    /* renamed from: E */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_item_search_notice_list, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public int e() {
        return this.f382e.size();
    }
}
