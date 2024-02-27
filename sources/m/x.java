package m;

import android.app.KeyguardManager;
import android.content.Context;

abstract class x {

    private static class a {
        static KeyguardManager a(Context context) {
            return (KeyguardManager) context.getSystemService(KeyguardManager.class);
        }

        static boolean b(KeyguardManager keyguardManager) {
            return keyguardManager.isDeviceSecure();
        }
    }

    static KeyguardManager a(Context context) {
        return a.a(context);
    }

    static boolean b(Context context) {
        KeyguardManager a10 = a(context);
        if (a10 == null) {
            return false;
        }
        return a.b(a10);
    }
}
