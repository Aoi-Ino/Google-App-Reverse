package com.yalantis.ucrop;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.UCropView;
import com.yalantis.ucrop.view.b;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import com.yalantis.ucrop.view.widget.HorizontalProgressWheelView;
import i1.l;
import i1.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ll.i;

public class UCropActivity extends androidx.appcompat.app.d {

    /* renamed from: k0  reason: collision with root package name */
    public static final Bitmap.CompressFormat f22637k0 = Bitmap.CompressFormat.JPEG;
    private String G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private boolean P;
    /* access modifiers changed from: private */
    public boolean Q = true;
    /* access modifiers changed from: private */
    public UCropView R;
    /* access modifiers changed from: private */
    public GestureCropImageView S;
    private OverlayView T;
    private ViewGroup U;
    private ViewGroup V;
    private ViewGroup W;
    private ViewGroup X;
    private ViewGroup Y;
    private ViewGroup Z;
    /* access modifiers changed from: private */

    /* renamed from: a0  reason: collision with root package name */
    public List f22638a0 = new ArrayList();

    /* renamed from: b0  reason: collision with root package name */
    private TextView f22639b0;

    /* renamed from: c0  reason: collision with root package name */
    private TextView f22640c0;
    /* access modifiers changed from: private */

    /* renamed from: d0  reason: collision with root package name */
    public View f22641d0;

    /* renamed from: e0  reason: collision with root package name */
    private l f22642e0;

    /* renamed from: f0  reason: collision with root package name */
    private Bitmap.CompressFormat f22643f0 = f22637k0;

    /* renamed from: g0  reason: collision with root package name */
    private int f22644g0 = 90;

    /* renamed from: h0  reason: collision with root package name */
    private int[] f22645h0 = {1, 2, 3};

    /* renamed from: i0  reason: collision with root package name */
    private b.C0281b f22646i0 = new a();

    /* renamed from: j0  reason: collision with root package name */
    private final View.OnClickListener f22647j0 = new g();

    class a implements b.C0281b {
        a() {
        }

        public void a(Exception exc) {
            UCropActivity.this.B1(exc);
            UCropActivity.this.finish();
        }

        public void b(float f10) {
            UCropActivity.this.D1(f10);
        }

        public void c(float f10) {
            UCropActivity.this.x1(f10);
        }

        public void d() {
            UCropActivity.this.R.animate().alpha(1.0f).setDuration(300).setInterpolator(new AccelerateInterpolator());
            UCropActivity.this.f22641d0.setClickable(false);
            boolean unused = UCropActivity.this.Q = false;
            UCropActivity.this.c1();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        public void onClick(View view) {
            UCropActivity.this.S.setTargetAspectRatio(((AspectRatioTextView) ((ViewGroup) view).getChildAt(0)).s(view.isSelected()));
            UCropActivity.this.S.z();
            if (!view.isSelected()) {
                for (ViewGroup viewGroup : UCropActivity.this.f22638a0) {
                    viewGroup.setSelected(viewGroup == view);
                }
            }
        }
    }

    class c implements HorizontalProgressWheelView.a {
        c() {
        }

        public void a(float f10, float f11) {
            UCropActivity.this.S.x(f10 / 42.0f);
        }

        public void b() {
            UCropActivity.this.S.z();
        }

        public void c() {
            UCropActivity.this.S.t();
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        public void onClick(View view) {
            UCropActivity.this.u1();
        }
    }

    class e implements View.OnClickListener {
        e() {
        }

        public void onClick(View view) {
            UCropActivity.this.v1(90);
        }
    }

    class f implements HorizontalProgressWheelView.a {
        f() {
        }

        public void a(float f10, float f11) {
            if (f10 > 0.0f) {
                UCropActivity.this.S.C(UCropActivity.this.S.getCurrentScale() + (f10 * ((UCropActivity.this.S.getMaxScale() - UCropActivity.this.S.getMinScale()) / 15000.0f)));
            } else {
                UCropActivity.this.S.E(UCropActivity.this.S.getCurrentScale() + (f10 * ((UCropActivity.this.S.getMaxScale() - UCropActivity.this.S.getMinScale()) / 15000.0f)));
            }
        }

        public void b() {
            UCropActivity.this.S.z();
        }

        public void c() {
            UCropActivity.this.S.t();
        }
    }

    class g implements View.OnClickListener {
        g() {
        }

        public void onClick(View view) {
            if (!view.isSelected()) {
                UCropActivity.this.G1(view.getId());
            }
        }
    }

    class h implements il.a {
        h() {
        }

        public void a(Throwable th2) {
            UCropActivity.this.B1(th2);
            UCropActivity.this.finish();
        }

        public void b(Uri uri, int i10, int i11, int i12, int i13) {
            UCropActivity uCropActivity = UCropActivity.this;
            uCropActivity.C1(uri, uCropActivity.S.getTargetAspectRatio(), i10, i11, i12, i13);
            UCropActivity.this.finish();
        }
    }

    static {
        androidx.appcompat.app.g.I(true);
    }

    private void A1() {
        if (this.P) {
            G1(this.U.getVisibility() == 0 ? hl.d.state_aspect_ratio : hl.d.state_scale);
        } else {
            w1(0);
        }
    }

    /* access modifiers changed from: private */
    public void D1(float f10) {
        TextView textView = this.f22640c0;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", new Object[]{Integer.valueOf((int) (f10 * 100.0f))}));
        }
    }

    private void E1(int i10) {
        TextView textView = this.f22640c0;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    private void F1(int i10) {
        Window window = getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i10);
        }
    }

    /* access modifiers changed from: private */
    public void G1(int i10) {
        if (this.P) {
            ViewGroup viewGroup = this.U;
            int i11 = hl.d.state_aspect_ratio;
            viewGroup.setSelected(i10 == i11);
            ViewGroup viewGroup2 = this.V;
            int i12 = hl.d.state_rotate;
            viewGroup2.setSelected(i10 == i12);
            ViewGroup viewGroup3 = this.W;
            int i13 = hl.d.state_scale;
            viewGroup3.setSelected(i10 == i13);
            int i14 = 8;
            this.X.setVisibility(i10 == i11 ? 0 : 8);
            this.Y.setVisibility(i10 == i12 ? 0 : 8);
            ViewGroup viewGroup4 = this.Z;
            if (i10 == i13) {
                i14 = 0;
            }
            viewGroup4.setVisibility(i14);
            q1(i10);
            if (i10 == i13) {
                w1(0);
            } else if (i10 == i12) {
                w1(1);
            } else {
                w1(2);
            }
        }
    }

    private void H1() {
        F1(this.I);
        Toolbar toolbar = (Toolbar) findViewById(hl.d.toolbar);
        toolbar.setBackgroundColor(this.H);
        toolbar.setTitleTextColor(this.K);
        TextView textView = (TextView) toolbar.findViewById(hl.d.toolbar_title);
        textView.setTextColor(this.K);
        textView.setText(this.G);
        Drawable mutate = androidx.core.content.a.e(this, this.M).mutate();
        mutate.setColorFilter(this.K, PorterDuff.Mode.SRC_ATOP);
        toolbar.setNavigationIcon(mutate);
        b1(toolbar);
        androidx.appcompat.app.a R0 = R0();
        if (R0 != null) {
            R0.t(false);
        }
    }

    private void I1(Intent intent) {
        int intExtra = intent.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            parcelableArrayListExtra = new ArrayList();
            parcelableArrayListExtra.add(new jl.a((String) null, 1.0f, 1.0f));
            parcelableArrayListExtra.add(new jl.a((String) null, 3.0f, 4.0f));
            parcelableArrayListExtra.add(new jl.a(getString(hl.g.ucrop_label_original).toUpperCase(), 0.0f, 0.0f));
            parcelableArrayListExtra.add(new jl.a((String) null, 3.0f, 2.0f));
            parcelableArrayListExtra.add(new jl.a((String) null, 16.0f, 9.0f));
            intExtra = 2;
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(hl.d.layout_aspect_ratio);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        Iterator it = parcelableArrayListExtra.iterator();
        while (it.hasNext()) {
            FrameLayout frameLayout = (FrameLayout) getLayoutInflater().inflate(hl.e.ucrop_aspect_ratio, (ViewGroup) null);
            frameLayout.setLayoutParams(layoutParams);
            AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) frameLayout.getChildAt(0);
            aspectRatioTextView.setActiveColor(this.J);
            aspectRatioTextView.setAspectRatio((jl.a) it.next());
            linearLayout.addView(frameLayout);
            this.f22638a0.add(frameLayout);
        }
        ((ViewGroup) this.f22638a0.get(intExtra)).setSelected(true);
        for (ViewGroup onClickListener : this.f22638a0) {
            onClickListener.setOnClickListener(new b());
        }
    }

    private void J1() {
        this.f22639b0 = (TextView) findViewById(hl.d.text_view_rotate);
        int i10 = hl.d.rotate_scroll_wheel;
        ((HorizontalProgressWheelView) findViewById(i10)).setScrollingListener(new c());
        ((HorizontalProgressWheelView) findViewById(i10)).setMiddleLineColor(this.J);
        findViewById(hl.d.wrapper_reset_rotate).setOnClickListener(new d());
        findViewById(hl.d.wrapper_rotate_by_angle).setOnClickListener(new e());
        y1(this.J);
    }

    private void K1() {
        this.f22640c0 = (TextView) findViewById(hl.d.text_view_scale);
        int i10 = hl.d.scale_scroll_wheel;
        ((HorizontalProgressWheelView) findViewById(i10)).setScrollingListener(new f());
        ((HorizontalProgressWheelView) findViewById(i10)).setMiddleLineColor(this.J);
        E1(this.J);
    }

    private void L1() {
        ImageView imageView = (ImageView) findViewById(hl.d.image_view_state_scale);
        ImageView imageView2 = (ImageView) findViewById(hl.d.image_view_state_rotate);
        ImageView imageView3 = (ImageView) findViewById(hl.d.image_view_state_aspect_ratio);
        imageView.setImageDrawable(new i(imageView.getDrawable(), this.J));
        imageView2.setImageDrawable(new i(imageView2.getDrawable(), this.J));
        imageView3.setImageDrawable(new i(imageView3.getDrawable(), this.J));
    }

    private void M1(Intent intent) {
        this.I = intent.getIntExtra("com.yalantis.ucrop.StatusBarColor", androidx.core.content.a.c(this, hl.a.ucrop_color_statusbar));
        this.H = intent.getIntExtra("com.yalantis.ucrop.ToolbarColor", androidx.core.content.a.c(this, hl.a.ucrop_color_toolbar));
        this.J = intent.getIntExtra("com.yalantis.ucrop.UcropColorControlsWidgetActive", androidx.core.content.a.c(this, hl.a.ucrop_color_active_controls_color));
        this.K = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarWidgetColor", androidx.core.content.a.c(this, hl.a.ucrop_color_toolbar_widget));
        this.M = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCancelDrawable", hl.c.ucrop_ic_cross);
        this.N = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCropDrawable", hl.c.ucrop_ic_done);
        String stringExtra = intent.getStringExtra("com.yalantis.ucrop.UcropToolbarTitleText");
        this.G = stringExtra;
        if (stringExtra == null) {
            stringExtra = getResources().getString(hl.g.ucrop_label_edit_photo);
        }
        this.G = stringExtra;
        this.O = intent.getIntExtra("com.yalantis.ucrop.UcropLogoColor", androidx.core.content.a.c(this, hl.a.ucrop_color_default_logo));
        this.P = !intent.getBooleanExtra("com.yalantis.ucrop.HideBottomControls", false);
        this.L = intent.getIntExtra("com.yalantis.ucrop.UcropRootViewBackgroundColor", androidx.core.content.a.c(this, hl.a.ucrop_color_crop_background));
        H1();
        s1();
        if (this.P) {
            ViewGroup viewGroup = (ViewGroup) ((ViewGroup) findViewById(hl.d.ucrop_photobox)).findViewById(hl.d.controls_wrapper);
            viewGroup.setVisibility(0);
            LayoutInflater.from(this).inflate(hl.e.ucrop_controls, viewGroup, true);
            i1.b bVar = new i1.b();
            this.f22642e0 = bVar;
            bVar.b0(50);
            ViewGroup viewGroup2 = (ViewGroup) findViewById(hl.d.state_aspect_ratio);
            this.U = viewGroup2;
            viewGroup2.setOnClickListener(this.f22647j0);
            ViewGroup viewGroup3 = (ViewGroup) findViewById(hl.d.state_rotate);
            this.V = viewGroup3;
            viewGroup3.setOnClickListener(this.f22647j0);
            ViewGroup viewGroup4 = (ViewGroup) findViewById(hl.d.state_scale);
            this.W = viewGroup4;
            viewGroup4.setOnClickListener(this.f22647j0);
            this.X = (ViewGroup) findViewById(hl.d.layout_aspect_ratio);
            this.Y = (ViewGroup) findViewById(hl.d.layout_rotate_wheel);
            this.Z = (ViewGroup) findViewById(hl.d.layout_scale_wheel);
            I1(intent);
            J1();
            K1();
            L1();
        }
    }

    private void p1() {
        if (this.f22641d0 == null) {
            this.f22641d0 = new View(this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(3, hl.d.toolbar);
            this.f22641d0.setLayoutParams(layoutParams);
            this.f22641d0.setClickable(true);
        }
        ((RelativeLayout) findViewById(hl.d.ucrop_photobox)).addView(this.f22641d0);
    }

    private void q1(int i10) {
        n.a((ViewGroup) findViewById(hl.d.ucrop_photobox), this.f22642e0);
        int i11 = 8;
        this.W.findViewById(hl.d.text_view_scale).setVisibility(i10 == hl.d.state_scale ? 0 : 8);
        this.U.findViewById(hl.d.text_view_crop).setVisibility(i10 == hl.d.state_aspect_ratio ? 0 : 8);
        View findViewById = this.V.findViewById(hl.d.text_view_rotate);
        if (i10 == hl.d.state_rotate) {
            i11 = 0;
        }
        findViewById.setVisibility(i11);
    }

    private void s1() {
        UCropView uCropView = (UCropView) findViewById(hl.d.ucrop);
        this.R = uCropView;
        this.S = uCropView.getCropImageView();
        this.T = this.R.getOverlayView();
        this.S.setTransformImageListener(this.f22646i0);
        ((ImageView) findViewById(hl.d.image_view_logo)).setColorFilter(this.O, PorterDuff.Mode.SRC_ATOP);
        int i10 = hl.d.ucrop_frame;
        findViewById(i10).setBackgroundColor(this.L);
        if (!this.P) {
            ((RelativeLayout.LayoutParams) findViewById(i10).getLayoutParams()).bottomMargin = 0;
            findViewById(i10).requestLayout();
        }
    }

    private void t1(Intent intent) {
        GestureCropImageView gestureCropImageView;
        String stringExtra = intent.getStringExtra("com.yalantis.ucrop.CompressionFormatName");
        Bitmap.CompressFormat valueOf = !TextUtils.isEmpty(stringExtra) ? Bitmap.CompressFormat.valueOf(stringExtra) : null;
        if (valueOf == null) {
            valueOf = f22637k0;
        }
        this.f22643f0 = valueOf;
        this.f22644g0 = intent.getIntExtra("com.yalantis.ucrop.CompressionQuality", 90);
        int[] intArrayExtra = intent.getIntArrayExtra("com.yalantis.ucrop.AllowedGestures");
        if (intArrayExtra != null && intArrayExtra.length == 3) {
            this.f22645h0 = intArrayExtra;
        }
        this.S.setMaxBitmapSize(intent.getIntExtra("com.yalantis.ucrop.MaxBitmapSize", 0));
        this.S.setMaxScaleMultiplier(intent.getFloatExtra("com.yalantis.ucrop.MaxScaleMultiplier", 10.0f));
        this.S.setImageToWrapCropBoundsAnimDuration((long) intent.getIntExtra("com.yalantis.ucrop.ImageToCropBoundsAnimDuration", 500));
        this.T.setFreestyleCropEnabled(intent.getBooleanExtra("com.yalantis.ucrop.FreeStyleCrop", false));
        this.T.setDimmedColor(intent.getIntExtra("com.yalantis.ucrop.DimmedLayerColor", getResources().getColor(hl.a.ucrop_color_default_dimmed)));
        this.T.setCircleDimmedLayer(intent.getBooleanExtra("com.yalantis.ucrop.CircleDimmedLayer", false));
        this.T.setShowCropFrame(intent.getBooleanExtra("com.yalantis.ucrop.ShowCropFrame", true));
        this.T.setCropFrameColor(intent.getIntExtra("com.yalantis.ucrop.CropFrameColor", getResources().getColor(hl.a.ucrop_color_default_crop_frame)));
        this.T.setCropFrameStrokeWidth(intent.getIntExtra("com.yalantis.ucrop.CropFrameStrokeWidth", getResources().getDimensionPixelSize(hl.b.ucrop_default_crop_frame_stoke_width)));
        this.T.setShowCropGrid(intent.getBooleanExtra("com.yalantis.ucrop.ShowCropGrid", true));
        this.T.setCropGridRowCount(intent.getIntExtra("com.yalantis.ucrop.CropGridRowCount", 2));
        this.T.setCropGridColumnCount(intent.getIntExtra("com.yalantis.ucrop.CropGridColumnCount", 2));
        this.T.setCropGridColor(intent.getIntExtra("com.yalantis.ucrop.CropGridColor", getResources().getColor(hl.a.ucrop_color_default_crop_grid)));
        this.T.setCropGridStrokeWidth(intent.getIntExtra("com.yalantis.ucrop.CropGridStrokeWidth", getResources().getDimensionPixelSize(hl.b.ucrop_default_crop_grid_stoke_width)));
        float f10 = 0.0f;
        float floatExtra = intent.getFloatExtra("com.yalantis.ucrop.AspectRatioX", 0.0f);
        float floatExtra2 = intent.getFloatExtra("com.yalantis.ucrop.AspectRatioY", 0.0f);
        int intExtra = intent.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
        if (floatExtra <= 0.0f || floatExtra2 <= 0.0f) {
            if (parcelableArrayListExtra == null || intExtra >= parcelableArrayListExtra.size()) {
                gestureCropImageView = this.S;
            } else {
                gestureCropImageView = this.S;
                f10 = ((jl.a) parcelableArrayListExtra.get(intExtra)).d() / ((jl.a) parcelableArrayListExtra.get(intExtra)).e();
            }
            gestureCropImageView.setTargetAspectRatio(f10);
        } else {
            ViewGroup viewGroup = this.U;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            this.S.setTargetAspectRatio(floatExtra / floatExtra2);
        }
        int intExtra2 = intent.getIntExtra("com.yalantis.ucrop.MaxSizeX", 0);
        int intExtra3 = intent.getIntExtra("com.yalantis.ucrop.MaxSizeY", 0);
        if (intExtra2 > 0 && intExtra3 > 0) {
            this.S.setMaxResultImageSizeX(intExtra2);
            this.S.setMaxResultImageSizeY(intExtra3);
        }
    }

    /* access modifiers changed from: private */
    public void u1() {
        GestureCropImageView gestureCropImageView = this.S;
        gestureCropImageView.x(-gestureCropImageView.getCurrentAngle());
        this.S.z();
    }

    /* access modifiers changed from: private */
    public void v1(int i10) {
        this.S.x((float) i10);
        this.S.z();
    }

    private void w1(int i10) {
        GestureCropImageView gestureCropImageView = this.S;
        int i11 = this.f22645h0[i10];
        boolean z10 = false;
        gestureCropImageView.setScaleEnabled(i11 == 3 || i11 == 1);
        GestureCropImageView gestureCropImageView2 = this.S;
        int i12 = this.f22645h0[i10];
        if (i12 == 3 || i12 == 2) {
            z10 = true;
        }
        gestureCropImageView2.setRotateEnabled(z10);
    }

    /* access modifiers changed from: private */
    public void x1(float f10) {
        TextView textView = this.f22639b0;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%.1f°", new Object[]{Float.valueOf(f10)}));
        }
    }

    private void y1(int i10) {
        TextView textView = this.f22639b0;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    private void z1(Intent intent) {
        Throwable e10;
        Uri uri = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.InputUri");
        Uri uri2 = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
        t1(intent);
        if (uri == null || uri2 == null) {
            e10 = new NullPointerException(getString(hl.g.ucrop_error_input_data_is_absent));
        } else {
            try {
                this.S.n(uri, uri2);
                return;
            } catch (Exception e11) {
                e10 = e11;
            }
        }
        B1(e10);
        finish();
    }

    /* access modifiers changed from: protected */
    public void B1(Throwable th2) {
        setResult(96, new Intent().putExtra("com.yalantis.ucrop.Error", th2));
    }

    /* access modifiers changed from: protected */
    public void C1(Uri uri, float f10, int i10, int i11, int i12, int i13) {
        setResult(-1, new Intent().putExtra("com.yalantis.ucrop.OutputUri", uri).putExtra("com.yalantis.ucrop.CropAspectRatio", f10).putExtra("com.yalantis.ucrop.ImageWidth", i12).putExtra("com.yalantis.ucrop.ImageHeight", i13).putExtra("com.yalantis.ucrop.OffsetX", i10).putExtra("com.yalantis.ucrop.OffsetY", i11));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(hl.e.ucrop_activity_photobox);
        Intent intent = getIntent();
        M1(intent);
        z1(intent);
        A1();
        p1();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(hl.f.ucrop_menu_activity, menu);
        MenuItem findItem = menu.findItem(hl.d.menu_loader);
        Drawable icon = findItem.getIcon();
        if (icon != null) {
            try {
                icon.mutate();
                icon.setColorFilter(this.K, PorterDuff.Mode.SRC_ATOP);
                findItem.setIcon(icon);
            } catch (IllegalStateException e10) {
                Log.i("UCropActivity", String.format("%s - %s", new Object[]{e10.getMessage(), getString(hl.g.ucrop_mutate_exception_hint)}));
            }
            ((Animatable) findItem.getIcon()).start();
        }
        MenuItem findItem2 = menu.findItem(hl.d.menu_crop);
        Drawable e11 = androidx.core.content.a.e(this, this.N);
        if (e11 == null) {
            return true;
        }
        e11.mutate();
        e11.setColorFilter(this.K, PorterDuff.Mode.SRC_ATOP);
        findItem2.setIcon(e11);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == hl.d.menu_crop) {
            r1();
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            onBackPressed();
            return true;
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(hl.d.menu_crop).setVisible(!this.Q);
        menu.findItem(hl.d.menu_loader).setVisible(this.Q);
        return super.onPrepareOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        GestureCropImageView gestureCropImageView = this.S;
        if (gestureCropImageView != null) {
            gestureCropImageView.t();
        }
    }

    /* access modifiers changed from: protected */
    public void r1() {
        this.f22641d0.setClickable(true);
        this.Q = true;
        c1();
        this.S.u(this.f22643f0, this.f22644g0, new h());
    }
}
