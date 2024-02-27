package j$.time.temporal;

public interface Temporal extends TemporalAccessor {
    Temporal minus(long j10, TemporalUnit temporalUnit) {
        return j10 == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1, temporalUnit) : plus(-j10, temporalUnit);
    }

    Temporal plus(long j10, TemporalUnit temporalUnit);

    Temporal plus(TemporalAmount temporalAmount) {
        return temporalAmount.addTo(this);
    }

    Temporal with(TemporalAdjuster temporalAdjuster) {
        return temporalAdjuster.adjustInto(this);
    }

    Temporal with(TemporalField temporalField, long j10);
}
