package in;

import java.io.Closeable;
import java.io.Flushable;

public interface y extends Closeable, Flushable {
    void b0(e eVar, long j10);

    void close();

    void flush();

    b0 timeout();
}
