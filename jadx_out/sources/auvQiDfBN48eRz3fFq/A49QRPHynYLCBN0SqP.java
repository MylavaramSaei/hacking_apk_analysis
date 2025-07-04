package auvQiDfBN48eRz3fFq;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* loaded from: classes.dex */
public class A49QRPHynYLCBN0SqP extends Y43RdunnpKgpbny0lE {

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public EditText f4382KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final View.OnClickListener f4383TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public int f4384husNiw3snxdgZPAGJm;

    public A49QRPHynYLCBN0SqP(com.google.android.material.textfield.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, int i) {
        super(leer5kfoer4xu5yhh7);
        this.f4384husNiw3snxdgZPAGJm = tmIBXGVvBsrJ7i63G2.zZKhbgvUfsK4AEX3r0.f7181lEeR5KfoEr4xU5yHH7;
        this.f4383TCyPEKSzIyweCN5yp1 = new View.OnClickListener() { // from class: auvQiDfBN48eRz3fFq.LIMtzhnLwQyigzK0KO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4434lEeR5KfoEr4xU5yHH7.VItLRw50eXTZeEfGl0(view);
            }
        };
        if (i != 0) {
            this.f4384husNiw3snxdgZPAGJm = i;
        }
    }

    public static boolean A49QRPHynYLCBN0SqP(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void VItLRw50eXTZeEfGl0(View view) {
        EditText editText;
        PasswordTransformationMethod passwordTransformationMethod;
        EditText editText2 = this.f4382KYHag8HRDlnO3X9zmZ;
        if (editText2 == null) {
            return;
        }
        int selectionEnd = editText2.getSelectionEnd();
        if (LIMtzhnLwQyigzK0KO()) {
            editText = this.f4382KYHag8HRDlnO3X9zmZ;
            passwordTransformationMethod = null;
        } else {
            editText = this.f4382KYHag8HRDlnO3X9zmZ;
            passwordTransformationMethod = PasswordTransformationMethod.getInstance();
        }
        editText.setTransformationMethod(passwordTransformationMethod);
        if (selectionEnd >= 0) {
            this.f4382KYHag8HRDlnO3X9zmZ.setSelection(selectionEnd);
        }
        sTkWmhpZ5b1ArQIw4K();
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public void G7AC3DWIx9i9fdanjk() {
        EditText editText = this.f4382KYHag8HRDlnO3X9zmZ;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public int HJFh0TGMpafqLE9haL() {
        return tmIBXGVvBsrJ7i63G2.IPyIQcaNa8aB7drBED.f7057Y43RdunnpKgpbny0lE;
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public View.OnClickListener KYHag8HRDlnO3X9zmZ() {
        return this.f4383TCyPEKSzIyweCN5yp1;
    }

    public final boolean LIMtzhnLwQyigzK0KO() {
        EditText editText = this.f4382KYHag8HRDlnO3X9zmZ;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public boolean T9PhQIpGRhE4yZDm1C() {
        return !LIMtzhnLwQyigzK0KO();
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public void Y43RdunnpKgpbny0lE() {
        if (A49QRPHynYLCBN0SqP(this.f4382KYHag8HRDlnO3X9zmZ)) {
            this.f4382KYHag8HRDlnO3X9zmZ.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public boolean e54J8UWNHWALQNixXM() {
        return true;
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public void hoXrIDAFrSwfShk8da(EditText editText) {
        this.f4382KYHag8HRDlnO3X9zmZ = editText;
        sTkWmhpZ5b1ArQIw4K();
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public void s3fjYDxWOUexjjVgyA(CharSequence charSequence, int i, int i2, int i3) {
        sTkWmhpZ5b1ArQIw4K();
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public int zZKhbgvUfsK4AEX3r0() {
        return this.f4384husNiw3snxdgZPAGJm;
    }
}
