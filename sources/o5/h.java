package o5;

import java.io.File;
import java.io.FilenameFilter;

public final /* synthetic */ class h implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f14440a;

    public /* synthetic */ h(String str) {
        this.f14440a = str;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(String.valueOf(this.f14440a).concat("-")) && str.endsWith(".apk");
    }
}
