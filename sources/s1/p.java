package s1;

import android.content.ComponentName;
import android.content.Context;
import m1.m;

public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    private static final String f15847a = m.i("PackageManagerHelper");

    private static int a(Context context, String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str));
    }

    private static boolean b(int i10, boolean z10) {
        if (i10 == 0) {
            return z10;
        }
        return i10 == 1;
    }

    public static void c(Context context, Class cls, boolean z10) {
        String str = "disabled";
        try {
            if (z10 == b(a(context, cls.getName()), false)) {
                m e10 = m.e();
                String str2 = f15847a;
                e10.a(str2, "Skipping component enablement for " + cls.getName());
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            m e11 = m.e();
            String str3 = f15847a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" ");
            sb2.append(z10 ? "enabled" : str);
            e11.a(str3, sb2.toString());
        } catch (Exception e12) {
            m e13 = m.e();
            String str4 = f15847a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            if (z10) {
                str = "enabled";
            }
            sb3.append(str);
            e13.b(str4, sb3.toString(), e12);
        }
    }
}
