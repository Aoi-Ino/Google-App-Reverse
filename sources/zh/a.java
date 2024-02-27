package zh;

import cm.g;
import cm.l;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0388a f33193a = new C0388a((g) null);

    /* renamed from: zh.a$a  reason: collision with other inner class name */
    public static final class C0388a {
        private C0388a() {
        }

        public /* synthetic */ C0388a(g gVar) {
            this();
        }

        public final void a(String str, File file) {
            try {
                URLConnection openConnection = new URL(str).openConnection();
                l.d(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.connect();
                InputStream inputStream = httpURLConnection.getInputStream();
                l.e(inputStream, "getInputStream(...)");
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                httpURLConnection.getContentLength();
                byte[] bArr = new byte[1048576];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.close();
                        return;
                    }
                }
            } catch (FileNotFoundException e10) {
                e = e10;
                e.printStackTrace();
            } catch (MalformedURLException e11) {
                e = e11;
                e.printStackTrace();
            } catch (IOException e12) {
                e = e12;
                e.printStackTrace();
            }
        }
    }
}
