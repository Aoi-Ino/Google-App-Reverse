package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class f implements DynamiteModule.b {
    f() {
    }

    public final DynamiteModule.b.C0097b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0097b bVar = new DynamiteModule.b.C0097b();
        int b10 = aVar.b(context, str, false);
        bVar.f5384b = b10;
        if (b10 == 0) {
            bVar.f5385c = 0;
        } else {
            bVar.f5385c = 1;
        }
        return bVar;
    }
}
