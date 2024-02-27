package n5;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import q5.a;

final class i implements a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Activity f14155a;

    i(j jVar, Activity activity) {
        this.f14155a = activity;
    }

    public final void a(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        this.f14155a.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }
}
