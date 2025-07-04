package ctWLFN70QQINH1kyYo;

/* loaded from: classes.dex */
public final class lEeR5KfoEr4xU5yHH7 extends zZKhbgvUfsK4AEX3r0 {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final husNiw3snxdgZPAGJm f5589HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Integer f5590lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Object f5591s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final KYHag8HRDlnO3X9zmZ f5592zZKhbgvUfsK4AEX3r0;

    public lEeR5KfoEr4xU5yHH7(Integer num, Object obj, husNiw3snxdgZPAGJm husniw3snxdgzpagjm, KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ) {
        this.f5590lEeR5KfoEr4xU5yHH7 = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f5591s3fjYDxWOUexjjVgyA = obj;
        if (husniw3snxdgzpagjm == null) {
            throw new NullPointerException("Null priority");
        }
        this.f5589HJFh0TGMpafqLE9haL = husniw3snxdgzpagjm;
        this.f5592zZKhbgvUfsK4AEX3r0 = kYHag8HRDlnO3X9zmZ;
    }

    @Override // ctWLFN70QQINH1kyYo.zZKhbgvUfsK4AEX3r0
    public husNiw3snxdgZPAGJm HJFh0TGMpafqLE9haL() {
        return this.f5589HJFh0TGMpafqLE9haL;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zZKhbgvUfsK4AEX3r0)) {
            return false;
        }
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = (zZKhbgvUfsK4AEX3r0) obj;
        Integer num = this.f5590lEeR5KfoEr4xU5yHH7;
        if (num != null ? num.equals(zzkhbgvufsk4aex3r0.lEeR5KfoEr4xU5yHH7()) : zzkhbgvufsk4aex3r0.lEeR5KfoEr4xU5yHH7() == null) {
            if (this.f5591s3fjYDxWOUexjjVgyA.equals(zzkhbgvufsk4aex3r0.s3fjYDxWOUexjjVgyA()) && this.f5589HJFh0TGMpafqLE9haL.equals(zzkhbgvufsk4aex3r0.HJFh0TGMpafqLE9haL())) {
                KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ = this.f5592zZKhbgvUfsK4AEX3r0;
                KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZZZKhbgvUfsK4AEX3r0 = zzkhbgvufsk4aex3r0.zZKhbgvUfsK4AEX3r0();
                if (kYHag8HRDlnO3X9zmZ == null) {
                    if (kYHag8HRDlnO3X9zmZZZKhbgvUfsK4AEX3r0 == null) {
                        return true;
                    }
                } else if (kYHag8HRDlnO3X9zmZ.equals(kYHag8HRDlnO3X9zmZZZKhbgvUfsK4AEX3r0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f5590lEeR5KfoEr4xU5yHH7;
        int iHashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f5591s3fjYDxWOUexjjVgyA.hashCode()) * 1000003) ^ this.f5589HJFh0TGMpafqLE9haL.hashCode()) * 1000003;
        KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ = this.f5592zZKhbgvUfsK4AEX3r0;
        return iHashCode ^ (kYHag8HRDlnO3X9zmZ != null ? kYHag8HRDlnO3X9zmZ.hashCode() : 0);
    }

    @Override // ctWLFN70QQINH1kyYo.zZKhbgvUfsK4AEX3r0
    public Integer lEeR5KfoEr4xU5yHH7() {
        return this.f5590lEeR5KfoEr4xU5yHH7;
    }

    @Override // ctWLFN70QQINH1kyYo.zZKhbgvUfsK4AEX3r0
    public Object s3fjYDxWOUexjjVgyA() {
        return this.f5591s3fjYDxWOUexjjVgyA;
    }

    public String toString() {
        return "Event{code=" + this.f5590lEeR5KfoEr4xU5yHH7 + ", payload=" + this.f5591s3fjYDxWOUexjjVgyA + ", priority=" + this.f5589HJFh0TGMpafqLE9haL + ", productData=" + this.f5592zZKhbgvUfsK4AEX3r0 + "}";
    }

    @Override // ctWLFN70QQINH1kyYo.zZKhbgvUfsK4AEX3r0
    public KYHag8HRDlnO3X9zmZ zZKhbgvUfsK4AEX3r0() {
        return this.f5592zZKhbgvUfsK4AEX3r0;
    }
}
