package j$.time.format;

import j$.time.DateTimeException;

public class DateTimeParseException extends DateTimeException {
    private static final long serialVersionUID = 4304633501674722597L;
    private final int errorIndex;
    private final String parsedString;

    public DateTimeParseException(String str, CharSequence charSequence, int i10) {
        super(str);
        this.parsedString = charSequence.toString();
        this.errorIndex = i10;
    }

    public DateTimeParseException(String str, CharSequence charSequence, int i10, Throwable th2) {
        super(str, th2);
        this.parsedString = charSequence.toString();
        this.errorIndex = i10;
    }
}
