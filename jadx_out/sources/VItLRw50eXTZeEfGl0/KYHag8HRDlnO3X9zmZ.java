package VItLRw50eXTZeEfGl0;

import android.graphics.Insets;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class KYHag8HRDlnO3X9zmZ {

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static final KYHag8HRDlnO3X9zmZ f1802husNiw3snxdgZPAGJm = new KYHag8HRDlnO3X9zmZ(0, 0, 0, 0);

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final int f1803HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final int f1804lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final int f1805s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final int f1806zZKhbgvUfsK4AEX3r0;

    public static class lEeR5KfoEr4xU5yHH7 {
        public static Insets lEeR5KfoEr4xU5yHH7(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    public KYHag8HRDlnO3X9zmZ(int i, int i2, int i3, int i4) {
        this.f1804lEeR5KfoEr4xU5yHH7 = i;
        this.f1805s3fjYDxWOUexjjVgyA = i2;
        this.f1803HJFh0TGMpafqLE9haL = i3;
        this.f1806zZKhbgvUfsK4AEX3r0 = i4;
    }

    public static KYHag8HRDlnO3X9zmZ HJFh0TGMpafqLE9haL(Rect rect) {
        return s3fjYDxWOUexjjVgyA(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static KYHag8HRDlnO3X9zmZ lEeR5KfoEr4xU5yHH7(KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ, KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ2) {
        return s3fjYDxWOUexjjVgyA(Math.max(kYHag8HRDlnO3X9zmZ.f1804lEeR5KfoEr4xU5yHH7, kYHag8HRDlnO3X9zmZ2.f1804lEeR5KfoEr4xU5yHH7), Math.max(kYHag8HRDlnO3X9zmZ.f1805s3fjYDxWOUexjjVgyA, kYHag8HRDlnO3X9zmZ2.f1805s3fjYDxWOUexjjVgyA), Math.max(kYHag8HRDlnO3X9zmZ.f1803HJFh0TGMpafqLE9haL, kYHag8HRDlnO3X9zmZ2.f1803HJFh0TGMpafqLE9haL), Math.max(kYHag8HRDlnO3X9zmZ.f1806zZKhbgvUfsK4AEX3r0, kYHag8HRDlnO3X9zmZ2.f1806zZKhbgvUfsK4AEX3r0));
    }

    public static KYHag8HRDlnO3X9zmZ s3fjYDxWOUexjjVgyA(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f1802husNiw3snxdgZPAGJm : new KYHag8HRDlnO3X9zmZ(i, i2, i3, i4);
    }

    public static KYHag8HRDlnO3X9zmZ zZKhbgvUfsK4AEX3r0(Insets insets) {
        return s3fjYDxWOUexjjVgyA(insets.left, insets.top, insets.right, insets.bottom);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || KYHag8HRDlnO3X9zmZ.class != obj.getClass()) {
            return false;
        }
        KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ = (KYHag8HRDlnO3X9zmZ) obj;
        return this.f1806zZKhbgvUfsK4AEX3r0 == kYHag8HRDlnO3X9zmZ.f1806zZKhbgvUfsK4AEX3r0 && this.f1804lEeR5KfoEr4xU5yHH7 == kYHag8HRDlnO3X9zmZ.f1804lEeR5KfoEr4xU5yHH7 && this.f1803HJFh0TGMpafqLE9haL == kYHag8HRDlnO3X9zmZ.f1803HJFh0TGMpafqLE9haL && this.f1805s3fjYDxWOUexjjVgyA == kYHag8HRDlnO3X9zmZ.f1805s3fjYDxWOUexjjVgyA;
    }

    public int hashCode() {
        return (((((this.f1804lEeR5KfoEr4xU5yHH7 * 31) + this.f1805s3fjYDxWOUexjjVgyA) * 31) + this.f1803HJFh0TGMpafqLE9haL) * 31) + this.f1806zZKhbgvUfsK4AEX3r0;
    }

    public Insets husNiw3snxdgZPAGJm() {
        return lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(this.f1804lEeR5KfoEr4xU5yHH7, this.f1805s3fjYDxWOUexjjVgyA, this.f1803HJFh0TGMpafqLE9haL, this.f1806zZKhbgvUfsK4AEX3r0);
    }

    public String toString() {
        return "Insets{left=" + this.f1804lEeR5KfoEr4xU5yHH7 + ", top=" + this.f1805s3fjYDxWOUexjjVgyA + ", right=" + this.f1803HJFh0TGMpafqLE9haL + ", bottom=" + this.f1806zZKhbgvUfsK4AEX3r0 + '}';
    }
}
