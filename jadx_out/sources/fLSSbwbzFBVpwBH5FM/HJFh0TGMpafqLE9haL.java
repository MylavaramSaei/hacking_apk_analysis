package fLSSbwbzFBVpwBH5FM;

import fLSSbwbzFBVpwBH5FM.KYHag8HRDlnO3X9zmZ;
import java.util.Set;

/* loaded from: classes.dex */
public final class HJFh0TGMpafqLE9haL extends KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final Set f5892HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final long f5893lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final long f5894s3fjYDxWOUexjjVgyA;

    public static final class s3fjYDxWOUexjjVgyA extends KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7 {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public Set f5895HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public Long f5896lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public Long f5897s3fjYDxWOUexjjVgyA;

        @Override // fLSSbwbzFBVpwBH5FM.KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7
        public KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7 HJFh0TGMpafqLE9haL(Set set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f5895HJFh0TGMpafqLE9haL = set;
            return this;
        }

        @Override // fLSSbwbzFBVpwBH5FM.KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7
        public KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA lEeR5KfoEr4xU5yHH7() {
            String str = "";
            if (this.f5896lEeR5KfoEr4xU5yHH7 == null) {
                str = " delta";
            }
            if (this.f5897s3fjYDxWOUexjjVgyA == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f5895HJFh0TGMpafqLE9haL == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new HJFh0TGMpafqLE9haL(this.f5896lEeR5KfoEr4xU5yHH7.longValue(), this.f5897s3fjYDxWOUexjjVgyA.longValue(), this.f5895HJFh0TGMpafqLE9haL);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // fLSSbwbzFBVpwBH5FM.KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7
        public KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7 s3fjYDxWOUexjjVgyA(long j) {
            this.f5896lEeR5KfoEr4xU5yHH7 = Long.valueOf(j);
            return this;
        }

        @Override // fLSSbwbzFBVpwBH5FM.KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7
        public KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7 zZKhbgvUfsK4AEX3r0(long j) {
            this.f5897s3fjYDxWOUexjjVgyA = Long.valueOf(j);
            return this;
        }
    }

    public HJFh0TGMpafqLE9haL(long j, long j2, Set set) {
        this.f5893lEeR5KfoEr4xU5yHH7 = j;
        this.f5894s3fjYDxWOUexjjVgyA = j2;
        this.f5892HJFh0TGMpafqLE9haL = set;
    }

    @Override // fLSSbwbzFBVpwBH5FM.KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA
    public Set HJFh0TGMpafqLE9haL() {
        return this.f5892HJFh0TGMpafqLE9haL;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA)) {
            return false;
        }
        KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = (KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA) obj;
        return this.f5893lEeR5KfoEr4xU5yHH7 == s3fjydxwouexjjvgya.s3fjYDxWOUexjjVgyA() && this.f5894s3fjYDxWOUexjjVgyA == s3fjydxwouexjjvgya.zZKhbgvUfsK4AEX3r0() && this.f5892HJFh0TGMpafqLE9haL.equals(s3fjydxwouexjjvgya.HJFh0TGMpafqLE9haL());
    }

    public int hashCode() {
        long j = this.f5893lEeR5KfoEr4xU5yHH7;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.f5894s3fjYDxWOUexjjVgyA;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f5892HJFh0TGMpafqLE9haL.hashCode();
    }

    @Override // fLSSbwbzFBVpwBH5FM.KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA
    public long s3fjYDxWOUexjjVgyA() {
        return this.f5893lEeR5KfoEr4xU5yHH7;
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f5893lEeR5KfoEr4xU5yHH7 + ", maxAllowedDelay=" + this.f5894s3fjYDxWOUexjjVgyA + ", flags=" + this.f5892HJFh0TGMpafqLE9haL + "}";
    }

    @Override // fLSSbwbzFBVpwBH5FM.KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA
    public long zZKhbgvUfsK4AEX3r0() {
        return this.f5894s3fjYDxWOUexjjVgyA;
    }
}
