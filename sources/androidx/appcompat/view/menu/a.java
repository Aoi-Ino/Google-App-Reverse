package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import x.b;

public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final int f892a;

    /* renamed from: b  reason: collision with root package name */
    private final int f893b;

    /* renamed from: c  reason: collision with root package name */
    private final int f894c;

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f895d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f896e;

    /* renamed from: f  reason: collision with root package name */
    private Intent f897f;

    /* renamed from: g  reason: collision with root package name */
    private char f898g;

    /* renamed from: h  reason: collision with root package name */
    private int f899h = 4096;

    /* renamed from: i  reason: collision with root package name */
    private char f900i;

    /* renamed from: j  reason: collision with root package name */
    private int f901j = 4096;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f902k;

    /* renamed from: l  reason: collision with root package name */
    private Context f903l;

    /* renamed from: m  reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f904m;

    /* renamed from: n  reason: collision with root package name */
    private CharSequence f905n;

    /* renamed from: o  reason: collision with root package name */
    private CharSequence f906o;

    /* renamed from: p  reason: collision with root package name */
    private ColorStateList f907p = null;

    /* renamed from: q  reason: collision with root package name */
    private PorterDuff.Mode f908q = null;

    /* renamed from: r  reason: collision with root package name */
    private boolean f909r = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f910s = false;

    /* renamed from: t  reason: collision with root package name */
    private int f911t = 16;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f903l = context;
        this.f892a = i11;
        this.f893b = i10;
        this.f894c = i13;
        this.f895d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f902k;
        if (drawable == null) {
            return;
        }
        if (this.f909r || this.f910s) {
            Drawable r10 = androidx.core.graphics.drawable.a.r(drawable);
            this.f902k = r10;
            Drawable mutate = r10.mutate();
            this.f902k = mutate;
            if (this.f909r) {
                androidx.core.graphics.drawable.a.o(mutate, this.f907p);
            }
            if (this.f910s) {
                androidx.core.graphics.drawable.a.p(this.f902k, this.f908q);
            }
        }
    }

    public b a(androidx.core.view.b bVar) {
        throw new UnsupportedOperationException();
    }

    public androidx.core.view.b b() {
        return null;
    }

    public boolean collapseActionView() {
        return false;
    }

    /* renamed from: d */
    public b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public boolean expandActionView() {
        return false;
    }

    /* renamed from: f */
    public b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f901j;
    }

    public char getAlphabeticShortcut() {
        return this.f900i;
    }

    public CharSequence getContentDescription() {
        return this.f905n;
    }

    public int getGroupId() {
        return this.f893b;
    }

    public Drawable getIcon() {
        return this.f902k;
    }

    public ColorStateList getIconTintList() {
        return this.f907p;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f908q;
    }

    public Intent getIntent() {
        return this.f897f;
    }

    public int getItemId() {
        return this.f892a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f899h;
    }

    public char getNumericShortcut() {
        return this.f898g;
    }

    public int getOrder() {
        return this.f894c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f895d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f896e;
        return charSequence != null ? charSequence : this.f895d;
    }

    public CharSequence getTooltipText() {
        return this.f906o;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f911t & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f911t & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f911t & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f911t & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c10) {
        this.f900i = Character.toLowerCase(c10);
        return this;
    }

    public MenuItem setCheckable(boolean z10) {
        this.f911t = z10 | (this.f911t & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z10) {
        this.f911t = (z10 ? 2 : 0) | (this.f911t & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z10) {
        this.f911t = (z10 ? 16 : 0) | (this.f911t & -17);
        return this;
    }

    public MenuItem setIcon(int i10) {
        this.f902k = androidx.core.content.a.e(this.f903l, i10);
        c();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f907p = colorStateList;
        this.f909r = true;
        c();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f908q = mode;
        this.f910s = true;
        c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f897f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c10) {
        this.f898g = c10;
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f904m = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c10, char c11) {
        this.f898g = c10;
        this.f900i = Character.toLowerCase(c11);
        return this;
    }

    public void setShowAsAction(int i10) {
    }

    public MenuItem setTitle(int i10) {
        this.f895d = this.f903l.getResources().getString(i10);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f896e = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z10) {
        int i10 = 8;
        int i11 = this.f911t & 8;
        if (z10) {
            i10 = 0;
        }
        this.f911t = i11 | i10;
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f900i = Character.toLowerCase(c10);
        this.f901j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    public b setContentDescription(CharSequence charSequence) {
        this.f905n = charSequence;
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f902k = drawable;
        c();
        return this;
    }

    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f898g = c10;
        this.f899h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f898g = c10;
        this.f899h = KeyEvent.normalizeMetaState(i10);
        this.f900i = Character.toLowerCase(c11);
        this.f901j = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f895d = charSequence;
        return this;
    }

    public b setTooltipText(CharSequence charSequence) {
        this.f906o = charSequence;
        return this;
    }
}
