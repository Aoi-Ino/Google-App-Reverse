package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import w5.p;

final class m extends k {
    m(s sVar, p pVar) {
        super(sVar, pVar);
    }

    public final void p(Bundle bundle, Bundle bundle2) {
        super.p(bundle, bundle2);
        this.f6763b.e((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
