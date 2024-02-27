package com.nic.mparivahan.PushNotification;

import android.content.Context;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import cm.g;
import cm.l;
import ld.b;
import pl.x;

public final class SaveFireBaseTokenService extends Worker {

    /* renamed from: k  reason: collision with root package name */
    public static final a f9444k = new a((g) null);

    /* renamed from: j  reason: collision with root package name */
    private Context f9445j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SaveFireBaseTokenService(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        l.f(context, "context");
        l.f(workerParameters, "workerParams");
        this.f9445j = context;
    }

    public c.a p() {
        try {
            boolean unused = p.o(new b(this.f9445j).a(), "0", true);
        } catch (Exception e10) {
            e10.printStackTrace();
            Log.e("eRRO", x.f30437a.toString());
        }
        c.a c10 = c.a.c();
        l.e(c10, "success(...)");
        return c10;
    }
}
