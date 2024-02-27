package a0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class c extends a {

    /* renamed from: m  reason: collision with root package name */
    private int f22m;

    /* renamed from: n  reason: collision with root package name */
    private int f23n;

    /* renamed from: o  reason: collision with root package name */
    private LayoutInflater f24o;

    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f23n = i10;
        this.f22m = i10;
        this.f24o = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f24o.inflate(this.f23n, viewGroup, false);
    }

    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f24o.inflate(this.f22m, viewGroup, false);
    }
}
