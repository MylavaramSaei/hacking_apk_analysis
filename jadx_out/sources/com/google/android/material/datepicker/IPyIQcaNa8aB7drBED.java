package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public class IPyIQcaNa8aB7drBED extends BaseAdapter {

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static final int f5099zZKhbgvUfsK4AEX3r0;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final int f5100HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Calendar f5101lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final int f5102s3fjYDxWOUexjjVgyA;

    static {
        f5099zZKhbgvUfsK4AEX3r0 = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public IPyIQcaNa8aB7drBED() {
        Calendar calendarPbVGzGjWvY2LDXC8vo = R9SAhYMerGybF9OAjL.pbVGzGjWvY2LDXC8vo();
        this.f5101lEeR5KfoEr4xU5yHH7 = calendarPbVGzGjWvY2LDXC8vo;
        this.f5102s3fjYDxWOUexjjVgyA = calendarPbVGzGjWvY2LDXC8vo.getMaximum(7);
        this.f5100HJFh0TGMpafqLE9haL = calendarPbVGzGjWvY2LDXC8vo.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f5102s3fjYDxWOUexjjVgyA;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(tmIBXGVvBsrJ7i63G2.TCyPEKSzIyweCN5yp1.f7077Z9WdNiOsPR0y54zHW4, viewGroup, false);
        }
        this.f5101lEeR5KfoEr4xU5yHH7.set(7, s3fjYDxWOUexjjVgyA(i));
        textView.setText(this.f5101lEeR5KfoEr4xU5yHH7.getDisplayName(7, f5099zZKhbgvUfsK4AEX3r0, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(tmIBXGVvBsrJ7i63G2.IPyIQcaNa8aB7drBED.f7064pbVGzGjWvY2LDXC8vo), this.f5101lEeR5KfoEr4xU5yHH7.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    @Override // android.widget.Adapter
    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i) {
        if (i >= this.f5102s3fjYDxWOUexjjVgyA) {
            return null;
        }
        return Integer.valueOf(s3fjYDxWOUexjjVgyA(i));
    }

    public final int s3fjYDxWOUexjjVgyA(int i) {
        int i2 = i + this.f5100HJFh0TGMpafqLE9haL;
        int i3 = this.f5102s3fjYDxWOUexjjVgyA;
        return i2 > i3 ? i2 - i3 : i2;
    }

    public IPyIQcaNa8aB7drBED(int i) {
        Calendar calendarPbVGzGjWvY2LDXC8vo = R9SAhYMerGybF9OAjL.pbVGzGjWvY2LDXC8vo();
        this.f5101lEeR5KfoEr4xU5yHH7 = calendarPbVGzGjWvY2LDXC8vo;
        this.f5102s3fjYDxWOUexjjVgyA = calendarPbVGzGjWvY2LDXC8vo.getMaximum(7);
        this.f5100HJFh0TGMpafqLE9haL = i;
    }
}
