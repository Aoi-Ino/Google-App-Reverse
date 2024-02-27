package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import b3.d;
import b3.h;
import b3.m;

@Keep
public class CctBackendFactory implements d {
    public m create(h hVar) {
        return new d(hVar.b(), hVar.e(), hVar.d());
    }
}
