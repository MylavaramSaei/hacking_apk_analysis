package bBVlTkqEpHW053CjWL;

/* loaded from: classes.dex */
public final class s3fjYDxWOUexjjVgyA extends Z9WdNiOsPR0y54zHW4 {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final eWK41qw3g36LVd4UnS.pbVGzGjWvY2LDXC8vo f4674HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final long f4675lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final eWK41qw3g36LVd4UnS.aPyGSIylzVNKPT1Bls f4676s3fjYDxWOUexjjVgyA;

    public s3fjYDxWOUexjjVgyA(long j, eWK41qw3g36LVd4UnS.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls, eWK41qw3g36LVd4UnS.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        this.f4675lEeR5KfoEr4xU5yHH7 = j;
        if (apygsiylzvnkpt1bls == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f4676s3fjYDxWOUexjjVgyA = apygsiylzvnkpt1bls;
        if (pbvgzgjwvy2ldxc8vo == null) {
            throw new NullPointerException("Null event");
        }
        this.f4674HJFh0TGMpafqLE9haL = pbvgzgjwvy2ldxc8vo;
    }

    @Override // bBVlTkqEpHW053CjWL.Z9WdNiOsPR0y54zHW4
    public long HJFh0TGMpafqLE9haL() {
        return this.f4675lEeR5KfoEr4xU5yHH7;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Z9WdNiOsPR0y54zHW4)) {
            return false;
        }
        Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4 = (Z9WdNiOsPR0y54zHW4) obj;
        return this.f4675lEeR5KfoEr4xU5yHH7 == z9WdNiOsPR0y54zHW4.HJFh0TGMpafqLE9haL() && this.f4676s3fjYDxWOUexjjVgyA.equals(z9WdNiOsPR0y54zHW4.zZKhbgvUfsK4AEX3r0()) && this.f4674HJFh0TGMpafqLE9haL.equals(z9WdNiOsPR0y54zHW4.s3fjYDxWOUexjjVgyA());
    }

    public int hashCode() {
        long j = this.f4675lEeR5KfoEr4xU5yHH7;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f4676s3fjYDxWOUexjjVgyA.hashCode()) * 1000003) ^ this.f4674HJFh0TGMpafqLE9haL.hashCode();
    }

    @Override // bBVlTkqEpHW053CjWL.Z9WdNiOsPR0y54zHW4
    public eWK41qw3g36LVd4UnS.pbVGzGjWvY2LDXC8vo s3fjYDxWOUexjjVgyA() {
        return this.f4674HJFh0TGMpafqLE9haL;
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f4675lEeR5KfoEr4xU5yHH7 + ", transportContext=" + this.f4676s3fjYDxWOUexjjVgyA + ", event=" + this.f4674HJFh0TGMpafqLE9haL + "}";
    }

    @Override // bBVlTkqEpHW053CjWL.Z9WdNiOsPR0y54zHW4
    public eWK41qw3g36LVd4UnS.aPyGSIylzVNKPT1Bls zZKhbgvUfsK4AEX3r0() {
        return this.f4676s3fjYDxWOUexjjVgyA;
    }
}
