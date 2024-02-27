package s1;

import android.app.Application;
import cm.l;

final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f15813a = new a();

    private a() {
    }

    public final String a() {
        String processName = Application.getProcessName();
        l.e(processName, "getProcessName()");
        return processName;
    }
}
