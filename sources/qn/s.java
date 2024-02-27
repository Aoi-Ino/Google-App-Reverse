package qn;

import ap.c;
import java.io.ByteArrayOutputStream;

public abstract class s implements f, c {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        return n().Y(((f) obj).n());
    }

    public byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        n().F(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public int hashCode() {
        return n().hashCode();
    }

    public abstract z n();

    public byte[] v(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        n().H(byteArrayOutputStream, str);
        return byteArrayOutputStream.toByteArray();
    }
}
