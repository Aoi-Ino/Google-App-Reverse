package o0;

import cm.l;

public final class i extends g {

    /* renamed from: f  reason: collision with root package name */
    private final androidx.fragment.app.i f14338f;

    /* renamed from: g  reason: collision with root package name */
    private final int f14339g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(androidx.fragment.app.i iVar, androidx.fragment.app.i iVar2, int i10) {
        super(iVar, "Attempting to nest fragment " + iVar + " within the view of parent fragment " + iVar2 + " via container with ID " + i10 + " without using parent's childFragmentManager");
        l.f(iVar, "fragment");
        l.f(iVar2, "expectedParentFragment");
        this.f14338f = iVar2;
        this.f14339g = i10;
    }
}
