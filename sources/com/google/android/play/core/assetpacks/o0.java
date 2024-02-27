package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import t5.y;
import w5.g;

final class o0 {

    /* renamed from: a  reason: collision with root package name */
    private final y f6825a;

    o0(y yVar) {
        this.f6825a = yVar;
    }

    /* access modifiers changed from: package-private */
    public final InputStream a(int i10, String str, String str2, int i11) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) g.a(((u3) this.f6825a.a()).l(i10, str, str2, i11));
            if (parcelFileDescriptor != null && parcelFileDescriptor.getFileDescriptor() != null) {
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            }
            throw new d1(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i10), str, str2, Integer.valueOf(i11)}), i10);
        } catch (ExecutionException e10) {
            throw new d1(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i10), str, str2, Integer.valueOf(i11)}), e10, i10);
        } catch (InterruptedException e11) {
            throw new d1("Extractor was interrupted while waiting for chunk file.", e11, i10);
        }
    }
}
