package o3;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new i();

    /* renamed from: e  reason: collision with root package name */
    Messenger f14391e;

    public k(IBinder iBinder) {
        this.f14391e = new Messenger(iBinder);
    }

    public final IBinder c() {
        Messenger messenger = this.f14391e;
        messenger.getClass();
        return messenger.getBinder();
    }

    public final void d(Message message) {
        Messenger messenger = this.f14391e;
        messenger.getClass();
        messenger.send(message);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return c().equals(((k) obj).c());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return c().hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f14391e;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
