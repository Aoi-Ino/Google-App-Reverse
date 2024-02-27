package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

public class e extends b implements g.a {

    /* renamed from: g  reason: collision with root package name */
    private Context f802g;

    /* renamed from: h  reason: collision with root package name */
    private ActionBarContextView f803h;

    /* renamed from: i  reason: collision with root package name */
    private b.a f804i;

    /* renamed from: j  reason: collision with root package name */
    private WeakReference f805j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f806k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f807l;

    /* renamed from: m  reason: collision with root package name */
    private g f808m;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f802g = context;
        this.f803h = actionBarContextView;
        this.f804i = aVar;
        g W = new g(actionBarContextView.getContext()).W(1);
        this.f808m = W;
        W.V(this);
        this.f807l = z10;
    }

    public boolean a(g gVar, MenuItem menuItem) {
        return this.f804i.c(this, menuItem);
    }

    public void b(g gVar) {
        k();
        this.f803h.l();
    }

    public void c() {
        if (!this.f806k) {
            this.f806k = true;
            this.f804i.b(this);
        }
    }

    public View d() {
        WeakReference weakReference = this.f805j;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public Menu e() {
        return this.f808m;
    }

    public MenuInflater f() {
        return new g(this.f803h.getContext());
    }

    public CharSequence g() {
        return this.f803h.getSubtitle();
    }

    public CharSequence i() {
        return this.f803h.getTitle();
    }

    public void k() {
        this.f804i.a(this, this.f808m);
    }

    public boolean l() {
        return this.f803h.j();
    }

    public void m(View view) {
        this.f803h.setCustomView(view);
        this.f805j = view != null ? new WeakReference(view) : null;
    }

    public void n(int i10) {
        o(this.f802g.getString(i10));
    }

    public void o(CharSequence charSequence) {
        this.f803h.setSubtitle(charSequence);
    }

    public void q(int i10) {
        r(this.f802g.getString(i10));
    }

    public void r(CharSequence charSequence) {
        this.f803h.setTitle(charSequence);
    }

    public void s(boolean z10) {
        super.s(z10);
        this.f803h.setTitleOptional(z10);
    }
}
