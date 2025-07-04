package com.example.fcmexpr.miner;

import android.util.Log;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class husNiw3snxdgZPAGJm implements Callable {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final int f4738HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Callable f4739lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final String f4740s3fjYDxWOUexjjVgyA;

    public husNiw3snxdgZPAGJm(Callable callable) {
        this(callable, callable.toString(), 5);
    }

    public husNiw3snxdgZPAGJm(Callable callable, String str, int i) {
        String str2 = "ۖۦۖۘۛۗۥۙۚۖۘ۬۟۠ۦۘۙۨۦۖ۫ۚۘۘۥۢۙۜ۬ۛۥ۟ۚۡۘۢۥۛۨۘۗۚۗۘۗۙ";
        while (true) {
            switch (str2.hashCode() ^ 1316198586) {
                case -1465521696:
                    str2 = "ۦۧۙۦۡۢۜۦۥۜۗۥۘۖۢۜۘۚۚۡ۟ۚۨۘ۟ۘ۟ۖۛ۬ۚۗۥۢ۫ۘۨۗۤ";
                    break;
                case 1116236643:
                    String str3 = "۬ۥۡۘۗ۫ۜۨۥۘۘۘۜ۠۠ۖۨۘ۬ۜۧۘ۬ۥۨۖۖۧۢ۬ۖۘ۟ۙۙۧۥۚۙۡۨۘۡۗۜۘ۠ۖۖۘ";
                    while (true) {
                        switch (str3.hashCode() ^ (-1699250498)) {
                            case -905322962:
                                str3 = "ۨۖۖۘ۬ۢۤۚۘۡۘ۫۟ۗ۠ۨ۟ۦ۬۟ۚۢۦۙۚۨۚۨۘۙۚۤۥۡۧۗۤۧ";
                                break;
                            case -340714962:
                                str2 = "ۛۤۛ۬ۦۥۤۥۚۧ۟ۖۙۡۥۘۤۙۙۢۢۥۨۙۛۜۥ۫ۙ۬ۦۘۖۖۧۖۦۦۖۛ۟۫۟ۚۜۨۚۥۡۙ";
                                continue;
                            case 157697903:
                                if (i <= 0) {
                                    str3 = "ۛۧۨ۫۬ۛۘۧۘۥ۬ۖۘ۬ۛۧ۫ۗۛۨۗۢۚۘۛۧۖۛۢ۠ۗ۬ۚۧ۟ۜۤ";
                                    break;
                                } else {
                                    str3 = "ۗۦۢۘ۠ۘۙۖ۬ۗ۟ۡۨۚۡۘۥۖۙ۠۟۬۟ۚ۫ۛۚOۡۗۘۤ۠ۘۘۤ۟ۘۜۡۜۘۘ۟ۦۘۜۢ۫ۨۛۡ۠ۡۨ";
                                    break;
                                }
                            case 524530365:
                                str2 = "ۧۜ۬ۛۥ۬ۨۗۙۘ۫ۦۛۜۥۘ۟۬ۦۛۦۨۘ۟ۦۘۘۙۙۙۤۛۚۖۧۖۘۦۧۨۚۗۖۢۧۡ";
                                continue;
                        }
                    }
                    break;
                case 2092040729:
                    this.f4738HJFh0TGMpafqLE9haL = i;
                    this.f4739lEeR5KfoEr4xU5yHH7 = callable;
                    this.f4740s3fjYDxWOUexjjVgyA = str;
                    return;
                case 2113053243:
                    throw new IllegalArgumentException("retries must > 0");
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public Object call() throws InterruptedException {
        Object objCall = null;
        Throwable th = null;
        int i = 0;
        while (true) {
            String str = "ۡۦۜ۠ۜۛۚۨ۠ۛۚۛۡ۟ۡۖۧۨۢۢۨۘۡۢۖۛۖۢۗۦۛۜۦۜۧ۬ۢ۬ۜ۫ۤ۠ۥۘ۫۠ۥ۬۫ۙ";
            while (true) {
                switch (str.hashCode() ^ (-947115121)) {
                    case -1029943402:
                        throw new RuntimeException(th);
                    case -719246034:
                        try {
                            objCall = this.f4739lEeR5KfoEr4xU5yHH7.call();
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                            int iMin = Math.min((int) (Math.pow(2.0d, i) * 1000.0d), 10000);
                            Log.e("TaskRepeater", String.format("try %d failed. reason %s. sleeping %d ms", Integer.valueOf(i), th.getMessage(), Integer.valueOf(iMin)));
                            try {
                                Thread.sleep(iMin);
                                i++;
                            } catch (InterruptedException e) {
                                Log.d("TaskRepeater", "task " + this.f4740s3fjYDxWOUexjjVgyA + " interrupted while waiting. aborting.");
                                break;
                            }
                        }
                    case 662009078:
                        str = "ۛۛ۠ۥۨۥ۠ۢۦۙۘۖۗ۟ۚۥۖۗ۠ۚۜۘۜۤ۠ۡۙۥۧۛ۟ۙۛۜۘ۠ۛۦۖۤۗۛۢۛ";
                        break;
                    case 1500184394:
                        String str2 = "ۥۡۜۘۧۦ۟ۥۦۖۖ۠ۨۤۙۗ۫۫ۧ۠ۙ۫ۦۥ۬ۦۘۨۘۚۡۡۘۢۧۢۤۗ۫";
                        while (true) {
                            switch (str2.hashCode() ^ 884320885) {
                                case -381018334:
                                    str = "ۧۥۦۜۥ۬۫ۡۘۥۗۦۚۛۘۧۘ۬ۘۧۙۤۧۗۢۘۥۗۜ";
                                    break;
                                case -253315916:
                                    str2 = "ۘۡۡ۫ۤۜۘۢ۟ۡۘۗۢۢۗۥۖۛۥ۫ۙ۫۟۠ۢ۠ۜۗۚۤۙ۟ۙ۫ۨۘۖۙۧ";
                                case 1807383801:
                                    str = "ۢۧۥۘۙۜ۟ۘۢۜۘۘ۟ۚ۠ۢۗۙۦۘ۬ۙۨۘۛ۬ۧ۫۫ۙ۫ۢۥۘۧۤۜ۠ۡۖۘۖۜۥۢ۟ۥۘۤۙۡۢۜۡۡۗۖۥ۟ۢ";
                                    break;
                                case 2016852889:
                                    str2 = i < this.f4738HJFh0TGMpafqLE9haL ? "۫۠ۨۦۧۘۘۙ۟ۥۧۥۨۘۥۡۨۥۛۨۘ۫۟ۤۦ۠ۚۛ۠ۘۛۖۧۜۧۘۦ۠ۜۘ" : "ۛۗ۟ۚۥۥۘۜ۠ۙ۟ۡۨۘۛۧۜۘۤۢۦ۠ۖۨ۟ۧۦۘۘۡۘۘۖۡۘۛۘ۠ۦۛ۟۟ۖ۬۫۟ۜۘ";
                            }
                        }
                        break;
                }
            }
        }
        return objCall;
    }
}
