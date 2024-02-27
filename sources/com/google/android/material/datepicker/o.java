package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.m0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.i;
import q4.f;
import q4.h;

class o extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final a f5955d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final i.m f5956e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5957f;

    class a implements AdapterView.OnItemClickListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f5958e;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f5958e = materialCalendarGridView;
        }

        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f5958e.getAdapter().p(i10)) {
                o.this.f5956e.a(this.f5958e.getAdapter().getItem(i10).longValue());
            }
        }
    }

    public static class b extends RecyclerView.d0 {

        /* renamed from: y  reason: collision with root package name */
        final TextView f5960y;

        /* renamed from: z  reason: collision with root package name */
        final MaterialCalendarGridView f5961z;

        b(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(f.month_title);
            this.f5960y = textView;
            m0.r0(textView, true);
            this.f5961z = (MaterialCalendarGridView) linearLayout.findViewById(f.month_grid);
            if (!z10) {
                textView.setVisibility(8);
            }
        }
    }

    o(Context context, d dVar, a aVar, g gVar, i.m mVar) {
        m m10 = aVar.m();
        m i10 = aVar.i();
        m l10 = aVar.l();
        if (m10.compareTo(l10) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (l10.compareTo(i10) <= 0) {
            this.f5957f = (n.f5949i * i.i2(context)) + (k.v2(context) ? i.i2(context) : 0);
            this.f5955d = aVar;
            this.f5956e = mVar;
            y(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    /* access modifiers changed from: package-private */
    public m B(int i10) {
        return this.f5955d.m().l(i10);
    }

    /* access modifiers changed from: package-private */
    public CharSequence C(int i10) {
        return B(i10).j();
    }

    /* access modifiers changed from: package-private */
    public int D(m mVar) {
        return this.f5955d.m().m(mVar);
    }

    /* renamed from: E */
    public void p(b bVar, int i10) {
        m l10 = this.f5955d.m().l(i10);
        bVar.f5960y.setText(l10.j());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f5961z.findViewById(f.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !l10.equals(materialCalendarGridView.getAdapter().f5951e)) {
            n nVar = new n(l10, (d) null, this.f5955d, (g) null);
            materialCalendarGridView.setNumColumns(l10.f5945h);
            materialCalendarGridView.setAdapter((ListAdapter) nVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().o(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    /* renamed from: F */
    public b r(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(h.mtrl_calendar_month_labeled, viewGroup, false);
        if (!k.v2(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.q(-1, this.f5957f));
        return new b(linearLayout, true);
    }

    public int e() {
        return this.f5955d.k();
    }

    public long f(int i10) {
        return this.f5955d.m().l(i10).k();
    }
}
