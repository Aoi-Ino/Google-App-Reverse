package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class g implements x.a {
    private static final int[] A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    private final Context f974a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f975b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f976c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f977d;

    /* renamed from: e  reason: collision with root package name */
    private a f978e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList f979f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList f980g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f981h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList f982i;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList f983j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f984k;

    /* renamed from: l  reason: collision with root package name */
    private int f985l = 0;

    /* renamed from: m  reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f986m;

    /* renamed from: n  reason: collision with root package name */
    CharSequence f987n;

    /* renamed from: o  reason: collision with root package name */
    Drawable f988o;

    /* renamed from: p  reason: collision with root package name */
    View f989p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f990q = false;

    /* renamed from: r  reason: collision with root package name */
    private boolean f991r = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f992s = false;

    /* renamed from: t  reason: collision with root package name */
    private boolean f993t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f994u = false;

    /* renamed from: v  reason: collision with root package name */
    private ArrayList f995v = new ArrayList();

    /* renamed from: w  reason: collision with root package name */
    private CopyOnWriteArrayList f996w = new CopyOnWriteArrayList();

    /* renamed from: x  reason: collision with root package name */
    private i f997x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f998y = false;

    /* renamed from: z  reason: collision with root package name */
    private boolean f999z;

    public interface a {
        boolean a(g gVar, MenuItem menuItem);

        void b(g gVar);
    }

    public interface b {
        boolean a(i iVar);
    }

    public g(Context context) {
        this.f974a = context;
        this.f975b = context.getResources();
        this.f979f = new ArrayList();
        this.f980g = new ArrayList();
        this.f981h = true;
        this.f982i = new ArrayList();
        this.f983j = new ArrayList();
        this.f984k = true;
        f0(true);
    }

    private static int D(int i10) {
        int i11 = (-65536 & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = A;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void P(int i10, boolean z10) {
        if (i10 >= 0 && i10 < this.f979f.size()) {
            this.f979f.remove(i10);
            if (z10) {
                M(true);
            }
        }
    }

    private void a0(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources E = E();
        if (view != null) {
            this.f989p = view;
            this.f987n = null;
            this.f988o = null;
        } else {
            if (i10 > 0) {
                this.f987n = E.getText(i10);
            } else if (charSequence != null) {
                this.f987n = charSequence;
            }
            if (i11 > 0) {
                this.f988o = androidx.core.content.a.e(w(), i11);
            } else if (drawable != null) {
                this.f988o = drawable;
            }
            this.f989p = null;
        }
        M(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        if (androidx.core.view.o0.f(android.view.ViewConfiguration.get(r2.f974a), r2.f974a) != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x001c
            android.content.res.Resources r3 = r2.f975b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L_0x001c
            android.content.Context r3 = r2.f974a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f974a
            boolean r3 = androidx.core.view.o0.f(r3, r1)
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r2.f977d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.g.f0(boolean):void");
    }

    private i g(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new i(this, i10, i11, i12, i13, charSequence, i14);
    }

    private void i(boolean z10) {
        if (!this.f996w.isEmpty()) {
            h0();
            Iterator it = this.f996w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                m mVar = (m) weakReference.get();
                if (mVar == null) {
                    this.f996w.remove(weakReference);
                } else {
                    mVar.i(z10);
                }
            }
            g0();
        }
    }

    private void j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.f996w.isEmpty()) {
            Iterator it = this.f996w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                m mVar = (m) weakReference.get();
                if (mVar == null) {
                    this.f996w.remove(weakReference);
                } else {
                    int c10 = mVar.c();
                    if (c10 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(c10)) != null) {
                        mVar.f(parcelable);
                    }
                }
            }
        }
    }

    private void k(Bundle bundle) {
        Parcelable k10;
        if (!this.f996w.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator it = this.f996w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                m mVar = (m) weakReference.get();
                if (mVar == null) {
                    this.f996w.remove(weakReference);
                } else {
                    int c10 = mVar.c();
                    if (c10 > 0 && (k10 = mVar.k()) != null) {
                        sparseArray.put(c10, k10);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    private boolean l(r rVar, m mVar) {
        boolean z10 = false;
        if (this.f996w.isEmpty()) {
            return false;
        }
        if (mVar != null) {
            z10 = mVar.g(rVar);
        }
        Iterator it = this.f996w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            m mVar2 = (m) weakReference.get();
            if (mVar2 == null) {
                this.f996w.remove(weakReference);
            } else if (!z10) {
                z10 = mVar2.g(rVar);
            }
        }
        return z10;
    }

    private static int p(ArrayList arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((i) arrayList.get(size)).f() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    public View A() {
        return this.f989p;
    }

    public ArrayList B() {
        t();
        return this.f983j;
    }

    /* access modifiers changed from: package-private */
    public boolean C() {
        return this.f993t;
    }

    /* access modifiers changed from: package-private */
    public Resources E() {
        return this.f975b;
    }

    public g F() {
        return this;
    }

    public ArrayList G() {
        if (!this.f981h) {
            return this.f980g;
        }
        this.f980g.clear();
        int size = this.f979f.size();
        for (int i10 = 0; i10 < size; i10++) {
            i iVar = (i) this.f979f.get(i10);
            if (iVar.isVisible()) {
                this.f980g.add(iVar);
            }
        }
        this.f981h = false;
        this.f984k = true;
        return this.f980g;
    }

    public boolean H() {
        return this.f998y;
    }

    /* access modifiers changed from: package-private */
    public boolean I() {
        return this.f976c;
    }

    public boolean J() {
        return this.f977d;
    }

    /* access modifiers changed from: package-private */
    public void K(i iVar) {
        this.f984k = true;
        M(true);
    }

    /* access modifiers changed from: package-private */
    public void L(i iVar) {
        this.f981h = true;
        M(true);
    }

    public void M(boolean z10) {
        if (!this.f990q) {
            if (z10) {
                this.f981h = true;
                this.f984k = true;
            }
            i(z10);
            return;
        }
        this.f991r = true;
        if (z10) {
            this.f992s = true;
        }
    }

    public boolean N(MenuItem menuItem, int i10) {
        return O(menuItem, (m) null, i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if ((r9 & 1) == 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        if (r1 == false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean O(android.view.MenuItem r7, androidx.appcompat.view.menu.m r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.i r7 = (androidx.appcompat.view.menu.i) r7
            r0 = 0
            if (r7 == 0) goto L_0x006c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000c
            goto L_0x006c
        L_0x000c:
            boolean r1 = r7.k()
            androidx.core.view.b r2 = r7.b()
            r3 = 1
            if (r2 == 0) goto L_0x001f
            boolean r4 = r2.a()
            if (r4 == 0) goto L_0x001f
            r4 = r3
            goto L_0x0020
        L_0x001f:
            r4 = r0
        L_0x0020:
            boolean r5 = r7.j()
            if (r5 == 0) goto L_0x0031
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x006b
        L_0x002d:
            r6.e(r3)
            goto L_0x006b
        L_0x0031:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x003f
            if (r4 == 0) goto L_0x003a
            goto L_0x003f
        L_0x003a:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x006b
            goto L_0x002d
        L_0x003f:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0046
            r6.e(r0)
        L_0x0046:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0058
            androidx.appcompat.view.menu.r r9 = new androidx.appcompat.view.menu.r
            android.content.Context r0 = r6.w()
            r9.<init>(r0, r6, r7)
            r7.x(r9)
        L_0x0058:
            android.view.SubMenu r7 = r7.getSubMenu()
            androidx.appcompat.view.menu.r r7 = (androidx.appcompat.view.menu.r) r7
            if (r4 == 0) goto L_0x0063
            r2.e(r7)
        L_0x0063:
            boolean r7 = r6.l(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L_0x006b
            goto L_0x002d
        L_0x006b:
            return r1
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.g.O(android.view.MenuItem, androidx.appcompat.view.menu.m, int):boolean");
    }

    public void Q(m mVar) {
        Iterator it = this.f996w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            m mVar2 = (m) weakReference.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.f996w.remove(weakReference);
            }
        }
    }

    public void R(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(v());
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                MenuItem item = getItem(i10);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((r) item.getSubMenu()).R(bundle);
                }
            }
            int i11 = bundle.getInt("android:menu:expandedactionview");
            if (i11 > 0 && (findItem = findItem(i11)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public void S(Bundle bundle) {
        j(bundle);
    }

    public void T(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).T(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(v(), sparseArray);
        }
    }

    public void U(Bundle bundle) {
        k(bundle);
    }

    public void V(a aVar) {
        this.f978e = aVar;
    }

    public g W(int i10) {
        this.f985l = i10;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void X(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f979f.size();
        h0();
        for (int i10 = 0; i10 < size; i10++) {
            i iVar = (i) this.f979f.get(i10);
            if (iVar.getGroupId() == groupId && iVar.m() && iVar.isCheckable()) {
                iVar.s(iVar == menuItem);
            }
        }
        g0();
    }

    /* access modifiers changed from: protected */
    public g Y(int i10) {
        a0(0, (CharSequence) null, i10, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public g Z(Drawable drawable) {
        a0(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int D = D(i12);
        i g10 = g(i10, i11, i12, D, charSequence, this.f985l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f986m;
        if (contextMenuInfo != null) {
            g10.v(contextMenuInfo);
        }
        ArrayList arrayList = this.f979f;
        arrayList.add(p(arrayList, D), g10);
        M(true);
        return g10;
    }

    public MenuItem add(int i10) {
        return a(0, 0, 0, this.f975b.getString(i10));
    }

    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f974a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f975b.getString(i10));
    }

    public void b(m mVar) {
        c(mVar, this.f974a);
    }

    /* access modifiers changed from: protected */
    public g b0(int i10) {
        a0(i10, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    public void c(m mVar, Context context) {
        this.f996w.add(new WeakReference(mVar));
        mVar.e(context, this);
        this.f984k = true;
    }

    /* access modifiers changed from: protected */
    public g c0(CharSequence charSequence) {
        a0(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public void clear() {
        i iVar = this.f997x;
        if (iVar != null) {
            f(iVar);
        }
        this.f979f.clear();
        M(true);
    }

    public void clearHeader() {
        this.f988o = null;
        this.f987n = null;
        this.f989p = null;
        M(false);
    }

    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f978e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    /* access modifiers changed from: protected */
    public g d0(View view) {
        a0(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public final void e(boolean z10) {
        if (!this.f994u) {
            this.f994u = true;
            Iterator it = this.f996w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                m mVar = (m) weakReference.get();
                if (mVar == null) {
                    this.f996w.remove(weakReference);
                } else {
                    mVar.b(this, z10);
                }
            }
            this.f994u = false;
        }
    }

    public void e0(boolean z10) {
        this.f999z = z10;
    }

    public boolean f(i iVar) {
        boolean z10 = false;
        if (!this.f996w.isEmpty() && this.f997x == iVar) {
            h0();
            Iterator it = this.f996w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                m mVar = (m) weakReference.get();
                if (mVar == null) {
                    this.f996w.remove(weakReference);
                } else {
                    z10 = mVar.l(this, iVar);
                    if (z10) {
                        break;
                    }
                }
            }
            g0();
            if (z10) {
                this.f997x = null;
            }
        }
        return z10;
    }

    public MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = (i) this.f979f.get(i11);
            if (iVar.getItemId() == i10) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (findItem = iVar.getSubMenu().findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public void g0() {
        this.f990q = false;
        if (this.f991r) {
            this.f991r = false;
            M(this.f992s);
        }
    }

    public MenuItem getItem(int i10) {
        return (MenuItem) this.f979f.get(i10);
    }

    /* access modifiers changed from: package-private */
    public boolean h(g gVar, MenuItem menuItem) {
        a aVar = this.f978e;
        return aVar != null && aVar.a(gVar, menuItem);
    }

    public void h0() {
        if (!this.f990q) {
            this.f990q = true;
            this.f991r = false;
            this.f992s = false;
        }
    }

    public boolean hasVisibleItems() {
        if (this.f999z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((i) this.f979f.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return r(i10, keyEvent) != null;
    }

    public boolean m(i iVar) {
        boolean z10 = false;
        if (this.f996w.isEmpty()) {
            return false;
        }
        h0();
        Iterator it = this.f996w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            m mVar = (m) weakReference.get();
            if (mVar == null) {
                this.f996w.remove(weakReference);
            } else {
                z10 = mVar.m(this, iVar);
                if (z10) {
                    break;
                }
            }
        }
        g0();
        if (z10) {
            this.f997x = iVar;
        }
        return z10;
    }

    public int n(int i10) {
        return o(i10, 0);
    }

    public int o(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (((i) this.f979f.get(i11)).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public boolean performIdentifierAction(int i10, int i11) {
        return N(findItem(i10), i11);
    }

    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        i r10 = r(i10, keyEvent);
        boolean N = r10 != null ? N(r10, i11) : false;
        if ((i11 & 2) != 0) {
            e(true);
        }
        return N;
    }

    public int q(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((i) this.f979f.get(i11)).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public i r(int i10, KeyEvent keyEvent) {
        ArrayList arrayList = this.f995v;
        arrayList.clear();
        s(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (i) arrayList.get(0);
        }
        boolean I = I();
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = (i) arrayList.get(i11);
            char alphabeticShortcut = I ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (I && alphabeticShortcut == 8 && i10 == 67))) {
                return iVar;
            }
        }
        return null;
    }

    public void removeGroup(int i10) {
        int n10 = n(i10);
        if (n10 >= 0) {
            int size = this.f979f.size() - n10;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || ((i) this.f979f.get(n10)).getGroupId() != i10) {
                    M(true);
                } else {
                    P(n10, false);
                    i11 = i12;
                }
            }
            M(true);
        }
    }

    public void removeItem(int i10) {
        P(q(i10), true);
    }

    /* access modifiers changed from: package-private */
    public void s(List list, int i10, KeyEvent keyEvent) {
        boolean I = I();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f979f.size();
            for (int i11 = 0; i11 < size; i11++) {
                i iVar = (i) this.f979f.get(i11);
                if (iVar.hasSubMenu()) {
                    ((g) iVar.getSubMenu()).s(list, i10, keyEvent);
                }
                char alphabeticShortcut = I ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
                if ((modifiers & 69647) == ((I ? iVar.getAlphabeticModifiers() : iVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (I && alphabeticShortcut == 8 && i10 == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f979f.size();
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = (i) this.f979f.get(i11);
            if (iVar.getGroupId() == i10) {
                iVar.t(z11);
                iVar.setCheckable(z10);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z10) {
        this.f998y = z10;
    }

    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f979f.size();
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = (i) this.f979f.get(i11);
            if (iVar.getGroupId() == i10) {
                iVar.setEnabled(z10);
            }
        }
    }

    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f979f.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = (i) this.f979f.get(i11);
            if (iVar.getGroupId() == i10 && iVar.y(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            M(true);
        }
    }

    public void setQwertyMode(boolean z10) {
        this.f976c = z10;
        M(false);
    }

    public int size() {
        return this.f979f.size();
    }

    public void t() {
        ArrayList G = G();
        if (this.f984k) {
            Iterator it = this.f996w.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                m mVar = (m) weakReference.get();
                if (mVar == null) {
                    this.f996w.remove(weakReference);
                } else {
                    z10 |= mVar.j();
                }
            }
            if (z10) {
                this.f982i.clear();
                this.f983j.clear();
                int size = G.size();
                for (int i10 = 0; i10 < size; i10++) {
                    i iVar = (i) G.get(i10);
                    (iVar.l() ? this.f982i : this.f983j).add(iVar);
                }
            } else {
                this.f982i.clear();
                this.f983j.clear();
                this.f983j.addAll(G());
            }
            this.f984k = false;
        }
    }

    public ArrayList u() {
        t();
        return this.f982i;
    }

    /* access modifiers changed from: protected */
    public String v() {
        return "android:menu:actionviewstates";
    }

    public Context w() {
        return this.f974a;
    }

    public i x() {
        return this.f997x;
    }

    public Drawable y() {
        return this.f988o;
    }

    public CharSequence z() {
        return this.f987n;
    }

    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f975b.getString(i13));
    }

    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, (CharSequence) this.f975b.getString(i13));
    }

    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        i iVar = (i) a(i10, i11, i12, charSequence);
        r rVar = new r(this.f974a, this, iVar);
        iVar.x(rVar);
        return rVar;
    }

    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }
}
