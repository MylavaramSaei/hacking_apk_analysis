package sKw6Jz5uGcQ479KwIW;

/* loaded from: classes.dex */
public final class lEeR5KfoEr4xU5yHH7 extends e54J8UWNHWALQNixXM {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final long f6645HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final long f6646lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final long f6647s3fjYDxWOUexjjVgyA;

    public lEeR5KfoEr4xU5yHH7(long j, long j2, long j3) {
        this.f6646lEeR5KfoEr4xU5yHH7 = j;
        this.f6647s3fjYDxWOUexjjVgyA = j2;
        this.f6645HJFh0TGMpafqLE9haL = j3;
    }

    @Override // sKw6Jz5uGcQ479KwIW.e54J8UWNHWALQNixXM
    public long HJFh0TGMpafqLE9haL() {
        return this.f6646lEeR5KfoEr4xU5yHH7;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e54J8UWNHWALQNixXM)) {
            return false;
        }
        e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm = (e54J8UWNHWALQNixXM) obj;
        return this.f6646lEeR5KfoEr4xU5yHH7 == e54j8uwnhwalqnixxm.HJFh0TGMpafqLE9haL() && this.f6647s3fjYDxWOUexjjVgyA == e54j8uwnhwalqnixxm.s3fjYDxWOUexjjVgyA() && this.f6645HJFh0TGMpafqLE9haL == e54j8uwnhwalqnixxm.zZKhbgvUfsK4AEX3r0();
    }

    public int hashCode() {
        long j = this.f6646lEeR5KfoEr4xU5yHH7;
        long j2 = this.f6647s3fjYDxWOUexjjVgyA;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f6645HJFh0TGMpafqLE9haL;
        return i ^ ((int) ((j3 >>> 32) ^ j3));
    }

    @Override // sKw6Jz5uGcQ479KwIW.e54J8UWNHWALQNixXM
    public long s3fjYDxWOUexjjVgyA() {
        return this.f6647s3fjYDxWOUexjjVgyA;
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f6646lEeR5KfoEr4xU5yHH7 + ", elapsedRealtime=" + this.f6647s3fjYDxWOUexjjVgyA + ", uptimeMillis=" + this.f6645HJFh0TGMpafqLE9haL + "}";
    }

    @Override // sKw6Jz5uGcQ479KwIW.e54J8UWNHWALQNixXM
    public long zZKhbgvUfsK4AEX3r0() {
        return this.f6645HJFh0TGMpafqLE9haL;
    }
}
