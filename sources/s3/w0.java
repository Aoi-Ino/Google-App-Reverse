package s3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import p3.a;

public final class w0 extends m0 {

    /* renamed from: g  reason: collision with root package name */
    public final IBinder f16045g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ c f16046h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w0(c cVar, int i10, IBinder iBinder, Bundle bundle) {
        super(cVar, i10, bundle);
        this.f16046h = cVar;
        this.f16045g = iBinder;
    }

    /* access modifiers changed from: protected */
    public final void f(a aVar) {
        if (this.f16046h.f15911v != null) {
            this.f16046h.f15911v.d(aVar);
        }
        this.f16046h.K(aVar);
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        String str;
        try {
            IBinder iBinder = this.f16045g;
            o.i(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f16046h.D().equals(interfaceDescriptor)) {
                str = "service descriptor mismatch: " + this.f16046h.D() + " vs. " + interfaceDescriptor;
                Log.w("GmsClient", str);
                return false;
            }
            IInterface r10 = this.f16046h.r(this.f16045g);
            if (r10 == null || (!c.e0(this.f16046h, 2, 4, r10) && !c.e0(this.f16046h, 3, 4, r10))) {
                return false;
            }
            this.f16046h.f15915z = null;
            Bundle w10 = this.f16046h.w();
            c cVar = this.f16046h;
            if (cVar.f15910u == null) {
                return true;
            }
            cVar.f15910u.j(w10);
            return true;
        } catch (RemoteException unused) {
            str = "service probably died";
        }
    }
}
