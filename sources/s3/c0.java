package s3;

import android.content.Intent;
import r3.f;

final class c0 extends d0 {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Intent f15917e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ f f15918f;

    c0(Intent intent, f fVar, int i10) {
        this.f15917e = intent;
        this.f15918f = fVar;
    }

    public final void a() {
        Intent intent = this.f15917e;
        if (intent != null) {
            this.f15918f.startActivityForResult(intent, 2);
        }
    }
}
