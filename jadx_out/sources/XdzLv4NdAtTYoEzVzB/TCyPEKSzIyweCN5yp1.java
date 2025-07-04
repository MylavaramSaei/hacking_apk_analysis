package XdzLv4NdAtTYoEzVzB;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.KYHag8HRDlnO3X9zmZ;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class TCyPEKSzIyweCN5yp1 implements TextWatcher {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public KYHag8HRDlnO3X9zmZ.AbstractC0037KYHag8HRDlnO3X9zmZ f2098HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final EditText f2101lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final boolean f2102s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public int f2103zZKhbgvUfsK4AEX3r0 = Integer.MAX_VALUE;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public int f2100husNiw3snxdgZPAGJm = 0;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public boolean f2099KYHag8HRDlnO3X9zmZ = true;

    public static class lEeR5KfoEr4xU5yHH7 extends KYHag8HRDlnO3X9zmZ.AbstractC0037KYHag8HRDlnO3X9zmZ {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final Reference f2104lEeR5KfoEr4xU5yHH7;

        public lEeR5KfoEr4xU5yHH7(EditText editText) {
            this.f2104lEeR5KfoEr4xU5yHH7 = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.KYHag8HRDlnO3X9zmZ.AbstractC0037KYHag8HRDlnO3X9zmZ
        public void s3fjYDxWOUexjjVgyA() {
            super.s3fjYDxWOUexjjVgyA();
            TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA((EditText) this.f2104lEeR5KfoEr4xU5yHH7.get(), 1);
        }
    }

    public TCyPEKSzIyweCN5yp1(EditText editText, boolean z) {
        this.f2101lEeR5KfoEr4xU5yHH7 = editText;
        this.f2102s3fjYDxWOUexjjVgyA = z;
    }

    public static void s3fjYDxWOUexjjVgyA(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL().OANkd3mP6AYvwbNLJM(editableText);
            zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA(editableText, selectionStart, selectionEnd);
        }
    }

    public void HJFh0TGMpafqLE9haL(boolean z) {
        if (this.f2099KYHag8HRDlnO3X9zmZ != z) {
            if (this.f2098HJFh0TGMpafqLE9haL != null) {
                androidx.emoji2.text.KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL().G7AC3DWIx9i9fdanjk(this.f2098HJFh0TGMpafqLE9haL);
            }
            this.f2099KYHag8HRDlnO3X9zmZ = z;
            if (z) {
                s3fjYDxWOUexjjVgyA(this.f2101lEeR5KfoEr4xU5yHH7, androidx.emoji2.text.KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL().husNiw3snxdgZPAGJm());
            }
        }
    }

    public final KYHag8HRDlnO3X9zmZ.AbstractC0037KYHag8HRDlnO3X9zmZ lEeR5KfoEr4xU5yHH7() {
        if (this.f2098HJFh0TGMpafqLE9haL == null) {
            this.f2098HJFh0TGMpafqLE9haL = new lEeR5KfoEr4xU5yHH7(this.f2101lEeR5KfoEr4xU5yHH7);
        }
        return this.f2098HJFh0TGMpafqLE9haL;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f2101lEeR5KfoEr4xU5yHH7.isInEditMode() || zZKhbgvUfsK4AEX3r0() || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iHusNiw3snxdgZPAGJm = androidx.emoji2.text.KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL().husNiw3snxdgZPAGJm();
        if (iHusNiw3snxdgZPAGJm != 0) {
            if (iHusNiw3snxdgZPAGJm == 1) {
                androidx.emoji2.text.KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL().Y43RdunnpKgpbny0lE((Spannable) charSequence, i, i + i3, this.f2103zZKhbgvUfsK4AEX3r0, this.f2100husNiw3snxdgZPAGJm);
                return;
            } else if (iHusNiw3snxdgZPAGJm != 3) {
                return;
            }
        }
        androidx.emoji2.text.KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL().R9SAhYMerGybF9OAjL(lEeR5KfoEr4xU5yHH7());
    }

    public final boolean zZKhbgvUfsK4AEX3r0() {
        return (this.f2099KYHag8HRDlnO3X9zmZ && (this.f2102s3fjYDxWOUexjjVgyA || androidx.emoji2.text.KYHag8HRDlnO3X9zmZ.pbVGzGjWvY2LDXC8vo())) ? false : true;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
