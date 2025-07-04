package XzJ1BS7H9Ilbkv4eVM;

import java.util.Locale;

/* loaded from: classes.dex */
public abstract class hoXrIDAFrSwfShk8da {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static final T9PhQIpGRhE4yZDm1C f2128HJFh0TGMpafqLE9haL;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public static final T9PhQIpGRhE4yZDm1C f2129KYHag8HRDlnO3X9zmZ;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static final T9PhQIpGRhE4yZDm1C f2130husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final T9PhQIpGRhE4yZDm1C f2131lEeR5KfoEr4xU5yHH7 = new husNiw3snxdgZPAGJm(null, false);

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final T9PhQIpGRhE4yZDm1C f2132s3fjYDxWOUexjjVgyA = new husNiw3snxdgZPAGJm(null, true);

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static final T9PhQIpGRhE4yZDm1C f2133zZKhbgvUfsK4AEX3r0;

    public interface HJFh0TGMpafqLE9haL {
        int lEeR5KfoEr4xU5yHH7(CharSequence charSequence, int i, int i2);
    }

    public static class KYHag8HRDlnO3X9zmZ extends zZKhbgvUfsK4AEX3r0 {

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public static final KYHag8HRDlnO3X9zmZ f2134s3fjYDxWOUexjjVgyA = new KYHag8HRDlnO3X9zmZ();

        public KYHag8HRDlnO3X9zmZ() {
            super(null);
        }

        @Override // XzJ1BS7H9Ilbkv4eVM.hoXrIDAFrSwfShk8da.zZKhbgvUfsK4AEX3r0
        public boolean s3fjYDxWOUexjjVgyA() {
            return aPyGSIylzVNKPT1Bls.lEeR5KfoEr4xU5yHH7(Locale.getDefault()) == 1;
        }
    }

    public static class husNiw3snxdgZPAGJm extends zZKhbgvUfsK4AEX3r0 {

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final boolean f2135s3fjYDxWOUexjjVgyA;

        public husNiw3snxdgZPAGJm(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, boolean z) {
            super(hJFh0TGMpafqLE9haL);
            this.f2135s3fjYDxWOUexjjVgyA = z;
        }

        @Override // XzJ1BS7H9Ilbkv4eVM.hoXrIDAFrSwfShk8da.zZKhbgvUfsK4AEX3r0
        public boolean s3fjYDxWOUexjjVgyA() {
            return this.f2135s3fjYDxWOUexjjVgyA;
        }
    }

    public static class lEeR5KfoEr4xU5yHH7 implements HJFh0TGMpafqLE9haL {

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f2136s3fjYDxWOUexjjVgyA = new lEeR5KfoEr4xU5yHH7(true);

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final boolean f2137lEeR5KfoEr4xU5yHH7;

        public lEeR5KfoEr4xU5yHH7(boolean z) {
            this.f2137lEeR5KfoEr4xU5yHH7 = z;
        }

        @Override // XzJ1BS7H9Ilbkv4eVM.hoXrIDAFrSwfShk8da.HJFh0TGMpafqLE9haL
        public int lEeR5KfoEr4xU5yHH7(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int iLEeR5KfoEr4xU5yHH7 = hoXrIDAFrSwfShk8da.lEeR5KfoEr4xU5yHH7(Character.getDirectionality(charSequence.charAt(i)));
                if (iLEeR5KfoEr4xU5yHH7 != 0) {
                    if (iLEeR5KfoEr4xU5yHH7 != 1) {
                        continue;
                        i++;
                        z = z;
                    } else if (!this.f2137lEeR5KfoEr4xU5yHH7) {
                        return 1;
                    }
                } else if (this.f2137lEeR5KfoEr4xU5yHH7) {
                    return 0;
                }
                z = true;
                i++;
                z = z;
            }
            if (z) {
                return this.f2137lEeR5KfoEr4xU5yHH7 ? 1 : 0;
            }
            return 2;
        }
    }

    public static class s3fjYDxWOUexjjVgyA implements HJFh0TGMpafqLE9haL {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public static final s3fjYDxWOUexjjVgyA f2138lEeR5KfoEr4xU5yHH7 = new s3fjYDxWOUexjjVgyA();

        @Override // XzJ1BS7H9Ilbkv4eVM.hoXrIDAFrSwfShk8da.HJFh0TGMpafqLE9haL
        public int lEeR5KfoEr4xU5yHH7(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int iS3fjYDxWOUexjjVgyA = 2;
            while (i < i3 && iS3fjYDxWOUexjjVgyA == 2) {
                iS3fjYDxWOUexjjVgyA = hoXrIDAFrSwfShk8da.s3fjYDxWOUexjjVgyA(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return iS3fjYDxWOUexjjVgyA;
        }
    }

    public static abstract class zZKhbgvUfsK4AEX3r0 implements T9PhQIpGRhE4yZDm1C {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final HJFh0TGMpafqLE9haL f2139lEeR5KfoEr4xU5yHH7;

        public zZKhbgvUfsK4AEX3r0(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
            this.f2139lEeR5KfoEr4xU5yHH7 = hJFh0TGMpafqLE9haL;
        }

        public final boolean HJFh0TGMpafqLE9haL(CharSequence charSequence, int i, int i2) {
            int iLEeR5KfoEr4xU5yHH7 = this.f2139lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(charSequence, i, i2);
            if (iLEeR5KfoEr4xU5yHH7 == 0) {
                return true;
            }
            if (iLEeR5KfoEr4xU5yHH7 != 1) {
                return s3fjYDxWOUexjjVgyA();
            }
            return false;
        }

        @Override // XzJ1BS7H9Ilbkv4eVM.T9PhQIpGRhE4yZDm1C
        public boolean lEeR5KfoEr4xU5yHH7(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            return this.f2139lEeR5KfoEr4xU5yHH7 == null ? s3fjYDxWOUexjjVgyA() : HJFh0TGMpafqLE9haL(charSequence, i, i2);
        }

        public abstract boolean s3fjYDxWOUexjjVgyA();
    }

    static {
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = s3fjYDxWOUexjjVgyA.f2138lEeR5KfoEr4xU5yHH7;
        f2128HJFh0TGMpafqLE9haL = new husNiw3snxdgZPAGJm(s3fjydxwouexjjvgya, false);
        f2133zZKhbgvUfsK4AEX3r0 = new husNiw3snxdgZPAGJm(s3fjydxwouexjjvgya, true);
        f2130husNiw3snxdgZPAGJm = new husNiw3snxdgZPAGJm(lEeR5KfoEr4xU5yHH7.f2136s3fjYDxWOUexjjVgyA, false);
        f2129KYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ.f2134s3fjYDxWOUexjjVgyA;
    }

    public static int lEeR5KfoEr4xU5yHH7(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int s3fjYDxWOUexjjVgyA(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
