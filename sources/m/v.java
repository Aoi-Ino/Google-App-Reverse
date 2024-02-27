package m;

import android.content.Context;
import android.util.Log;

abstract class v {
    static String a(Context context, int i10) {
        int i11;
        if (context == null) {
            return "";
        }
        if (i10 != 1) {
            if (i10 != 7) {
                switch (i10) {
                    case 9:
                        break;
                    case 10:
                        i11 = e0.fingerprint_error_user_canceled;
                        break;
                    case 11:
                        i11 = e0.fingerprint_error_no_fingerprints;
                        break;
                    case 12:
                        i11 = e0.fingerprint_error_hw_not_present;
                        break;
                    default:
                        Log.e("BiometricUtils", "Unknown error code: " + i10);
                        i11 = e0.default_error_msg;
                        break;
                }
            }
            i11 = e0.fingerprint_error_lockout;
        } else {
            i11 = e0.fingerprint_error_hw_not_available;
        }
        return context.getString(i11);
    }

    static boolean b(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            default:
                return false;
        }
    }

    static boolean c(int i10) {
        return i10 == 7 || i10 == 9;
    }
}
