package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class g implements DynamiteModule.b {
    g() {
    }

    public final DynamiteModule.b.C0097b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0097b bVar = new DynamiteModule.b.C0097b();
        bVar.f5383a = aVar.a(context, str);
        int b10 = aVar.b(context, str, true);
        bVar.f5384b = b10;
        int i10 = bVar.f5383a;
        if (i10 == 0) {
            i10 = 0;
            if (b10 == 0) {
                bVar.f5385c = 0;
                return bVar;
            }
        }
        if (i10 >= b10) {
            bVar.f5385c = -1;
        } else {
            bVar.f5385c = 1;
        }
        return bVar;
    }
}
