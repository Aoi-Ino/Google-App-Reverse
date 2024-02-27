package org.json;

public class JSONException extends Exception {
    private static final long serialVersionUID = 0;
    private Throwable cause;

    public JSONException(String str) {
        super(str);
    }

    public Throwable getCause() {
        return this.cause;
    }

    public JSONException(Throwable th2) {
        super(th2.getMessage());
        this.cause = th2;
    }
}
