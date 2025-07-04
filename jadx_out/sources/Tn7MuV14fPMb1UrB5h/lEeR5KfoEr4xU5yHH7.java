package Tn7MuV14fPMb1UrB5h;

/* loaded from: classes.dex */
public final class lEeR5KfoEr4xU5yHH7 extends KYHag8HRDlnO3X9zmZ {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final String f1625lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final String f1626s3fjYDxWOUexjjVgyA;

    public lEeR5KfoEr4xU5yHH7(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f1625lEeR5KfoEr4xU5yHH7 = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f1626s3fjYDxWOUexjjVgyA = str2;
    }

    @Override // Tn7MuV14fPMb1UrB5h.KYHag8HRDlnO3X9zmZ
    public String HJFh0TGMpafqLE9haL() {
        return this.f1626s3fjYDxWOUexjjVgyA;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof KYHag8HRDlnO3X9zmZ)) {
            return false;
        }
        KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ = (KYHag8HRDlnO3X9zmZ) obj;
        return this.f1625lEeR5KfoEr4xU5yHH7.equals(kYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA()) && this.f1626s3fjYDxWOUexjjVgyA.equals(kYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL());
    }

    public int hashCode() {
        return ((this.f1625lEeR5KfoEr4xU5yHH7.hashCode() ^ 1000003) * 1000003) ^ this.f1626s3fjYDxWOUexjjVgyA.hashCode();
    }

    @Override // Tn7MuV14fPMb1UrB5h.KYHag8HRDlnO3X9zmZ
    public String s3fjYDxWOUexjjVgyA() {
        return this.f1625lEeR5KfoEr4xU5yHH7;
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f1625lEeR5KfoEr4xU5yHH7 + ", version=" + this.f1626s3fjYDxWOUexjjVgyA + "}";
    }
}
