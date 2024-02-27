package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

public class f extends BaseAdapter {

    /* renamed from: e  reason: collision with root package name */
    g f968e;

    /* renamed from: f  reason: collision with root package name */
    private int f969f = -1;

    /* renamed from: g  reason: collision with root package name */
    private boolean f970g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f971h;

    /* renamed from: i  reason: collision with root package name */
    private final LayoutInflater f972i;

    /* renamed from: j  reason: collision with root package name */
    private final int f973j;

    public f(g gVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f971h = z10;
        this.f972i = layoutInflater;
        this.f968e = gVar;
        this.f973j = i10;
        a();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        i x10 = this.f968e.x();
        if (x10 != null) {
            ArrayList B = this.f968e.B();
            int size = B.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((i) B.get(i10)) == x10) {
                    this.f969f = i10;
                    return;
                }
            }
        }
        this.f969f = -1;
    }

    public g b() {
        return this.f968e;
    }

    /* renamed from: c */
    public i getItem(int i10) {
        ArrayList B = this.f971h ? this.f968e.B() : this.f968e.G();
        int i11 = this.f969f;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (i) B.get(i10);
    }

    public void d(boolean z10) {
        this.f970g = z10;
    }

    public int getCount() {
        ArrayList B = this.f971h ? this.f968e.B() : this.f968e.G();
        int i10 = this.f969f;
        int size = B.size();
        return i10 < 0 ? size : size - 1;
    }

    public long getItemId(int i10) {
        return (long) i10;
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f972i.inflate(this.f973j, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f968e.H() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        n.a aVar = (n.a) view;
        if (this.f970g) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.e(getItem(i10), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
