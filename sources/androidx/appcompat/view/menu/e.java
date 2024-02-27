package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import f.g;
import java.util.ArrayList;

public class e implements m, AdapterView.OnItemClickListener {

    /* renamed from: e  reason: collision with root package name */
    Context f956e;

    /* renamed from: f  reason: collision with root package name */
    LayoutInflater f957f;

    /* renamed from: g  reason: collision with root package name */
    g f958g;

    /* renamed from: h  reason: collision with root package name */
    ExpandedMenuView f959h;

    /* renamed from: i  reason: collision with root package name */
    int f960i;

    /* renamed from: j  reason: collision with root package name */
    int f961j;

    /* renamed from: k  reason: collision with root package name */
    int f962k;

    /* renamed from: l  reason: collision with root package name */
    private m.a f963l;

    /* renamed from: m  reason: collision with root package name */
    a f964m;

    /* renamed from: n  reason: collision with root package name */
    private int f965n;

    private class a extends BaseAdapter {

        /* renamed from: e  reason: collision with root package name */
        private int f966e = -1;

        public a() {
            a();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            i x10 = e.this.f958g.x();
            if (x10 != null) {
                ArrayList B = e.this.f958g.B();
                int size = B.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (((i) B.get(i10)) == x10) {
                        this.f966e = i10;
                        return;
                    }
                }
            }
            this.f966e = -1;
        }

        /* renamed from: b */
        public i getItem(int i10) {
            ArrayList B = e.this.f958g.B();
            int i11 = i10 + e.this.f960i;
            int i12 = this.f966e;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return (i) B.get(i11);
        }

        public int getCount() {
            int size = e.this.f958g.B().size() - e.this.f960i;
            return this.f966e < 0 ? size : size - 1;
        }

        public long getItemId(int i10) {
            return (long) i10;
        }

        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.f957f.inflate(eVar.f962k, viewGroup, false);
            }
            ((n.a) view).e(getItem(i10), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(int i10, int i11) {
        this.f962k = i10;
        this.f961j = i11;
    }

    public ListAdapter a() {
        if (this.f964m == null) {
            this.f964m = new a();
        }
        return this.f964m;
    }

    public void b(g gVar, boolean z10) {
        m.a aVar = this.f963l;
        if (aVar != null) {
            aVar.b(gVar, z10);
        }
    }

    public int c() {
        return this.f965n;
    }

    public n d(ViewGroup viewGroup) {
        if (this.f959h == null) {
            this.f959h = (ExpandedMenuView) this.f957f.inflate(g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f964m == null) {
                this.f964m = new a();
            }
            this.f959h.setAdapter(this.f964m);
            this.f959h.setOnItemClickListener(this);
        }
        return this.f959h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(android.content.Context r3, androidx.appcompat.view.menu.g r4) {
        /*
            r2 = this;
            int r0 = r2.f961j
            if (r0 == 0) goto L_0x0014
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f961j
            r0.<init>(r3, r1)
            r2.f956e = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L_0x0011:
            r2.f957f = r3
            goto L_0x0023
        L_0x0014:
            android.content.Context r0 = r2.f956e
            if (r0 == 0) goto L_0x0023
            r2.f956e = r3
            android.view.LayoutInflater r0 = r2.f957f
            if (r0 != 0) goto L_0x0023
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L_0x0011
        L_0x0023:
            r2.f958g = r4
            androidx.appcompat.view.menu.e$a r3 = r2.f964m
            if (r3 == 0) goto L_0x002c
            r3.notifyDataSetChanged()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.e(android.content.Context, androidx.appcompat.view.menu.g):void");
    }

    public void f(Parcelable parcelable) {
        h((Bundle) parcelable);
    }

    public boolean g(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new h(rVar).d((IBinder) null);
        m.a aVar = this.f963l;
        if (aVar == null) {
            return true;
        }
        aVar.c(rVar);
        return true;
    }

    public void h(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f959h.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public void i(boolean z10) {
        a aVar = this.f964m;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public boolean j() {
        return false;
    }

    public Parcelable k() {
        if (this.f959h == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        o(bundle);
        return bundle;
    }

    public boolean l(g gVar, i iVar) {
        return false;
    }

    public boolean m(g gVar, i iVar) {
        return false;
    }

    public void n(m.a aVar) {
        this.f963l = aVar;
    }

    public void o(Bundle bundle) {
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.f959h;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        this.f958g.O(this.f964m.getItem(i10), this, 0);
    }

    public e(Context context, int i10) {
        this(i10, 0);
        this.f956e = context;
        this.f957f = LayoutInflater.from(context);
    }
}
