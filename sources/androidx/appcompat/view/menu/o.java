package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import x.a;

public class o extends c implements Menu {

    /* renamed from: d  reason: collision with root package name */
    private final a f1056d;

    public o(Context context, a aVar) {
        super(context);
        if (aVar != null) {
            this.f1056d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(int i10) {
        return c(this.f1056d.add(i10));
    }

    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.f1056d.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr2[i14] = c(menuItemArr3[i14]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(int i10) {
        return d(this.f1056d.addSubMenu(i10));
    }

    public void clear() {
        e();
        this.f1056d.clear();
    }

    public void close() {
        this.f1056d.close();
    }

    public MenuItem findItem(int i10) {
        return c(this.f1056d.findItem(i10));
    }

    public MenuItem getItem(int i10) {
        return c(this.f1056d.getItem(i10));
    }

    public boolean hasVisibleItems() {
        return this.f1056d.hasVisibleItems();
    }

    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f1056d.isShortcutKey(i10, keyEvent);
    }

    public boolean performIdentifierAction(int i10, int i11) {
        return this.f1056d.performIdentifierAction(i10, i11);
    }

    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f1056d.performShortcut(i10, keyEvent, i11);
    }

    public void removeGroup(int i10) {
        f(i10);
        this.f1056d.removeGroup(i10);
    }

    public void removeItem(int i10) {
        g(i10);
        this.f1056d.removeItem(i10);
    }

    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        this.f1056d.setGroupCheckable(i10, z10, z11);
    }

    public void setGroupEnabled(int i10, boolean z10) {
        this.f1056d.setGroupEnabled(i10, z10);
    }

    public void setGroupVisible(int i10, boolean z10) {
        this.f1056d.setGroupVisible(i10, z10);
    }

    public void setQwertyMode(boolean z10) {
        this.f1056d.setQwertyMode(z10);
    }

    public int size() {
        return this.f1056d.size();
    }

    public MenuItem add(int i10, int i11, int i12, int i13) {
        return c(this.f1056d.add(i10, i11, i12, i13));
    }

    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return d(this.f1056d.addSubMenu(i10, i11, i12, i13));
    }

    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return c(this.f1056d.add(i10, i11, i12, charSequence));
    }

    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return d(this.f1056d.addSubMenu(i10, i11, i12, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return c(this.f1056d.add(charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f1056d.addSubMenu(charSequence));
    }
}
