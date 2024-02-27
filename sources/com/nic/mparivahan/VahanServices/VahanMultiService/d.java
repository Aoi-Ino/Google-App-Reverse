package com.nic.mparivahan.VahanServices.VahanMultiService;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class d implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final b f21126b;

    public d(b bVar) {
        l.f(bVar, "repository");
        this.f21126b = bVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(MultiSelectionViewModel.class)) {
            return new MultiSelectionViewModel(this.f21126b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
