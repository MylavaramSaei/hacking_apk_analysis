package fLSSbwbzFBVpwBH5FM;

import java.util.Map;

/* loaded from: classes.dex */
public final class s3fjYDxWOUexjjVgyA extends KYHag8HRDlnO3X9zmZ {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final O1furmptfI76BGfN0d.lEeR5KfoEr4xU5yHH7 f5939lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Map f5940s3fjYDxWOUexjjVgyA;

    public s3fjYDxWOUexjjVgyA(O1furmptfI76BGfN0d.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, Map map) {
        if (leer5kfoer4xu5yhh7 == null) {
            throw new NullPointerException("Null clock");
        }
        this.f5939lEeR5KfoEr4xU5yHH7 = leer5kfoer4xu5yhh7;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f5940s3fjYDxWOUexjjVgyA = map;
    }

    @Override // fLSSbwbzFBVpwBH5FM.KYHag8HRDlnO3X9zmZ
    public Map IPyIQcaNa8aB7drBED() {
        return this.f5940s3fjYDxWOUexjjVgyA;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof KYHag8HRDlnO3X9zmZ)) {
            return false;
        }
        KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ = (KYHag8HRDlnO3X9zmZ) obj;
        return this.f5939lEeR5KfoEr4xU5yHH7.equals(kYHag8HRDlnO3X9zmZ.husNiw3snxdgZPAGJm()) && this.f5940s3fjYDxWOUexjjVgyA.equals(kYHag8HRDlnO3X9zmZ.IPyIQcaNa8aB7drBED());
    }

    public int hashCode() {
        return ((this.f5939lEeR5KfoEr4xU5yHH7.hashCode() ^ 1000003) * 1000003) ^ this.f5940s3fjYDxWOUexjjVgyA.hashCode();
    }

    @Override // fLSSbwbzFBVpwBH5FM.KYHag8HRDlnO3X9zmZ
    public O1furmptfI76BGfN0d.lEeR5KfoEr4xU5yHH7 husNiw3snxdgZPAGJm() {
        return this.f5939lEeR5KfoEr4xU5yHH7;
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f5939lEeR5KfoEr4xU5yHH7 + ", values=" + this.f5940s3fjYDxWOUexjjVgyA + "}";
    }
}
