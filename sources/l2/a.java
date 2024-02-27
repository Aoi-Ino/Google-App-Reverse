package l2;

import g2.d;
import h2.b;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public abstract class a {

    /* renamed from: l2.a$a  reason: collision with other inner class name */
    class C0177a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f13268e;

        C0177a(int i10) {
            this.f13268e = i10;
        }

        public void run() {
            List<d> d10 = i2.a.d().b().d(this.f13268e);
            if (d10 != null) {
                for (d dVar : d10) {
                    String d11 = a.d(dVar.a(), dVar.d());
                    i2.a.d().b().remove(dVar.e());
                    File file = new File(d11);
                    if (file.exists()) {
                        file.delete();
                    }
                }
            }
        }
    }

    public static void a(int i10) {
        f2.a.b().a().b().execute(new C0177a(i10));
    }

    public static String b(String str, String str2) {
        return str + File.separator + str2;
    }

    public static b c(b bVar, k2.a aVar) {
        int B = bVar.B();
        String E = bVar.E("Location");
        int i10 = 0;
        while (f(B)) {
            if (E != null) {
                bVar.close();
                aVar.F(E);
                bVar = i2.a.d().c();
                bVar.s(aVar);
                B = bVar.B();
                E = bVar.E("Location");
                i10++;
                if (i10 >= 10) {
                    throw new IllegalAccessException("Max redirection done");
                }
            } else {
                throw new IllegalAccessException("Location is null");
            }
        }
        return bVar;
    }

    public static String d(String str, String str2) {
        return b(str, str2) + ".temp";
    }

    public static int e(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String str4 = File.separator;
        sb2.append(str4);
        sb2.append(str2);
        sb2.append(str4);
        sb2.append(str3);
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(sb2.toString().getBytes("UTF-8"));
            StringBuilder sb3 = new StringBuilder(digest.length * 2);
            for (byte b10 : digest) {
                byte b11 = b10 & 255;
                if (b11 < 16) {
                    sb3.append("0");
                }
                sb3.append(Integer.toHexString(b11));
            }
            return sb3.toString().hashCode();
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException("NoSuchAlgorithmException", e10);
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException("UnsupportedEncodingException", e11);
        }
    }

    private static boolean f(int i10) {
        return i10 == 301 || i10 == 302 || i10 == 303 || i10 == 300 || i10 == 307 || i10 == 308;
    }

    public static void g(String str, String str2) {
        File file = new File(str);
        try {
            File file2 = new File(str2);
            if (file2.exists()) {
                if (!file2.delete()) {
                    throw new IOException("Deletion Failed");
                }
            }
            if (!file.renameTo(file2)) {
                throw new IOException("Rename Failed");
            } else if (file.exists()) {
                file.delete();
            }
        } catch (Throwable th2) {
            if (file.exists()) {
                file.delete();
            }
            throw th2;
        }
    }
}
