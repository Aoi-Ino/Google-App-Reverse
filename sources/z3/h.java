package z3;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

final class h implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Context f18880e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Intent f18881f;

    h(Context context, Intent intent) {
        this.f18880e = context;
        this.f18881f = intent;
    }

    public final void onClick(View view) {
        try {
            this.f18880e.startActivity(this.f18881f);
        } catch (ActivityNotFoundException e10) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e10);
        }
    }
}
