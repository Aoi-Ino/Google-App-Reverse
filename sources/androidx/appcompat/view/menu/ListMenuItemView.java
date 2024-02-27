package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.v0;
import androidx.core.view.m0;
import f.a;
import f.f;
import f.g;
import f.j;

public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: e  reason: collision with root package name */
    private i f875e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f876f;

    /* renamed from: g  reason: collision with root package name */
    private RadioButton f877g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f878h;

    /* renamed from: i  reason: collision with root package name */
    private CheckBox f879i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f880j;

    /* renamed from: k  reason: collision with root package name */
    private ImageView f881k;

    /* renamed from: l  reason: collision with root package name */
    private ImageView f882l;

    /* renamed from: m  reason: collision with root package name */
    private LinearLayout f883m;

    /* renamed from: n  reason: collision with root package name */
    private Drawable f884n;

    /* renamed from: o  reason: collision with root package name */
    private int f885o;

    /* renamed from: p  reason: collision with root package name */
    private Context f886p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f887q;

    /* renamed from: r  reason: collision with root package name */
    private Drawable f888r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f889s;

    /* renamed from: t  reason: collision with root package name */
    private LayoutInflater f890t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f891u;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.listMenuViewStyle);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i10) {
        LinearLayout linearLayout = this.f883m;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    private void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(g.abc_list_menu_item_checkbox, this, false);
        this.f879i = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(g.abc_list_menu_item_icon, this, false);
        this.f876f = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(g.abc_list_menu_item_radio, this, false);
        this.f877g = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f890t == null) {
            this.f890t = LayoutInflater.from(getContext());
        }
        return this.f890t;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f881k;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f882l;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f882l.getLayoutParams();
            rect.top += this.f882l.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    public boolean d() {
        return false;
    }

    public void e(i iVar, int i10) {
        this.f875e = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.i(this));
        setCheckable(iVar.isCheckable());
        h(iVar.A(), iVar.g());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    public i getItemData() {
        return this.f875e;
    }

    public void h(boolean z10, char c10) {
        int i10 = (!z10 || !this.f875e.A()) ? 8 : 0;
        if (i10 == 0) {
            this.f880j.setText(this.f875e.h());
        }
        if (this.f880j.getVisibility() != i10) {
            this.f880j.setVisibility(i10);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        m0.u0(this, this.f884n);
        TextView textView = (TextView) findViewById(f.title);
        this.f878h = textView;
        int i10 = this.f885o;
        if (i10 != -1) {
            textView.setTextAppearance(this.f886p, i10);
        }
        this.f880j = (TextView) findViewById(f.shortcut);
        ImageView imageView = (ImageView) findViewById(f.submenuarrow);
        this.f881k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f888r);
        }
        this.f882l = (ImageView) findViewById(f.group_divider);
        this.f883m = (LinearLayout) findViewById(f.content);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        if (this.f876f != null && this.f887q) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f876f.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        View view;
        CompoundButton compoundButton;
        if (z10 || this.f877g != null || this.f879i != null) {
            if (this.f875e.m()) {
                if (this.f877g == null) {
                    g();
                }
                compoundButton = this.f877g;
                view = this.f879i;
            } else {
                if (this.f879i == null) {
                    c();
                }
                compoundButton = this.f879i;
                view = this.f877g;
            }
            if (z10) {
                compoundButton.setChecked(this.f875e.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f879i;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f877g;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f875e.m()) {
            if (this.f877g == null) {
                g();
            }
            compoundButton = this.f877g;
        } else {
            if (this.f879i == null) {
                c();
            }
            compoundButton = this.f879i;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f891u = z10;
        this.f887q = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f882l;
        if (imageView != null) {
            imageView.setVisibility((this.f889s || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f875e.z() || this.f891u;
        if (z10 || this.f887q) {
            ImageView imageView = this.f876f;
            if (imageView != null || drawable != null || this.f887q) {
                if (imageView == null) {
                    f();
                }
                if (drawable != null || this.f887q) {
                    ImageView imageView2 = this.f876f;
                    if (!z10) {
                        drawable = null;
                    }
                    imageView2.setImageDrawable(drawable);
                    if (this.f876f.getVisibility() != 0) {
                        this.f876f.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f876f.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i10;
        TextView textView;
        if (charSequence != null) {
            this.f878h.setText(charSequence);
            if (this.f878h.getVisibility() != 0) {
                textView = this.f878h;
                i10 = 0;
            } else {
                return;
            }
        } else {
            i10 = 8;
            if (this.f878h.getVisibility() != 8) {
                textView = this.f878h;
            } else {
                return;
            }
        }
        textView.setVisibility(i10);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        v0 v10 = v0.v(getContext(), attributeSet, j.f11186b2, i10, 0);
        this.f884n = v10.g(j.f11196d2);
        this.f885o = v10.n(j.f11191c2, -1);
        this.f887q = v10.a(j.f11201e2, false);
        this.f886p = context;
        this.f888r = v10.g(j.f11206f2);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, a.dropDownListViewStyle, 0);
        this.f889s = obtainStyledAttributes.hasValue(0);
        v10.w();
        obtainStyledAttributes.recycle();
    }
}
