package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.c0;
import androidx.core.view.k1;
import androidx.core.view.m0;
import androidx.fragment.app.h;
import androidx.fragment.app.x;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.d;
import com.google.android.material.internal.u;
import i5.g;
import java.util.Iterator;
import java.util.LinkedHashSet;
import q4.e;
import q4.f;
import q4.i;
import q4.j;

public final class k<S> extends h {
    static final Object Z0 = "CONFIRM_BUTTON_TAG";

    /* renamed from: a1  reason: collision with root package name */
    static final Object f5929a1 = "CANCEL_BUTTON_TAG";

    /* renamed from: b1  reason: collision with root package name */
    static final Object f5930b1 = "TOGGLE_BUTTON_TAG";
    private final LinkedHashSet A0 = new LinkedHashSet();
    private int B0;
    private q C0;
    private a D0;
    private i E0;
    private int F0;
    private CharSequence G0;
    private boolean H0;
    private int I0;
    private int J0;
    private CharSequence K0;
    private int L0;
    private CharSequence M0;
    private int N0;
    private CharSequence O0;
    private int P0;
    private CharSequence Q0;
    private TextView R0;
    private TextView S0;
    private CheckableImageButton T0;
    private g U0;
    private Button V0;
    private boolean W0;
    private CharSequence X0;
    private CharSequence Y0;

    /* renamed from: x0  reason: collision with root package name */
    private final LinkedHashSet f5931x0 = new LinkedHashSet();

    /* renamed from: y0  reason: collision with root package name */
    private final LinkedHashSet f5932y0 = new LinkedHashSet();

    /* renamed from: z0  reason: collision with root package name */
    private final LinkedHashSet f5933z0 = new LinkedHashSet();

    class a implements c0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5934a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f5935b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f5936c;

        a(int i10, View view, int i11) {
            this.f5934a = i10;
            this.f5935b = view;
            this.f5936c = i11;
        }

        public k1 a(View view, k1 k1Var) {
            int i10 = k1Var.f(k1.m.d()).f2374b;
            if (this.f5934a >= 0) {
                this.f5935b.getLayoutParams().height = this.f5934a + i10;
                View view2 = this.f5935b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f5935b;
            view3.setPadding(view3.getPaddingLeft(), this.f5936c + i10, this.f5935b.getPaddingRight(), this.f5935b.getPaddingBottom());
            return k1Var;
        }
    }

    class b extends p {
        b() {
        }
    }

    private void A2() {
        int t22 = t2(E1());
        o2();
        i l22 = i.l2((d) null, t22, this.D0, (g) null);
        this.E0 = l22;
        q qVar = l22;
        if (this.I0 == 1) {
            o2();
            qVar = l.X1((d) null, t22, this.D0);
        }
        this.C0 = qVar;
        C2();
        B2(r2());
        x n10 = v().n();
        n10.o(f.mtrl_calendar_frame, this.C0);
        n10.j();
        this.C0.V1(new b());
    }

    private void C2() {
        this.R0.setText((this.I0 != 1 || !w2()) ? this.X0 : this.Y0);
    }

    private void D2(CheckableImageButton checkableImageButton) {
        this.T0.setContentDescription(checkableImageButton.getContext().getString(this.I0 == 1 ? i.mtrl_picker_toggle_to_calendar_input_mode : i.mtrl_picker_toggle_to_text_input_mode));
    }

    private static Drawable m2(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, g.a.b(context, e.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], g.a.b(context, e.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    private void n2(Window window) {
        if (!this.W0) {
            View findViewById = F1().findViewById(f.fullscreen_header);
            d.a(window, true, u.d(findViewById), (Integer) null);
            m0.F0(findViewById, new a(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop()));
            this.W0 = true;
        }
    }

    private d o2() {
        android.support.v4.media.session.b.a(u().getParcelable("DATE_SELECTOR_KEY"));
        return null;
    }

    private static CharSequence p2(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] split = TextUtils.split(String.valueOf(charSequence), "\n");
        return split.length > 1 ? split[0] : charSequence;
    }

    private String q2() {
        o2();
        E1();
        throw null;
    }

    private static int s2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(q4.d.mtrl_calendar_content_padding);
        int i10 = m.f().f5945h;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(q4.d.mtrl_calendar_day_width) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(q4.d.mtrl_calendar_month_horizontal_padding));
    }

    private int t2(Context context) {
        int i10 = this.B0;
        if (i10 != 0) {
            return i10;
        }
        o2();
        throw null;
    }

    private void u2(Context context) {
        this.T0.setTag(f5930b1);
        this.T0.setImageDrawable(m2(context));
        this.T0.setChecked(this.I0 != 0);
        m0.q0(this.T0, (androidx.core.view.a) null);
        D2(this.T0);
        this.T0.setOnClickListener(new j(this));
    }

    static boolean v2(Context context) {
        return z2(context, 16843277);
    }

    private boolean w2() {
        return V().getConfiguration().orientation == 2;
    }

    static boolean x2(Context context) {
        return z2(context, q4.b.nestedScrollable);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void y2(View view) {
        o2();
        throw null;
    }

    static boolean z2(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f5.b.d(context, q4.b.materialCalendarStyle, i.class.getCanonicalName()), new int[]{i10});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    /* access modifiers changed from: package-private */
    public void B2(String str) {
        this.S0.setContentDescription(q2());
        this.S0.setText(str);
    }

    public final void C0(Bundle bundle) {
        super.C0(bundle);
        if (bundle == null) {
            bundle = u();
        }
        this.B0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        android.support.v4.media.session.b.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.D0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        android.support.v4.media.session.b.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.F0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.G0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.I0 = bundle.getInt("INPUT_MODE_KEY");
        this.J0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.K0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.L0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.M0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.N0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.O0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.P0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.Q0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.G0;
        if (charSequence == null) {
            charSequence = E1().getResources().getText(this.F0);
        }
        this.X0 = charSequence;
        this.Y0 = p2(charSequence);
    }

    public final View G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View findViewById;
        LinearLayout.LayoutParams layoutParams;
        View inflate = layoutInflater.inflate(this.H0 ? q4.h.mtrl_picker_fullscreen : q4.h.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.H0) {
            findViewById = inflate.findViewById(f.mtrl_calendar_frame);
            layoutParams = new LinearLayout.LayoutParams(s2(context), -2);
        } else {
            findViewById = inflate.findViewById(f.mtrl_calendar_main_pane);
            layoutParams = new LinearLayout.LayoutParams(s2(context), -1);
        }
        findViewById.setLayoutParams(layoutParams);
        TextView textView = (TextView) inflate.findViewById(f.mtrl_picker_header_selection_text);
        this.S0 = textView;
        m0.s0(textView, 1);
        this.T0 = (CheckableImageButton) inflate.findViewById(f.mtrl_picker_header_toggle);
        this.R0 = (TextView) inflate.findViewById(f.mtrl_picker_title_text);
        u2(context);
        this.V0 = (Button) inflate.findViewById(f.confirm_button);
        o2();
        throw null;
    }

    public final void Y0(Bundle bundle) {
        super.Y0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.B0);
        bundle.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
        a.b bVar = new a.b(this.D0);
        i iVar = this.E0;
        m g22 = iVar == null ? null : iVar.g2();
        if (g22 != null) {
            bVar.b(g22.f5947j);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.F0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.G0);
        bundle.putInt("INPUT_MODE_KEY", this.I0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.J0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.K0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.L0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.M0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.N0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.O0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.P0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.Q0);
    }

    public void Z0() {
        super.Z0();
        Window window = h2().getWindow();
        if (this.H0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.U0);
            n2(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = V().getDimensionPixelOffset(q4.d.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.U0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new y4.a(h2(), rect));
        }
        A2();
    }

    public void a1() {
        this.C0.W1();
        super.a1();
    }

    public final Dialog d2(Bundle bundle) {
        Dialog dialog = new Dialog(E1(), t2(E1()));
        Context context = dialog.getContext();
        this.H0 = v2(context);
        int i10 = q4.b.materialCalendarStyle;
        int i11 = j.Widget_MaterialComponents_MaterialCalendar;
        this.U0 = new g(context, (AttributeSet) null, i10, i11);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, q4.k.f14991c3, i10, i11);
        int color = obtainStyledAttributes.getColor(q4.k.f15001d3, 0);
        obtainStyledAttributes.recycle();
        this.U0.M(context);
        this.U0.W(ColorStateList.valueOf(color));
        this.U0.V(m0.w(dialog.getWindow().getDecorView()));
        return dialog;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f5933z0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.A0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) h0();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public String r2() {
        o2();
        w();
        throw null;
    }
}
