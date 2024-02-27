package com.google.firebase.installations;

import a7.d;
import p4.j;

class e implements h {

    /* renamed from: a  reason: collision with root package name */
    private final i f7387a;

    /* renamed from: b  reason: collision with root package name */
    private final j f7388b;

    public e(i iVar, j jVar) {
        this.f7387a = iVar;
        this.f7388b = jVar;
    }

    public boolean a(d dVar) {
        if (!dVar.k() || this.f7387a.f(dVar)) {
            return false;
        }
        this.f7388b.c(g.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }

    public boolean b(Exception exc) {
        this.f7388b.d(exc);
        return true;
    }
}
