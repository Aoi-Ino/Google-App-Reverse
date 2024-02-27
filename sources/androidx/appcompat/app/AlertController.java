package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.m0;
import androidx.core.widget.NestedScrollView;
import f.f;
import f.j;
import java.lang.ref.WeakReference;

class AlertController {
    NestedScrollView A;
    private int B = 0;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    int I = -1;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    private int Q = 0;
    Handler R;
    private final View.OnClickListener S = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Context f544a;

    /* renamed from: b  reason: collision with root package name */
    final r f545b;

    /* renamed from: c  reason: collision with root package name */
    private final Window f546c;

    /* renamed from: d  reason: collision with root package name */
    private final int f547d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f548e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f549f;

    /* renamed from: g  reason: collision with root package name */
    ListView f550g;

    /* renamed from: h  reason: collision with root package name */
    private View f551h;

    /* renamed from: i  reason: collision with root package name */
    private int f552i;

    /* renamed from: j  reason: collision with root package name */
    private int f553j;

    /* renamed from: k  reason: collision with root package name */
    private int f554k;

    /* renamed from: l  reason: collision with root package name */
    private int f555l;

    /* renamed from: m  reason: collision with root package name */
    private int f556m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f557n = false;

    /* renamed from: o  reason: collision with root package name */
    Button f558o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f559p;

    /* renamed from: q  reason: collision with root package name */
    Message f560q;

    /* renamed from: r  reason: collision with root package name */
    private Drawable f561r;

    /* renamed from: s  reason: collision with root package name */
    Button f562s;

    /* renamed from: t  reason: collision with root package name */
    private CharSequence f563t;

    /* renamed from: u  reason: collision with root package name */
    Message f564u;

    /* renamed from: v  reason: collision with root package name */
    private Drawable f565v;

    /* renamed from: w  reason: collision with root package name */
    Button f566w;

    /* renamed from: x  reason: collision with root package name */
    private CharSequence f567x;

    /* renamed from: y  reason: collision with root package name */
    Message f568y;

    /* renamed from: z  reason: collision with root package name */
    private Drawable f569z;

    public static class RecycleListView extends ListView {

        /* renamed from: e  reason: collision with root package name */
        private final int f570e;

        /* renamed from: f  reason: collision with root package name */
        private final int f571f;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f11231k2);
            this.f571f = obtainStyledAttributes.getDimensionPixelOffset(j.f11236l2, -1);
            this.f570e = obtainStyledAttributes.getDimensionPixelOffset(j.f11241m2, -1);
        }

        public void a(boolean z10, boolean z11) {
            if (!z11 || !z10) {
                setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f570e, getPaddingRight(), z11 ? getPaddingBottom() : this.f571f);
            }
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            r3 = r0.f568y;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f558o
                if (r3 != r1) goto L_0x000f
                android.os.Message r1 = r0.f560q
                if (r1 == 0) goto L_0x000f
            L_0x000a:
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x0026
            L_0x000f:
                android.widget.Button r1 = r0.f562s
                if (r3 != r1) goto L_0x0018
                android.os.Message r1 = r0.f564u
                if (r1 == 0) goto L_0x0018
                goto L_0x000a
            L_0x0018:
                android.widget.Button r1 = r0.f566w
                if (r3 != r1) goto L_0x0025
                android.os.Message r3 = r0.f568y
                if (r3 == 0) goto L_0x0025
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x0026
            L_0x0025:
                r3 = 0
            L_0x0026:
                if (r3 == 0) goto L_0x002b
                r3.sendToTarget()
            L_0x002b:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.R
                r1 = 1
                androidx.appcompat.app.r r3 = r3.f545b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.a.onClick(android.view.View):void");
        }
    }

    public static class b {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean E = false;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public int I = -1;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;
        public boolean O = true;

        /* renamed from: a  reason: collision with root package name */
        public final Context f573a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f574b;

        /* renamed from: c  reason: collision with root package name */
        public int f575c = 0;

        /* renamed from: d  reason: collision with root package name */
        public Drawable f576d;

        /* renamed from: e  reason: collision with root package name */
        public int f577e = 0;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f578f;

        /* renamed from: g  reason: collision with root package name */
        public View f579g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f580h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f581i;

        /* renamed from: j  reason: collision with root package name */
        public Drawable f582j;

        /* renamed from: k  reason: collision with root package name */
        public DialogInterface.OnClickListener f583k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f584l;

        /* renamed from: m  reason: collision with root package name */
        public Drawable f585m;

        /* renamed from: n  reason: collision with root package name */
        public DialogInterface.OnClickListener f586n;

        /* renamed from: o  reason: collision with root package name */
        public CharSequence f587o;

        /* renamed from: p  reason: collision with root package name */
        public Drawable f588p;

        /* renamed from: q  reason: collision with root package name */
        public DialogInterface.OnClickListener f589q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f590r;

        /* renamed from: s  reason: collision with root package name */
        public DialogInterface.OnCancelListener f591s;

        /* renamed from: t  reason: collision with root package name */
        public DialogInterface.OnDismissListener f592t;

        /* renamed from: u  reason: collision with root package name */
        public DialogInterface.OnKeyListener f593u;

        /* renamed from: v  reason: collision with root package name */
        public CharSequence[] f594v;

        /* renamed from: w  reason: collision with root package name */
        public ListAdapter f595w;

        /* renamed from: x  reason: collision with root package name */
        public DialogInterface.OnClickListener f596x;

        /* renamed from: y  reason: collision with root package name */
        public int f597y;

        /* renamed from: z  reason: collision with root package name */
        public View f598z;

        class a extends ArrayAdapter {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ RecycleListView f599e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f599e = recycleListView;
            }

            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = b.this.F;
                if (zArr != null && zArr[i10]) {
                    this.f599e.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$b  reason: collision with other inner class name */
        class C0012b extends CursorAdapter {

            /* renamed from: e  reason: collision with root package name */
            private final int f601e;

            /* renamed from: f  reason: collision with root package name */
            private final int f602f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ RecycleListView f603g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ AlertController f604h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0012b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f603g = recycleListView;
                this.f604h = alertController;
                Cursor cursor2 = getCursor();
                this.f601e = cursor2.getColumnIndexOrThrow(b.this.L);
                this.f602f = cursor2.getColumnIndexOrThrow(b.this.M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f601e));
                RecycleListView recycleListView = this.f603g;
                int position = cursor.getPosition();
                boolean z10 = true;
                if (cursor.getInt(this.f602f) != 1) {
                    z10 = false;
                }
                recycleListView.setItemChecked(position, z10);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f574b.inflate(this.f604h.M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ AlertController f606e;

            c(AlertController alertController) {
                this.f606e = alertController;
            }

            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                b.this.f596x.onClick(this.f606e.f545b, i10);
                if (!b.this.H) {
                    this.f606e.f545b.dismiss();
                }
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ RecycleListView f608e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ AlertController f609f;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f608e = recycleListView;
                this.f609f = alertController;
            }

            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                boolean[] zArr = b.this.F;
                if (zArr != null) {
                    zArr[i10] = this.f608e.isItemChecked(i10);
                }
                b.this.J.onClick(this.f609f.f545b, i10, this.f608e.isItemChecked(i10));
            }
        }

        public b(Context context) {
            this.f573a = context;
            this.f590r = true;
            this.f574b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r8v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r8v3 */
        /* JADX WARNING: type inference failed for: r8v4 */
        /* JADX WARNING: type inference failed for: r2v5, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v24, types: [androidx.appcompat.app.AlertController$b$b] */
        /* JADX WARNING: type inference failed for: r1v25, types: [androidx.appcompat.app.AlertController$b$a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x008a  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0096  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void b(androidx.appcompat.app.AlertController r10) {
            /*
                r9 = this;
                android.view.LayoutInflater r0 = r9.f574b
                int r1 = r10.L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r9.G
                if (r1 == 0) goto L_0x0034
                android.database.Cursor r1 = r9.K
                if (r1 != 0) goto L_0x0025
                androidx.appcompat.app.AlertController$b$a r8 = new androidx.appcompat.app.AlertController$b$a
                android.content.Context r3 = r9.f573a
                int r4 = r10.M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r9.f594v
                r1 = r8
                r2 = r9
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0069
            L_0x0025:
                androidx.appcompat.app.AlertController$b$b r8 = new androidx.appcompat.app.AlertController$b$b
                android.content.Context r3 = r9.f573a
                android.database.Cursor r4 = r9.K
                r5 = 0
                r1 = r8
                r2 = r9
                r6 = r0
                r7 = r10
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0069
            L_0x0034:
                boolean r1 = r9.H
                if (r1 == 0) goto L_0x003c
                int r1 = r10.N
            L_0x003a:
                r4 = r1
                goto L_0x003f
            L_0x003c:
                int r1 = r10.O
                goto L_0x003a
            L_0x003f:
                android.database.Cursor r1 = r9.K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L_0x005b
                android.widget.SimpleCursorAdapter r8 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r9.f573a
                android.database.Cursor r5 = r9.K
                java.lang.String r1 = r9.L
                java.lang.String[] r6 = new java.lang.String[]{r1}
                int[] r7 = new int[]{r2}
                r2 = r8
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x0069
            L_0x005b:
                android.widget.ListAdapter r8 = r9.f595w
                if (r8 == 0) goto L_0x0060
                goto L_0x0069
            L_0x0060:
                androidx.appcompat.app.AlertController$d r8 = new androidx.appcompat.app.AlertController$d
                android.content.Context r1 = r9.f573a
                java.lang.CharSequence[] r3 = r9.f594v
                r8.<init>(r1, r4, r2, r3)
            L_0x0069:
                r10.H = r8
                int r1 = r9.I
                r10.I = r1
                android.content.DialogInterface$OnClickListener r1 = r9.f596x
                if (r1 == 0) goto L_0x007c
                androidx.appcompat.app.AlertController$b$c r1 = new androidx.appcompat.app.AlertController$b$c
                r1.<init>(r10)
            L_0x0078:
                r0.setOnItemClickListener(r1)
                goto L_0x0086
            L_0x007c:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r9.J
                if (r1 == 0) goto L_0x0086
                androidx.appcompat.app.AlertController$b$d r1 = new androidx.appcompat.app.AlertController$b$d
                r1.<init>(r0, r10)
                goto L_0x0078
            L_0x0086:
                android.widget.AdapterView$OnItemSelectedListener r1 = r9.N
                if (r1 == 0) goto L_0x008d
                r0.setOnItemSelectedListener(r1)
            L_0x008d:
                boolean r1 = r9.H
                if (r1 == 0) goto L_0x0096
                r1 = 1
            L_0x0092:
                r0.setChoiceMode(r1)
                goto L_0x009c
            L_0x0096:
                boolean r1 = r9.G
                if (r1 == 0) goto L_0x009c
                r1 = 2
                goto L_0x0092
            L_0x009c:
                r10.f550g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.b.b(androidx.appcompat.app.AlertController):void");
        }

        public void a(AlertController alertController) {
            View view = this.f579g;
            if (view != null) {
                alertController.l(view);
            } else {
                CharSequence charSequence = this.f578f;
                if (charSequence != null) {
                    alertController.q(charSequence);
                }
                Drawable drawable = this.f576d;
                if (drawable != null) {
                    alertController.n(drawable);
                }
                int i10 = this.f575c;
                if (i10 != 0) {
                    alertController.m(i10);
                }
                int i11 = this.f577e;
                if (i11 != 0) {
                    alertController.m(alertController.d(i11));
                }
            }
            CharSequence charSequence2 = this.f580h;
            if (charSequence2 != null) {
                alertController.o(charSequence2);
            }
            CharSequence charSequence3 = this.f581i;
            if (!(charSequence3 == null && this.f582j == null)) {
                alertController.k(-1, charSequence3, this.f583k, (Message) null, this.f582j);
            }
            CharSequence charSequence4 = this.f584l;
            if (!(charSequence4 == null && this.f585m == null)) {
                alertController.k(-2, charSequence4, this.f586n, (Message) null, this.f585m);
            }
            CharSequence charSequence5 = this.f587o;
            if (!(charSequence5 == null && this.f588p == null)) {
                alertController.k(-3, charSequence5, this.f589q, (Message) null, this.f588p);
            }
            if (!(this.f594v == null && this.K == null && this.f595w == null)) {
                b(alertController);
            }
            View view2 = this.f598z;
            if (view2 == null) {
                int i12 = this.f597y;
                if (i12 != 0) {
                    alertController.r(i12);
                }
            } else if (this.E) {
                alertController.t(view2, this.A, this.B, this.C, this.D);
            } else {
                alertController.s(view2);
            }
        }
    }

    private static final class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference f611a;

        public c(DialogInterface dialogInterface) {
            this.f611a = new WeakReference(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f611a.get(), message.what);
            } else if (i10 == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class d extends ArrayAdapter {
        public d(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        public long getItemId(int i10) {
            return (long) i10;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, r rVar, Window window) {
        this.f544a = context;
        this.f545b = rVar;
        this.f546c = window;
        this.R = new c(rVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, j.F, f.a.alertDialogStyle, 0);
        this.J = obtainStyledAttributes.getResourceId(j.G, 0);
        this.K = obtainStyledAttributes.getResourceId(j.I, 0);
        this.L = obtainStyledAttributes.getResourceId(j.K, 0);
        this.M = obtainStyledAttributes.getResourceId(j.L, 0);
        this.N = obtainStyledAttributes.getResourceId(j.N, 0);
        this.O = obtainStyledAttributes.getResourceId(j.J, 0);
        this.P = obtainStyledAttributes.getBoolean(j.M, true);
        this.f547d = obtainStyledAttributes.getDimensionPixelSize(j.H, 0);
        obtainStyledAttributes.recycle();
        rVar.h(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private ViewGroup i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int j() {
        int i10 = this.K;
        if (i10 == 0) {
            return this.J;
        }
        return this.Q == 1 ? i10 : this.J;
    }

    private void p(ViewGroup viewGroup, View view, int i10, int i11) {
        View findViewById = this.f546c.findViewById(f.scrollIndicatorUp);
        View findViewById2 = this.f546c.findViewById(f.scrollIndicatorDown);
        m0.I0(view, i10, i11);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    private void u(ViewGroup viewGroup) {
        boolean z10;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(16908313);
        this.f558o = button2;
        button2.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.f559p) || this.f561r != null) {
            this.f558o.setText(this.f559p);
            Drawable drawable = this.f561r;
            if (drawable != null) {
                int i10 = this.f547d;
                drawable.setBounds(0, 0, i10, i10);
                this.f558o.setCompoundDrawables(this.f561r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f558o.setVisibility(0);
            z10 = true;
        } else {
            this.f558o.setVisibility(8);
            z10 = false;
        }
        Button button3 = (Button) viewGroup.findViewById(16908314);
        this.f562s = button3;
        button3.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.f563t) || this.f565v != null) {
            this.f562s.setText(this.f563t);
            Drawable drawable2 = this.f565v;
            if (drawable2 != null) {
                int i11 = this.f547d;
                drawable2.setBounds(0, 0, i11, i11);
                this.f562s.setCompoundDrawables(this.f565v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f562s.setVisibility(0);
            z10 |= true;
        } else {
            this.f562s.setVisibility(8);
        }
        Button button4 = (Button) viewGroup.findViewById(16908315);
        this.f566w = button4;
        button4.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.f567x) || this.f569z != null) {
            this.f566w.setText(this.f567x);
            Drawable drawable3 = this.f569z;
            if (drawable3 != null) {
                int i12 = this.f547d;
                drawable3.setBounds(0, 0, i12, i12);
                this.f566w.setCompoundDrawables(this.f569z, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f566w.setVisibility(0);
            z10 |= true;
        } else {
            this.f566w.setVisibility(8);
        }
        if (z(this.f544a)) {
            if (z10) {
                button = this.f558o;
            } else if (z10) {
                button = this.f562s;
            } else if (z10) {
                button = this.f566w;
            }
            b(button);
        }
        if (!z10) {
            viewGroup.setVisibility(8);
        }
    }

    private void v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f546c.findViewById(f.scrollView);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f549f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.A.removeView(this.F);
            if (this.f550g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f550g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    private void w(ViewGroup viewGroup) {
        View view = this.f551h;
        boolean z10 = false;
        if (view == null) {
            view = this.f552i != 0 ? LayoutInflater.from(this.f544a).inflate(this.f552i, viewGroup, false) : null;
        }
        if (view != null) {
            z10 = true;
        }
        if (!z10 || !a(view)) {
            this.f546c.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) this.f546c.findViewById(f.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f557n) {
                frameLayout.setPadding(this.f553j, this.f554k, this.f555l, this.f556m);
            }
            if (this.f550g != null) {
                ((LinearLayoutCompat.a) viewGroup.getLayoutParams()).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void x(ViewGroup viewGroup) {
        View view;
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            view = this.f546c.findViewById(f.title_template);
        } else {
            this.D = (ImageView) this.f546c.findViewById(16908294);
            if (!(!TextUtils.isEmpty(this.f548e)) || !this.P) {
                this.f546c.findViewById(f.title_template).setVisibility(8);
                this.D.setVisibility(8);
                view = viewGroup;
            } else {
                TextView textView = (TextView) this.f546c.findViewById(f.alertTitle);
                this.E = textView;
                textView.setText(this.f548e);
                int i10 = this.B;
                if (i10 != 0) {
                    this.D.setImageResource(i10);
                    return;
                }
                Drawable drawable = this.C;
                if (drawable != null) {
                    this.D.setImageDrawable(drawable);
                    return;
                }
                this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
                this.D.setVisibility(8);
                return;
            }
        }
        view.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        if (r1 != null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
        if (r1 != null) goto L_0x009f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void y() {
        /*
            r8 = this;
            android.view.Window r0 = r8.f546c
            int r1 = f.f.parentPanel
            android.view.View r0 = r0.findViewById(r1)
            int r1 = f.f.topPanel
            android.view.View r2 = r0.findViewById(r1)
            int r3 = f.f.contentPanel
            android.view.View r4 = r0.findViewById(r3)
            int r5 = f.f.buttonPanel
            android.view.View r6 = r0.findViewById(r5)
            int r7 = f.f.customPanel
            android.view.View r0 = r0.findViewById(r7)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r8.w(r0)
            android.view.View r1 = r0.findViewById(r1)
            android.view.View r3 = r0.findViewById(r3)
            android.view.View r5 = r0.findViewById(r5)
            android.view.ViewGroup r1 = r8.i(r1, r2)
            android.view.ViewGroup r2 = r8.i(r3, r4)
            android.view.ViewGroup r3 = r8.i(r5, r6)
            r8.v(r2)
            r8.u(r3)
            r8.x(r1)
            int r0 = r0.getVisibility()
            r4 = 8
            r5 = 1
            r6 = 0
            if (r0 == r4) goto L_0x0052
            r0 = r5
            goto L_0x0053
        L_0x0052:
            r0 = r6
        L_0x0053:
            if (r1 == 0) goto L_0x005d
            int r7 = r1.getVisibility()
            if (r7 == r4) goto L_0x005d
            r7 = r5
            goto L_0x005e
        L_0x005d:
            r7 = r6
        L_0x005e:
            if (r3 == 0) goto L_0x0068
            int r3 = r3.getVisibility()
            if (r3 == r4) goto L_0x0068
            r3 = r5
            goto L_0x0069
        L_0x0068:
            r3 = r6
        L_0x0069:
            if (r3 != 0) goto L_0x0078
            if (r2 == 0) goto L_0x0078
            int r4 = f.f.textSpacerNoButtons
            android.view.View r4 = r2.findViewById(r4)
            if (r4 == 0) goto L_0x0078
            r4.setVisibility(r6)
        L_0x0078:
            if (r7 == 0) goto L_0x0095
            androidx.core.widget.NestedScrollView r4 = r8.A
            if (r4 == 0) goto L_0x0081
            r4.setClipToPadding(r5)
        L_0x0081:
            java.lang.CharSequence r4 = r8.f549f
            if (r4 != 0) goto L_0x008c
            android.widget.ListView r4 = r8.f550g
            if (r4 == 0) goto L_0x008a
            goto L_0x008c
        L_0x008a:
            r1 = 0
            goto L_0x0092
        L_0x008c:
            int r4 = f.f.titleDividerNoCustom
            android.view.View r1 = r1.findViewById(r4)
        L_0x0092:
            if (r1 == 0) goto L_0x00a2
            goto L_0x009f
        L_0x0095:
            if (r2 == 0) goto L_0x00a2
            int r1 = f.f.textSpacerNoTitle
            android.view.View r1 = r2.findViewById(r1)
            if (r1 == 0) goto L_0x00a2
        L_0x009f:
            r1.setVisibility(r6)
        L_0x00a2:
            android.widget.ListView r1 = r8.f550g
            boolean r4 = r1 instanceof androidx.appcompat.app.AlertController.RecycleListView
            if (r4 == 0) goto L_0x00ad
            androidx.appcompat.app.AlertController$RecycleListView r1 = (androidx.appcompat.app.AlertController.RecycleListView) r1
            r1.a(r7, r3)
        L_0x00ad:
            if (r0 != 0) goto L_0x00c1
            android.widget.ListView r0 = r8.f550g
            if (r0 == 0) goto L_0x00b4
            goto L_0x00b6
        L_0x00b4:
            androidx.core.widget.NestedScrollView r0 = r8.A
        L_0x00b6:
            if (r0 == 0) goto L_0x00c1
            if (r3 == 0) goto L_0x00bb
            r6 = 2
        L_0x00bb:
            r1 = r7 | r6
            r3 = 3
            r8.p(r2, r0, r1, r3)
        L_0x00c1:
            android.widget.ListView r0 = r8.f550g
            if (r0 == 0) goto L_0x00d7
            android.widget.ListAdapter r1 = r8.H
            if (r1 == 0) goto L_0x00d7
            r0.setAdapter(r1)
            int r1 = r8.I
            r2 = -1
            if (r1 <= r2) goto L_0x00d7
            r0.setItemChecked(r1, r5)
            r0.setSelection(r1)
        L_0x00d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.y():void");
    }

    private static boolean z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(f.a.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    public Button c(int i10) {
        if (i10 == -3) {
            return this.f566w;
        }
        if (i10 == -2) {
            return this.f562s;
        }
        if (i10 != -1) {
            return null;
        }
        return this.f558o;
    }

    public int d(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f544a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f550g;
    }

    public void f() {
        this.f545b.setContentView(j());
        y();
    }

    public boolean g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.s(keyEvent);
    }

    public boolean h(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.s(keyEvent);
    }

    public void k(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f567x = charSequence;
            this.f568y = message;
            this.f569z = drawable;
        } else if (i10 == -2) {
            this.f563t = charSequence;
            this.f564u = message;
            this.f565v = drawable;
        } else if (i10 == -1) {
            this.f559p = charSequence;
            this.f560q = message;
            this.f561r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    public void l(View view) {
        this.G = view;
    }

    public void m(int i10) {
        this.C = null;
        this.B = i10;
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        if (i10 != 0) {
            imageView.setVisibility(0);
            this.D.setImageResource(this.B);
            return;
        }
        imageView.setVisibility(8);
    }

    public void n(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    public void o(CharSequence charSequence) {
        this.f549f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(CharSequence charSequence) {
        this.f548e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r(int i10) {
        this.f551h = null;
        this.f552i = i10;
        this.f557n = false;
    }

    public void s(View view) {
        this.f551h = view;
        this.f552i = 0;
        this.f557n = false;
    }

    public void t(View view, int i10, int i11, int i12, int i13) {
        this.f551h = view;
        this.f552i = 0;
        this.f557n = true;
        this.f553j = i10;
        this.f554k = i11;
        this.f555l = i12;
        this.f556m = i13;
    }
}
