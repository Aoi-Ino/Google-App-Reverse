package db;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.Echallan.Model.SearchChallanResultModel;
import com.nic.mparivahan.Echallan.PrintChallanWebView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import java.util.ArrayList;
import java.util.List;
import ld.c;

public final class f extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final Context f9905d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList f9906e;

    /* renamed from: f  reason: collision with root package name */
    private final c f9907f;

    public static final class a extends RecyclerView.d0 {

        /* renamed from: y  reason: collision with root package name */
        private final MyTextView f9908y;

        /* renamed from: z  reason: collision with root package name */
        private final AppCompatTextView f9909z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "itemView");
            View findViewById = view.findViewById(R.id.challanNoTv);
            l.e(findViewById, "findViewById(...)");
            this.f9908y = (MyTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.reprintReceiptTv);
            l.e(findViewById2, "findViewById(...)");
            this.f9909z = (AppCompatTextView) findViewById2;
        }

        public final MyTextView O() {
            return this.f9908y;
        }

        public final AppCompatTextView P() {
            return this.f9909z;
        }
    }

    public f(Context context, ArrayList arrayList, c cVar) {
        l.f(context, "context");
        l.f(arrayList, "searchList");
        l.f(cVar, "langSession");
        this.f9905d = context;
        this.f9906e = arrayList;
        this.f9907f = cVar;
    }

    /* access modifiers changed from: private */
    public static final void D(f fVar, SearchChallanResultModel searchChallanResultModel, View view) {
        l.f(fVar, "this$0");
        l.f(searchChallanResultModel, "$model");
        Intent intent = new Intent(fVar.f9905d, PrintChallanWebView.class);
        intent.putExtra("challanPdfUrl", searchChallanResultModel.getReceiptUrl());
        intent.putExtra("challanNo", searchChallanResultModel.getDocNo());
        intent.putExtra("fromActivity", "reprintReceiptActivity");
        fVar.f9905d.startActivity(intent);
    }

    public final void B(List list) {
        l.f(list, "searchList");
        ArrayList arrayList = this.f9906e;
        arrayList.clear();
        arrayList.addAll(list);
        j();
    }

    /* renamed from: C */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        Object obj = this.f9906e.get(i10);
        l.e(obj, "get(...)");
        SearchChallanResultModel searchChallanResultModel = (SearchChallanResultModel) obj;
        if (searchChallanResultModel.getChallanNo().length() > 0) {
            aVar.O().setText(searchChallanResultModel.getChallanNo());
        }
        if (searchChallanResultModel.getReceiptUrl().length() > 0) {
            aVar.P().setVisibility(0);
        } else {
            aVar.P().setVisibility(8);
            aVar.O().setPadding(0, 10, 0, 10);
        }
        aVar.P().setText(this.f9907f.b("label_challan_reprint_receipt", this.f9905d.getString(R.string.reprint_receipt)));
        aVar.P().setOnClickListener(new e(this, searchChallanResultModel));
    }

    /* renamed from: E */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.echallan_payment_item_reprint, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public int e() {
        return this.f9906e.size();
    }
}
