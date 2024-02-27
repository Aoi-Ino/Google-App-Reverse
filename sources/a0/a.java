package a0;

import a0.b;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: e  reason: collision with root package name */
    protected boolean f11e;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f12f;

    /* renamed from: g  reason: collision with root package name */
    protected Cursor f13g;

    /* renamed from: h  reason: collision with root package name */
    protected Context f14h;

    /* renamed from: i  reason: collision with root package name */
    protected int f15i;

    /* renamed from: j  reason: collision with root package name */
    protected C0000a f16j;

    /* renamed from: k  reason: collision with root package name */
    protected DataSetObserver f17k;

    /* renamed from: l  reason: collision with root package name */
    protected b f18l;

    /* renamed from: a0.a$a  reason: collision with other inner class name */
    private class C0000a extends ContentObserver {
        C0000a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z10) {
            a.this.i();
        }
    }

    private class b extends DataSetObserver {
        b() {
        }

        public void onChanged() {
            a aVar = a.this;
            aVar.f11e = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            a aVar = a.this;
            aVar.f11e = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z10) {
        f(context, cursor, z10 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor j10 = j(cursor);
        if (j10 != null) {
            j10.close();
        }
    }

    public Cursor b() {
        return this.f13g;
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract void e(View view, Context context, Cursor cursor);

    /* access modifiers changed from: package-private */
    public void f(Context context, Cursor cursor, int i10) {
        b bVar;
        boolean z10 = false;
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f12f = true;
        } else {
            this.f12f = false;
        }
        if (cursor != null) {
            z10 = true;
        }
        this.f13g = cursor;
        this.f11e = z10;
        this.f14h = context;
        this.f15i = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f16j = new C0000a();
            bVar = new b();
        } else {
            bVar = null;
            this.f16j = null;
        }
        this.f17k = bVar;
        if (z10) {
            C0000a aVar = this.f16j;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f17k;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    public int getCount() {
        Cursor cursor;
        if (!this.f11e || (cursor = this.f13g) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f11e) {
            return null;
        }
        this.f13g.moveToPosition(i10);
        if (view == null) {
            view = g(this.f14h, this.f13g, viewGroup);
        }
        e(view, this.f14h, this.f13g);
        return view;
    }

    public Filter getFilter() {
        if (this.f18l == null) {
            this.f18l = new b(this);
        }
        return this.f18l;
    }

    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f11e || (cursor = this.f13g) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f13g;
    }

    public long getItemId(int i10) {
        Cursor cursor;
        if (!this.f11e || (cursor = this.f13g) == null || !cursor.moveToPosition(i10)) {
            return 0;
        }
        return this.f13g.getLong(this.f15i);
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f11e) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f13g.moveToPosition(i10)) {
            if (view == null) {
                view = h(this.f14h, this.f13g, viewGroup);
            }
            e(view, this.f14h, this.f13g);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i10);
        }
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    public void i() {
        Cursor cursor;
        if (this.f12f && (cursor = this.f13g) != null && !cursor.isClosed()) {
            this.f11e = this.f13g.requery();
        }
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f13g;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0000a aVar = this.f16j;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f17k;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f13g = cursor;
        if (cursor != null) {
            C0000a aVar2 = this.f16j;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f17k;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f15i = cursor.getColumnIndexOrThrow("_id");
            this.f11e = true;
            notifyDataSetChanged();
        } else {
            this.f15i = -1;
            this.f11e = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
