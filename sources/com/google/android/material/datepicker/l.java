package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.b;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class l<S> extends q {

    /* renamed from: i0  reason: collision with root package name */
    private int f5939i0;

    /* renamed from: j0  reason: collision with root package name */
    private a f5940j0;

    class a extends p {
        a() {
        }
    }

    static l X1(d dVar, int i10, a aVar) {
        l lVar = new l();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        lVar.K1(bundle);
        return lVar;
    }

    public void C0(Bundle bundle) {
        super.C0(bundle);
        if (bundle == null) {
            bundle = u();
        }
        this.f5939i0 = bundle.getInt("THEME_RES_ID_KEY");
        b.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f5940j0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public View G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(w(), this.f5939i0));
        new a();
        throw null;
    }

    public void Y0(Bundle bundle) {
        super.Y0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f5939i0);
        bundle.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f5940j0);
    }
}
