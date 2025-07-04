package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class hoXrIDAFrSwfShk8da {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final lEeR5KfoEr4xU5yHH7 f3365HJFh0TGMpafqLE9haL = new lEeR5KfoEr4xU5yHH7(1024);

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final ToH8yzk8U1nKT0PUfY.s3fjYDxWOUexjjVgyA f3366lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final char[] f3367s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final Typeface f3368zZKhbgvUfsK4AEX3r0;

    public static class lEeR5KfoEr4xU5yHH7 {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final SparseArray f3369lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public OANkd3mP6AYvwbNLJM f3370s3fjYDxWOUexjjVgyA;

        public lEeR5KfoEr4xU5yHH7() {
            this(1);
        }

        public void HJFh0TGMpafqLE9haL(OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM, int i, int i2) {
            lEeR5KfoEr4xU5yHH7 lEeR5KfoEr4xU5yHH72 = lEeR5KfoEr4xU5yHH7(oANkd3mP6AYvwbNLJM.s3fjYDxWOUexjjVgyA(i));
            if (lEeR5KfoEr4xU5yHH72 == null) {
                lEeR5KfoEr4xU5yHH72 = new lEeR5KfoEr4xU5yHH7();
                this.f3369lEeR5KfoEr4xU5yHH7.put(oANkd3mP6AYvwbNLJM.s3fjYDxWOUexjjVgyA(i), lEeR5KfoEr4xU5yHH72);
            }
            if (i2 > i) {
                lEeR5KfoEr4xU5yHH72.HJFh0TGMpafqLE9haL(oANkd3mP6AYvwbNLJM, i + 1, i2);
            } else {
                lEeR5KfoEr4xU5yHH72.f3370s3fjYDxWOUexjjVgyA = oANkd3mP6AYvwbNLJM;
            }
        }

        public lEeR5KfoEr4xU5yHH7 lEeR5KfoEr4xU5yHH7(int i) {
            SparseArray sparseArray = this.f3369lEeR5KfoEr4xU5yHH7;
            if (sparseArray == null) {
                return null;
            }
            return (lEeR5KfoEr4xU5yHH7) sparseArray.get(i);
        }

        public final OANkd3mP6AYvwbNLJM s3fjYDxWOUexjjVgyA() {
            return this.f3370s3fjYDxWOUexjjVgyA;
        }

        public lEeR5KfoEr4xU5yHH7(int i) {
            this.f3369lEeR5KfoEr4xU5yHH7 = new SparseArray(i);
        }
    }

    public hoXrIDAFrSwfShk8da(Typeface typeface, ToH8yzk8U1nKT0PUfY.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        this.f3368zZKhbgvUfsK4AEX3r0 = typeface;
        this.f3366lEeR5KfoEr4xU5yHH7 = s3fjydxwouexjjvgya;
        this.f3367s3fjYDxWOUexjjVgyA = new char[s3fjydxwouexjjvgya.Z9WdNiOsPR0y54zHW4() * 2];
        lEeR5KfoEr4xU5yHH7(s3fjydxwouexjjvgya);
    }

    public static hoXrIDAFrSwfShk8da s3fjYDxWOUexjjVgyA(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            OUd9THiLjZndMj0qdF.KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7("EmojiCompat.MetadataRepo.create");
            return new hoXrIDAFrSwfShk8da(typeface, T9PhQIpGRhE4yZDm1C.s3fjYDxWOUexjjVgyA(byteBuffer));
        } finally {
            OUd9THiLjZndMj0qdF.KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA();
        }
    }

    public char[] HJFh0TGMpafqLE9haL() {
        return this.f3367s3fjYDxWOUexjjVgyA;
    }

    public void IPyIQcaNa8aB7drBED(OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM) {
        tXWeW0sqVddf7ZBflq.TCyPEKSzIyweCN5yp1.IPyIQcaNa8aB7drBED(oANkd3mP6AYvwbNLJM, "emoji metadata cannot be null");
        tXWeW0sqVddf7ZBflq.TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA(oANkd3mP6AYvwbNLJM.HJFh0TGMpafqLE9haL() > 0, "invalid metadata codepoint length");
        this.f3365HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL(oANkd3mP6AYvwbNLJM, 0, oANkd3mP6AYvwbNLJM.HJFh0TGMpafqLE9haL() - 1);
    }

    public lEeR5KfoEr4xU5yHH7 KYHag8HRDlnO3X9zmZ() {
        return this.f3365HJFh0TGMpafqLE9haL;
    }

    public Typeface TCyPEKSzIyweCN5yp1() {
        return this.f3368zZKhbgvUfsK4AEX3r0;
    }

    public int husNiw3snxdgZPAGJm() {
        return this.f3366lEeR5KfoEr4xU5yHH7.e54J8UWNHWALQNixXM();
    }

    public final void lEeR5KfoEr4xU5yHH7(ToH8yzk8U1nKT0PUfY.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        int iZ9WdNiOsPR0y54zHW4 = s3fjydxwouexjjvgya.Z9WdNiOsPR0y54zHW4();
        for (int i = 0; i < iZ9WdNiOsPR0y54zHW4; i++) {
            OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM = new OANkd3mP6AYvwbNLJM(this, i);
            Character.toChars(oANkd3mP6AYvwbNLJM.KYHag8HRDlnO3X9zmZ(), this.f3367s3fjYDxWOUexjjVgyA, i * 2);
            IPyIQcaNa8aB7drBED(oANkd3mP6AYvwbNLJM);
        }
    }

    public ToH8yzk8U1nKT0PUfY.s3fjYDxWOUexjjVgyA zZKhbgvUfsK4AEX3r0() {
        return this.f3366lEeR5KfoEr4xU5yHH7;
    }
}
