package XdzLv4NdAtTYoEzVzB;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.KYHag8HRDlnO3X9zmZ;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class zZKhbgvUfsK4AEX3r0 implements InputFilter {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final TextView f2115lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public KYHag8HRDlnO3X9zmZ.AbstractC0037KYHag8HRDlnO3X9zmZ f2116s3fjYDxWOUexjjVgyA;

    public static class lEeR5KfoEr4xU5yHH7 extends KYHag8HRDlnO3X9zmZ.AbstractC0037KYHag8HRDlnO3X9zmZ {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final Reference f2117lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final Reference f2118s3fjYDxWOUexjjVgyA;

        public lEeR5KfoEr4xU5yHH7(TextView textView, zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
            this.f2117lEeR5KfoEr4xU5yHH7 = new WeakReference(textView);
            this.f2118s3fjYDxWOUexjjVgyA = new WeakReference(zzkhbgvufsk4aex3r0);
        }

        public final boolean HJFh0TGMpafqLE9haL(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.KYHag8HRDlnO3X9zmZ.AbstractC0037KYHag8HRDlnO3X9zmZ
        public void s3fjYDxWOUexjjVgyA() {
            CharSequence text;
            CharSequence charSequenceOANkd3mP6AYvwbNLJM;
            super.s3fjYDxWOUexjjVgyA();
            TextView textView = (TextView) this.f2117lEeR5KfoEr4xU5yHH7.get();
            if (HJFh0TGMpafqLE9haL(textView, (InputFilter) this.f2118s3fjYDxWOUexjjVgyA.get()) && textView.isAttachedToWindow() && text != (charSequenceOANkd3mP6AYvwbNLJM = androidx.emoji2.text.KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL().OANkd3mP6AYvwbNLJM((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(charSequenceOANkd3mP6AYvwbNLJM);
                int selectionEnd = Selection.getSelectionEnd(charSequenceOANkd3mP6AYvwbNLJM);
                textView.setText(charSequenceOANkd3mP6AYvwbNLJM);
                if (charSequenceOANkd3mP6AYvwbNLJM instanceof Spannable) {
                    zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA((Spannable) charSequenceOANkd3mP6AYvwbNLJM, selectionStart, selectionEnd);
                }
            }
        }
    }

    public zZKhbgvUfsK4AEX3r0(TextView textView) {
        this.f2115lEeR5KfoEr4xU5yHH7 = textView;
    }

    public static void s3fjYDxWOUexjjVgyA(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.f2115lEeR5KfoEr4xU5yHH7.isInEditMode()) {
            return charSequence;
        }
        int iHusNiw3snxdgZPAGJm = androidx.emoji2.text.KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL().husNiw3snxdgZPAGJm();
        if (iHusNiw3snxdgZPAGJm != 0) {
            if (iHusNiw3snxdgZPAGJm == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.f2115lEeR5KfoEr4xU5yHH7.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return androidx.emoji2.text.KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL().zaq8hOURtfwbcX17cG(charSequence, 0, charSequence.length());
            }
            if (iHusNiw3snxdgZPAGJm != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL().R9SAhYMerGybF9OAjL(lEeR5KfoEr4xU5yHH7());
        return charSequence;
    }

    public final KYHag8HRDlnO3X9zmZ.AbstractC0037KYHag8HRDlnO3X9zmZ lEeR5KfoEr4xU5yHH7() {
        if (this.f2116s3fjYDxWOUexjjVgyA == null) {
            this.f2116s3fjYDxWOUexjjVgyA = new lEeR5KfoEr4xU5yHH7(this.f2115lEeR5KfoEr4xU5yHH7, this);
        }
        return this.f2116s3fjYDxWOUexjjVgyA;
    }
}
