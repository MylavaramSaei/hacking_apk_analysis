package eWK41qw3g36LVd4UnS;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class IPyIQcaNa8aB7drBED {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final ctWLFN70QQINH1kyYo.HJFh0TGMpafqLE9haL f5682lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final byte[] f5683s3fjYDxWOUexjjVgyA;

    public IPyIQcaNa8aB7drBED(ctWLFN70QQINH1kyYo.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, byte[] bArr) {
        if (hJFh0TGMpafqLE9haL == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f5682lEeR5KfoEr4xU5yHH7 = hJFh0TGMpafqLE9haL;
        this.f5683s3fjYDxWOUexjjVgyA = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IPyIQcaNa8aB7drBED)) {
            return false;
        }
        IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED = (IPyIQcaNa8aB7drBED) obj;
        if (this.f5682lEeR5KfoEr4xU5yHH7.equals(iPyIQcaNa8aB7drBED.f5682lEeR5KfoEr4xU5yHH7)) {
            return Arrays.equals(this.f5683s3fjYDxWOUexjjVgyA, iPyIQcaNa8aB7drBED.f5683s3fjYDxWOUexjjVgyA);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5682lEeR5KfoEr4xU5yHH7.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5683s3fjYDxWOUexjjVgyA);
    }

    public byte[] lEeR5KfoEr4xU5yHH7() {
        return this.f5683s3fjYDxWOUexjjVgyA;
    }

    public ctWLFN70QQINH1kyYo.HJFh0TGMpafqLE9haL s3fjYDxWOUexjjVgyA() {
        return this.f5682lEeR5KfoEr4xU5yHH7;
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f5682lEeR5KfoEr4xU5yHH7 + ", bytes=[...]}";
    }
}
