package ac;

import android.content.Context;
import android.content.res.AssetManager;
import cm.g;
import cm.l;
import java.io.IOException;
import java.io.InputStream;
import km.d;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0007a f399a = new C0007a((g) null);

    /* renamed from: ac.a$a  reason: collision with other inner class name */
    public static final class C0007a {
        private C0007a() {
        }

        public /* synthetic */ C0007a(g gVar) {
            this();
        }

        public final String a(Context context, String str) {
            l.f(context, "context");
            try {
                AssetManager assets = context.getAssets();
                l.c(str);
                InputStream open = assets.open(str);
                l.e(open, "open(...)");
                byte[] bArr = new byte[open.available()];
                open.read(bArr);
                open.close();
                return new String(bArr, d.f24740b);
            } catch (IOException e10) {
                e10.printStackTrace();
                return null;
            }
        }
    }
}
