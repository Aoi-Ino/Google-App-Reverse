package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.n;
import androidx.core.view.b;
import f.h;
import x.b;

public final class i implements b {
    private View A;
    private androidx.core.view.b B;
    private MenuItem.OnActionExpandListener C;
    private boolean D = false;
    private ContextMenu.ContextMenuInfo E;

    /* renamed from: a  reason: collision with root package name */
    private final int f1004a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1005b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1006c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1007d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f1008e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f1009f;

    /* renamed from: g  reason: collision with root package name */
    private Intent f1010g;

    /* renamed from: h  reason: collision with root package name */
    private char f1011h;

    /* renamed from: i  reason: collision with root package name */
    private int f1012i = 4096;

    /* renamed from: j  reason: collision with root package name */
    private char f1013j;

    /* renamed from: k  reason: collision with root package name */
    private int f1014k = 4096;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f1015l;

    /* renamed from: m  reason: collision with root package name */
    private int f1016m = 0;

    /* renamed from: n  reason: collision with root package name */
    g f1017n;

    /* renamed from: o  reason: collision with root package name */
    private r f1018o;

    /* renamed from: p  reason: collision with root package name */
    private Runnable f1019p;

    /* renamed from: q  reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f1020q;

    /* renamed from: r  reason: collision with root package name */
    private CharSequence f1021r;

    /* renamed from: s  reason: collision with root package name */
    private CharSequence f1022s;

    /* renamed from: t  reason: collision with root package name */
    private ColorStateList f1023t = null;

    /* renamed from: u  reason: collision with root package name */
    private PorterDuff.Mode f1024u = null;

    /* renamed from: v  reason: collision with root package name */
    private boolean f1025v = false;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1026w = false;

    /* renamed from: x  reason: collision with root package name */
    private boolean f1027x = false;

    /* renamed from: y  reason: collision with root package name */
    private int f1028y = 16;

    /* renamed from: z  reason: collision with root package name */
    private int f1029z;

    class a implements b.C0040b {
        a() {
        }

        public void onActionProviderVisibilityChanged(boolean z10) {
            i iVar = i.this;
            iVar.f1017n.L(iVar);
        }
    }

    i(g gVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f1017n = gVar;
        this.f1004a = i11;
        this.f1005b = i10;
        this.f1006c = i12;
        this.f1007d = i13;
        this.f1008e = charSequence;
        this.f1029z = i14;
    }

    private static void d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f1027x && (this.f1025v || this.f1026w)) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            if (this.f1025v) {
                androidx.core.graphics.drawable.a.o(drawable, this.f1023t);
            }
            if (this.f1026w) {
                androidx.core.graphics.drawable.a.p(drawable, this.f1024u);
            }
            this.f1027x = false;
        }
        return drawable;
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        return this.f1017n.J() && g() != 0;
    }

    public boolean B() {
        return (this.f1029z & 4) == 4;
    }

    public x.b a(androidx.core.view.b bVar) {
        androidx.core.view.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.g();
        }
        this.A = null;
        this.B = bVar;
        this.f1017n.M(true);
        androidx.core.view.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.i(new a());
        }
        return this;
    }

    public androidx.core.view.b b() {
        return this.B;
    }

    public void c() {
        this.f1017n.K(this);
    }

    public boolean collapseActionView() {
        if ((this.f1029z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1017n.f(this);
        }
        return false;
    }

    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1017n.m(this);
        }
        return false;
    }

    public int f() {
        return this.f1007d;
    }

    /* access modifiers changed from: package-private */
    public char g() {
        return this.f1017n.I() ? this.f1013j : this.f1011h;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        androidx.core.view.b bVar = this.B;
        if (bVar == null) {
            return null;
        }
        View c10 = bVar.c(this);
        this.A = c10;
        return c10;
    }

    public int getAlphabeticModifiers() {
        return this.f1014k;
    }

    public char getAlphabeticShortcut() {
        return this.f1013j;
    }

    public CharSequence getContentDescription() {
        return this.f1021r;
    }

    public int getGroupId() {
        return this.f1005b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f1015l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f1016m == 0) {
            return null;
        }
        Drawable b10 = g.a.b(this.f1017n.w(), this.f1016m);
        this.f1016m = 0;
        this.f1015l = b10;
        return e(b10);
    }

    public ColorStateList getIconTintList() {
        return this.f1023t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1024u;
    }

    public Intent getIntent() {
        return this.f1010g;
    }

    public int getItemId() {
        return this.f1004a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    public int getNumericModifiers() {
        return this.f1012i;
    }

    public char getNumericShortcut() {
        return this.f1011h;
    }

    public int getOrder() {
        return this.f1006c;
    }

    public SubMenu getSubMenu() {
        return this.f1018o;
    }

    public CharSequence getTitle() {
        return this.f1008e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1009f;
        return charSequence != null ? charSequence : this.f1008e;
    }

    public CharSequence getTooltipText() {
        return this.f1022s;
    }

    /* access modifiers changed from: package-private */
    public String h() {
        int i10;
        char g10 = g();
        if (g10 == 0) {
            return "";
        }
        Resources resources = this.f1017n.w().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f1017n.w()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(h.abc_prepend_shortcut_label));
        }
        int i11 = this.f1017n.I() ? this.f1014k : this.f1012i;
        d(sb2, i11, 65536, resources.getString(h.abc_menu_meta_shortcut_label));
        d(sb2, i11, 4096, resources.getString(h.abc_menu_ctrl_shortcut_label));
        d(sb2, i11, 2, resources.getString(h.abc_menu_alt_shortcut_label));
        d(sb2, i11, 1, resources.getString(h.abc_menu_shift_shortcut_label));
        d(sb2, i11, 4, resources.getString(h.abc_menu_sym_shortcut_label));
        d(sb2, i11, 8, resources.getString(h.abc_menu_function_shortcut_label));
        if (g10 == 8) {
            i10 = h.abc_menu_delete_shortcut_label;
        } else if (g10 == 10) {
            i10 = h.abc_menu_enter_shortcut_label;
        } else if (g10 != ' ') {
            sb2.append(g10);
            return sb2.toString();
        } else {
            i10 = h.abc_menu_space_shortcut_label;
        }
        sb2.append(resources.getString(i10));
        return sb2.toString();
    }

    public boolean hasSubMenu() {
        return this.f1018o != null;
    }

    /* access modifiers changed from: package-private */
    public CharSequence i(n.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    public boolean isActionViewExpanded() {
        return this.D;
    }

    public boolean isCheckable() {
        return (this.f1028y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f1028y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f1028y & 16) != 0;
    }

    public boolean isVisible() {
        androidx.core.view.b bVar = this.B;
        return (bVar == null || !bVar.f()) ? (this.f1028y & 8) == 0 : (this.f1028y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        androidx.core.view.b bVar;
        if ((this.f1029z & 8) == 0) {
            return false;
        }
        if (this.A == null && (bVar = this.B) != null) {
            this.A = bVar.c(this);
        }
        return this.A != null;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1020q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        g gVar = this.f1017n;
        if (gVar.h(gVar, this)) {
            return true;
        }
        Runnable runnable = this.f1019p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1010g != null) {
            try {
                this.f1017n.w().startActivity(this.f1010g);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        androidx.core.view.b bVar = this.B;
        return bVar != null && bVar.d();
    }

    public boolean l() {
        return (this.f1028y & 32) == 32;
    }

    public boolean m() {
        return (this.f1028y & 4) != 0;
    }

    public boolean n() {
        return (this.f1029z & 1) == 1;
    }

    public boolean o() {
        return (this.f1029z & 2) == 2;
    }

    /* renamed from: p */
    public x.b setActionView(int i10) {
        Context w10 = this.f1017n.w();
        setActionView(LayoutInflater.from(w10).inflate(i10, new LinearLayout(w10), false));
        return this;
    }

    /* renamed from: q */
    public x.b setActionView(View view) {
        int i10;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f1004a) > 0) {
            view.setId(i10);
        }
        this.f1017n.K(this);
        return this;
    }

    public void r(boolean z10) {
        this.D = z10;
        this.f1017n.M(false);
    }

    /* access modifiers changed from: package-private */
    public void s(boolean z10) {
        int i10 = this.f1028y;
        int i11 = (z10 ? 2 : 0) | (i10 & -3);
        this.f1028y = i11;
        if (i10 != i11) {
            this.f1017n.M(false);
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f1013j == c10) {
            return this;
        }
        this.f1013j = Character.toLowerCase(c10);
        this.f1017n.M(false);
        return this;
    }

    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f1028y;
        boolean z11 = z10 | (i10 & true);
        this.f1028y = z11 ? 1 : 0;
        if (i10 != z11) {
            this.f1017n.M(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z10) {
        if ((this.f1028y & 4) != 0) {
            this.f1017n.X(this);
        } else {
            s(z10);
        }
        return this;
    }

    public MenuItem setEnabled(boolean z10) {
        this.f1028y = z10 ? this.f1028y | 16 : this.f1028y & -17;
        this.f1017n.M(false);
        return this;
    }

    public MenuItem setIcon(int i10) {
        this.f1015l = null;
        this.f1016m = i10;
        this.f1027x = true;
        this.f1017n.M(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1023t = colorStateList;
        this.f1025v = true;
        this.f1027x = true;
        this.f1017n.M(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1024u = mode;
        this.f1026w = true;
        this.f1027x = true;
        this.f1017n.M(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1010g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c10) {
        if (this.f1011h == c10) {
            return this;
        }
        this.f1011h = c10;
        this.f1017n.M(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1020q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c10, char c11) {
        this.f1011h = c10;
        this.f1013j = Character.toLowerCase(c11);
        this.f1017n.M(false);
        return this;
    }

    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 == 0 || i11 == 1 || i11 == 2) {
            this.f1029z = i10;
            this.f1017n.K(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setTitle(int i10) {
        return setTitle((CharSequence) this.f1017n.w().getString(i10));
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1009f = charSequence;
        this.f1017n.M(false);
        return this;
    }

    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f1017n.L(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.f1028y = (z10 ? 4 : 0) | (this.f1028y & -5);
    }

    public String toString() {
        CharSequence charSequence = this.f1008e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        this.f1028y = z10 ? this.f1028y | 32 : this.f1028y & -33;
    }

    /* access modifiers changed from: package-private */
    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    /* renamed from: w */
    public x.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void x(r rVar) {
        this.f1018o = rVar;
        rVar.setHeaderTitle(getTitle());
    }

    /* access modifiers changed from: package-private */
    public boolean y(boolean z10) {
        int i10 = this.f1028y;
        int i11 = (z10 ? 0 : 8) | (i10 & -9);
        this.f1028y = i11;
        return i10 != i11;
    }

    public boolean z() {
        return this.f1017n.C();
    }

    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f1013j == c10 && this.f1014k == i10) {
            return this;
        }
        this.f1013j = Character.toLowerCase(c10);
        this.f1014k = KeyEvent.normalizeMetaState(i10);
        this.f1017n.M(false);
        return this;
    }

    public x.b setContentDescription(CharSequence charSequence) {
        this.f1021r = charSequence;
        this.f1017n.M(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1016m = 0;
        this.f1015l = drawable;
        this.f1027x = true;
        this.f1017n.M(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f1011h == c10 && this.f1012i == i10) {
            return this;
        }
        this.f1011h = c10;
        this.f1012i = KeyEvent.normalizeMetaState(i10);
        this.f1017n.M(false);
        return this;
    }

    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f1011h = c10;
        this.f1012i = KeyEvent.normalizeMetaState(i10);
        this.f1013j = Character.toLowerCase(c11);
        this.f1014k = KeyEvent.normalizeMetaState(i11);
        this.f1017n.M(false);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1008e = charSequence;
        this.f1017n.M(false);
        r rVar = this.f1018o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public x.b setTooltipText(CharSequence charSequence) {
        this.f1022s = charSequence;
        this.f1017n.M(false);
        return this;
    }
}
