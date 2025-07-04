package XdzLv4NdAtTYoEzVzB;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class KYHag8HRDlnO3X9zmZ {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final s3fjYDxWOUexjjVgyA f2093lEeR5KfoEr4xU5yHH7;

    public static class HJFh0TGMpafqLE9haL extends s3fjYDxWOUexjjVgyA {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final lEeR5KfoEr4xU5yHH7 f2094lEeR5KfoEr4xU5yHH7;

        public HJFh0TGMpafqLE9haL(TextView textView) {
            this.f2094lEeR5KfoEr4xU5yHH7 = new lEeR5KfoEr4xU5yHH7(textView);
        }

        @Override // XdzLv4NdAtTYoEzVzB.KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA
        public void HJFh0TGMpafqLE9haL(boolean z) {
            if (zZKhbgvUfsK4AEX3r0()) {
                this.f2094lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(z);
            } else {
                this.f2094lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(z);
            }
        }

        @Override // XdzLv4NdAtTYoEzVzB.KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA
        public InputFilter[] lEeR5KfoEr4xU5yHH7(InputFilter[] inputFilterArr) {
            return zZKhbgvUfsK4AEX3r0() ? inputFilterArr : this.f2094lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(inputFilterArr);
        }

        @Override // XdzLv4NdAtTYoEzVzB.KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA
        public void s3fjYDxWOUexjjVgyA(boolean z) {
            if (zZKhbgvUfsK4AEX3r0()) {
                return;
            }
            this.f2094lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(z);
        }

        public final boolean zZKhbgvUfsK4AEX3r0() {
            return !androidx.emoji2.text.KYHag8HRDlnO3X9zmZ.pbVGzGjWvY2LDXC8vo();
        }
    }

    public static class lEeR5KfoEr4xU5yHH7 extends s3fjYDxWOUexjjVgyA {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public boolean f2095HJFh0TGMpafqLE9haL = true;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final TextView f2096lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final zZKhbgvUfsK4AEX3r0 f2097s3fjYDxWOUexjjVgyA;

        public lEeR5KfoEr4xU5yHH7(TextView textView) {
            this.f2096lEeR5KfoEr4xU5yHH7 = textView;
            this.f2097s3fjYDxWOUexjjVgyA = new zZKhbgvUfsK4AEX3r0(textView);
        }

        public void Acstmh57AKoSEkEFNJ() {
            this.f2096lEeR5KfoEr4xU5yHH7.setTransformationMethod(e54J8UWNHWALQNixXM(this.f2096lEeR5KfoEr4xU5yHH7.getTransformationMethod()));
        }

        @Override // XdzLv4NdAtTYoEzVzB.KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA
        public void HJFh0TGMpafqLE9haL(boolean z) {
            this.f2095HJFh0TGMpafqLE9haL = z;
            Acstmh57AKoSEkEFNJ();
            pbVGzGjWvY2LDXC8vo();
        }

        public final TransformationMethod IPyIQcaNa8aB7drBED(TransformationMethod transformationMethod) {
            return transformationMethod instanceof IPyIQcaNa8aB7drBED ? ((IPyIQcaNa8aB7drBED) transformationMethod).lEeR5KfoEr4xU5yHH7() : transformationMethod;
        }

        public final InputFilter[] KYHag8HRDlnO3X9zmZ(InputFilter[] inputFilterArr) {
            SparseArray sparseArrayHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm(inputFilterArr);
            if (sparseArrayHusNiw3snxdgZPAGJm.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayHusNiw3snxdgZPAGJm.size()];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (sparseArrayHusNiw3snxdgZPAGJm.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        public void TCyPEKSzIyweCN5yp1(boolean z) {
            this.f2095HJFh0TGMpafqLE9haL = z;
        }

        public final TransformationMethod Z9WdNiOsPR0y54zHW4(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof IPyIQcaNa8aB7drBED) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new IPyIQcaNa8aB7drBED(transformationMethod);
        }

        public TransformationMethod e54J8UWNHWALQNixXM(TransformationMethod transformationMethod) {
            return this.f2095HJFh0TGMpafqLE9haL ? Z9WdNiOsPR0y54zHW4(transformationMethod) : IPyIQcaNa8aB7drBED(transformationMethod);
        }

        public final SparseArray husNiw3snxdgZPAGJm(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof zZKhbgvUfsK4AEX3r0) {
                    sparseArray.put(i, inputFilter);
                }
            }
            return sparseArray;
        }

        @Override // XdzLv4NdAtTYoEzVzB.KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA
        public InputFilter[] lEeR5KfoEr4xU5yHH7(InputFilter[] inputFilterArr) {
            return !this.f2095HJFh0TGMpafqLE9haL ? KYHag8HRDlnO3X9zmZ(inputFilterArr) : zZKhbgvUfsK4AEX3r0(inputFilterArr);
        }

        public final void pbVGzGjWvY2LDXC8vo() {
            this.f2096lEeR5KfoEr4xU5yHH7.setFilters(lEeR5KfoEr4xU5yHH7(this.f2096lEeR5KfoEr4xU5yHH7.getFilters()));
        }

        @Override // XdzLv4NdAtTYoEzVzB.KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA
        public void s3fjYDxWOUexjjVgyA(boolean z) {
            if (z) {
                Acstmh57AKoSEkEFNJ();
            }
        }

        public final InputFilter[] zZKhbgvUfsK4AEX3r0(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f2097s3fjYDxWOUexjjVgyA) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f2097s3fjYDxWOUexjjVgyA;
            return inputFilterArr2;
        }
    }

    public static class s3fjYDxWOUexjjVgyA {
        public abstract void HJFh0TGMpafqLE9haL(boolean z);

        public abstract InputFilter[] lEeR5KfoEr4xU5yHH7(InputFilter[] inputFilterArr);

        public abstract void s3fjYDxWOUexjjVgyA(boolean z);
    }

    public KYHag8HRDlnO3X9zmZ(TextView textView, boolean z) {
        tXWeW0sqVddf7ZBflq.TCyPEKSzIyweCN5yp1.IPyIQcaNa8aB7drBED(textView, "textView cannot be null");
        this.f2093lEeR5KfoEr4xU5yHH7 = !z ? new HJFh0TGMpafqLE9haL(textView) : new lEeR5KfoEr4xU5yHH7(textView);
    }

    public void HJFh0TGMpafqLE9haL(boolean z) {
        this.f2093lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(z);
    }

    public InputFilter[] lEeR5KfoEr4xU5yHH7(InputFilter[] inputFilterArr) {
        return this.f2093lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(inputFilterArr);
    }

    public void s3fjYDxWOUexjjVgyA(boolean z) {
        this.f2093lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(z);
    }
}
