package o3;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import c4.e;
import java.lang.ref.SoftReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p4.i;
import p4.l;

public abstract class b extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static SoftReference f14366a;

    private final int e(Context context, Intent intent) {
        i iVar;
        if (intent.getExtras() == null) {
            return 500;
        }
        a aVar = new a(intent);
        if (TextUtils.isEmpty(aVar.d())) {
            iVar = l.e((Object) null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", aVar.d());
            Integer e10 = aVar.e();
            if (e10 != null) {
                bundle.putInt("google.product_id", e10.intValue());
            }
            bundle.putBoolean("supports_message_handled", true);
            iVar = a0.b(context).c(2, bundle);
        }
        int b10 = b(context, aVar);
        try {
            l.b(iVar, TimeUnit.SECONDS.toMillis(1), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e11) {
            Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e11.toString()));
        }
        return b10;
    }

    private final int f(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        String action = intent.getAction();
        if (action == "com.google.firebase.messaging.NOTIFICATION_DISMISS" || (action != null && action.equals("com.google.firebase.messaging.NOTIFICATION_DISMISS"))) {
            c(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    /* access modifiers changed from: protected */
    public Executor a() {
        ExecutorService executorService;
        synchronized (b.class) {
            try {
                SoftReference softReference = f14366a;
                executorService = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorService == null) {
                    e.a();
                    executorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new x3.b("firebase-iid-executor")));
                    f14366a = new SoftReference(executorService);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return executorService;
    }

    /* access modifiers changed from: protected */
    public abstract int b(Context context, a aVar);

    /* access modifiers changed from: protected */
    public abstract void c(Context context, Bundle bundle);

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            int f10 = intent2 != null ? f(context, intent2) : e(context, intent);
            if (z10) {
                pendingResult.setResultCode(f10);
            }
            pendingResult.finish();
        } catch (Throwable th2) {
            pendingResult.finish();
            throw th2;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            a().execute(new l(this, intent, context, isOrderedBroadcast(), goAsync()));
        }
    }
}
