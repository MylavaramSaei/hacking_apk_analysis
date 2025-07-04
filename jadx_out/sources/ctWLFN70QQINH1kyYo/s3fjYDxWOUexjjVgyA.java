package ctWLFN70QQINH1kyYo;

/* loaded from: classes.dex */
public final class s3fjYDxWOUexjjVgyA extends KYHag8HRDlnO3X9zmZ {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Integer f5593lEeR5KfoEr4xU5yHH7;

    public s3fjYDxWOUexjjVgyA(Integer num) {
        this.f5593lEeR5KfoEr4xU5yHH7 = num;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof KYHag8HRDlnO3X9zmZ)) {
            return false;
        }
        Integer num = this.f5593lEeR5KfoEr4xU5yHH7;
        Integer numLEeR5KfoEr4xU5yHH7 = ((KYHag8HRDlnO3X9zmZ) obj).lEeR5KfoEr4xU5yHH7();
        return num == null ? numLEeR5KfoEr4xU5yHH7 == null : num.equals(numLEeR5KfoEr4xU5yHH7);
    }

    public int hashCode() {
        Integer num = this.f5593lEeR5KfoEr4xU5yHH7;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    @Override // ctWLFN70QQINH1kyYo.KYHag8HRDlnO3X9zmZ
    public Integer lEeR5KfoEr4xU5yHH7() {
        return this.f5593lEeR5KfoEr4xU5yHH7;
    }

    public String toString() {
        return "ProductData{productId=" + this.f5593lEeR5KfoEr4xU5yHH7 + "}";
    }
}
