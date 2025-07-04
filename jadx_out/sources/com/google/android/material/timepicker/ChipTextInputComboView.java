package com.google.android.material.timepicker;

import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import WaWv1mJ1ya3uoEaKqz.Acstmh57AKoSEkEFNJ;
import WaWv1mJ1ya3uoEaKqz.hoXrIDAFrSwfShk8da;
import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import tmIBXGVvBsrJ7i63G2.TCyPEKSzIyweCN5yp1;

/* loaded from: classes.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final EditText f5432HJFh0TGMpafqLE9haL;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public TextView f5433husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Chip f5434lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final TextInputLayout f5435s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public TextWatcher f5436zZKhbgvUfsK4AEX3r0;

    public class s3fjYDxWOUexjjVgyA extends Acstmh57AKoSEkEFNJ {
        public s3fjYDxWOUexjjVgyA() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f5434lEeR5KfoEr4xU5yHH7.setText(ChipTextInputComboView.this.HJFh0TGMpafqLE9haL("00"));
                return;
            }
            String strHJFh0TGMpafqLE9haL = ChipTextInputComboView.this.HJFh0TGMpafqLE9haL(editable);
            Chip chip = ChipTextInputComboView.this.f5434lEeR5KfoEr4xU5yHH7;
            if (TextUtils.isEmpty(strHJFh0TGMpafqLE9haL)) {
                strHJFh0TGMpafqLE9haL = ChipTextInputComboView.this.HJFh0TGMpafqLE9haL("00");
            }
            chip.setText(strHJFh0TGMpafqLE9haL);
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final String HJFh0TGMpafqLE9haL(CharSequence charSequence) {
        return husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL(getResources(), charSequence);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f5434lEeR5KfoEr4xU5yHH7.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        zZKhbgvUfsK4AEX3r0();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.f5434lEeR5KfoEr4xU5yHH7.setChecked(z);
        this.f5432HJFh0TGMpafqLE9haL.setVisibility(z ? 0 : 4);
        this.f5434lEeR5KfoEr4xU5yHH7.setVisibility(z ? 8 : 0);
        if (isChecked()) {
            hoXrIDAFrSwfShk8da.Z9WdNiOsPR0y54zHW4(this.f5432HJFh0TGMpafqLE9haL, false);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f5434lEeR5KfoEr4xU5yHH7.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        this.f5434lEeR5KfoEr4xU5yHH7.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f5434lEeR5KfoEr4xU5yHH7.toggle();
    }

    public final void zZKhbgvUfsK4AEX3r0() {
        this.f5432HJFh0TGMpafqLE9haL.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(TCyPEKSzIyweCN5yp1.f7076TCyPEKSzIyweCN5yp1, (ViewGroup) this, false);
        this.f5434lEeR5KfoEr4xU5yHH7 = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(TCyPEKSzIyweCN5yp1.f7072IPyIQcaNa8aB7drBED, (ViewGroup) this, false);
        this.f5435s3fjYDxWOUexjjVgyA = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f5432HJFh0TGMpafqLE9haL = editText;
        editText.setVisibility(4);
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = new s3fjYDxWOUexjjVgyA();
        this.f5436zZKhbgvUfsK4AEX3r0 = s3fjydxwouexjjvgya;
        editText.addTextChangedListener(s3fjydxwouexjjvgya);
        zZKhbgvUfsK4AEX3r0();
        addView(chip);
        addView(textInputLayout);
        this.f5433husNiw3snxdgZPAGJm = (TextView) findViewById(tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7114e54J8UWNHWALQNixXM);
        editText.setId(lLKzvdU99Iw80uVD5I.IPyIQcaNa8aB7drBED());
        lLKzvdU99Iw80uVD5I.Fo9071MN8vwEWamAUX(this.f5433husNiw3snxdgZPAGJm, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
