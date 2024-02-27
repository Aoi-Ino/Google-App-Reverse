package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

public class a0 extends IOException {

    /* renamed from: e  reason: collision with root package name */
    private o0 f7035e = null;

    public static class a extends a0 {
        public a(String str) {
            super(str);
        }
    }

    public a0(String str) {
        super(str);
    }

    static a0 a() {
        return new a0("Protocol message end-group tag did not match expected tag.");
    }

    static a0 b() {
        return new a0("Protocol message contained an invalid tag (zero).");
    }

    static a0 c() {
        return new a0("Protocol message had invalid UTF-8.");
    }

    static a d() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static a0 e() {
        return new a0("CodedInputStream encountered a malformed varint.");
    }

    static a0 f() {
        return new a0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static a0 g() {
        return new a0("Failed to parse the message.");
    }

    static a0 h() {
        return new a0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static a0 j() {
        return new a0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public a0 i(o0 o0Var) {
        this.f7035e = o0Var;
        return this;
    }
}
