package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.f0;
import androidx.appcompat.widget.v0;
import androidx.core.view.u;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class g extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    static final Class[] f815e;

    /* renamed from: f  reason: collision with root package name */
    static final Class[] f816f;

    /* renamed from: a  reason: collision with root package name */
    final Object[] f817a;

    /* renamed from: b  reason: collision with root package name */
    final Object[] f818b;

    /* renamed from: c  reason: collision with root package name */
    Context f819c;

    /* renamed from: d  reason: collision with root package name */
    private Object f820d;

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        private static final Class[] f821c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        private Object f822a;

        /* renamed from: b  reason: collision with root package name */
        private Method f823b;

        public a(Object obj, String str) {
            this.f822a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f823b = cls.getMethod(str, f821c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f823b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f823b.invoke(this.f822a, new Object[]{menuItem})).booleanValue();
                }
                this.f823b.invoke(this.f822a, new Object[]{menuItem});
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    private class b {
        androidx.core.view.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* renamed from: a  reason: collision with root package name */
        private Menu f824a;

        /* renamed from: b  reason: collision with root package name */
        private int f825b;

        /* renamed from: c  reason: collision with root package name */
        private int f826c;

        /* renamed from: d  reason: collision with root package name */
        private int f827d;

        /* renamed from: e  reason: collision with root package name */
        private int f828e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f829f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f830g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f831h;

        /* renamed from: i  reason: collision with root package name */
        private int f832i;

        /* renamed from: j  reason: collision with root package name */
        private int f833j;

        /* renamed from: k  reason: collision with root package name */
        private CharSequence f834k;

        /* renamed from: l  reason: collision with root package name */
        private CharSequence f835l;

        /* renamed from: m  reason: collision with root package name */
        private int f836m;

        /* renamed from: n  reason: collision with root package name */
        private char f837n;

        /* renamed from: o  reason: collision with root package name */
        private int f838o;

        /* renamed from: p  reason: collision with root package name */
        private char f839p;

        /* renamed from: q  reason: collision with root package name */
        private int f840q;

        /* renamed from: r  reason: collision with root package name */
        private int f841r;

        /* renamed from: s  reason: collision with root package name */
        private boolean f842s;

        /* renamed from: t  reason: collision with root package name */
        private boolean f843t;

        /* renamed from: u  reason: collision with root package name */
        private boolean f844u;

        /* renamed from: v  reason: collision with root package name */
        private int f845v;

        /* renamed from: w  reason: collision with root package name */
        private int f846w;

        /* renamed from: x  reason: collision with root package name */
        private String f847x;

        /* renamed from: y  reason: collision with root package name */
        private String f848y;

        /* renamed from: z  reason: collision with root package name */
        private String f849z;

        public b(Menu menu) {
            this.f824a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        private Object e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f819c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f842s).setVisible(this.f843t).setEnabled(this.f844u).setCheckable(this.f841r >= 1).setTitleCondensed(this.f835l).setIcon(this.f836m);
            int i10 = this.f845v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f849z != null) {
                if (!g.this.f819c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f849z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f841r >= 2) {
                if (menuItem instanceof i) {
                    ((i) menuItem).t(true);
                } else if (menuItem instanceof j) {
                    ((j) menuItem).h(true);
                }
            }
            String str = this.f847x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f815e, g.this.f817a));
                z10 = true;
            }
            int i11 = this.f846w;
            if (i11 > 0) {
                if (!z10) {
                    menuItem.setActionView(i11);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            androidx.core.view.b bVar = this.A;
            if (bVar != null) {
                u.a(menuItem, bVar);
            }
            u.c(menuItem, this.B);
            u.g(menuItem, this.C);
            u.b(menuItem, this.f837n, this.f838o);
            u.f(menuItem, this.f839p, this.f840q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                u.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                u.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f831h = true;
            i(this.f824a.add(this.f825b, this.f832i, this.f833j, this.f834k));
        }

        public SubMenu b() {
            this.f831h = true;
            SubMenu addSubMenu = this.f824a.addSubMenu(this.f825b, this.f832i, this.f833j, this.f834k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.f831h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f819c.obtainStyledAttributes(attributeSet, f.j.f11290w1);
            this.f825b = obtainStyledAttributes.getResourceId(f.j.f11300y1, 0);
            this.f826c = obtainStyledAttributes.getInt(f.j.A1, 0);
            this.f827d = obtainStyledAttributes.getInt(f.j.B1, 0);
            this.f828e = obtainStyledAttributes.getInt(f.j.C1, 0);
            this.f829f = obtainStyledAttributes.getBoolean(f.j.f11305z1, true);
            this.f830g = obtainStyledAttributes.getBoolean(f.j.f11295x1, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            v0 u10 = v0.u(g.this.f819c, attributeSet, f.j.D1);
            this.f832i = u10.n(f.j.G1, 0);
            this.f833j = (u10.k(f.j.J1, this.f826c) & -65536) | (u10.k(f.j.K1, this.f827d) & 65535);
            this.f834k = u10.p(f.j.L1);
            this.f835l = u10.p(f.j.M1);
            this.f836m = u10.n(f.j.E1, 0);
            this.f837n = c(u10.o(f.j.N1));
            this.f838o = u10.k(f.j.U1, 4096);
            this.f839p = c(u10.o(f.j.O1));
            this.f840q = u10.k(f.j.Y1, 4096);
            int i10 = f.j.P1;
            this.f841r = u10.s(i10) ? u10.a(i10, false) : this.f828e;
            this.f842s = u10.a(f.j.H1, false);
            this.f843t = u10.a(f.j.I1, this.f829f);
            this.f844u = u10.a(f.j.F1, this.f830g);
            this.f845v = u10.k(f.j.Z1, -1);
            this.f849z = u10.o(f.j.Q1);
            this.f846w = u10.n(f.j.R1, 0);
            this.f847x = u10.o(f.j.T1);
            String o10 = u10.o(f.j.S1);
            this.f848y = o10;
            boolean z10 = o10 != null;
            if (z10 && this.f846w == 0 && this.f847x == null) {
                this.A = (androidx.core.view.b) e(o10, g.f816f, g.this.f818b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = u10.p(f.j.V1);
            this.C = u10.p(f.j.f11181a2);
            int i11 = f.j.X1;
            if (u10.s(i11)) {
                this.E = f0.d(u10.k(i11, -1), this.E);
            } else {
                this.E = null;
            }
            int i12 = f.j.W1;
            if (u10.s(i12)) {
                this.D = u10.c(i12);
            } else {
                this.D = null;
            }
            u10.w();
            this.f831h = false;
        }

        public void h() {
            this.f825b = 0;
            this.f826c = 0;
            this.f827d = 0;
            this.f828e = 0;
            this.f829f = true;
            this.f830g = true;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f815e = clsArr;
        f816f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f819c = context;
        Object[] objArr = {context};
        this.f817a = objArr;
        this.f818b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z11 && name2.equals(str)) {
                            z11 = false;
                            str = null;
                        } else if (name2.equals("group")) {
                            bVar.h();
                        } else if (name2.equals("item")) {
                            if (!bVar.d()) {
                                androidx.core.view.b bVar2 = bVar.A;
                                if (bVar2 == null || !bVar2.a()) {
                                    bVar.a();
                                } else {
                                    bVar.b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z10 = true;
                        }
                    }
                } else if (!z11) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.f(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.g(attributeSet);
                    } else if (name3.equals("menu")) {
                        c(xmlPullParser, attributeSet, bVar.b());
                    } else {
                        str = name3;
                        z11 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Object b() {
        if (this.f820d == null) {
            this.f820d = a(this.f819c);
        }
        return this.f820d;
    }

    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof x.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f819c.getResources().getLayout(i10);
            c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e10) {
            throw new InflateException("Error inflating menu XML", e10);
        } catch (IOException e11) {
            throw new InflateException("Error inflating menu XML", e11);
        } catch (Throwable th2) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th2;
        }
    }
}
