package db;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.DPTNotice.DataClass.DPTNoticeDataModel;
import com.nic.mparivahan.DPTNotice.DownloadNoticeActivity;
import com.nic.mparivahan.DPTNotice.NoticeDetailsActivity;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import java.util.ArrayList;
import java.util.List;
import ld.c;

public final class b extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final Context f9887d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList f9888e;

    /* renamed from: f  reason: collision with root package name */
    private final String f9889f;

    /* renamed from: g  reason: collision with root package name */
    private final c f9890g;

    /* renamed from: h  reason: collision with root package name */
    private final String f9891h;

    public static final class a extends RecyclerView.d0 {

        /* renamed from: y  reason: collision with root package name */
        private final MyTextView f9892y;

        /* renamed from: z  reason: collision with root package name */
        private final AppCompatTextView f9893z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "itemView");
            View findViewById = view.findViewById(R.id.challanNoTv);
            l.e(findViewById, "findViewById(...)");
            this.f9892y = (MyTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.viewTv);
            l.e(findViewById2, "findViewById(...)");
            this.f9893z = (AppCompatTextView) findViewById2;
        }

        public final MyTextView O() {
            return this.f9892y;
        }

        public final AppCompatTextView P() {
            return this.f9893z;
        }
    }

    public b(Context context, ArrayList arrayList, String str, c cVar, String str2) {
        l.f(context, "context");
        l.f(arrayList, "noticeList");
        l.f(str, "inputType");
        l.f(cVar, "langSession");
        l.f(str2, "serviceName");
        this.f9887d = context;
        this.f9888e = arrayList;
        this.f9889f = str;
        this.f9890g = cVar;
        this.f9891h = str2;
    }

    /* access modifiers changed from: private */
    public static final void D(b bVar, DPTNoticeDataModel dPTNoticeDataModel, int i10, View view) {
        l.f(bVar, "this$0");
        l.f(dPTNoticeDataModel, "$model");
        if (l.a(bVar.f9891h, "Download Notice")) {
            Intent intent = new Intent(bVar.f9887d, DownloadNoticeActivity.class);
            intent.putExtra("challanPdfUrl", dPTNoticeDataModel.getPdf_url());
            intent.putExtra("challanNo", dPTNoticeDataModel.getDoc_no());
            intent.putExtra("fromActivity", "noticeDetailsActivity");
            bVar.f9887d.startActivity(intent);
            return;
        }
        Intent intent2 = new Intent(bVar.f9887d, NoticeDetailsActivity.class);
        intent2.putExtra("selectedData", (Parcelable) bVar.f9888e.get(i10));
        intent2.putExtra("inputType", bVar.f9889f);
        intent2.putExtra("serviceName", bVar.f9891h);
        bVar.f9887d.startActivity(intent2);
    }

    public final void B(List list) {
        l.f(list, "searchList");
        ArrayList arrayList = this.f9888e;
        arrayList.clear();
        arrayList.addAll(list);
        j();
    }

    /* renamed from: C */
    public void p(a aVar, int i10) {
        AppCompatTextView P;
        String b10;
        l.f(aVar, "holder");
        Object obj = this.f9888e.get(i10);
        l.e(obj, "get(...)");
        DPTNoticeDataModel dPTNoticeDataModel = (DPTNoticeDataModel) obj;
        aVar.O().setText(String.valueOf(dPTNoticeDataModel.getChallan_no()));
        if (l.a(this.f9891h, "Download Notice")) {
            P = aVar.P();
            b10 = this.f9887d.getString(R.string.download_notice);
        } else {
            P = aVar.P();
            b10 = this.f9890g.b("label_challan_view_details", this.f9887d.getString(R.string.view_Details));
        }
        P.setText(b10);
        aVar.P().setOnClickListener(new a(this, dPTNoticeDataModel, i10));
    }

    /* renamed from: E */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_item_search_notice_list, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public int e() {
        return this.f9888e.size();
    }
}
