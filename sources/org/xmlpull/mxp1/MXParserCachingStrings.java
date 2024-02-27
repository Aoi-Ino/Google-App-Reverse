package org.xmlpull.mxp1;

import org.xmlpull.v1.XmlPullParserException;

public class MXParserCachingStrings extends MXParser {
    private static final int CACHE_LOAD = 77;
    private static final boolean CACHE_STATISTICS = false;
    private static final int INITIAL_CAPACITY = 13;
    private static final boolean TRACE_SIZING = false;
    private static int globalCacheEntriesCount;
    private static int globalCacheEntriesThreshold;
    private static char[][] globalKeys;
    private static String[] globalValues;
    private int cacheEntriesCount;
    private int cacheEntriesThreshold;
    private int cacheStatCalls;
    private int cacheStatRehash;
    private int cacheStatResets;
    private int cacheStatWalks;
    private boolean global;
    private char[][] keys;
    private String[] values;

    public MXParserCachingStrings() {
        this.allStringsInterned = true;
    }

    private static final boolean keysAreEqual(char[] cArr, int i10, int i11, char[] cArr2, int i12, int i13) {
        if (i11 != i13) {
            return false;
        }
        for (int i14 = 0; i14 < i11; i14++) {
            if (cArr[i10 + i14] != cArr2[i12 + i14]) {
                return false;
            }
        }
        return true;
    }

    private void rehash() {
        int length = (this.keys.length * 2) + 1;
        int i10 = (length * 77) / 100;
        this.cacheEntriesThreshold = i10;
        if (i10 < length) {
            char[][] cArr = new char[length][];
            String[] strArr = new String[length];
            int i11 = 0;
            while (true) {
                char[][] cArr2 = this.keys;
                if (i11 >= cArr2.length) {
                    this.keys = cArr;
                    this.values = strArr;
                    return;
                }
                char[] cArr3 = cArr2[i11];
                cArr2[i11] = null;
                String[] strArr2 = this.values;
                String str = strArr2[i11];
                strArr2[i11] = null;
                if (cArr3 != null) {
                    int fastHash = MXParser.fastHash(cArr3, 0, cArr3.length);
                    while (true) {
                        int i12 = fastHash % length;
                        char[] cArr4 = cArr[i12];
                        if (cArr4 == null) {
                            cArr[i12] = cArr3;
                            strArr[i12] = str;
                            break;
                        }
                        if (!keysAreEqual(cArr4, 0, cArr4.length, cArr3, 0, cArr3.length)) {
                            fastHash = i12 + 1;
                        } else {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("internal cache error: duplicated keys: ");
                            stringBuffer.append(new String(cArr4));
                            stringBuffer.append(" and ");
                            stringBuffer.append(new String(cArr3));
                            throw new RuntimeException(stringBuffer.toString());
                        }
                    }
                }
                i11++;
            }
        } else {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("internal error: threshold must be less than capacity: ");
            stringBuffer2.append(length);
            throw new RuntimeException(stringBuffer2.toString());
        }
    }

    public void finalize() {
    }

    public boolean getFeature(String str) {
        return "http://xmlpull.org/v1/doc/features.html#names-interned".equals(str) ? this.allStringsInterned : super.getFeature(str);
    }

    /* access modifiers changed from: protected */
    public void initStringCache() {
        if (this.keys == null) {
            this.cacheEntriesThreshold = 10;
            this.keys = new char[13][];
            this.values = new String[13];
            this.cacheEntriesCount = 0;
        }
    }

    /* access modifiers changed from: protected */
    public String newString(char[] cArr, int i10, int i11) {
        return this.allStringsInterned ? newStringIntern(cArr, i10, i11) : super.newString(cArr, i10, i11);
    }

    /* access modifiers changed from: protected */
    public String newStringIntern(char[] cArr, int i10, int i11) {
        int i12;
        char[] cArr2;
        if (this.cacheEntriesCount >= this.cacheEntriesThreshold) {
            rehash();
        }
        int fastHash = MXParser.fastHash(cArr, i10, i11);
        int length = this.keys.length;
        while (true) {
            i12 = fastHash % length;
            cArr2 = this.keys[i12];
            if (cArr2 == null) {
                break;
            }
            if (keysAreEqual(cArr2, 0, cArr2.length, cArr, i10, i11)) {
                break;
            }
            fastHash = i12 + 1;
            length = this.keys.length;
        }
        if (cArr2 != null) {
            return this.values[i12];
        }
        char[] cArr3 = new char[i11];
        System.arraycopy(cArr, i10, cArr3, 0, i11);
        String intern = new String(cArr3).intern();
        this.keys[i12] = cArr3;
        this.values[i12] = intern;
        this.cacheEntriesCount++;
        return intern;
    }

    /* access modifiers changed from: protected */
    public void resetStringCache() {
        initStringCache();
    }

    public void setFeature(String str, boolean z10) throws XmlPullParserException {
        if (!"http://xmlpull.org/v1/doc/features.html#names-interned".equals(str)) {
            super.setFeature(str, z10);
        } else if (this.eventType == 0) {
            this.allStringsInterned = z10;
            if (!z10 && this.keys != null) {
                resetStringCache();
            }
        } else {
            throw new XmlPullParserException("interning names feature can only be changed before parsing", this, (Throwable) null);
        }
    }
}
