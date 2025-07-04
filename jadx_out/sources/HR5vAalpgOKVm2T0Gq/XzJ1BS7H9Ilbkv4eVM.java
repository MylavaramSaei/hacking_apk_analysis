package HR5vAalpgOKVm2T0Gq;

import HZ4bptRS9XIcK1CV95.lEeR5KfoEr4xU5yHH7;
import android.content.Context;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class XzJ1BS7H9Ilbkv4eVM {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final SparseIntArray f379lEeR5KfoEr4xU5yHH7 = new SparseIntArray();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public f2zPq7MOnQrtOlZ1Zg.IPyIQcaNa8aB7drBED f380s3fjYDxWOUexjjVgyA;

    public XzJ1BS7H9Ilbkv4eVM(f2zPq7MOnQrtOlZ1Zg.IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED) {
        hoXrIDAFrSwfShk8da.Acstmh57AKoSEkEFNJ(iPyIQcaNa8aB7drBED);
        this.f380s3fjYDxWOUexjjVgyA = iPyIQcaNa8aB7drBED;
    }

    public final void HJFh0TGMpafqLE9haL() {
        this.f379lEeR5KfoEr4xU5yHH7.clear();
    }

    public final int lEeR5KfoEr4xU5yHH7(Context context, int i) {
        return this.f379lEeR5KfoEr4xU5yHH7.get(i, -1);
    }

    public final int s3fjYDxWOUexjjVgyA(Context context, lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ) {
        hoXrIDAFrSwfShk8da.Acstmh57AKoSEkEFNJ(context);
        hoXrIDAFrSwfShk8da.Acstmh57AKoSEkEFNJ(kYHag8HRDlnO3X9zmZ);
        int i = 0;
        if (!kYHag8HRDlnO3X9zmZ.aPyGSIylzVNKPT1Bls()) {
            return 0;
        }
        int iOANkd3mP6AYvwbNLJM = kYHag8HRDlnO3X9zmZ.OANkd3mP6AYvwbNLJM();
        int iLEeR5KfoEr4xU5yHH7 = lEeR5KfoEr4xU5yHH7(context, iOANkd3mP6AYvwbNLJM);
        if (iLEeR5KfoEr4xU5yHH7 == -1) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f379lEeR5KfoEr4xU5yHH7.size()) {
                    i = -1;
                    break;
                }
                int iKeyAt = this.f379lEeR5KfoEr4xU5yHH7.keyAt(i2);
                if (iKeyAt > iOANkd3mP6AYvwbNLJM && this.f379lEeR5KfoEr4xU5yHH7.get(iKeyAt) == 0) {
                    break;
                }
                i2++;
            }
            iLEeR5KfoEr4xU5yHH7 = i == -1 ? this.f380s3fjYDxWOUexjjVgyA.TCyPEKSzIyweCN5yp1(context, iOANkd3mP6AYvwbNLJM) : i;
            this.f379lEeR5KfoEr4xU5yHH7.put(iOANkd3mP6AYvwbNLJM, iLEeR5KfoEr4xU5yHH7);
        }
        return iLEeR5KfoEr4xU5yHH7;
    }
}
