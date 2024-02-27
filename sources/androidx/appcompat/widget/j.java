package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.m0;
import f.c;
import f.d;
import f.e;

public final class j {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f1431b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    private static j f1432c;

    /* renamed from: a  reason: collision with root package name */
    private m0 f1433a;

    class a implements m0.c {

        /* renamed from: a  reason: collision with root package name */
        private final int[] f1434a = {e.abc_textfield_search_default_mtrl_alpha, e.abc_textfield_default_mtrl_alpha, e.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b  reason: collision with root package name */
        private final int[] f1435b = {e.abc_ic_commit_search_api_mtrl_alpha, e.abc_seekbar_tick_mark_material, e.abc_ic_menu_share_mtrl_alpha, e.abc_ic_menu_copy_mtrl_am_alpha, e.abc_ic_menu_cut_mtrl_alpha, e.abc_ic_menu_selectall_mtrl_alpha, e.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c  reason: collision with root package name */
        private final int[] f1436c = {e.abc_textfield_activated_mtrl_alpha, e.abc_textfield_search_activated_mtrl_alpha, e.abc_cab_background_top_mtrl_alpha, e.abc_text_cursor_material, e.abc_text_select_handle_left_mtrl, e.abc_text_select_handle_middle_mtrl, e.abc_text_select_handle_right_mtrl};

        /* renamed from: d  reason: collision with root package name */
        private final int[] f1437d = {e.abc_popup_background_mtrl_mult, e.abc_cab_background_internal_bg, e.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e  reason: collision with root package name */
        private final int[] f1438e = {e.abc_tab_indicator_material, e.abc_textfield_search_material};

        /* renamed from: f  reason: collision with root package name */
        private final int[] f1439f = {e.abc_btn_check_material, e.abc_btn_radio_material, e.abc_btn_check_material_anim, e.abc_btn_radio_material_anim};

        a() {
        }

        private boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i10) {
            int c10 = r0.c(context, f.a.f11175t);
            int b10 = r0.b(context, f.a.colorButtonNormal);
            return new ColorStateList(new int[][]{r0.f1530b, r0.f1533e, r0.f1531c, r0.f1537i}, new int[]{b10, androidx.core.graphics.a.g(c10, i10), androidx.core.graphics.a.g(c10, i10), i10});
        }

        private ColorStateList i(Context context) {
            return h(context, r0.c(context, f.a.colorAccent));
        }

        private ColorStateList j(Context context) {
            return h(context, r0.c(context, f.a.colorButtonNormal));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i10 = f.a.colorSwitchThumbNormal;
            ColorStateList e10 = r0.e(context, i10);
            if (e10 == null || !e10.isStateful()) {
                iArr[0] = r0.f1530b;
                iArr2[0] = r0.b(context, i10);
                iArr[1] = r0.f1534f;
                iArr2[1] = r0.c(context, f.a.f11174s);
                iArr[2] = r0.f1537i;
                iArr2[2] = r0.c(context, i10);
            } else {
                int[] iArr3 = r0.f1530b;
                iArr[0] = iArr3;
                iArr2[0] = e10.getColorForState(iArr3, 0);
                iArr[1] = r0.f1534f;
                iArr2[1] = r0.c(context, f.a.f11174s);
                iArr[2] = r0.f1537i;
                iArr2[2] = e10.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(m0 m0Var, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable i11 = m0Var.i(context, e.abc_star_black_48dp);
            Drawable i12 = m0Var.i(context, e.abc_star_half_black_48dp);
            if ((i11 instanceof BitmapDrawable) && i11.getIntrinsicWidth() == dimensionPixelSize && i11.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) i11;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                i11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                i11.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((i12 instanceof BitmapDrawable) && i12.getIntrinsicWidth() == dimensionPixelSize && i12.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) i12;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                i12.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                i12.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            if (f0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = j.f1431b;
            }
            drawable.setColorFilter(j.e(i10, mode));
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x006c A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
            /*
                r7 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.j.f1431b
                int[] r1 = r7.f1434a
                boolean r1 = r7.f(r1, r9)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L_0x0015
                int r9 = f.a.colorControlNormal
            L_0x0011:
                r1 = r0
                r5 = r2
            L_0x0013:
                r0 = r4
                goto L_0x004f
            L_0x0015:
                int[] r1 = r7.f1436c
                boolean r1 = r7.f(r1, r9)
                if (r1 == 0) goto L_0x0020
                int r9 = f.a.f11174s
                goto L_0x0011
            L_0x0020:
                int[] r1 = r7.f1437d
                boolean r1 = r7.f(r1, r9)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L_0x0032
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L_0x002d:
                r1 = r0
                r0 = r4
                r9 = r5
                r5 = r2
                goto L_0x004f
            L_0x0032:
                int r1 = f.e.abc_list_divider_mtrl_alpha
                if (r9 != r1) goto L_0x0046
                r9 = 1109603123(0x42233333, float:40.8)
                int r9 = java.lang.Math.round(r9)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r2
                r6 = r0
                r0 = r9
                r9 = r1
                r1 = r6
                goto L_0x004f
            L_0x0046:
                int r1 = f.e.abc_dialog_material_background
                if (r9 != r1) goto L_0x004b
                goto L_0x002d
            L_0x004b:
                r1 = r0
                r9 = r3
                r5 = r9
                goto L_0x0013
            L_0x004f:
                if (r5 == 0) goto L_0x006c
                boolean r3 = androidx.appcompat.widget.f0.a(r10)
                if (r3 == 0) goto L_0x005b
                android.graphics.drawable.Drawable r10 = r10.mutate()
            L_0x005b:
                int r8 = androidx.appcompat.widget.r0.c(r8, r9)
                android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.j.e(r8, r1)
                r10.setColorFilter(r8)
                if (r0 == r4) goto L_0x006b
                r10.setAlpha(r0)
            L_0x006b:
                return r2
            L_0x006c:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        public PorterDuff.Mode b(int i10) {
            if (i10 == e.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        public Drawable c(m0 m0Var, Context context, int i10) {
            int i11;
            if (i10 == e.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{m0Var.i(context, e.abc_cab_background_internal_bg), m0Var.i(context, e.abc_cab_background_top_mtrl_alpha)});
            }
            if (i10 == e.abc_ratingbar_material) {
                i11 = d.abc_star_big;
            } else if (i10 == e.abc_ratingbar_indicator_material) {
                i11 = d.abc_star_medium;
            } else if (i10 != e.abc_ratingbar_small_material) {
                return null;
            } else {
                i11 = d.abc_star_small;
            }
            return l(m0Var, context, i11);
        }

        public ColorStateList d(Context context, int i10) {
            if (i10 == e.abc_edit_text_material) {
                return g.a.a(context, c.abc_tint_edittext);
            }
            if (i10 == e.abc_switch_track_mtrl_alpha) {
                return g.a.a(context, c.abc_tint_switch_track);
            }
            if (i10 == e.abc_switch_thumb_material) {
                return k(context);
            }
            if (i10 == e.abc_btn_default_mtrl_shape) {
                return j(context);
            }
            if (i10 == e.abc_btn_borderless_material) {
                return g(context);
            }
            if (i10 == e.abc_btn_colored_material) {
                return i(context);
            }
            if (i10 == e.abc_spinner_mtrl_am_alpha || i10 == e.abc_spinner_textfield_background_material) {
                return g.a.a(context, c.abc_tint_spinner);
            }
            if (f(this.f1435b, i10)) {
                return r0.e(context, f.a.colorControlNormal);
            }
            if (f(this.f1438e, i10)) {
                return g.a.a(context, c.abc_tint_default);
            }
            if (f(this.f1439f, i10)) {
                return g.a.a(context, c.abc_tint_btn_checkable);
            }
            if (i10 == e.abc_seekbar_thumb_material) {
                return g.a.a(context, c.abc_tint_seek_thumb);
            }
            return null;
        }

        public boolean e(Context context, int i10, Drawable drawable) {
            Drawable findDrawableByLayerId;
            int c10;
            if (i10 == e.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(16908288);
                int i11 = f.a.colorControlNormal;
                m(findDrawableByLayerId2, r0.c(context, i11), j.f1431b);
                m(layerDrawable.findDrawableByLayerId(16908303), r0.c(context, i11), j.f1431b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
                c10 = r0.c(context, f.a.f11174s);
            } else if (i10 != e.abc_ratingbar_material && i10 != e.abc_ratingbar_indicator_material && i10 != e.abc_ratingbar_small_material) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m(layerDrawable2.findDrawableByLayerId(16908288), r0.b(context, f.a.colorControlNormal), j.f1431b);
                Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(16908303);
                int i12 = f.a.f11174s;
                m(findDrawableByLayerId3, r0.c(context, i12), j.f1431b);
                findDrawableByLayerId = layerDrawable2.findDrawableByLayerId(16908301);
                c10 = r0.c(context, i12);
            }
            m(findDrawableByLayerId, c10, j.f1431b);
            return true;
        }
    }

    public static synchronized j b() {
        j jVar;
        synchronized (j.class) {
            try {
                if (f1432c == null) {
                    h();
                }
                jVar = f1432c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter k10;
        synchronized (j.class) {
            k10 = m0.k(i10, mode);
        }
        return k10;
    }

    public static synchronized void h() {
        synchronized (j.class) {
            if (f1432c == null) {
                j jVar = new j();
                f1432c = jVar;
                jVar.f1433a = m0.g();
                f1432c.f1433a.t(new a());
            }
        }
    }

    static void i(Drawable drawable, t0 t0Var, int[] iArr) {
        m0.v(drawable, t0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i10) {
        return this.f1433a.i(context, i10);
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable d(Context context, int i10, boolean z10) {
        return this.f1433a.j(context, i10, z10);
    }

    /* access modifiers changed from: package-private */
    public synchronized ColorStateList f(Context context, int i10) {
        return this.f1433a.l(context, i10);
    }

    public synchronized void g(Context context) {
        this.f1433a.r(context);
    }
}
