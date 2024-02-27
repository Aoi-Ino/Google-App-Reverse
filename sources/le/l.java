package le;

import android.content.Context;
import android.widget.BaseAdapter;
import java.util.List;

public final class l extends BaseAdapter {

    /* renamed from: e  reason: collision with root package name */
    private Context f24819e;

    /* renamed from: f  reason: collision with root package name */
    private List f24820f;

    public l(Context context, List list) {
        this.f24819e = context;
        this.f24820f = list;
    }

    public int getCount() {
        List list = this.f24820f;
        cm.l.c(list);
        return list.size();
    }

    public Object getItem(int i10) {
        List list = this.f24820f;
        cm.l.c(list);
        Object obj = list.get(i10);
        cm.l.c(obj);
        return obj;
    }

    public long getItemId(int i10) {
        return (long) i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        r3 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.SubcategoryMasterDataX) r0.get(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
        /*
            r2 = this;
            java.lang.String r0 = "parent"
            cm.l.f(r5, r0)
            if (r4 != 0) goto L_0x0015
            android.content.Context r4 = r2.f24819e
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0 = 2131559023(0x7f0d026f, float:1.8743378E38)
            r1 = 0
            android.view.View r4 = r4.inflate(r0, r5, r1)
        L_0x0015:
            cm.l.c(r4)
            r5 = 2131364806(0x7f0a0bc6, float:1.834946E38)
            android.view.View r5 = r4.findViewById(r5)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            cm.l.d(r5, r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.util.List r0 = r2.f24820f
            if (r0 == 0) goto L_0x0037
            java.lang.Object r3 = r0.get(r3)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.SubcategoryMasterDataX r3 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.SubcategoryMasterDataX) r3
            if (r3 == 0) goto L_0x0037
            java.lang.String r3 = r3.getSub_cat_name()
            goto L_0x0038
        L_0x0037:
            r3 = 0
        L_0x0038:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r5.setText(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: le.l.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
