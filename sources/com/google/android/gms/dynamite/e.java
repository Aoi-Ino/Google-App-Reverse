package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class e implements DynamiteModule.b {
    e() {
    }

    public final DynamiteModule.b.C0097b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0097b bVar = new DynamiteModule.b.C0097b();
        int a10 = aVar.a(context, str);
        bVar.f5383a = a10;
        if (a10 != 0) {
            bVar.f5385c = -1;
        } else {
            int b10 = aVar.b(context, str, true);
            bVar.f5384b = b10;
            if (b10 != 0) {
                bVar.f5385c = 1;
            }
        }
        return bVar;
    }
}
