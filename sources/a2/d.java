package a2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import cm.l;
import java.io.File;
import java.util.ArrayList;
import z7.f;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private f f70a = f.f18917j;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList f71b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private File f72c;

    public final void a(int i10, long j10, MediaCodec.BufferInfo bufferInfo) {
        l.f(bufferInfo, "bufferInfo");
        if (i10 >= 0 && i10 < this.f71b.size()) {
            Object obj = this.f71b.get(i10);
            l.e(obj, "tracks[trackIndex]");
            ((i) obj).a(j10, bufferInfo);
        }
    }

    public final int b(MediaFormat mediaFormat, boolean z10) {
        l.f(mediaFormat, "mediaFormat");
        ArrayList arrayList = this.f71b;
        arrayList.add(new i(arrayList.size(), mediaFormat, z10));
        return this.f71b.size() - 1;
    }

    public final File c() {
        return this.f72c;
    }

    public final f d() {
        return this.f70a;
    }

    public final ArrayList e() {
        return this.f71b;
    }

    public final void f(File file) {
        l.f(file, "file");
        this.f72c = file;
    }

    public final void g(int i10) {
        f fVar;
        if (i10 == 0) {
            fVar = f.f18917j;
        } else if (i10 == 90) {
            fVar = f.f18918k;
        } else if (i10 == 180) {
            fVar = f.f18919l;
        } else if (i10 == 270) {
            fVar = f.f18920m;
        } else {
            return;
        }
        this.f70a = fVar;
    }
}
