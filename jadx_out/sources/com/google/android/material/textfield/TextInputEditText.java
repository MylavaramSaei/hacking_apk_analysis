package com.google.android.material.textfield;

import IPyIQcaNa8aB7drBED.pbVGzGjWvY2LDXC8vo;
import WaWv1mJ1ya3uoEaKqz.Z9WdNiOsPR0y54zHW4;
import WaWv1mJ1ya3uoEaKqz.husNiw3snxdgZPAGJm;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import tmIBXGVvBsrJ7i63G2.Acstmh57AKoSEkEFNJ;

/* loaded from: classes.dex */
public class TextInputEditText extends pbVGzGjWvY2LDXC8vo {

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public boolean f5316IPyIQcaNa8aB7drBED;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final Rect f5317TCyPEKSzIyweCN5yp1;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7152pbVGzGjWvY2LDXC8vo);
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!husNiw3snxdgZPAGJm(textInputLayout) || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.f5317TCyPEKSzIyweCN5yp1);
        rect.bottom = this.f5317TCyPEKSzIyweCN5yp1.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!husNiw3snxdgZPAGJm(textInputLayout)) {
            return super.getGlobalVisibleRect(rect, point);
        }
        boolean globalVisibleRect = textInputLayout.getGlobalVisibleRect(rect, point);
        if (globalVisibleRect && point != null) {
            point.offset(-getScrollX(), -getScrollY());
        }
        return globalVisibleRect;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.LU0fFDMACqnfIfA1AZ()) ? super.getHint() : textInputLayout.getHint();
    }

    public final boolean husNiw3snxdgZPAGJm(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f5316IPyIQcaNa8aB7drBED;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.LU0fFDMACqnfIfA1AZ() && super.getHint() == null && husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA()) {
            setHint("");
        }
    }

    @Override // IPyIQcaNa8aB7drBED.pbVGzGjWvY2LDXC8vo, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!husNiw3snxdgZPAGJm(textInputLayout) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.f5317TCyPEKSzIyweCN5yp1.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.f5317TCyPEKSzIyweCN5yp1);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.f5316IPyIQcaNa8aB7drBED = z;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(gpnYwZkFpQwu7zi2gb.lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(context, attributeSet, i, 0), attributeSet, i);
        this.f5317TCyPEKSzIyweCN5yp1 = new Rect();
        TypedArray typedArrayIPyIQcaNa8aB7drBED = Z9WdNiOsPR0y54zHW4.IPyIQcaNa8aB7drBED(context, attributeSet, Acstmh57AKoSEkEFNJ.XQXo8jgSHTWLZdMPSX, i, tmIBXGVvBsrJ7i63G2.pbVGzGjWvY2LDXC8vo.f7160HJFh0TGMpafqLE9haL, new int[0]);
        setTextInputLayoutFocusedRectEnabled(typedArrayIPyIQcaNa8aB7drBED.getBoolean(Acstmh57AKoSEkEFNJ.N8pW3GNEzdve5gbCQC, false));
        typedArrayIPyIQcaNa8aB7drBED.recycle();
    }
}
