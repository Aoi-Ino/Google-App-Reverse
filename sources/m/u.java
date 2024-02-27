package m;

import android.content.Context;
import android.os.Build;

abstract class u {
    static boolean a(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            return false;
        }
        return b(context, str, z.assume_strong_biometrics_models);
    }

    private static boolean b(Context context, String str, int i10) {
        if (str == null) {
            return false;
        }
        for (String equals : context.getResources().getStringArray(i10)) {
            if (str.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(Context context, String str, int i10) {
        if (str == null) {
            return false;
        }
        for (String startsWith : context.getResources().getStringArray(i10)) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    private static boolean d(Context context, String str, int i10) {
        if (str == null) {
            return false;
        }
        for (String equalsIgnoreCase : context.getResources().getStringArray(i10)) {
            if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                return true;
            }
        }
        return false;
    }

    static boolean e(Context context, String str) {
        if (Build.VERSION.SDK_INT != 29) {
            return false;
        }
        return b(context, str, z.delay_showing_prompt_models);
    }

    static boolean f(Context context, String str) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return c(context, str, z.hide_fingerprint_instantly_prefixes);
    }

    static boolean g(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return d(context, str, z.crypto_fingerprint_fallback_vendors) || c(context, str2, z.crypto_fingerprint_fallback_prefixes);
    }

    static boolean h(Context context, String str) {
        if (Build.VERSION.SDK_INT != 29) {
            return false;
        }
        return !d(context, str, z.keyguard_biometric_and_credential_exclude_vendors);
    }
}
