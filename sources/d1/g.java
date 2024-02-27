package d1;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;

public interface g extends Closeable {
    k D(String str);

    boolean T();

    Cursor a0(j jVar, CancellationSignal cancellationSignal);

    String b();

    boolean d0();

    void g0();

    Cursor h0(j jVar);

    void i();

    boolean isOpen();

    void j();

    void k0(String str, Object[] objArr);

    void l0();

    int m0(String str, int i10, ContentValues contentValues, String str2, Object[] objArr);

    List r();

    void w(String str);

    Cursor w0(String str);
}
