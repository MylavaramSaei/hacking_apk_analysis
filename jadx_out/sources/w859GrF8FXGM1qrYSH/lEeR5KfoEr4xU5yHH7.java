package w859GrF8FXGM1qrYSH;

import w859GrF8FXGM1qrYSH.T9PhQIpGRhE4yZDm1C;

/* loaded from: classes.dex */
public final class lEeR5KfoEr4xU5yHH7 extends T9PhQIpGRhE4yZDm1C {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final long f7232HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final String f7233lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final long f7234s3fjYDxWOUexjjVgyA;

    public static final class s3fjYDxWOUexjjVgyA extends T9PhQIpGRhE4yZDm1C.lEeR5KfoEr4xU5yHH7 {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public Long f7235HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public String f7236lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public Long f7237s3fjYDxWOUexjjVgyA;

        @Override // w859GrF8FXGM1qrYSH.T9PhQIpGRhE4yZDm1C.lEeR5KfoEr4xU5yHH7
        public T9PhQIpGRhE4yZDm1C.lEeR5KfoEr4xU5yHH7 HJFh0TGMpafqLE9haL(long j) {
            this.f7235HJFh0TGMpafqLE9haL = Long.valueOf(j);
            return this;
        }

        @Override // w859GrF8FXGM1qrYSH.T9PhQIpGRhE4yZDm1C.lEeR5KfoEr4xU5yHH7
        public T9PhQIpGRhE4yZDm1C lEeR5KfoEr4xU5yHH7() {
            String str = "";
            if (this.f7236lEeR5KfoEr4xU5yHH7 == null) {
                str = " token";
            }
            if (this.f7237s3fjYDxWOUexjjVgyA == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f7235HJFh0TGMpafqLE9haL == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new lEeR5KfoEr4xU5yHH7(this.f7236lEeR5KfoEr4xU5yHH7, this.f7237s3fjYDxWOUexjjVgyA.longValue(), this.f7235HJFh0TGMpafqLE9haL.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // w859GrF8FXGM1qrYSH.T9PhQIpGRhE4yZDm1C.lEeR5KfoEr4xU5yHH7
        public T9PhQIpGRhE4yZDm1C.lEeR5KfoEr4xU5yHH7 s3fjYDxWOUexjjVgyA(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f7236lEeR5KfoEr4xU5yHH7 = str;
            return this;
        }

        @Override // w859GrF8FXGM1qrYSH.T9PhQIpGRhE4yZDm1C.lEeR5KfoEr4xU5yHH7
        public T9PhQIpGRhE4yZDm1C.lEeR5KfoEr4xU5yHH7 zZKhbgvUfsK4AEX3r0(long j) {
            this.f7237s3fjYDxWOUexjjVgyA = Long.valueOf(j);
            return this;
        }
    }

    public lEeR5KfoEr4xU5yHH7(String str, long j, long j2) {
        this.f7233lEeR5KfoEr4xU5yHH7 = str;
        this.f7234s3fjYDxWOUexjjVgyA = j;
        this.f7232HJFh0TGMpafqLE9haL = j2;
    }

    @Override // w859GrF8FXGM1qrYSH.T9PhQIpGRhE4yZDm1C
    public long HJFh0TGMpafqLE9haL() {
        return this.f7232HJFh0TGMpafqLE9haL;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof T9PhQIpGRhE4yZDm1C)) {
            return false;
        }
        T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C = (T9PhQIpGRhE4yZDm1C) obj;
        return this.f7233lEeR5KfoEr4xU5yHH7.equals(t9PhQIpGRhE4yZDm1C.s3fjYDxWOUexjjVgyA()) && this.f7234s3fjYDxWOUexjjVgyA == t9PhQIpGRhE4yZDm1C.zZKhbgvUfsK4AEX3r0() && this.f7232HJFh0TGMpafqLE9haL == t9PhQIpGRhE4yZDm1C.HJFh0TGMpafqLE9haL();
    }

    public int hashCode() {
        int iHashCode = (this.f7233lEeR5KfoEr4xU5yHH7.hashCode() ^ 1000003) * 1000003;
        long j = this.f7234s3fjYDxWOUexjjVgyA;
        long j2 = this.f7232HJFh0TGMpafqLE9haL;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // w859GrF8FXGM1qrYSH.T9PhQIpGRhE4yZDm1C
    public String s3fjYDxWOUexjjVgyA() {
        return this.f7233lEeR5KfoEr4xU5yHH7;
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f7233lEeR5KfoEr4xU5yHH7 + ", tokenExpirationTimestamp=" + this.f7234s3fjYDxWOUexjjVgyA + ", tokenCreationTimestamp=" + this.f7232HJFh0TGMpafqLE9haL + "}";
    }

    @Override // w859GrF8FXGM1qrYSH.T9PhQIpGRhE4yZDm1C
    public long zZKhbgvUfsK4AEX3r0() {
        return this.f7234s3fjYDxWOUexjjVgyA;
    }
}
