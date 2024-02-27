package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import androidx.profileinstaller.g;
import com.google.firebase.messaging.i1;
import p4.i;

class f1 extends Binder {

    /* renamed from: b  reason: collision with root package name */
    private final a f7493b;

    interface a {
        i a(Intent intent);
    }

    f1(a aVar) {
        this.f7493b = aVar;
    }

    /* access modifiers changed from: package-private */
    public void c(i1.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.f7493b.a(aVar.f7515a).b(new g(), new e1(aVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
