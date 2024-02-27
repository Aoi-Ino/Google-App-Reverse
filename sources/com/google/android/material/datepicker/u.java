package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import q4.h;

class u extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final i f5968d;

    public static class a extends RecyclerView.d0 {

        /* renamed from: y  reason: collision with root package name */
        final TextView f5969y;

        a(TextView textView) {
            super(textView);
            this.f5969y = textView;
        }
    }

    u(i iVar) {
        this.f5968d = iVar;
    }

    /* access modifiers changed from: package-private */
    public int A(int i10) {
        return i10 - this.f5968d.e2().m().f5944g;
    }

    /* access modifiers changed from: package-private */
    public int B(int i10) {
        return this.f5968d.e2().m().f5944g + i10;
    }

    /* renamed from: C */
    public void p(a aVar, int i10) {
        int B = B(i10);
        aVar.f5969y.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(B)}));
        TextView textView = aVar.f5969y;
        textView.setContentDescription(e.e(textView.getContext(), B));
        c f22 = this.f5968d.f2();
        if (t.g().get(1) == B) {
            b bVar = f22.f5885f;
        } else {
            b bVar2 = f22.f5883d;
        }
        this.f5968d.h2();
        throw null;
    }

    /* renamed from: D */
    public a r(ViewGroup viewGroup, int i10) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(h.mtrl_calendar_year, viewGroup, false));
    }

    public int e() {
        return this.f5968d.e2().n();
    }
}
