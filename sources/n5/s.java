package n5;

import android.os.Bundle;
import t5.a;
import w5.p;

final class s extends r {
    s(u uVar, p pVar) {
        super(uVar, new a("OnCompleteUpdateCallback"), pVar);
    }

    public final void y(Bundle bundle) {
        super.y(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f14174c.d(new r5.a(bundle.getInt("error.code", -2)));
        } else {
            this.f14174c.e((Object) null);
        }
    }
}
