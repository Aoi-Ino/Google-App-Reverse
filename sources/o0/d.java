package o0;

import android.view.ViewGroup;
import androidx.fragment.app.i;
import cm.l;

public final class d extends g {

    /* renamed from: f  reason: collision with root package name */
    private final ViewGroup f14335f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(i iVar, ViewGroup viewGroup) {
        super(iVar, "Attempting to use <fragment> tag to add fragment " + iVar + " to container " + viewGroup);
        l.f(iVar, "fragment");
        this.f14335f = viewGroup;
    }
}
