package j$.sun.nio.cs;

import java.nio.charset.spi.CharsetProvider;

public abstract class StandardCharsets extends CharsetProvider {
    static String[] aliases_MS932 = {"MS932", "windows-932", "csWindows31J"};
    static String[] aliases_SJIS = {"sjis", "shift_jis", "shift-jis", "ms_kanji", "x-sjis", "csShiftJIS"};

    static String[] aliases_ISO_8859_1() {
        return new String[]{"iso-ir-100", "ISO_8859-1", "latin1", "l1", "IBM819", "cp819", "csISOLatin1", "819", "IBM-819", "ISO8859_1", "ISO_8859-1:1987", "ISO_8859_1", "8859_1", "ISO8859-1"};
    }
}
