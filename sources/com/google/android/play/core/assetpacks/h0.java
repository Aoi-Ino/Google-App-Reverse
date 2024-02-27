package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import o5.i;
import t5.w;

final class h0 extends w {

    /* renamed from: e  reason: collision with root package name */
    private final File f6730e;

    /* renamed from: f  reason: collision with root package name */
    private final File f6731f;

    /* renamed from: g  reason: collision with root package name */
    private final NavigableMap f6732g = new TreeMap();

    h0(File file, File file2) {
        this.f6730e = file;
        this.f6731f = file2;
        List<File> a10 = d3.a(file, file2);
        if (!a10.isEmpty()) {
            long j10 = 0;
            for (File file3 : a10) {
                this.f6732g.put(Long.valueOf(j10), file3);
                j10 += file3.length();
            }
            return;
        }
        throw new d1(String.format("Virtualized slice archive empty for %s, %s", new Object[]{file, file2}));
    }

    private final InputStream g(long j10, Long l10) {
        FileInputStream fileInputStream = new FileInputStream((File) this.f6732g.get(l10));
        if (fileInputStream.skip(j10 - l10.longValue()) == j10 - l10.longValue()) {
            return fileInputStream;
        }
        throw new d1(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", new Object[]{l10}));
    }

    public final long c() {
        Map.Entry lastEntry = this.f6732g.lastEntry();
        return ((Long) lastEntry.getKey()).longValue() + ((File) lastEntry.getValue()).length();
    }

    public final void close() {
    }

    /* access modifiers changed from: protected */
    public final InputStream e(long j10, long j11) {
        if (j10 < 0 || j11 < 0) {
            throw new d1(String.format("Invalid input parameters %s, %s", new Object[]{Long.valueOf(j10), Long.valueOf(j11)}));
        }
        long j12 = j10 + j11;
        if (j12 <= c()) {
            Long l10 = (Long) this.f6732g.floorKey(Long.valueOf(j10));
            Long l11 = (Long) this.f6732g.floorKey(Long.valueOf(j12));
            if (l10.equals(l11)) {
                return new g0(g(j10, l10), j11);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(g(j10, l10));
            Collection values = this.f6732g.subMap(l10, false, l11, false).values();
            if (!values.isEmpty()) {
                arrayList.add(new i(Collections.enumeration(values)));
            }
            arrayList.add(new g0(new FileInputStream((File) this.f6732g.get(l11)), j11 - (l11.longValue() - j10)));
            return new SequenceInputStream(Collections.enumeration(arrayList));
        }
        throw new d1(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", new Object[]{Long.valueOf(c()), Long.valueOf(j12)}));
    }
}
