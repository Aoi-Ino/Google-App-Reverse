package j$.time.temporal;

public interface TemporalUnit {
    Temporal addTo(Temporal temporal, long j10);

    boolean isDateBased();
}
