package z1;

import android.util.Log;
import cm.l;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import y1.a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f18714a = new c();

    private c() {
    }

    private final boolean a(FileChannel fileChannel, FileChannel fileChannel2) {
        ByteBuffer byteBuffer;
        FileChannel fileChannel3 = fileChannel;
        FileChannel fileChannel4 = fileChannel2;
        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
        long j10 = 0;
        ByteBuffer byteBuffer2 = null;
        long j11 = 0;
        int i10 = 0;
        while (true) {
            l.e(order, "atomBytes");
            if (!b(fileChannel3, order)) {
                break;
            }
            j10 = b.e(order.getInt());
            i10 = order.getInt();
            if (i10 == a.e()) {
                int d10 = b.d(j10);
                ByteBuffer order2 = ByteBuffer.allocate(d10).order(ByteOrder.BIG_ENDIAN);
                order.rewind();
                order2.put(order);
                if (fileChannel3.read(order2) < d10 - 8) {
                    byteBuffer2 = order2;
                    break;
                }
                order2.flip();
                j11 = fileChannel.position();
                byteBuffer2 = order2;
            } else {
                if (j10 == 1) {
                    order.clear();
                    if (!b(fileChannel3, order)) {
                        break;
                    }
                    j10 = b.f(order.getLong());
                    byteBuffer = byteBuffer2;
                    fileChannel3.position((fileChannel.position() + j10) - ((long) 16));
                } else {
                    byteBuffer = byteBuffer2;
                    fileChannel3.position((fileChannel.position() + j10) - ((long) 8));
                }
                byteBuffer2 = byteBuffer;
            }
            if (i10 == a.d() || i10 == a.f() || i10 == a.g() || i10 == a.h() || i10 == a.j() || i10 == a.k() || i10 == a.n() || i10 == a.i() || i10 == a.m() || i10 == a.e()) {
                if (j10 < 8) {
                    break;
                }
            } else {
                Log.wtf("StreamableVideo", "encountered non-QT top-level atom (is this a QuickTime file?)");
                break;
            }
        }
        ByteBuffer byteBuffer3 = byteBuffer2;
        if (i10 != a.h()) {
            Log.wtf("StreamableVideo", "last atom in file was not a moov atom");
            return false;
        }
        int d11 = b.d(j10);
        long j12 = (long) d11;
        long size = fileChannel.size() - j12;
        ByteBuffer order3 = ByteBuffer.allocate(d11).order(ByteOrder.BIG_ENDIAN);
        l.e(order3, "allocate(moovAtomSize).order(ByteOrder.BIG_ENDIAN)");
        if (!c(fileChannel3, order3, size)) {
            throw new Exception("failed to read moov atom");
        } else if (order3.getInt(12) != a.b()) {
            for (int i11 = 8; order3.remaining() >= i11; i11 = 8) {
                int position = order3.position();
                int i12 = order3.getInt(position + 4);
                if (i12 == a.l() || i12 == a.c()) {
                    long j13 = size;
                    if (b.e(order3.getInt(position)) <= ((long) order3.remaining())) {
                        order3.position(position + 12);
                        if (order3.remaining() >= 4) {
                            int c10 = b.c(order3.getInt());
                            if (i12 == a.l()) {
                                Log.i("StreamableVideo", "patching stco atom...");
                                if (order3.remaining() >= c10 * 4) {
                                    int i13 = 0;
                                    while (i13 < c10) {
                                        int i14 = order3.getInt(order3.position());
                                        int i15 = i14 + d11;
                                        if (i14 >= 0 || i15 < 0) {
                                            order3.putInt(i15);
                                            i13++;
                                        } else {
                                            throw new Exception("This is bug in original qt-faststart.c: stco atom should be extended to co64 atom as new offset value overflows uint32, but is not implemented.");
                                        }
                                    }
                                } else {
                                    throw new Exception("bad atom size/element count");
                                }
                            } else if (i12 == a.c()) {
                                Log.wtf("StreamableVideo", "patching co64 atom...");
                                if (order3.remaining() >= c10 * 8) {
                                    for (int i16 = 0; i16 < c10; i16++) {
                                        order3.putLong(order3.getLong(order3.position()) + j12);
                                    }
                                } else {
                                    throw new Exception("bad atom size/element count");
                                }
                            }
                            size = j13;
                        } else {
                            throw new Exception("malformed atom");
                        }
                    } else {
                        throw new Exception("bad atom size");
                    }
                } else {
                    order3.position(order3.position() + 1);
                }
            }
            long j14 = size;
            fileChannel3.position(j11);
            if (byteBuffer2 != null) {
                Log.i("StreamableVideo", "writing ftyp atom...");
                byteBuffer2.rewind();
                fileChannel4.write(byteBuffer2);
            }
            Log.i("StreamableVideo", "writing moov atom...");
            order3.rewind();
            fileChannel4.write(order3);
            Log.i("StreamableVideo", "copying rest of file...");
            fileChannel.transferTo(j11, j14 - j11, fileChannel2);
            return true;
        } else {
            throw new Exception("this utility does not support compressed moov atoms yet");
        }
    }

    private final boolean b(FileChannel fileChannel, ByteBuffer byteBuffer) {
        byteBuffer.clear();
        int read = fileChannel.read(byteBuffer);
        byteBuffer.flip();
        return read == byteBuffer.capacity();
    }

    private final boolean c(FileChannel fileChannel, ByteBuffer byteBuffer, long j10) {
        byteBuffer.clear();
        int read = fileChannel.read(byteBuffer, j10);
        byteBuffer.flip();
        return read == byteBuffer.capacity();
    }

    private final void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Log.wtf("StreamableVideo", "Failed to close file: ");
            }
        }
    }

    public final boolean e(File file, File file2) {
        FileOutputStream fileOutputStream;
        FileChannel channel;
        l.f(file2, "out");
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                channel = fileInputStream2.getChannel();
                fileOutputStream = new FileOutputStream(file2);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
                fileInputStream = fileInputStream2;
                d(fileInputStream);
                d(fileOutputStream);
                file2.delete();
                throw th;
            }
            try {
                FileChannel channel2 = fileOutputStream.getChannel();
                l.e(channel, "infile");
                l.e(channel2, "outfile");
                boolean a10 = a(channel, channel2);
                d(fileInputStream2);
                d(fileOutputStream);
                if (!a10) {
                    file2.delete();
                }
                return a10;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = fileInputStream2;
                d(fileInputStream);
                d(fileOutputStream);
                file2.delete();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            d(fileInputStream);
            d(fileOutputStream);
            file2.delete();
            throw th;
        }
    }
}
