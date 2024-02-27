package s3;

import android.app.Activity;
import android.content.Intent;

final class b0 extends d0 {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Intent f15887e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Activity f15888f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f15889g;

    b0(Intent intent, Activity activity, int i10) {
        this.f15887e = intent;
        this.f15888f = activity;
        this.f15889g = i10;
    }

    public final void a() {
        Intent intent = this.f15887e;
        if (intent != null) {
            this.f15888f.startActivityForResult(intent, this.f15889g);
        }
    }
}
