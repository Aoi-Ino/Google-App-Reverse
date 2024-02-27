package j$.time.chrono;

import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

final class Ser implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;
    private Object object;
    private byte type;

    public Ser() {
    }

    Ser(byte b10, Object obj) {
        this.type = b10;
        this.object = obj;
    }

    private static Object readInternal(byte b10, ObjectInput objectInput) {
        switch (b10) {
            case 1:
                return AbstractChronology.readExternal(objectInput);
            case 2:
                return ChronoLocalDateTimeImpl.readExternal(objectInput);
            case 3:
                return ChronoZonedDateTimeImpl.readExternal(objectInput);
            case 4:
                return JapaneseDate.readExternal(objectInput);
            case 5:
                return JapaneseEra.readExternal(objectInput);
            case 6:
                return HijrahDate.readExternal(objectInput);
            case 7:
                return MinguoDate.readExternal(objectInput);
            case 8:
                return ThaiBuddhistDate.readExternal(objectInput);
            case 9:
                return ChronoPeriodImpl.readExternal(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.object;
    }

    private static void writeInternal(byte b10, Object obj, ObjectOutput objectOutput) {
        objectOutput.writeByte(b10);
        switch (b10) {
            case 1:
                ((AbstractChronology) obj).writeExternal(objectOutput);
                return;
            case 2:
                ((ChronoLocalDateTimeImpl) obj).writeExternal(objectOutput);
                return;
            case 3:
                ((ChronoZonedDateTimeImpl) obj).writeExternal(objectOutput);
                return;
            case 4:
                ((JapaneseDate) obj).writeExternal(objectOutput);
                return;
            case 5:
                ((JapaneseEra) obj).writeExternal(objectOutput);
                return;
            case 6:
                ((HijrahDate) obj).writeExternal(objectOutput);
                return;
            case 7:
                ((MinguoDate) obj).writeExternal(objectOutput);
                return;
            case 8:
                ((ThaiBuddhistDate) obj).writeExternal(objectOutput);
                return;
            case 9:
                ((ChronoPeriodImpl) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    public void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.type = readByte;
        this.object = readInternal(readByte, objectInput);
    }

    public void writeExternal(ObjectOutput objectOutput) {
        writeInternal(this.type, this.object, objectOutput);
    }
}
