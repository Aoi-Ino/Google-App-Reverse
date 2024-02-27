package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.view.d;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.n;
import androidx.appcompat.widget.p;
import androidx.appcompat.widget.s0;
import androidx.appcompat.widget.t;
import androidx.appcompat.widget.v;
import androidx.core.view.m0;
import f.j;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.g;

public class s {

    /* renamed from: b  reason: collision with root package name */
    private static final Class[] f751b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f752c = {16843375};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f753d = {16844160};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f754e = {16844156};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f755f = {16844148};

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f756g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h  reason: collision with root package name */
    private static final g f757h = new g();

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f758a = new Object[2];

    private static class a implements View.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        private final View f759e;

        /* renamed from: f  reason: collision with root package name */
        private final String f760f;

        /* renamed from: g  reason: collision with root package name */
        private Method f761g;

        /* renamed from: h  reason: collision with root package name */
        private Context f762h;

        public a(View view, String str) {
            this.f759e = view;
            this.f760f = str;
        }

        private void a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f760f, new Class[]{View.class})) != null) {
                        this.f761g = method;
                        this.f762h = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id2 = this.f759e.getId();
            if (id2 == -1) {
                str = "";
            } else {
                str = " with id '" + this.f759e.getContext().getResources().getResourceEntryName(id2) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f760f + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f759e.getClass() + str);
        }

        public void onClick(View view) {
            if (this.f761g == null) {
                a(this.f759e.getContext());
            }
            try {
                this.f761g.invoke(this.f762h, new Object[]{view});
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    private void a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT <= 28) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f753d);
            if (obtainStyledAttributes.hasValue(0)) {
                m0.r0(view, obtainStyledAttributes.getBoolean(0, false));
            }
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f754e);
            if (obtainStyledAttributes2.hasValue(0)) {
                m0.t0(view, obtainStyledAttributes2.getString(0));
            }
            obtainStyledAttributes2.recycle();
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f755f);
            if (obtainStyledAttributes3.hasValue(0)) {
                m0.H0(view, obtainStyledAttributes3.getBoolean(0, false));
            }
            obtainStyledAttributes3.recycle();
        }
    }

    private void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && m0.P(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f752c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View s(Context context, String str, String str2) {
        String str3;
        g gVar = f757h;
        Constructor<? extends U> constructor = (Constructor) gVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f751b);
            gVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f758a);
    }

    private View t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue((String) null, "class");
        }
        try {
            Object[] objArr = this.f758a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i10 = 0;
                while (true) {
                    String[] strArr = f756g;
                    if (i10 < strArr.length) {
                        View s10 = s(context, str, strArr[i10]);
                        if (s10 != null) {
                            return s10;
                        }
                        i10++;
                    } else {
                        Object[] objArr2 = this.f758a;
                        objArr2[0] = null;
                        objArr2[1] = null;
                        return null;
                    }
                }
            } else {
                View s11 = s(context, str, (String) null);
                Object[] objArr3 = this.f758a;
                objArr3[0] = null;
                objArr3[1] = null;
                return s11;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr4 = this.f758a;
            objArr4[0] = null;
            objArr4[1] = null;
        }
    }

    private static Context u(Context context, AttributeSet attributeSet, boolean z10, boolean z11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.A3, 0, 0);
        int resourceId = z10 ? obtainStyledAttributes.getResourceId(j.B3, 0) : 0;
        if (z11 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(j.C3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return (!(context instanceof d) || ((d) context).c() != resourceId) ? new d(context, resourceId) : context;
        }
        return context;
    }

    private void v(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    /* access modifiers changed from: protected */
    public androidx.appcompat.widget.d c(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.d(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatButton d(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public f e(Context context, AttributeSet attributeSet) {
        return new f(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public androidx.appcompat.widget.g f(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.g(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatEditText g(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public n h(Context context, AttributeSet attributeSet) {
        return new n(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatImageView i(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public p j(Context context, AttributeSet attributeSet) {
        return new p(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public androidx.appcompat.widget.s k(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.s(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public t l(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public v m(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatSpinner n(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatTextView o(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public c0 p(Context context, AttributeSet attributeSet) {
        return new c0(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public View q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View r(View view, String str, Context context, AttributeSet attributeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        View view2;
        Context context2 = (!z10 || view == null) ? context : view.getContext();
        if (z11 || z12) {
            context2 = u(context2, attributeSet, z11, z12);
        }
        if (z13) {
            context2 = s0.b(context2);
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c10 = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c10 = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c10 = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c10 = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c10 = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c10 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c10 = 8;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c10 = 9;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c10 = 10;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c10 = 12;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c10 = 13;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                view2 = l(context2, attributeSet);
                break;
            case 1:
                view2 = f(context2, attributeSet);
                break;
            case 2:
                view2 = j(context2, attributeSet);
                break;
            case 3:
                view2 = o(context2, attributeSet);
                break;
            case 4:
                view2 = h(context2, attributeSet);
                break;
            case 5:
                view2 = m(context2, attributeSet);
                break;
            case 6:
                view2 = n(context2, attributeSet);
                break;
            case 7:
                view2 = k(context2, attributeSet);
                break;
            case 8:
                view2 = p(context2, attributeSet);
                break;
            case 9:
                view2 = i(context2, attributeSet);
                break;
            case 10:
                view2 = c(context2, attributeSet);
                break;
            case 11:
                view2 = e(context2, attributeSet);
                break;
            case 12:
                view2 = g(context2, attributeSet);
                break;
            case 13:
                view2 = d(context2, attributeSet);
                break;
            default:
                view2 = q(context2, str, attributeSet);
                break;
        }
        v(view2, str);
        if (view2 == null && context != context2) {
            view2 = t(context2, str, attributeSet);
        }
        if (view2 != null) {
            b(view2, attributeSet);
            a(context2, view2, attributeSet);
        }
        return view2;
    }
}
