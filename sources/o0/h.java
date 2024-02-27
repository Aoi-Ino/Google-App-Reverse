package o0;

import android.view.ViewGroup;
import androidx.fragment.app.i;
import cm.l;

public final class h extends g {

    /* renamed from: f  reason: collision with root package name */
    private final ViewGroup f14337f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(i iVar, ViewGroup viewGroup) {
        super(iVar, "Attempting to add fragment " + iVar + " to container " + viewGroup + " which is not a FragmentContainerView");
        l.f(iVar, "fragment");
        l.f(viewGroup, "container");
        this.f14337f = viewGroup;
    }
}
