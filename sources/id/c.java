package id;

import cm.g;
import com.nic.mparivahan.APIController;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f12675a = new a((g) null);

    /* renamed from: b  reason: collision with root package name */
    private static String f12676b = APIController.a().getAuth();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
            	at java.util.ArrayList.get(ArrayList.java:435)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        public final java.lang.String a(java.lang.String r12, java.lang.String r13) {
            /*
                r11 = this;
                java.lang.String r0 = "stock"
                cm.l.f(r12, r0)
                eo.a r0 = new eo.a
                r0.<init>()
                java.security.Security.addProvider(r0)
                r0 = 0
                ii.d r1 = new ii.d     // Catch:{ Exception -> 0x0072 }
                r1.<init>(r12)     // Catch:{ Exception -> 0x0072 }
                java.util.HashMap r12 = r1.a()     // Catch:{ Exception -> 0x0072 }
                com.nic.mparivahan.APIController r1 = com.nic.mparivahan.APIController.a()     // Catch:{ Exception -> 0x0072 }
                java.lang.String r1 = r1.getConst()     // Catch:{ Exception -> 0x0072 }
                java.lang.Object r12 = r12.get(r1)     // Catch:{ Exception -> 0x0072 }
                java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x0072 }
                java.lang.String r1 = "UTF8"
                java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)     // Catch:{ Exception -> 0x0072 }
                java.lang.String r2 = "forName(charsetName)"
                cm.l.e(r1, r2)     // Catch:{ Exception -> 0x0072 }
                byte[] r12 = r12.getBytes(r1)     // Catch:{ Exception -> 0x0072 }
                java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
                cm.l.e(r12, r1)     // Catch:{ Exception -> 0x0072 }
                javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch:{ Exception -> 0x0072 }
                java.lang.String r2 = "AES"
                r1.<init>(r12, r2)     // Catch:{ Exception -> 0x0072 }
                r12 = 32
                r2 = 0
                r3 = 1
                if (r13 == 0) goto L_0x0095
                int r4 = r13.length()     // Catch:{ Exception -> 0x0072 }
                int r4 = r4 - r3
                r5 = r2
                r6 = r5
            L_0x004f:
                if (r5 > r4) goto L_0x0075
                if (r6 != 0) goto L_0x0055
                r7 = r5
                goto L_0x0056
            L_0x0055:
                r7 = r4
            L_0x0056:
                char r7 = r13.charAt(r7)     // Catch:{ Exception -> 0x0072 }
                int r7 = cm.l.h(r7, r12)     // Catch:{ Exception -> 0x0072 }
                if (r7 > 0) goto L_0x0062
                r7 = r3
                goto L_0x0063
            L_0x0062:
                r7 = r2
            L_0x0063:
                if (r6 != 0) goto L_0x006c
                if (r7 != 0) goto L_0x0069
                r6 = r3
                goto L_0x004f
            L_0x0069:
                int r5 = r5 + 1
                goto L_0x004f
            L_0x006c:
                if (r7 != 0) goto L_0x006f
                goto L_0x0075
            L_0x006f:
                int r4 = r4 + -1
                goto L_0x004f
            L_0x0072:
                r12 = move-exception
                goto L_0x00fa
            L_0x0075:
                int r4 = r4 + r3
                java.lang.CharSequence r13 = r13.subSequence(r5, r4)     // Catch:{ Exception -> 0x0072 }
                java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x0072 }
                if (r13 == 0) goto L_0x0095
                java.lang.String r4 = "UTF8"
                java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)     // Catch:{ Exception -> 0x0072 }
                java.lang.String r5 = "forName(charsetName)"
                cm.l.e(r4, r5)     // Catch:{ Exception -> 0x0072 }
                byte[] r13 = r13.getBytes(r4)     // Catch:{ Exception -> 0x0072 }
                java.lang.String r4 = "this as java.lang.String).getBytes(charset)"
                cm.l.e(r13, r4)     // Catch:{ Exception -> 0x0072 }
                goto L_0x0096
            L_0x0095:
                r13 = r0
            L_0x0096:
                byte[] r5 = bp.a.a(r13)     // Catch:{ Exception -> 0x0072 }
                java.lang.Class<javax.crypto.Cipher> r13 = javax.crypto.Cipher.class
                monitor-enter(r13)     // Catch:{ Exception -> 0x0072 }
                java.lang.String r4 = "AES/ECB/PKCS7Padding"
                javax.crypto.Cipher r10 = javax.crypto.Cipher.getInstance(r4)     // Catch:{ all -> 0x00eb }
                r4 = 2
                r10.init(r4, r1)     // Catch:{ all -> 0x00eb }
                int r1 = r5.length     // Catch:{ all -> 0x00eb }
                int r1 = r10.getOutputSize(r1)     // Catch:{ all -> 0x00eb }
                byte[] r1 = new byte[r1]     // Catch:{ all -> 0x00eb }
                r6 = 0
                int r7 = r5.length     // Catch:{ all -> 0x00eb }
                r9 = 0
                r4 = r10
                r8 = r1
                int r4 = r4.update(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00eb }
                r10.doFinal(r1, r4)     // Catch:{ all -> 0x00eb }
                java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x00eb }
                java.nio.charset.Charset r5 = km.d.f24740b     // Catch:{ all -> 0x00eb }
                r4.<init>(r1, r5)     // Catch:{ all -> 0x00eb }
                int r1 = r4.length()     // Catch:{ all -> 0x00eb }
                int r1 = r1 - r3
                r5 = r2
                r6 = r5
            L_0x00c8:
                if (r5 > r1) goto L_0x00ed
                if (r6 != 0) goto L_0x00ce
                r7 = r5
                goto L_0x00cf
            L_0x00ce:
                r7 = r1
            L_0x00cf:
                char r7 = r4.charAt(r7)     // Catch:{ all -> 0x00eb }
                int r7 = cm.l.h(r7, r12)     // Catch:{ all -> 0x00eb }
                if (r7 > 0) goto L_0x00db
                r7 = r3
                goto L_0x00dc
            L_0x00db:
                r7 = r2
            L_0x00dc:
                if (r6 != 0) goto L_0x00e5
                if (r7 != 0) goto L_0x00e2
                r6 = r3
                goto L_0x00c8
            L_0x00e2:
                int r5 = r5 + 1
                goto L_0x00c8
            L_0x00e5:
                if (r7 != 0) goto L_0x00e8
                goto L_0x00ed
            L_0x00e8:
                int r1 = r1 + -1
                goto L_0x00c8
            L_0x00eb:
                r12 = move-exception
                goto L_0x00f8
            L_0x00ed:
                int r1 = r1 + r3
                java.lang.CharSequence r12 = r4.subSequence(r5, r1)     // Catch:{ all -> 0x00eb }
                java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x00eb }
                monitor-exit(r13)     // Catch:{ Exception -> 0x0072 }
                return r12
            L_0x00f8:
                monitor-exit(r13)     // Catch:{ Exception -> 0x0072 }
                throw r12     // Catch:{ Exception -> 0x0072 }
            L_0x00fa:
                r12.printStackTrace()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: id.c.a.a(java.lang.String, java.lang.String):java.lang.String");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x00a3, code lost:
            r9 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x00a5, code lost:
            r9 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a7, code lost:
            r9 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a9, code lost:
            r9 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ab, code lost:
            r9 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ad, code lost:
            r9 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00af, code lost:
            r9 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b1, code lost:
            r9 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b6, code lost:
            r9.printStackTrace();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bb, code lost:
            return "Error";
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String b(java.lang.String r9, java.lang.String r10) {
            /*
                r8 = this;
                java.lang.String r0 = "strToEncrypt"
                cm.l.f(r9, r0)
                java.lang.String r0 = "stock"
                cm.l.f(r10, r0)
                eo.a r0 = new eo.a
                r0.<init>()
                java.security.Security.addProvider(r0)
                ii.d r0 = new ii.d     // Catch:{ UnsupportedEncodingException -> 0x00b1, IllegalBlockSizeException -> 0x00af, BadPaddingException -> 0x00ad, InvalidKeyException -> 0x00ab, NoSuchPaddingException -> 0x00a9, NoSuchAlgorithmException -> 0x00a7, ShortBufferException -> 0x00a5, Exception -> 0x00a3 }
                r0.<init>(r10)     // Catch:{ UnsupportedEncodingException -> 0x00b1, IllegalBlockSizeException -> 0x00af, BadPaddingException -> 0x00ad, InvalidKeyException -> 0x00ab, NoSuchPaddingException -> 0x00a9, NoSuchAlgorithmException -> 0x00a7, ShortBufferException -> 0x00a5, Exception -> 0x00a3 }
                java.util.HashMap r10 = r0.a()     // Catch:{ UnsupportedEncodingException -> 0x00b1, IllegalBlockSizeException -> 0x00af, BadPaddingException -> 0x00ad, InvalidKeyException -> 0x00ab, NoSuchPaddingException -> 0x00a9, NoSuchAlgorithmException -> 0x00a7, ShortBufferException -> 0x00a5, Exception -> 0x00a3 }
                com.nic.mparivahan.APIController r0 = com.nic.mparivahan.APIController.a()     // Catch:{ UnsupportedEncodingException -> 0x00b1, IllegalBlockSizeException -> 0x00af, BadPaddingException -> 0x00ad, InvalidKeyException -> 0x00ab, NoSuchPaddingException -> 0x00a9, NoSuchAlgorithmException -> 0x00a7, ShortBufferException -> 0x00a5, Exception -> 0x00a3 }
                java.lang.String r0 = r0.getConst()     // Catch:{ UnsupportedEncodingException -> 0x00b1, IllegalBlockSizeException -> 0x00af, BadPaddingException -> 0x00ad, InvalidKeyException -> 0x00ab, NoSuchPaddingException -> 0x00a9, NoSuchAlgorithmException -> 0x00a7, ShortBufferException -> 0x00a5, Exception -> 0x00a3 }
                java.lang.Object r10 = r10.get(r0)     // Catch:{ UnsupportedEncodingException -> 0x00b1, IllegalBlockSizeException -> 0x00af, BadPaddingException -> 0x00ad, InvalidKeyException -> 0x00ab, NoSuchPaddingException -> 0x00a9, NoSuchAlgorithmException -> 0x00a7, ShortBufferException -> 0x00a5, Exception -> 0x00a3 }
                java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ UnsupportedEncodingException -> 0x00b1, IllegalBlockSizeException -> 0x00af, BadPaddingException -> 0x00ad, InvalidKeyException -> 0x00ab, NoSuchPaddingException -> 0x00a9, NoSuchAlgorithmException -> 0x00a7, ShortBufferException -> 0x00a5, Exception -> 0x00a3 }
                java.lang.String r0 = "UTF8"
                java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch:{ UnsupportedEncodingException -> 0x00b1, IllegalBlockSizeException -> 0x00af, BadPaddingException -> 0x00ad, InvalidKeyException -> 0x00ab, NoSuchPaddingException -> 0x00a9, NoSuchAlgorithmException -> 0x00a7, ShortBufferException -> 0x00a5, Exception -> 0x00a3 }
                java.lang.String r1 = "forName(charsetName)"
                cm.l.e(r0, r1)     // Catch:{ UnsupportedEncodingException -> 0x00b1, IllegalBlockSizeException -> 0x00af, BadPaddingException -> 0x00ad, InvalidKeyException -> 0x00ab, NoSuchPaddingException -> 0x00a9, NoSuchAlgorithmException -> 0x00a7, ShortBufferException -> 0x00a5, Exception -> 0x00a3 }
                byte[] r10 = r10.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x00b1, IllegalBlockSizeException -> 0x00af, BadPaddingException -> 0x00ad, InvalidKeyException -> 0x00ab, NoSuchPaddingException -> 0x00a9, NoSuchAlgorithmException -> 0x00a7, ShortBufferException -> 0x00a5, Exception -> 0x00a3 }
                java.lang.String r0 = "this as java.lang.String).getBytes(charset)"
                cm.l.e(r10, r0)     // Catch:{ UnsupportedEncodingException -> 0x00b1, IllegalBlockSizeException -> 0x00af, BadPaddingException -> 0x00ad, InvalidKeyException -> 0x00ab, NoSuchPaddingException -> 0x00a9, NoSuchAlgorithmException -> 0x00a7, ShortBufferException -> 0x00a5, Exception -> 0x00a3 }
                javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec     // Catch:{ UnsupportedEncodingException -> 0x00b1, IllegalBlockSizeException -> 0x00af, BadPaddingException -> 0x00ad, InvalidKeyException -> 0x00ab, NoSuchPaddingException -> 0x00a9, NoSuchAlgorithmException -> 0x00a7, ShortBufferException -> 0x00a5, Exception -> 0x00a3 }
                java.lang.String r1 = "AES"
                r0.<init>(r10, r1)     // Catch:{ UnsupportedEncodingException -> 0x00b1, IllegalBlockSizeException -> 0x00af, BadPaddingException -> 0x00ad, InvalidKeyException -> 0x00ab, NoSuchPaddingException -> 0x00a9, NoSuchAlgorithmException -> 0x00a7, ShortBufferException -> 0x00a5, Exception -> 0x00a3 }
                java.lang.String r10 = "UTF8"
                java.nio.charset.Charset r10 = java.nio.charset.Charset.forName(r10)     // Catch:{ UnsupportedEncodingException -> 0x00b1, IllegalBlockSizeException -> 0x00af, BadPaddingException -> 0x00ad, InvalidKeyException -> 0x00ab, NoSuchPaddingException -> 0x00a9, NoSuchAlgorithmException -> 0x00a7, ShortBufferException -> 0x00a5, Exception -> 0x00a3 }
                java.lang.String r1 = "forName(charsetName)"
                cm.l.e(r10, r1)     // Catch:{ UnsupportedEncodingException -> 0x00b1, IllegalBlockSizeException -> 0x00af, BadPaddingException -> 0x00ad, InvalidKeyException -> 0x00ab, NoSuchPaddingException -> 0x00a9, NoSuchAlgorithmException -> 0x00a7, ShortBufferException -> 0x00a5, Exception -> 0x00a3 }
                byte[] r3 = r9.getBytes(r10)     // Catch:{ UnsupportedEncodingException -> 0x00b1, IllegalBlockSizeException -> 0x00af, BadPaddingException -> 0x00ad, InvalidKeyException -> 0x00ab, NoSuchPaddingException -> 0x00a9, NoSuchAlgorithmException -> 0x00a7, ShortBufferException -> 0x00a5, Exception -> 0x00a3 }
                java.lang.String r9 = "this as java.lang.String).getBytes(charset)"
                cm.l.e(r3, r9)     // Catch:{ UnsupportedEncodingException -> 0x00b1, IllegalBlockSizeException -> 0x00af, BadPaddingException -> 0x00ad, InvalidKeyException -> 0x00ab, NoSuchPaddingException -> 0x00a9, NoSuchAlgorithmException -> 0x00a7, ShortBufferException -> 0x00a5, Exception -> 0x00a3 }
                java.lang.Class<javax.crypto.Cipher> r9 = javax.crypto.Cipher.class
                monitor-enter(r9)     // Catch:{ UnsupportedEncodingException -> 0x00b1, IllegalBlockSizeException -> 0x00af, BadPaddingException -> 0x00ad, InvalidKeyException -> 0x00ab, NoSuchPaddingException -> 0x00a9, NoSuchAlgorithmException -> 0x00a7, ShortBufferException -> 0x00a5, Exception -> 0x00a3 }
                java.lang.String r10 = "AES/ECB/PKCS7Padding"
                javax.crypto.Cipher r10 = javax.crypto.Cipher.getInstance(r10)     // Catch:{ all -> 0x00b3 }
                r1 = 1
                r10.init(r1, r0)     // Catch:{ all -> 0x00b3 }
                int r0 = r3.length     // Catch:{ all -> 0x00b3 }
                int r0 = r10.getOutputSize(r0)     // Catch:{ all -> 0x00b3 }
                byte[] r0 = new byte[r0]     // Catch:{ all -> 0x00b3 }
                r4 = 0
                int r5 = r3.length     // Catch:{ all -> 0x00b3 }
                r7 = 0
                r2 = r10
                r6 = r0
                int r1 = r2.update(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00b3 }
                r10.doFinal(r0, r1)     // Catch:{ all -> 0x00b3 }
                byte[] r10 = bp.a.b(r0)     // Catch:{ all -> 0x00b3 }
                java.lang.String r0 = "encode(...)"
                cm.l.e(r10, r0)     // Catch:{ all -> 0x00b3 }
                java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x00b3 }
                java.nio.charset.Charset r1 = km.d.f24740b     // Catch:{ all -> 0x00b3 }
                r0.<init>(r10, r1)     // Catch:{ all -> 0x00b3 }
                byte[] r10 = r0.getBytes(r1)     // Catch:{ all -> 0x00b3 }
                java.lang.String r0 = "this as java.lang.String).getBytes(charset)"
                cm.l.e(r10, r0)     // Catch:{ all -> 0x00b3 }
                byte[] r10 = bp.a.b(r10)     // Catch:{ all -> 0x00b3 }
                java.lang.String r0 = "encode(...)"
                cm.l.e(r10, r0)     // Catch:{ all -> 0x00b3 }
                java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x00b3 }
                r0.<init>(r10, r1)     // Catch:{ all -> 0x00b3 }
                monitor-exit(r9)     // Catch:{ UnsupportedEncodingException -> 0x00b1, IllegalBlockSizeException -> 0x00af, BadPaddingException -> 0x00ad, InvalidKeyException -> 0x00ab, NoSuchPaddingException -> 0x00a9, NoSuchAlgorithmException -> 0x00a7, ShortBufferException -> 0x00a5, Exception -> 0x00a3 }
                return r0
            L_0x00a3:
                r9 = move-exception
                goto L_0x00b6
            L_0x00a5:
                r9 = move-exception
                goto L_0x00b6
            L_0x00a7:
                r9 = move-exception
                goto L_0x00b6
            L_0x00a9:
                r9 = move-exception
                goto L_0x00b6
            L_0x00ab:
                r9 = move-exception
                goto L_0x00b6
            L_0x00ad:
                r9 = move-exception
                goto L_0x00b6
            L_0x00af:
                r9 = move-exception
                goto L_0x00b6
            L_0x00b1:
                r9 = move-exception
                goto L_0x00b6
            L_0x00b3:
                r10 = move-exception
                monitor-exit(r9)     // Catch:{ UnsupportedEncodingException -> 0x00b1, IllegalBlockSizeException -> 0x00af, BadPaddingException -> 0x00ad, InvalidKeyException -> 0x00ab, NoSuchPaddingException -> 0x00a9, NoSuchAlgorithmException -> 0x00a7, ShortBufferException -> 0x00a5, Exception -> 0x00a3 }
                throw r10     // Catch:{ UnsupportedEncodingException -> 0x00b1, IllegalBlockSizeException -> 0x00af, BadPaddingException -> 0x00ad, InvalidKeyException -> 0x00ab, NoSuchPaddingException -> 0x00a9, NoSuchAlgorithmException -> 0x00a7, ShortBufferException -> 0x00a5, Exception -> 0x00a3 }
            L_0x00b6:
                r9.printStackTrace()
                java.lang.String r9 = "Error"
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: id.c.a.b(java.lang.String, java.lang.String):java.lang.String");
        }
    }
}
