package t8;

import android.opengl.GLES20;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import java.io.File;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static int f16575a = -1;

    /* renamed from: b  reason: collision with root package name */
    public static String[] f16576b = {"fstab.nox", "init.nox.rc", "ueventd.nox.rc"};

    /* renamed from: c  reason: collision with root package name */
    public static String[] f16577c = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};

    /* renamed from: d  reason: collision with root package name */
    public static String[] f16578d = {"/dev/socket/qemud", "/dev/qemu_pipe"};

    /* renamed from: e  reason: collision with root package name */
    public static String[] f16579e = {"ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc"};

    /* renamed from: f  reason: collision with root package name */
    private static String[] f16580f = {"fstab.andy", "ueventd.andy.rc"};

    public static Boolean a(String[] strArr) {
        for (String file : strArr) {
            if (new File(file).exists()) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public static boolean b() {
        if (f16575a < 0) {
            String str = Build.PRODUCT;
            int i10 = (str.contains("sdk") || str.contains("Andy") || str.contains("ttVM_Hdragon") || str.contains("google_sdk") || str.contains("Droid4X") || str.contains("nox") || str.contains("sdk_x86") || str.contains("sdk_google") || str.contains("vbox86p")) ? 1 : 0;
            String str2 = Build.MANUFACTURER;
            if (str2.equals("unknown") || str2.equals("Genymotion") || str2.contains("Andy") || str2.contains("MIT") || str2.contains("nox") || str2.contains("TiantianVM")) {
                i10++;
            }
            if (Build.getRadioVersion().isEmpty()) {
                return true;
            }
            String str3 = Build.BRAND;
            if (str3.equals("generic") || str3.equals("generic_x86") || str3.equals("TTVM") || str3.contains("Andy")) {
                i10++;
            }
            String str4 = Build.DEVICE;
            if (str4.contains("generic") || str4.contains("generic_x86") || str4.contains("Andy") || str4.contains("ttVM_Hdragon") || str4.contains("Droid4X") || str4.contains("nox") || str4.contains("generic_x86_64") || str4.contains("vbox86p")) {
                i10++;
            }
            String str5 = Build.MODEL;
            if (str5.equals("sdk") || str5.equals("google_sdk") || str5.contains("Droid4X") || str5.contains("TiantianVM") || str5.contains("Andy") || str5.equals("Android SDK built for x86_64") || str5.equals("Android SDK built for x86")) {
                i10++;
            }
            String str6 = Build.HARDWARE;
            if (str6.equals("goldfish") || str6.equals("vbox86") || str6.contains("nox") || str6.contains("ttVM_x86")) {
                i10++;
            }
            String str7 = Build.FINGERPRINT;
            if (str7.contains("generic/sdk/generic") || str7.contains("generic_x86/sdk_x86/generic_x86") || str7.contains("Andy") || str7.contains("ttVM_Hdragon") || str7.contains("generic_x86_64") || str7.contains("generic/google_sdk/generic") || str7.contains("vbox86p") || str7.contains("generic/vbox86p/vbox86p")) {
                i10++;
            }
            try {
                String glGetString = GLES20.glGetString(7937);
                if (glGetString != null && (glGetString.contains("Bluestacks") || glGetString.contains("Translator"))) {
                    i10 += 10;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            try {
                Log.e("calling", "files");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Environment.getExternalStorageDirectory().toString());
                char c10 = File.separatorChar;
                sb2.append(c10);
                sb2.append("windows");
                sb2.append(c10);
                sb2.append("BstSharedFolder");
                if (new File(sb2.toString()).exists() || a(f16576b).booleanValue() || a(f16577c).booleanValue() || a(f16580f).booleanValue() || a(f16579e).booleanValue() || a(f16578d).booleanValue()) {
                    i10 += 10;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            f16575a = i10;
        }
        return f16575a > 3;
    }
}
