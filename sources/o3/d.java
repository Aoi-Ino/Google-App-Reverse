package o3;

import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import p4.a;
import p4.i;

public final /* synthetic */ class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ d f14381a = new d();

    private /* synthetic */ d() {
    }

    public final Object a(i iVar) {
        if (iVar.m()) {
            return (Bundle) iVar.i();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(iVar.h())));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", iVar.h());
    }
}
