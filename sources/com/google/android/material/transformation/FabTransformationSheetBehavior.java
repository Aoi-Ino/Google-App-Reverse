package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.m0;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import q4.a;
import r4.f;
import r4.h;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: m  reason: collision with root package name */
    private Map f6607m;

    public FabTransformationSheetBehavior() {
    }

    private void f0(View view, boolean z10) {
        int i10;
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                this.f6607m = new HashMap(childCount);
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                boolean z11 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z11) {
                    Map map = this.f6607m;
                    if (z10) {
                        map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        i10 = 4;
                    } else if (map != null && map.containsKey(childAt)) {
                        i10 = ((Integer) this.f6607m.get(childAt)).intValue();
                    }
                    m0.B0(childAt, i10);
                }
            }
            if (!z10) {
                this.f6607m = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean L(View view, View view2, boolean z10, boolean z11) {
        f0(view2, z10);
        return super.L(view, view2, z10, z11);
    }

    /* access modifiers changed from: protected */
    public FabTransformationBehavior.b d0(Context context, boolean z10) {
        int i10 = z10 ? a.mtrl_fab_transformation_sheet_expand_spec : a.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.b bVar = new FabTransformationBehavior.b();
        bVar.f6600a = f.c(context, i10);
        bVar.f6601b = new h(17, 0.0f, 0.0f);
        return bVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
