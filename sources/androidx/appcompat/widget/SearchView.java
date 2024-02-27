package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.m0;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends LinearLayoutCompat implements androidx.appcompat.view.c {

    /* renamed from: r0  reason: collision with root package name */
    static final o f1218r0 = (Build.VERSION.SDK_INT < 29 ? new o() : null);
    final ImageView A;
    private final View B;
    private q C;
    private Rect D;
    private Rect E;
    private int[] F;
    private int[] G;
    private final ImageView H;
    private final Drawable I;
    private final int J;
    private final int K;
    private final Intent L;
    private final Intent M;
    private final CharSequence N;
    View.OnFocusChangeListener O;
    private View.OnClickListener P;
    private boolean Q;
    private boolean R;
    a0.a S;
    private boolean T;
    private CharSequence U;
    private boolean V;
    private boolean W;

    /* renamed from: a0  reason: collision with root package name */
    private int f1219a0;

    /* renamed from: b0  reason: collision with root package name */
    private boolean f1220b0;

    /* renamed from: c0  reason: collision with root package name */
    private CharSequence f1221c0;

    /* renamed from: d0  reason: collision with root package name */
    private CharSequence f1222d0;

    /* renamed from: e0  reason: collision with root package name */
    private boolean f1223e0;

    /* renamed from: f0  reason: collision with root package name */
    private int f1224f0;

    /* renamed from: g0  reason: collision with root package name */
    SearchableInfo f1225g0;

    /* renamed from: h0  reason: collision with root package name */
    private Bundle f1226h0;

    /* renamed from: i0  reason: collision with root package name */
    private final Runnable f1227i0;

    /* renamed from: j0  reason: collision with root package name */
    private Runnable f1228j0;

    /* renamed from: k0  reason: collision with root package name */
    private final WeakHashMap f1229k0;

    /* renamed from: l0  reason: collision with root package name */
    private final View.OnClickListener f1230l0;

    /* renamed from: m0  reason: collision with root package name */
    View.OnKeyListener f1231m0;

    /* renamed from: n0  reason: collision with root package name */
    private final TextView.OnEditorActionListener f1232n0;

    /* renamed from: o0  reason: collision with root package name */
    private final AdapterView.OnItemClickListener f1233o0;

    /* renamed from: p0  reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f1234p0;

    /* renamed from: q0  reason: collision with root package name */
    private TextWatcher f1235q0;

    /* renamed from: t  reason: collision with root package name */
    final SearchAutoComplete f1236t;

    /* renamed from: u  reason: collision with root package name */
    private final View f1237u;

    /* renamed from: v  reason: collision with root package name */
    private final View f1238v;

    /* renamed from: w  reason: collision with root package name */
    private final View f1239w;

    /* renamed from: x  reason: collision with root package name */
    final ImageView f1240x;

    /* renamed from: y  reason: collision with root package name */
    final ImageView f1241y;

    /* renamed from: z  reason: collision with root package name */
    final ImageView f1242z;

    public static class SearchAutoComplete extends d {

        /* renamed from: i  reason: collision with root package name */
        private int f1243i;

        /* renamed from: j  reason: collision with root package name */
        private SearchView f1244j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f1245k;

        /* renamed from: l  reason: collision with root package name */
        final Runnable f1246l;

        class a implements Runnable {
            a() {
            }

            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, f.a.f11172m);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (Build.VERSION.SDK_INT >= 29) {
                k.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f1218r0.c(this);
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            if (this.f1245k) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1245k = false;
            }
        }

        public boolean enoughToFilter() {
            return this.f1243i <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1245k) {
                removeCallbacks(this.f1246l);
                post(this.f1246l);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            this.f1244j.Z();
        }

        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1244j.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f1244j.hasFocus() && getVisibility() == 0) {
                this.f1245k = true;
                if (SearchView.M(getContext())) {
                    b();
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f1245k = false;
                removeCallbacks(this.f1246l);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f1245k = false;
                removeCallbacks(this.f1246l);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f1245k = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f1244j = searchView;
        }

        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f1243i = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f1246l = new a();
            this.f1243i = getThreshold();
        }
    }

    class a implements TextWatcher {
        a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.Y(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            SearchView.this.f0();
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            a0.a aVar = SearchView.this.S;
            if (aVar instanceof q0) {
                aVar.a((Cursor) null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.O;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.B();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f1240x) {
                searchView.V();
            } else if (view == searchView.f1242z) {
                searchView.R();
            } else if (view == searchView.f1241y) {
                searchView.W();
            } else if (view == searchView.A) {
                searchView.a0();
            } else if (view == searchView.f1236t) {
                searchView.H();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1225g0 == null) {
                return false;
            }
            if (searchView.f1236t.isPopupShowing() && SearchView.this.f1236t.getListSelection() != -1) {
                return SearchView.this.X(view, i10, keyEvent);
            }
            if (SearchView.this.f1236t.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.P(0, (String) null, searchView2.f1236t.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.W();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            SearchView.this.S(i10, 0, (String) null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            SearchView.this.T(i10);
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static class k {
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    public interface l {
    }

    public interface m {
    }

    public interface n {
    }

    private static class o {

        /* renamed from: a  reason: collision with root package name */
        private Method f1258a = null;

        /* renamed from: b  reason: collision with root package name */
        private Method f1259b = null;

        /* renamed from: c  reason: collision with root package name */
        private Method f1260c = null;

        o() {
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            d();
            try {
                Method declaredMethod = cls.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1258a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = cls.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1259b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f1260c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* access modifiers changed from: package-private */
        public void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1259b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1258a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1260c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }
    }

    static class p extends b0.a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        boolean f1261g;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public p createFromParcel(Parcel parcel) {
                return new p(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            /* renamed from: c */
            public p[] newArray(int i10) {
                return new p[i10];
            }
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1261g = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1261g + "}";
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f1261g));
        }

        p(Parcelable parcelable) {
            super(parcelable);
        }
    }

    private static class q extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        private final View f1262a;

        /* renamed from: b  reason: collision with root package name */
        private final Rect f1263b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        private final Rect f1264c = new Rect();

        /* renamed from: d  reason: collision with root package name */
        private final Rect f1265d = new Rect();

        /* renamed from: e  reason: collision with root package name */
        private final int f1266e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f1267f;

        public q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1266e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            a(rect, rect2);
            this.f1262a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f1263b.set(rect);
            this.f1265d.set(rect);
            Rect rect3 = this.f1265d;
            int i10 = this.f1266e;
            rect3.inset(-i10, -i10);
            this.f1264c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r9) {
            /*
                r8 = this;
                float r0 = r9.getX()
                int r0 = (int) r0
                float r1 = r9.getY()
                int r1 = (int) r1
                int r2 = r9.getAction()
                r3 = 2
                r4 = 0
                r5 = 1
                if (r2 == 0) goto L_0x0032
                if (r2 == r5) goto L_0x0023
                if (r2 == r3) goto L_0x0023
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003e
            L_0x001b:
                boolean r2 = r8.f1267f
                r8.f1267f = r4
            L_0x001f:
                r7 = r5
                r5 = r2
                r2 = r7
                goto L_0x0040
            L_0x0023:
                boolean r2 = r8.f1267f
                if (r2 == 0) goto L_0x001f
                android.graphics.Rect r6 = r8.f1265d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x001f
                r5 = r2
                r2 = r4
                goto L_0x0040
            L_0x0032:
                android.graphics.Rect r2 = r8.f1263b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003e
                r8.f1267f = r5
                r2 = r5
                goto L_0x0040
            L_0x003e:
                r2 = r5
                r5 = r4
            L_0x0040:
                if (r5 == 0) goto L_0x0070
                if (r2 == 0) goto L_0x0060
                android.graphics.Rect r2 = r8.f1264c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x0060
                android.view.View r0 = r8.f1262a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r8.f1262a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
            L_0x005b:
                float r1 = (float) r1
                r9.setLocation(r0, r1)
                goto L_0x006a
            L_0x0060:
                android.graphics.Rect r2 = r8.f1264c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
                goto L_0x005b
            L_0x006a:
                android.view.View r0 = r8.f1262a
                boolean r4 = r0.dispatchTouchEvent(r9)
            L_0x0070:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.q.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    private Intent C(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1222d0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1226h0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1225g0.getSearchActivity());
        return intent;
    }

    private Intent D(Cursor cursor, int i10, String str) {
        int i11;
        String o10;
        try {
            String o11 = q0.o(cursor, "suggest_intent_action");
            if (o11 == null) {
                o11 = this.f1225g0.getSuggestIntentAction();
            }
            if (o11 == null) {
                o11 = "android.intent.action.SEARCH";
            }
            String str2 = o11;
            String o12 = q0.o(cursor, "suggest_intent_data");
            if (o12 == null) {
                o12 = this.f1225g0.getSuggestIntentData();
            }
            if (!(o12 == null || (o10 = q0.o(cursor, "suggest_intent_data_id")) == null)) {
                o12 = o12 + "/" + Uri.encode(o10);
            }
            return C(str2, o12 == null ? null : Uri.parse(o12), q0.o(cursor, "suggest_intent_extra_data"), q0.o(cursor, "suggest_intent_query"), i10, str);
        } catch (RuntimeException e10) {
            try {
                i11 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i11 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e10);
            return null;
        }
    }

    private Intent E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1226h0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent F(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void G() {
        this.f1236t.dismissDropDown();
    }

    private void I(View view, Rect rect) {
        view.getLocationInWindow(this.F);
        getLocationInWindow(this.G);
        int[] iArr = this.F;
        int i10 = iArr[1];
        int[] iArr2 = this.G;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    private CharSequence J(CharSequence charSequence) {
        if (!this.Q || this.I == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f1236t.getTextSize()) * 1.25d);
        this.I.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.I), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean K() {
        SearchableInfo searchableInfo = this.f1225g0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = this.f1225g0.getVoiceSearchLaunchWebSearch() ? this.L : this.f1225g0.getVoiceSearchLaunchRecognizer() ? this.M : null;
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean N() {
        return (this.T || this.f1220b0) && !L();
    }

    private void O(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e10) {
                Log.e("SearchView", "Failed launch activity: " + intent, e10);
            }
        }
    }

    private boolean Q(int i10, int i11, String str) {
        Cursor b10 = this.S.b();
        if (b10 == null || !b10.moveToPosition(i10)) {
            return false;
        }
        O(D(b10, i11, str));
        return true;
    }

    private void b0() {
        post(this.f1227i0);
    }

    private void c0(int i10) {
        CharSequence c10;
        Editable text = this.f1236t.getText();
        Cursor b10 = this.S.b();
        if (b10 != null) {
            if (!b10.moveToPosition(i10) || (c10 = this.S.c(b10)) == null) {
                setQuery(text);
            } else {
                setQuery(c10);
            }
        }
    }

    private void e0() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f1236t.getText());
        int i10 = 0;
        if (!z11 && (!this.Q || this.f1223e0)) {
            z10 = false;
        }
        ImageView imageView = this.f1242z;
        if (!z10) {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        Drawable drawable = this.f1242z.getDrawable();
        if (drawable != null) {
            drawable.setState(z11 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1236t;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(f.d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(f.d.abc_search_view_preferred_width);
    }

    private void h0() {
        this.f1236t.setThreshold(this.f1225g0.getSuggestThreshold());
        this.f1236t.setImeOptions(this.f1225g0.getImeOptions());
        int inputType = this.f1225g0.getInputType();
        int i10 = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1225g0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f1236t.setInputType(inputType);
        a0.a aVar = this.S;
        if (aVar != null) {
            aVar.a((Cursor) null);
        }
        if (this.f1225g0.getSuggestAuthority() != null) {
            q0 q0Var = new q0(getContext(), this, this.f1225g0, this.f1229k0);
            this.S = q0Var;
            this.f1236t.setAdapter(q0Var);
            q0 q0Var2 = (q0) this.S;
            if (this.V) {
                i10 = 2;
            }
            q0Var2.x(i10);
        }
    }

    private void i0() {
        this.f1239w.setVisibility((!N() || !(this.f1241y.getVisibility() == 0 || this.A.getVisibility() == 0)) ? 8 : 0);
    }

    private void j0(boolean z10) {
        this.f1241y.setVisibility((!this.T || !N() || !hasFocus() || (!z10 && this.f1220b0)) ? 8 : 0);
    }

    private void k0(boolean z10) {
        this.R = z10;
        int i10 = 8;
        int i11 = z10 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.f1236t.getText());
        this.f1240x.setVisibility(i11);
        j0(!isEmpty);
        this.f1237u.setVisibility(z10 ? 8 : 0);
        if (this.H.getDrawable() != null && !this.Q) {
            i10 = 0;
        }
        this.H.setVisibility(i10);
        e0();
        l0(isEmpty);
        i0();
    }

    private void l0(boolean z10) {
        int i10 = 8;
        if (this.f1220b0 && !L() && z10) {
            this.f1241y.setVisibility(8);
            i10 = 0;
        }
        this.A.setVisibility(i10);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1236t.setText(charSequence);
        this.f1236t.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* access modifiers changed from: package-private */
    public void B() {
        if (this.B.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1238v.getPaddingLeft();
            Rect rect = new Rect();
            boolean b10 = g1.b(this);
            int dimensionPixelSize = this.Q ? resources.getDimensionPixelSize(f.d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(f.d.abc_dropdownitem_text_padding_left) : 0;
            this.f1236t.getDropDownBackground().getPadding(rect);
            int i10 = rect.left;
            this.f1236t.setDropDownHorizontalOffset(b10 ? -i10 : paddingLeft - (i10 + dimensionPixelSize));
            this.f1236t.setDropDownWidth((((this.B.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* access modifiers changed from: package-private */
    public void H() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f1236t);
            return;
        }
        o oVar = f1218r0;
        oVar.b(this.f1236t);
        oVar.a(this.f1236t);
    }

    public boolean L() {
        return this.R;
    }

    /* access modifiers changed from: package-private */
    public void P(int i10, String str, String str2) {
        getContext().startActivity(C("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i10, str));
    }

    /* access modifiers changed from: package-private */
    public void R() {
        if (!TextUtils.isEmpty(this.f1236t.getText())) {
            this.f1236t.setText("");
            this.f1236t.requestFocus();
            this.f1236t.setImeVisibility(true);
        } else if (this.Q) {
            clearFocus();
            k0(true);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean S(int i10, int i11, String str) {
        Q(i10, 0, (String) null);
        this.f1236t.setImeVisibility(false);
        G();
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean T(int i10) {
        c0(i10);
        return true;
    }

    /* access modifiers changed from: protected */
    public void U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* access modifiers changed from: package-private */
    public void V() {
        k0(false);
        this.f1236t.requestFocus();
        this.f1236t.setImeVisibility(true);
        View.OnClickListener onClickListener = this.P;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void W() {
        Editable text = this.f1236t.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f1225g0 != null) {
                P(0, (String) null, text.toString());
            }
            this.f1236t.setImeVisibility(false);
            G();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean X(View view, int i10, KeyEvent keyEvent) {
        if (this.f1225g0 != null && this.S != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return S(this.f1236t.getListSelection(), 0, (String) null);
            }
            if (i10 == 21 || i10 == 22) {
                this.f1236t.setSelection(i10 == 21 ? 0 : this.f1236t.length());
                this.f1236t.setListSelection(0);
                this.f1236t.clearListSelection();
                this.f1236t.b();
                return true;
            } else if (i10 == 19) {
                this.f1236t.getListSelection();
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void Y(CharSequence charSequence) {
        Editable text = this.f1236t.getText();
        this.f1222d0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        j0(!isEmpty);
        l0(isEmpty);
        e0();
        i0();
        this.f1221c0 = charSequence.toString();
    }

    /* access modifiers changed from: package-private */
    public void Z() {
        k0(L());
        b0();
        if (this.f1236t.hasFocus()) {
            H();
        }
    }

    /* access modifiers changed from: package-private */
    public void a0() {
        Intent E2;
        SearchableInfo searchableInfo = this.f1225g0;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    E2 = F(this.L, searchableInfo);
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    E2 = E(this.M, searchableInfo);
                } else {
                    return;
                }
                getContext().startActivity(E2);
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    public void c() {
        if (!this.f1223e0) {
            this.f1223e0 = true;
            int imeOptions = this.f1236t.getImeOptions();
            this.f1224f0 = imeOptions;
            this.f1236t.setImeOptions(imeOptions | 33554432);
            this.f1236t.setText("");
            setIconified(false);
        }
    }

    public void clearFocus() {
        this.W = true;
        super.clearFocus();
        this.f1236t.clearFocus();
        this.f1236t.setImeVisibility(false);
        this.W = false;
    }

    public void d0(CharSequence charSequence, boolean z10) {
        this.f1236t.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1236t;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1222d0 = charSequence;
        }
        if (z10 && !TextUtils.isEmpty(charSequence)) {
            W();
        }
    }

    public void f() {
        d0("", false);
        clearFocus();
        k0(true);
        this.f1236t.setImeOptions(this.f1224f0);
        this.f1223e0 = false;
    }

    /* access modifiers changed from: package-private */
    public void f0() {
        int[] iArr = this.f1236t.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1238v.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1239w.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f1236t.getImeOptions();
    }

    public int getInputType() {
        return this.f1236t.getInputType();
    }

    public int getMaxWidth() {
        return this.f1219a0;
    }

    public CharSequence getQuery() {
        return this.f1236t.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.U;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1225g0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.N : getContext().getText(this.f1225g0.getHintId());
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.K;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.J;
    }

    public a0.a getSuggestionsAdapter() {
        return this.S;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f1227i0);
        post(this.f1228j0);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            I(this.f1236t, this.D);
            Rect rect = this.E;
            Rect rect2 = this.D;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            q qVar = this.C;
            if (qVar == null) {
                q qVar2 = new q(this.E, this.D, this.f1236t);
                this.C = qVar2;
                setTouchDelegate(qVar2);
                return;
            }
            qVar.a(this.E, this.D);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0 <= 0) goto L_0x003a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.L()
            if (r0 == 0) goto L_0x000a
            super.onMeasure(r4, r5)
            return
        L_0x000a:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x0030
            if (r0 == 0) goto L_0x0026
            if (r0 == r2) goto L_0x001d
            goto L_0x003a
        L_0x001d:
            int r0 = r3.f1219a0
            if (r0 <= 0) goto L_0x003a
        L_0x0021:
            int r4 = java.lang.Math.min(r0, r4)
            goto L_0x003a
        L_0x0026:
            int r4 = r3.f1219a0
            if (r4 <= 0) goto L_0x002b
            goto L_0x003a
        L_0x002b:
            int r4 = r3.getPreferredWidth()
            goto L_0x003a
        L_0x0030:
            int r0 = r3.f1219a0
            if (r0 <= 0) goto L_0x0035
            goto L_0x0021
        L_0x0035:
            int r0 = r3.getPreferredWidth()
            goto L_0x0021
        L_0x003a:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x004c
            if (r0 == 0) goto L_0x0047
            goto L_0x0054
        L_0x0047:
            int r5 = r3.getPreferredHeight()
            goto L_0x0054
        L_0x004c:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0054:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.c());
        k0(pVar.f1261g);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f1261g = L();
        return pVar;
    }

    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        b0();
    }

    public boolean requestFocus(int i10, Rect rect) {
        if (this.W || !isFocusable()) {
            return false;
        }
        if (L()) {
            return super.requestFocus(i10, rect);
        }
        boolean requestFocus = this.f1236t.requestFocus(i10, rect);
        if (requestFocus) {
            k0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1226h0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            R();
        } else {
            V();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.Q != z10) {
            this.Q = z10;
            k0(z10);
            g0();
        }
    }

    public void setImeOptions(int i10) {
        this.f1236t.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f1236t.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f1219a0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.O = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.P = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.U = charSequence;
        g0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.V = z10;
        a0.a aVar = this.S;
        if (aVar instanceof q0) {
            ((q0) aVar).x(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1225g0 = searchableInfo;
        if (searchableInfo != null) {
            h0();
            g0();
        }
        boolean K2 = K();
        this.f1220b0 = K2;
        if (K2) {
            this.f1236t.setPrivateImeOptions("nm");
        }
        k0(L());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.T = z10;
        k0(L());
    }

    public void setSuggestionsAdapter(a0.a aVar) {
        this.S = aVar;
        this.f1236t.setAdapter(aVar);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.searchViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.D = new Rect();
        this.E = new Rect();
        this.F = new int[2];
        this.G = new int[2];
        this.f1227i0 = new b();
        this.f1228j0 = new c();
        this.f1229k0 = new WeakHashMap();
        f fVar = new f();
        this.f1230l0 = fVar;
        this.f1231m0 = new g();
        h hVar = new h();
        this.f1232n0 = hVar;
        i iVar = new i();
        this.f1233o0 = iVar;
        j jVar = new j();
        this.f1234p0 = jVar;
        this.f1235q0 = new a();
        int[] iArr = f.j.f11246n2;
        AttributeSet attributeSet2 = attributeSet;
        int i11 = i10;
        v0 v10 = v0.v(context, attributeSet2, iArr, i11, 0);
        m0.o0(this, context, iArr, attributeSet2, v10.r(), i11, 0);
        LayoutInflater.from(context).inflate(v10.n(f.j.f11296x2, f.g.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(f.f.search_src_text);
        this.f1236t = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1237u = findViewById(f.f.search_edit_frame);
        View findViewById = findViewById(f.f.search_plate);
        this.f1238v = findViewById;
        View findViewById2 = findViewById(f.f.submit_area);
        this.f1239w = findViewById2;
        ImageView imageView = (ImageView) findViewById(f.f.search_button);
        this.f1240x = imageView;
        ImageView imageView2 = (ImageView) findViewById(f.f.search_go_btn);
        this.f1241y = imageView2;
        ImageView imageView3 = (ImageView) findViewById(f.f.search_close_btn);
        this.f1242z = imageView3;
        ImageView imageView4 = (ImageView) findViewById(f.f.search_voice_btn);
        this.A = imageView4;
        ImageView imageView5 = (ImageView) findViewById(f.f.search_mag_icon);
        this.H = imageView5;
        m0.u0(findViewById, v10.g(f.j.f11301y2));
        m0.u0(findViewById2, v10.g(f.j.C2));
        int i12 = f.j.B2;
        imageView.setImageDrawable(v10.g(i12));
        imageView2.setImageDrawable(v10.g(f.j.f11286v2));
        imageView3.setImageDrawable(v10.g(f.j.f11271s2));
        imageView4.setImageDrawable(v10.g(f.j.E2));
        imageView5.setImageDrawable(v10.g(i12));
        this.I = v10.g(f.j.A2);
        a1.a(imageView, getResources().getString(f.h.abc_searchview_description_search));
        this.J = v10.n(f.j.D2, f.g.abc_search_dropdown_item_icons_2line);
        this.K = v10.n(f.j.f11276t2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f1235q0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f1231m0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(v10.a(f.j.f11291w2, true));
        int f10 = v10.f(f.j.f11256p2, -1);
        if (f10 != -1) {
            setMaxWidth(f10);
        }
        this.N = v10.p(f.j.f11281u2);
        this.U = v10.p(f.j.f11306z2);
        int k10 = v10.k(f.j.f11266r2, -1);
        if (k10 != -1) {
            setImeOptions(k10);
        }
        int k11 = v10.k(f.j.f11261q2, -1);
        if (k11 != -1) {
            setInputType(k11);
        }
        setFocusable(v10.a(f.j.f11251o2, true));
        v10.w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.L = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.M = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.B = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        k0(this.Q);
        g0();
    }
}
