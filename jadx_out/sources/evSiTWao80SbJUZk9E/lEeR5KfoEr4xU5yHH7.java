package evSiTWao80SbJUZk9E;

import evSiTWao80SbJUZk9E.KYHag8HRDlnO3X9zmZ;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class lEeR5KfoEr4xU5yHH7 extends KYHag8HRDlnO3X9zmZ {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Iterable f5779lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final byte[] f5780s3fjYDxWOUexjjVgyA;

    public static final class s3fjYDxWOUexjjVgyA extends KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7 {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public Iterable f5781lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public byte[] f5782s3fjYDxWOUexjjVgyA;

        @Override // evSiTWao80SbJUZk9E.KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7
        public KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7 HJFh0TGMpafqLE9haL(byte[] bArr) {
            this.f5782s3fjYDxWOUexjjVgyA = bArr;
            return this;
        }

        @Override // evSiTWao80SbJUZk9E.KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7
        public KYHag8HRDlnO3X9zmZ lEeR5KfoEr4xU5yHH7() {
            String str = "";
            if (this.f5781lEeR5KfoEr4xU5yHH7 == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new lEeR5KfoEr4xU5yHH7(this.f5781lEeR5KfoEr4xU5yHH7, this.f5782s3fjYDxWOUexjjVgyA);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // evSiTWao80SbJUZk9E.KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7
        public KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7 s3fjYDxWOUexjjVgyA(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f5781lEeR5KfoEr4xU5yHH7 = iterable;
            return this;
        }
    }

    public lEeR5KfoEr4xU5yHH7(Iterable iterable, byte[] bArr) {
        this.f5779lEeR5KfoEr4xU5yHH7 = iterable;
        this.f5780s3fjYDxWOUexjjVgyA = bArr;
    }

    @Override // evSiTWao80SbJUZk9E.KYHag8HRDlnO3X9zmZ
    public byte[] HJFh0TGMpafqLE9haL() {
        return this.f5780s3fjYDxWOUexjjVgyA;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof KYHag8HRDlnO3X9zmZ)) {
            return false;
        }
        KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ = (KYHag8HRDlnO3X9zmZ) obj;
        if (this.f5779lEeR5KfoEr4xU5yHH7.equals(kYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA())) {
            if (Arrays.equals(this.f5780s3fjYDxWOUexjjVgyA, kYHag8HRDlnO3X9zmZ instanceof lEeR5KfoEr4xU5yHH7 ? ((lEeR5KfoEr4xU5yHH7) kYHag8HRDlnO3X9zmZ).f5780s3fjYDxWOUexjjVgyA : kYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5779lEeR5KfoEr4xU5yHH7.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5780s3fjYDxWOUexjjVgyA);
    }

    @Override // evSiTWao80SbJUZk9E.KYHag8HRDlnO3X9zmZ
    public Iterable s3fjYDxWOUexjjVgyA() {
        return this.f5779lEeR5KfoEr4xU5yHH7;
    }

    public String toString() {
        return "BackendRequest{events=" + this.f5779lEeR5KfoEr4xU5yHH7 + ", extras=" + Arrays.toString(this.f5780s3fjYDxWOUexjjVgyA) + "}";
    }
}
