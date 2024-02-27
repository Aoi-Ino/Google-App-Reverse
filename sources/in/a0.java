package in;

import java.io.Closeable;

public interface a0 extends Closeable {
    void close();

    long read(e eVar, long j10);

    b0 timeout();
}
