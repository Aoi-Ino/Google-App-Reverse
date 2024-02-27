package j$.time.temporal;

import j$.time.format.ResolverStyle;
import java.util.Map;

public interface TemporalField {
    Temporal adjustInto(Temporal temporal, long j10);

    long getFrom(TemporalAccessor temporalAccessor);

    boolean isDateBased();

    boolean isSupportedBy(TemporalAccessor temporalAccessor);

    boolean isTimeBased();

    ValueRange range();

    ValueRange rangeRefinedBy(TemporalAccessor temporalAccessor);

    TemporalAccessor resolve(Map map, TemporalAccessor temporalAccessor, ResolverStyle resolverStyle) {
        return null;
    }
}
