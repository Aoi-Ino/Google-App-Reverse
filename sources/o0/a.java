package o0;

import androidx.fragment.app.i;
import cm.l;

public final class a extends g {

    /* renamed from: f  reason: collision with root package name */
    private final String f14316f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(i iVar, String str) {
        super(iVar, "Attempting to reuse fragment " + iVar + " with previous ID " + str);
        l.f(iVar, "fragment");
        l.f(str, "previousFragmentId");
        this.f14316f = str;
    }
}
