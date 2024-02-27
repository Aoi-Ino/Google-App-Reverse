package o3;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

final class v {

    /* renamed from: a  reason: collision with root package name */
    private final Messenger f14411a;

    /* renamed from: b  reason: collision with root package name */
    private final k f14412b;

    v(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (u.a(interfaceDescriptor, "android.os.IMessenger")) {
            this.f14411a = new Messenger(iBinder);
            this.f14412b = null;
        } else if (u.a(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f14412b = new k(iBinder);
            this.f14411a = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Message message) {
        Messenger messenger = this.f14411a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        k kVar = this.f14412b;
        if (kVar != null) {
            kVar.d(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
