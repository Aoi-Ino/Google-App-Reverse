package com.google.firebase.installations;

import a7.d;
import p4.j;

class f implements h {

    /* renamed from: a  reason: collision with root package name */
    final j f7389a;

    public f(j jVar) {
        this.f7389a = jVar;
    }

    public boolean a(d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f7389a.e(dVar.d());
        return true;
    }

    public boolean b(Exception exc) {
        return false;
    }
}
