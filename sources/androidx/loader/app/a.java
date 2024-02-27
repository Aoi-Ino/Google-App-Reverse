package androidx.loader.app;

import androidx.lifecycle.s;
import androidx.lifecycle.x0;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class a {
    public static a b(s sVar) {
        return new b(sVar, ((x0) sVar).X());
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();
}
