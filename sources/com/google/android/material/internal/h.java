package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;

public class h extends g {
    public h(Context context) {
        super(context);
    }

    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        i iVar = (i) a(i10, i11, i12, charSequence);
        j jVar = new j(w(), this, iVar);
        iVar.x(jVar);
        return jVar;
    }
}
