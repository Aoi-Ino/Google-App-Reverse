package in;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

public interface g extends a0, ReadableByteChannel {
    boolean A(long j10);

    int I(r rVar);

    String J();

    long L(y yVar);

    byte[] M();

    boolean P();

    byte[] S(long j10);

    e d();

    String e0(long j10);

    void p0(long j10);

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j10);

    h u();

    h v(long j10);

    long x0();

    String y0(Charset charset);

    InputStream z0();
}
