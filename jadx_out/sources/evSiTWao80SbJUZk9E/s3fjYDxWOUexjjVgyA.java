package evSiTWao80SbJUZk9E;

import evSiTWao80SbJUZk9E.TCyPEKSzIyweCN5yp1;

/* loaded from: classes.dex */
public final class s3fjYDxWOUexjjVgyA extends TCyPEKSzIyweCN5yp1 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7 f5786lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final long f5787s3fjYDxWOUexjjVgyA;

    public s3fjYDxWOUexjjVgyA(TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, long j) {
        if (leer5kfoer4xu5yhh7 == null) {
            throw new NullPointerException("Null status");
        }
        this.f5786lEeR5KfoEr4xU5yHH7 = leer5kfoer4xu5yhh7;
        this.f5787s3fjYDxWOUexjjVgyA = j;
    }

    @Override // evSiTWao80SbJUZk9E.TCyPEKSzIyweCN5yp1
    public TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7 HJFh0TGMpafqLE9haL() {
        return this.f5786lEeR5KfoEr4xU5yHH7;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TCyPEKSzIyweCN5yp1)) {
            return false;
        }
        TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = (TCyPEKSzIyweCN5yp1) obj;
        return this.f5786lEeR5KfoEr4xU5yHH7.equals(tCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL()) && this.f5787s3fjYDxWOUexjjVgyA == tCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA();
    }

    public int hashCode() {
        int iHashCode = (this.f5786lEeR5KfoEr4xU5yHH7.hashCode() ^ 1000003) * 1000003;
        long j = this.f5787s3fjYDxWOUexjjVgyA;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    @Override // evSiTWao80SbJUZk9E.TCyPEKSzIyweCN5yp1
    public long s3fjYDxWOUexjjVgyA() {
        return this.f5787s3fjYDxWOUexjjVgyA;
    }

    public String toString() {
        return "BackendResponse{status=" + this.f5786lEeR5KfoEr4xU5yHH7 + ", nextRequestWaitMillis=" + this.f5787s3fjYDxWOUexjjVgyA + "}";
    }
}
