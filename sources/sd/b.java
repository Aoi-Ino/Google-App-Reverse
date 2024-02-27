package sd;

import android.content.Context;
import android.widget.BaseAdapter;
import cm.l;
import java.util.ArrayList;

public final class b extends BaseAdapter {

    /* renamed from: e  reason: collision with root package name */
    private Context f31198e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList f31199f;

    public b(Context context, ArrayList arrayList) {
        this.f31198e = context;
        this.f31199f = arrayList;
    }

    public int getCount() {
        ArrayList arrayList = this.f31199f;
        l.c(arrayList);
        return arrayList.size();
    }

    public Object getItem(int i10) {
        ArrayList arrayList = this.f31199f;
        l.c(arrayList);
        Object obj = arrayList.get(i10);
        l.c(obj);
        return obj;
    }

    public long getItemId(int i10) {
        return (long) i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        r3 = (java.lang.Integer) r0.get(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
        /*
            r2 = this;
            java.lang.String r0 = "parent"
            cm.l.f(r5, r0)
            if (r4 != 0) goto L_0x0015
            android.content.Context r4 = r2.f31198e
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0 = 2131559025(0x7f0d0271, float:1.8743382E38)
            r1 = 0
            android.view.View r4 = r4.inflate(r0, r5, r1)
        L_0x0015:
            cm.l.c(r4)
            r5 = 2131364806(0x7f0a0bc6, float:1.834946E38)
            android.view.View r5 = r4.findViewById(r5)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            cm.l.d(r5, r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.util.ArrayList r0 = r2.f31199f
            if (r0 == 0) goto L_0x0037
            java.lang.Object r3 = r0.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x0037
            java.lang.String r3 = java.lang.String.valueOf(r3)
            goto L_0x0038
        L_0x0037:
            r3 = 0
        L_0x0038:
            r5.setText(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: sd.b.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
