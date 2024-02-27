package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

public final /* synthetic */ class c3 implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ c3 f6638a = new c3();

    private /* synthetic */ c3() {
    }

    public final boolean accept(File file, String str) {
        return d3.f6653a.matcher(str).matches();
    }
}
