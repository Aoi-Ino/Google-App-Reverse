package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

public class SearchBar$ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

    /* renamed from: l  reason: collision with root package name */
    private boolean f6243l = false;

    public SearchBar$ScrollingViewBehavior() {
    }

    private void Y(AppBarLayout appBarLayout) {
        appBarLayout.setBackgroundColor(0);
        appBarLayout.setTargetElevation(0.0f);
    }

    /* access modifiers changed from: protected */
    public boolean T() {
        return true;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean l10 = super.l(coordinatorLayout, view, view2);
        if (!this.f6243l && (view2 instanceof AppBarLayout)) {
            this.f6243l = true;
            Y((AppBarLayout) view2);
        }
        return l10;
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
