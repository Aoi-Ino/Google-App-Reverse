package e8;

import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.AccessController;
import java.security.PrivilegedAction;

public class t {

    /* renamed from: a  reason: collision with root package name */
    private MappedByteBuffer f11022a = null;

    /* renamed from: b  reason: collision with root package name */
    private FileChannel f11023b = null;

    static class a implements PrivilegedAction {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ByteBuffer f11024a;

        a(ByteBuffer byteBuffer) {
            this.f11024a = byteBuffer;
        }

        /* renamed from: a */
        public Boolean run() {
            Boolean bool = Boolean.FALSE;
            try {
                Method method = this.f11024a.getClass().getMethod("cleaner", (Class[]) null);
                method.setAccessible(true);
                Object invoke = method.invoke(this.f11024a, (Object[]) null);
                invoke.getClass().getMethod("clean", (Class[]) null).invoke(invoke, (Object[]) null);
                return Boolean.TRUE;
            } catch (Exception unused) {
                return bool;
            }
        }
    }

    public t(String str, String str2) {
        FileChannel channel;
        FileChannel.MapMode mapMode;
        if (str2.equals("rw")) {
            channel = new RandomAccessFile(str, str2).getChannel();
            mapMode = FileChannel.MapMode.READ_WRITE;
        } else {
            channel = new FileInputStream(str).getChannel();
            mapMode = FileChannel.MapMode.READ_ONLY;
        }
        d(channel, mapMode);
    }

    public static boolean a(ByteBuffer byteBuffer) {
        if (byteBuffer == null || !byteBuffer.isDirect()) {
            return false;
        }
        return ((Boolean) AccessController.doPrivileged(new a(byteBuffer))).booleanValue();
    }

    private void d(FileChannel fileChannel, FileChannel.MapMode mapMode) {
        this.f11023b = fileChannel;
        MappedByteBuffer map = fileChannel.map(mapMode, 0, fileChannel.size());
        this.f11022a = map;
        map.load();
    }

    public void b() {
        a(this.f11022a);
        this.f11022a = null;
        FileChannel fileChannel = this.f11023b;
        if (fileChannel != null) {
            fileChannel.close();
        }
        this.f11023b = null;
    }

    public long c() {
        return (long) this.f11022a.position();
    }

    public long e() {
        return (long) this.f11022a.limit();
    }

    public int f() {
        try {
            return this.f11022a.get() & 255;
        } catch (BufferUnderflowException unused) {
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        b();
        super.finalize();
    }

    public int g(byte[] bArr, int i10, int i11) {
        int position = this.f11022a.position();
        int limit = this.f11022a.limit();
        if (position == limit) {
            return -1;
        }
        if ((position + i11) - i10 > limit) {
            i11 = limit - position;
        }
        this.f11022a.get(bArr, i10, i11);
        return i11;
    }

    public void h(long j10) {
        this.f11022a.position((int) j10);
    }
}
