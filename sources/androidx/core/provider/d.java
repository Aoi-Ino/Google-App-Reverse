package androidx.core.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Comparator f2439a = new c();

    static class a {
        static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    private static List b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    private static boolean c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private static List d(e eVar, Resources resources) {
        return eVar.b() != null ? eVar.b() : e.c(resources, eVar.c());
    }

    static g.a e(Context context, e eVar, CancellationSignal cancellationSignal) {
        ProviderInfo f10 = f(context.getPackageManager(), eVar, context.getResources());
        return f10 == null ? g.a.a(1, (g.b[]) null) : g.a.a(0, h(context, eVar, f10.authority, cancellationSignal));
    }

    static ProviderInfo f(PackageManager packageManager, e eVar, Resources resources) {
        String e10 = eVar.e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e10, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + e10);
        } else if (resolveContentProvider.packageName.equals(eVar.f())) {
            List b10 = b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(b10, f2439a);
            List d10 = d(eVar, resources);
            for (int i10 = 0; i10 < d10.size(); i10++) {
                ArrayList arrayList = new ArrayList((Collection) d10.get(i10));
                Collections.sort(arrayList, f2439a);
                if (c(b10, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + e10 + ", but package was not " + eVar.f());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            byte b11 = bArr2[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static androidx.core.provider.g.b[] h(android.content.Context r18, androidx.core.provider.e r19, java.lang.String r20, android.os.CancellationSignal r21) {
        /*
            r0 = r20
            java.lang.String r1 = "result_code"
            java.lang.String r2 = "font_italic"
            java.lang.String r3 = "font_weight"
            java.lang.String r4 = "font_ttc_index"
            java.lang.String r5 = "file_id"
            java.lang.String r6 = "_id"
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            android.net.Uri$Builder r8 = new android.net.Uri$Builder
            r8.<init>()
            java.lang.String r9 = "content"
            android.net.Uri$Builder r8 = r8.scheme(r9)
            android.net.Uri$Builder r8 = r8.authority(r0)
            android.net.Uri r8 = r8.build()
            android.net.Uri$Builder r10 = new android.net.Uri$Builder
            r10.<init>()
            android.net.Uri$Builder r9 = r10.scheme(r9)
            android.net.Uri$Builder r0 = r9.authority(r0)
            java.lang.String r9 = "file"
            android.net.Uri$Builder r0 = r0.appendPath(r9)
            android.net.Uri r0 = r0.build()
            r9 = 7
            r17 = 0
            java.lang.String[] r12 = new java.lang.String[r9]     // Catch:{ all -> 0x00f1 }
            r9 = 0
            r12[r9] = r6     // Catch:{ all -> 0x00f1 }
            r15 = 1
            r12[r15] = r5     // Catch:{ all -> 0x00f1 }
            r10 = 2
            r12[r10] = r4     // Catch:{ all -> 0x00f1 }
            java.lang.String r10 = "font_variation_settings"
            r11 = 3
            r12[r11] = r10     // Catch:{ all -> 0x00f1 }
            r10 = 4
            r12[r10] = r3     // Catch:{ all -> 0x00f1 }
            r10 = 5
            r12[r10] = r2     // Catch:{ all -> 0x00f1 }
            r10 = 6
            r12[r10] = r1     // Catch:{ all -> 0x00f1 }
            android.content.ContentResolver r10 = r18.getContentResolver()     // Catch:{ all -> 0x00f1 }
            java.lang.String r13 = "query = ?"
            java.lang.String[] r14 = new java.lang.String[r15]     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = r19.g()     // Catch:{ all -> 0x00f1 }
            r14[r9] = r11     // Catch:{ all -> 0x00f1 }
            r16 = 0
            r11 = r8
            r9 = r15
            r15 = r16
            r16 = r21
            android.database.Cursor r10 = androidx.core.provider.d.a.a(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00f1 }
            if (r10 == 0) goto L_0x00e2
            int r11 = r10.getCount()     // Catch:{ all -> 0x00a6 }
            if (r11 <= 0) goto L_0x00e2
            int r1 = r10.getColumnIndex(r1)     // Catch:{ all -> 0x00a6 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x00a6 }
            r7.<init>()     // Catch:{ all -> 0x00a6 }
            int r6 = r10.getColumnIndex(r6)     // Catch:{ all -> 0x00a6 }
            int r5 = r10.getColumnIndex(r5)     // Catch:{ all -> 0x00a6 }
            int r4 = r10.getColumnIndex(r4)     // Catch:{ all -> 0x00a6 }
            int r3 = r10.getColumnIndex(r3)     // Catch:{ all -> 0x00a6 }
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x00a6 }
        L_0x0098:
            boolean r11 = r10.moveToNext()     // Catch:{ all -> 0x00a6 }
            if (r11 == 0) goto L_0x00e2
            r11 = -1
            if (r1 == r11) goto L_0x00aa
            int r12 = r10.getInt(r1)     // Catch:{ all -> 0x00a6 }
            goto L_0x00ab
        L_0x00a6:
            r0 = move-exception
            r17 = r10
            goto L_0x00f2
        L_0x00aa:
            r12 = 0
        L_0x00ab:
            if (r4 == r11) goto L_0x00b2
            int r13 = r10.getInt(r4)     // Catch:{ all -> 0x00a6 }
            goto L_0x00b3
        L_0x00b2:
            r13 = 0
        L_0x00b3:
            if (r5 != r11) goto L_0x00be
            long r14 = r10.getLong(r6)     // Catch:{ all -> 0x00a6 }
            android.net.Uri r14 = android.content.ContentUris.withAppendedId(r8, r14)     // Catch:{ all -> 0x00a6 }
            goto L_0x00c6
        L_0x00be:
            long r14 = r10.getLong(r5)     // Catch:{ all -> 0x00a6 }
            android.net.Uri r14 = android.content.ContentUris.withAppendedId(r0, r14)     // Catch:{ all -> 0x00a6 }
        L_0x00c6:
            if (r3 == r11) goto L_0x00cd
            int r15 = r10.getInt(r3)     // Catch:{ all -> 0x00a6 }
            goto L_0x00cf
        L_0x00cd:
            r15 = 400(0x190, float:5.6E-43)
        L_0x00cf:
            if (r2 == r11) goto L_0x00d9
            int r11 = r10.getInt(r2)     // Catch:{ all -> 0x00a6 }
            if (r11 != r9) goto L_0x00d9
            r11 = r9
            goto L_0x00da
        L_0x00d9:
            r11 = 0
        L_0x00da:
            androidx.core.provider.g$b r11 = androidx.core.provider.g.b.a(r14, r13, r15, r11, r12)     // Catch:{ all -> 0x00a6 }
            r7.add(r11)     // Catch:{ all -> 0x00a6 }
            goto L_0x0098
        L_0x00e2:
            if (r10 == 0) goto L_0x00e7
            r10.close()
        L_0x00e7:
            r0 = 0
            androidx.core.provider.g$b[] r0 = new androidx.core.provider.g.b[r0]
            java.lang.Object[] r0 = r7.toArray(r0)
            androidx.core.provider.g$b[] r0 = (androidx.core.provider.g.b[]) r0
            return r0
        L_0x00f1:
            r0 = move-exception
        L_0x00f2:
            if (r17 == 0) goto L_0x00f7
            r17.close()
        L_0x00f7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.d.h(android.content.Context, androidx.core.provider.e, java.lang.String, android.os.CancellationSignal):androidx.core.provider.g$b[]");
    }
}
