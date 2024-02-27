package a1;

import cm.l;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

public abstract class c {
    public static final void a(ReadableByteChannel readableByteChannel, FileChannel fileChannel) {
        l.f(readableByteChannel, "input");
        l.f(fileChannel, "output");
        try {
            fileChannel.transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
            fileChannel.force(false);
        } finally {
            readableByteChannel.close();
            fileChannel.close();
        }
    }
}
