package j$.time.format;

public enum SignStyle {
    NORMAL,
    ALWAYS,
    NEVER,
    NOT_NEGATIVE,
    EXCEEDS_PAD;

    /* access modifiers changed from: package-private */
    public boolean parse(boolean z10, boolean z11, boolean z12) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return !z10 || !z11;
        }
        if (ordinal == 1 || ordinal == 4) {
            return true;
        }
        return !z11 && !z12;
    }
}
