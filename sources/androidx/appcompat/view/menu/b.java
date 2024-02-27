package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

public abstract class b implements m {

    /* renamed from: e  reason: collision with root package name */
    protected Context f912e;

    /* renamed from: f  reason: collision with root package name */
    protected Context f913f;

    /* renamed from: g  reason: collision with root package name */
    protected g f914g;

    /* renamed from: h  reason: collision with root package name */
    protected LayoutInflater f915h;

    /* renamed from: i  reason: collision with root package name */
    protected LayoutInflater f916i;

    /* renamed from: j  reason: collision with root package name */
    private m.a f917j;

    /* renamed from: k  reason: collision with root package name */
    private int f918k;

    /* renamed from: l  reason: collision with root package name */
    private int f919l;

    /* renamed from: m  reason: collision with root package name */
    protected n f920m;

    /* renamed from: n  reason: collision with root package name */
    private int f921n;

    public b(Context context, int i10, int i11) {
        this.f912e = context;
        this.f915h = LayoutInflater.from(context);
        this.f918k = i10;
        this.f919l = i11;
    }

    /* access modifiers changed from: protected */
    public void a(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f920m).addView(view, i10);
    }

    public void b(g gVar, boolean z10) {
        m.a aVar = this.f917j;
        if (aVar != null) {
            aVar.b(gVar, z10);
        }
    }

    public int c() {
        return this.f921n;
    }

    public abstract void d(i iVar, n.a aVar);

    public void e(Context context, g gVar) {
        this.f913f = context;
        this.f916i = LayoutInflater.from(context);
        this.f914g = gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(androidx.appcompat.view.menu.r r2) {
        /*
            r1 = this;
            androidx.appcompat.view.menu.m$a r0 = r1.f917j
            if (r0 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            androidx.appcompat.view.menu.g r2 = r1.f914g
        L_0x0009:
            boolean r2 = r0.c(r2)
            return r2
        L_0x000e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.b.g(androidx.appcompat.view.menu.r):boolean");
    }

    public n.a h(ViewGroup viewGroup) {
        return (n.a) this.f915h.inflate(this.f919l, viewGroup, false);
    }

    public void i(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f920m;
        if (viewGroup != null) {
            g gVar = this.f914g;
            int i10 = 0;
            if (gVar != null) {
                gVar.t();
                ArrayList G = this.f914g.G();
                int size = G.size();
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    i iVar = (i) G.get(i12);
                    if (t(i11, iVar)) {
                        View childAt = viewGroup.getChildAt(i11);
                        i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                        View q10 = q(iVar, childAt, viewGroup);
                        if (iVar != itemData) {
                            q10.setPressed(false);
                            q10.jumpDrawablesToCurrentState();
                        }
                        if (q10 != childAt) {
                            a(q10, i11);
                        }
                        i11++;
                    }
                }
                i10 = i11;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (!o(viewGroup, i10)) {
                    i10++;
                }
            }
        }
    }

    public boolean l(g gVar, i iVar) {
        return false;
    }

    public boolean m(g gVar, i iVar) {
        return false;
    }

    public void n(m.a aVar) {
        this.f917j = aVar;
    }

    /* access modifiers changed from: protected */
    public boolean o(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public m.a p() {
        return this.f917j;
    }

    public View q(i iVar, View view, ViewGroup viewGroup) {
        n.a h10 = view instanceof n.a ? (n.a) view : h(viewGroup);
        d(iVar, h10);
        return (View) h10;
    }

    public n r(ViewGroup viewGroup) {
        if (this.f920m == null) {
            n nVar = (n) this.f915h.inflate(this.f918k, viewGroup, false);
            this.f920m = nVar;
            nVar.b(this.f914g);
            i(true);
        }
        return this.f920m;
    }

    public void s(int i10) {
        this.f921n = i10;
    }

    public abstract boolean t(int i10, i iVar);
}
