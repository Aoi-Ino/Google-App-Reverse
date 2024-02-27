package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.b;
import java.lang.reflect.Method;

public class j extends c implements MenuItem {

    /* renamed from: d  reason: collision with root package name */
    private final x.b f1031d;

    /* renamed from: e  reason: collision with root package name */
    private Method f1032e;

    private class a extends androidx.core.view.b {

        /* renamed from: d  reason: collision with root package name */
        final ActionProvider f1033d;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f1033d = actionProvider;
        }

        public boolean a() {
            return this.f1033d.hasSubMenu();
        }

        public boolean d() {
            return this.f1033d.onPerformDefaultAction();
        }

        public void e(SubMenu subMenu) {
            this.f1033d.onPrepareSubMenu(j.this.d(subMenu));
        }
    }

    private class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: f  reason: collision with root package name */
        private b.C0040b f1035f;

        b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        public boolean b() {
            return this.f1033d.isVisible();
        }

        public View c(MenuItem menuItem) {
            return this.f1033d.onCreateActionView(menuItem);
        }

        public boolean f() {
            return this.f1033d.overridesItemVisibility();
        }

        public void i(b.C0040b bVar) {
            this.f1035f = bVar;
            this.f1033d.setVisibilityListener(bVar != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean z10) {
            b.C0040b bVar = this.f1035f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    static class c extends FrameLayout implements androidx.appcompat.view.c {

        /* renamed from: e  reason: collision with root package name */
        final CollapsibleActionView f1037e;

        c(View view) {
            super(view.getContext());
            this.f1037e = (CollapsibleActionView) view;
            addView(view);
        }

        /* access modifiers changed from: package-private */
        public View a() {
            return (View) this.f1037e;
        }

        public void c() {
            this.f1037e.onActionViewExpanded();
        }

        public void f() {
            this.f1037e.onActionViewCollapsed();
        }
    }

    private class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a  reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f1038a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f1038a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f1038a.onMenuItemActionCollapse(j.this.c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f1038a.onMenuItemActionExpand(j.this.c(menuItem));
        }
    }

    private class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f1040a;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f1040a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f1040a.onMenuItemClick(j.this.c(menuItem));
        }
    }

    public j(Context context, x.b bVar) {
        super(context);
        if (bVar != null) {
            this.f1031d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f1031d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f1031d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        androidx.core.view.b b10 = this.f1031d.b();
        if (b10 instanceof a) {
            return ((a) b10).f1033d;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f1031d.getActionView();
        return actionView instanceof c ? ((c) actionView).a() : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f1031d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f1031d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f1031d.getContentDescription();
    }

    public int getGroupId() {
        return this.f1031d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f1031d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f1031d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1031d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f1031d.getIntent();
    }

    public int getItemId() {
        return this.f1031d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1031d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f1031d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f1031d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f1031d.getOrder();
    }

    public SubMenu getSubMenu() {
        return d(this.f1031d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f1031d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f1031d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f1031d.getTooltipText();
    }

    public void h(boolean z10) {
        try {
            if (this.f1032e == null) {
                this.f1032e = this.f1031d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f1032e.invoke(this.f1031d, new Object[]{Boolean.valueOf(z10)});
        } catch (Exception e10) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
        }
    }

    public boolean hasSubMenu() {
        return this.f1031d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f1031d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f1031d.isCheckable();
    }

    public boolean isChecked() {
        return this.f1031d.isChecked();
    }

    public boolean isEnabled() {
        return this.f1031d.isEnabled();
    }

    public boolean isVisible() {
        return this.f1031d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this.f922a, actionProvider);
        x.b bVar2 = this.f1031d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.a(bVar);
        return this;
    }

    public MenuItem setActionView(int i10) {
        this.f1031d.setActionView(i10);
        View actionView = this.f1031d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f1031d.setActionView((View) new c(actionView));
        }
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c10) {
        this.f1031d.setAlphabeticShortcut(c10);
        return this;
    }

    public MenuItem setCheckable(boolean z10) {
        this.f1031d.setCheckable(z10);
        return this;
    }

    public MenuItem setChecked(boolean z10) {
        this.f1031d.setChecked(z10);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f1031d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z10) {
        this.f1031d.setEnabled(z10);
        return this;
    }

    public MenuItem setIcon(int i10) {
        this.f1031d.setIcon(i10);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1031d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1031d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1031d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c10) {
        this.f1031d.setNumericShortcut(c10);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1031d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1031d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c10, char c11) {
        this.f1031d.setShortcut(c10, c11);
        return this;
    }

    public void setShowAsAction(int i10) {
        this.f1031d.setShowAsAction(i10);
    }

    public MenuItem setShowAsActionFlags(int i10) {
        this.f1031d.setShowAsActionFlags(i10);
        return this;
    }

    public MenuItem setTitle(int i10) {
        this.f1031d.setTitle(i10);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1031d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f1031d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z10) {
        return this.f1031d.setVisible(z10);
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f1031d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f1031d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1031d.setIcon(drawable);
        return this;
    }

    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f1031d.setNumericShortcut(c10, i10);
        return this;
    }

    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f1031d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1031d.setTitle(charSequence);
        return this;
    }
}
