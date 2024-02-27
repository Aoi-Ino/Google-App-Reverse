package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

@KeepName
public abstract class GooglePlayServicesManifestException extends IllegalStateException {

    /* renamed from: e  reason: collision with root package name */
    private final int f5228e;

    public GooglePlayServicesManifestException(int i10, String str) {
        super(str);
        this.f5228e = i10;
    }
}
